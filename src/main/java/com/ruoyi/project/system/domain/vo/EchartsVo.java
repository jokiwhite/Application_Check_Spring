package com.ruoyi.project.system.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class EchartsVo {

    private String college;

    private Integer countCollege;

    private  String fundingType;

    private  Integer countFundingType;

    private  String applyCode;

    private Integer countApplyCode;

    private String submitTime;

    private  Integer countSubmitTime;
}
