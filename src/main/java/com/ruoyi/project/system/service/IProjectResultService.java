package com.ruoyi.project.system.service;

import com.ruoyi.project.system.domain.ProjectResult;
import com.ruoyi.project.system.domain.vo.ProjectResultBody;

import java.util.List;

public interface IProjectResultService {
    List<ProjectResult> getAddressById(String id1);

    void processId2Repetition(List<ProjectResultBody> projectResultBodies);
}
