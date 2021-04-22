package com.ruoyi.project.system.service.impl;

import com.ruoyi.project.system.domain.ProjectResult;
import com.ruoyi.project.system.domain.vo.ProjectResultBody;
import com.ruoyi.project.system.domain.vo.quChongVO;
import com.ruoyi.project.system.mapper.CurrentprojectinformationMapper;
import com.ruoyi.project.system.mapper.FeedbackprojectinformationMapper;
import com.ruoyi.project.system.mapper.ProjectResultMapper;
import com.ruoyi.project.system.service.IProjectResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProjectResultServiceImpl implements IProjectResultService {

    @Autowired
    private ProjectResultMapper  projectResultMapper;
    @Autowired
    private CurrentprojectinformationMapper currentprojectinformationMapper;
    @Autowired
    private FeedbackprojectinformationMapper feedbackprojectinformationMapper;



    @Override
    public List<ProjectResult> getAddressById(String id1) {
        return projectResultMapper.getAddressById(id1);
    }

    @Override
    public void processId2Repetition(List<ProjectResultBody> projectResultBodies) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (ProjectResultBody projectResultBody : projectResultBodies) {
            String item = projectResultBody.getArticleID2();
            if(map.containsKey(item)){
                map.put(item, map.get(item).intValue() + 1);
            }else {
                map.put(item, new Integer(1));
            }
        }

        for (ProjectResultBody projectResultBody : projectResultBodies) {
            if (map.get(projectResultBody.getArticleID2())!=null){
                projectResultBody.setComparedNum(String.valueOf(map.get(projectResultBody.getArticleID2())));
            }
        }

    }

    @Override
    public HashSet<Integer> quChong() {


        HashSet<Integer> result = new HashSet<>();
        List<quChongVO> currentID = projectResultMapper.getCurrentID();

        for (quChongVO quChongVO : currentID) {
            String personname = currentprojectinformationMapper.selectCurrentprojectinformationById(Long.valueOf(quChongVO.getCurrentArticleID())).getPersonname();
            HashSet<String> CpersonName = new HashSet<>();
            List<Integer> comparedArticleIDById = projectResultMapper.getComparedArticleIDById(String.valueOf(quChongVO.getCurrentArticleID()));

            for (Integer comparedArticleID : comparedArticleIDById) {
//                String personname1 = feedbackprojectinformationMapper.selectFeedbackprojectinformationById(String.valueOf(comparedArticleID)).getPersonname();
                String personname1 = currentprojectinformationMapper.selectCurrentprojectinformationById(Long.valueOf(comparedArticleID)).getPersonname();
                CpersonName.add(personname1);
            }
            if (CpersonName.contains(personname)){
                result.add(quChongVO.getCurrentArticleID());
            }
        }


        return  result;

    }
}
