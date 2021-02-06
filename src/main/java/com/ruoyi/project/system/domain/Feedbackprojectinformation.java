package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 feedbackprojectinformation
 * 
 * @author ruoyi
 * @date 2021-01-02
 */
public class Feedbackprojectinformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applyyear;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sciencenumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applycode1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fundingtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String money;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectapprovalnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applycode2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectenglishname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unitname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectapprovaldocumentnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String college;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cooperativeresearchunit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jobtitle;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String researchnature;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startendtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer statusweb;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setApplyyear(String applyyear) 
    {
        this.applyyear = applyyear;
    }

    public String getApplyyear() 
    {
        return applyyear;
    }
    public void setSciencenumber(String sciencenumber) 
    {
        this.sciencenumber = sciencenumber;
    }

    public String getSciencenumber() 
    {
        return sciencenumber;
    }
    public void setProjectname(String projectname) 
    {
        this.projectname = projectname;
    }

    public String getProjectname() 
    {
        return projectname;
    }
    public void setPersonname(String personname) 
    {
        this.personname = personname;
    }

    public String getPersonname() 
    {
        return personname;
    }
    public void setApplycode1(String applycode1) 
    {
        this.applycode1 = applycode1;
    }

    public String getApplycode1() 
    {
        return applycode1;
    }
    public void setFundingtype(String fundingtype) 
    {
        this.fundingtype = fundingtype;
    }

    public String getFundingtype() 
    {
        return fundingtype;
    }
    public void setMoney(String money) 
    {
        this.money = money;
    }

    public String getMoney() 
    {
        return money;
    }
    public void setProjectapprovalnumber(String projectapprovalnumber) 
    {
        this.projectapprovalnumber = projectapprovalnumber;
    }

    public String getProjectapprovalnumber() 
    {
        return projectapprovalnumber;
    }
    public void setApplycode2(String applycode2) 
    {
        this.applycode2 = applycode2;
    }

    public String getApplycode2() 
    {
        return applycode2;
    }
    public void setProjectenglishname(String projectenglishname) 
    {
        this.projectenglishname = projectenglishname;
    }

    public String getProjectenglishname() 
    {
        return projectenglishname;
    }
    public void setUnitname(String unitname) 
    {
        this.unitname = unitname;
    }

    public String getUnitname() 
    {
        return unitname;
    }
    public void setProjectapprovaldocumentnumber(String projectapprovaldocumentnumber) 
    {
        this.projectapprovaldocumentnumber = projectapprovaldocumentnumber;
    }

    public String getProjectapprovaldocumentnumber() 
    {
        return projectapprovaldocumentnumber;
    }
    public void setCollege(String college) 
    {
        this.college = college;
    }

    public String getCollege() 
    {
        return college;
    }
    public void setCooperativeresearchunit(String cooperativeresearchunit) 
    {
        this.cooperativeresearchunit = cooperativeresearchunit;
    }

    public String getCooperativeresearchunit() 
    {
        return cooperativeresearchunit;
    }
    public void setJobtitle(String jobtitle) 
    {
        this.jobtitle = jobtitle;
    }

    public String getJobtitle() 
    {
        return jobtitle;
    }
    public void setResearchnature(String researchnature) 
    {
        this.researchnature = researchnature;
    }

    public String getResearchnature() 
    {
        return researchnature;
    }
    public void setStartendtime(String startendtime) 
    {
        this.startendtime = startendtime;
    }

    public String getStartendtime() 
    {
        return startendtime;
    }
    public void setStatusweb(Integer statusweb) 
    {
        this.statusweb = statusweb;
    }

    public Integer getStatusweb() 
    {
        return statusweb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applyyear", getApplyyear())
            .append("sciencenumber", getSciencenumber())
            .append("projectname", getProjectname())
            .append("personname", getPersonname())
            .append("applycode1", getApplycode1())
            .append("fundingtype", getFundingtype())
            .append("money", getMoney())
            .append("projectapprovalnumber", getProjectapprovalnumber())
            .append("applycode2", getApplycode2())
            .append("projectenglishname", getProjectenglishname())
            .append("unitname", getUnitname())
            .append("projectapprovaldocumentnumber", getProjectapprovaldocumentnumber())
            .append("college", getCollege())
            .append("cooperativeresearchunit", getCooperativeresearchunit())
            .append("jobtitle", getJobtitle())
            .append("researchnature", getResearchnature())
            .append("startendtime", getStartendtime())
            .append("statusweb", getStatusweb())
            .toString();
    }
}
