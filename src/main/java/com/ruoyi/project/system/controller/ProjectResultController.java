package com.ruoyi.project.system.controller;

import com.ruoyi.common.utils.FTPUtil;
import com.ruoyi.common.utils.R;
import com.ruoyi.framework.web.controller.BaseController;

import com.ruoyi.project.system.domain.Currentprojectinformation;
import com.ruoyi.project.system.domain.Feedbackprojectinformation;
import com.ruoyi.project.system.domain.ProjectResult;
import com.ruoyi.project.system.domain.vo.ProjectResultBody;
import com.ruoyi.project.system.service.ICurrentprojectinformationService;
import com.ruoyi.project.system.service.IFeedbackprojectinformationService;
import com.ruoyi.project.system.service.IProjectResultService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Api(tags = "查重报告页面接口")
@RestController
@RequestMapping("/system/project-result")
public class ProjectResultController extends BaseController {

    @Autowired
    private IFeedbackprojectinformationService projectService;
    @Autowired
    private ICurrentprojectinformationService currentProjectService;
    @Autowired
    private IProjectResultService projectResultService;



    @ApiOperation(value = "根据ID获取概览数据")
    @GetMapping("findByIdSurvey/{id1}")
    public R findByIdSurvey(@PathVariable("id1") String id1) {



        //利用本文id获取所有本文id的数据
        List<ProjectResult> address1 = projectResultService.getAddressById(id1);
        //利用currentid获取currentinformation
        Currentprojectinformation currentprojectinformations = currentProjectService.selectCurrentprojectinformationById(Long.valueOf(id1));

        String article1Name = projectService.selectFeedbackprojectinformationById(address1.get(0).getCurrentArticleID()).getProjectname();

        List<ProjectResultBody> projectResultBodies = new ArrayList<>();

        for (ProjectResult projectResult : address1) {

            Feedbackprojectinformation feedbackprojectinformation = projectService.selectFeedbackprojectinformationById(projectResult.getComparedArticleID());
            String article2Name = feedbackprojectinformation.getProjectname();
            String personname = feedbackprojectinformation.getPersonname();
            String fundingtype = feedbackprojectinformation.getFundingtype();
            String college = feedbackprojectinformation.getCollege();
            String applyyear = feedbackprojectinformation.getApplyyear();

            ProjectResultBody projectResultBody = new ProjectResultBody();
            projectResultBody.setPersonName(personname);
            projectResultBody.setFundingType(fundingtype);
            projectResultBody.setCollege(college);
            projectResultBody.setApplyYear(applyyear);
            projectResultBody.setArticle1Name(article1Name);
            projectResultBody.setArticle2Name(article2Name);
            String articleID21 = projectResult.getComparedArticleID();
            projectResultBody.setArticleID2(articleID21);


            projectResultBodies.add(projectResultBody);
        }

        projectResultService.processId2Repetition(projectResultBodies);

        List<ProjectResultBody> newProjectResultBodies = new ArrayList<>();
        Set<String> set = new HashSet<String>();

        for (ProjectResultBody projectResultBody : projectResultBodies) {
            String articleID2 = projectResultBody.getArticleID2();
            if (!set.contains(articleID2)) { //set中不包含重复的
                set.add(articleID2);
                newProjectResultBodies.add(projectResultBody);
            }
        }

        return R.ok().data("article2Name", newProjectResultBodies).data("currentInformation",currentprojectinformations);
    }


    @ApiOperation(value = "根据ID获取详情数据")
    @GetMapping("findById/{id1}")
    public R findById(@PathVariable("id1") String id1) {



        //利用本文id获取所有本文id的数据
       List<ProjectResult> address1 = projectResultService.getAddressById(id1);

        List<ProjectResultBody> projectResultBodies = new ArrayList<>();

        for (ProjectResult projectResult : address1) {

            //原文的地址字段转文件服务器上的真实文字
            String currentArticleParagraphAddress = projectResult.getCurrentArticleParagraphContent();
            String[] names = currentArticleParagraphAddress.split("\\\\");
            String path = names[1]+"/"+names[2]+"/"+names[3];
            String fileName = names[4];
            String DataCurrent=FTPUtil.getData(path,fileName);
            projectResult.setCurrentArticleParagraphContent(DataCurrent);

            //相似文章的地址字段转文件服务器上的真实文字
            String comparedArticleParagraphAddress = projectResult.getComparedArticleParagraphContent();
            String[] names2 = comparedArticleParagraphAddress.split("\\\\");
            String path2 = names2[1]+"/"+names2[2]+"/"+names2[3];
            String fileName2 = names2[4];
            String DataCompared=FTPUtil.getData(path2,fileName2);
            projectResult.setComparedArticleParagraphContent(DataCompared);

            ProjectResultBody projectResultBody = new ProjectResultBody();
            String articleID21 = projectResult.getComparedArticleID();
            projectResultBody.setArticleID2(articleID21);

            String article2Name = projectService.selectFeedbackprojectinformationById(articleID21).getProjectname();
            projectResultBody.setArticle2Name(article2Name);
            projectResultBodies.add(projectResultBody);
        }

        return R.ok().data("result", address1).data("article2Name", projectResultBodies);
    }
}
