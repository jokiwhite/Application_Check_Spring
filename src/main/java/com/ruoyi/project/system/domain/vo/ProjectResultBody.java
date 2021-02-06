package com.ruoyi.project.system.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProjectResultBody {

    private String article1Name;

    private String articleID2;

    private String article2Name;

    private String comparedNum;

    private String personName;

    private String fundingType;

    private String college;

    private String applyYear;
}
