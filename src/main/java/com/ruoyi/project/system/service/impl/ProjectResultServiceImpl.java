package com.ruoyi.project.system.service.impl;

import com.ruoyi.project.system.domain.ProjectResult;
import com.ruoyi.project.system.domain.vo.ProjectResultBody;
import com.ruoyi.project.system.mapper.ProjectResultMapper;
import com.ruoyi.project.system.service.IProjectResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class ProjectResultServiceImpl implements IProjectResultService {

    @Autowired
    private ProjectResultMapper  projectResultMapper;



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
}
