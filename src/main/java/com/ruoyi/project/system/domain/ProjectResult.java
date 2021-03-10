package com.ruoyi.project.system.domain;

import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

@Data
public class ProjectResult extends BaseEntity {
    private static final long serialVersionUID=1L;


    private String currentArticleID;


    private String currentArticleParagraphNum;

    private String comparedArticleID;

    private String comparedArticleParagraphNum;

    private String result;


    private String currentArticleParagraphContent;


    private String comparedArticleParagraphContent;

    private  String yuxuan;

    private  int status;


}
