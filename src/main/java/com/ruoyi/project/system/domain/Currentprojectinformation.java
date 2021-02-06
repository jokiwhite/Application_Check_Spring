package com.ruoyi.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 本年度项目书对象 currentprojectinformation
 * 
 * @author bhd
 * @date 2021-01-03
 */
public class Currentprojectinformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applycode1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fundingtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sciencenumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String versionnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String college;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applyyear;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String submittime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectenglishname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applycode2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String subclassdescription;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String notedescription;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startdata;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String enddata;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String base;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mainresearch;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String researchdirection;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chineseabstract;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String englishabstract;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chinesekeyword;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String englishkeyword;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supportingunit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unitcontact;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unitcontactemail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unitcontactphone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String collegecontact;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String collegecontactemail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String collegecontactphone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String peaplelistname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String peaplelistemail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String peaplelistjob;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String peaplelistunitname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String peaplelistwork;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String totalnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String advanced;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String intermediate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String primary1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String postdoc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String master;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applypersontype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String scientificresearchprojects;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String scientificproblemattributes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String scientificproblemattributescontent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pdfdownloadaddress;

    /** pdf有无解析 */
    @Excel(name = "pdf有无解析")
    private Integer processed;

    /** pdf查重对比 */
    @Excel(name = "pdf查重对比")
    private Integer detected;

    /** 审核 */
    @Excel(name = "审核")
    private Integer statusweb;

    /** 综合查重率 */
    @Excel(name = "综合查重率")
    private String checkrate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setApplycode1(String applycode1) 
    {
        this.applycode1 = applycode1;
    }

    public String getApplycode1() 
    {
        return applycode1;
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
    public void setFundingtype(String fundingtype) 
    {
        this.fundingtype = fundingtype;
    }

    public String getFundingtype() 
    {
        return fundingtype;
    }
    public void setSciencenumber(String sciencenumber) 
    {
        this.sciencenumber = sciencenumber;
    }

    public String getSciencenumber() 
    {
        return sciencenumber;
    }
    public void setVersionnumber(String versionnumber) 
    {
        this.versionnumber = versionnumber;
    }

    public String getVersionnumber() 
    {
        return versionnumber;
    }
    public void setCollege(String college) 
    {
        this.college = college;
    }

    public String getCollege() 
    {
        return college;
    }
    public void setApplyyear(String applyyear) 
    {
        this.applyyear = applyyear;
    }

    public String getApplyyear() 
    {
        return applyyear;
    }
    public void setSubmittime(String submittime) 
    {
        this.submittime = submittime;
    }

    public String getSubmittime() 
    {
        return submittime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setProjectenglishname(String projectenglishname) 
    {
        this.projectenglishname = projectenglishname;
    }

    public String getProjectenglishname() 
    {
        return projectenglishname;
    }
    public void setApplycode2(String applycode2) 
    {
        this.applycode2 = applycode2;
    }

    public String getApplycode2() 
    {
        return applycode2;
    }
    public void setSubclassdescription(String subclassdescription) 
    {
        this.subclassdescription = subclassdescription;
    }

    public String getSubclassdescription() 
    {
        return subclassdescription;
    }
    public void setNotedescription(String notedescription) 
    {
        this.notedescription = notedescription;
    }

    public String getNotedescription() 
    {
        return notedescription;
    }
    public void setStartdata(String startdata) 
    {
        this.startdata = startdata;
    }

    public String getStartdata() 
    {
        return startdata;
    }
    public void setEnddata(String enddata) 
    {
        this.enddata = enddata;
    }

    public String getEnddata() 
    {
        return enddata;
    }
    public void setBase(String base) 
    {
        this.base = base;
    }

    public String getBase() 
    {
        return base;
    }
    public void setMainresearch(String mainresearch) 
    {
        this.mainresearch = mainresearch;
    }

    public String getMainresearch() 
    {
        return mainresearch;
    }
    public void setResearchdirection(String researchdirection) 
    {
        this.researchdirection = researchdirection;
    }

    public String getResearchdirection() 
    {
        return researchdirection;
    }
    public void setChineseabstract(String chineseabstract) 
    {
        this.chineseabstract = chineseabstract;
    }

    public String getChineseabstract() 
    {
        return chineseabstract;
    }
    public void setEnglishabstract(String englishabstract) 
    {
        this.englishabstract = englishabstract;
    }

    public String getEnglishabstract() 
    {
        return englishabstract;
    }
    public void setChinesekeyword(String chinesekeyword) 
    {
        this.chinesekeyword = chinesekeyword;
    }

    public String getChinesekeyword() 
    {
        return chinesekeyword;
    }
    public void setEnglishkeyword(String englishkeyword) 
    {
        this.englishkeyword = englishkeyword;
    }

    public String getEnglishkeyword() 
    {
        return englishkeyword;
    }
    public void setSupportingunit(String supportingunit) 
    {
        this.supportingunit = supportingunit;
    }

    public String getSupportingunit() 
    {
        return supportingunit;
    }
    public void setUnitcontact(String unitcontact) 
    {
        this.unitcontact = unitcontact;
    }

    public String getUnitcontact() 
    {
        return unitcontact;
    }
    public void setUnitcontactemail(String unitcontactemail) 
    {
        this.unitcontactemail = unitcontactemail;
    }

    public String getUnitcontactemail() 
    {
        return unitcontactemail;
    }
    public void setUnitcontactphone(String unitcontactphone) 
    {
        this.unitcontactphone = unitcontactphone;
    }

    public String getUnitcontactphone() 
    {
        return unitcontactphone;
    }
    public void setCollegecontact(String collegecontact) 
    {
        this.collegecontact = collegecontact;
    }

    public String getCollegecontact() 
    {
        return collegecontact;
    }
    public void setCollegecontactemail(String collegecontactemail) 
    {
        this.collegecontactemail = collegecontactemail;
    }

    public String getCollegecontactemail() 
    {
        return collegecontactemail;
    }
    public void setCollegecontactphone(String collegecontactphone) 
    {
        this.collegecontactphone = collegecontactphone;
    }

    public String getCollegecontactphone() 
    {
        return collegecontactphone;
    }
    public void setPeaplelistname(String peaplelistname) 
    {
        this.peaplelistname = peaplelistname;
    }

    public String getPeaplelistname() 
    {
        return peaplelistname;
    }
    public void setPeaplelistemail(String peaplelistemail) 
    {
        this.peaplelistemail = peaplelistemail;
    }

    public String getPeaplelistemail() 
    {
        return peaplelistemail;
    }
    public void setPeaplelistjob(String peaplelistjob) 
    {
        this.peaplelistjob = peaplelistjob;
    }

    public String getPeaplelistjob() 
    {
        return peaplelistjob;
    }
    public void setPeaplelistunitname(String peaplelistunitname) 
    {
        this.peaplelistunitname = peaplelistunitname;
    }

    public String getPeaplelistunitname() 
    {
        return peaplelistunitname;
    }
    public void setPeaplelistwork(String peaplelistwork) 
    {
        this.peaplelistwork = peaplelistwork;
    }

    public String getPeaplelistwork() 
    {
        return peaplelistwork;
    }
    public void setTotalnumber(String totalnumber) 
    {
        this.totalnumber = totalnumber;
    }

    public String getTotalnumber() 
    {
        return totalnumber;
    }
    public void setAdvanced(String advanced) 
    {
        this.advanced = advanced;
    }

    public String getAdvanced() 
    {
        return advanced;
    }
    public void setIntermediate(String intermediate) 
    {
        this.intermediate = intermediate;
    }

    public String getIntermediate() 
    {
        return intermediate;
    }
    public void setPrimary1(String primary1) 
    {
        this.primary1 = primary1;
    }

    public String getPrimary1() 
    {
        return primary1;
    }
    public void setPostdoc(String postdoc) 
    {
        this.postdoc = postdoc;
    }

    public String getPostdoc() 
    {
        return postdoc;
    }
    public void setPhd(String phd) 
    {
        this.phd = phd;
    }

    public String getPhd() 
    {
        return phd;
    }
    public void setMaster(String master) 
    {
        this.master = master;
    }

    public String getMaster() 
    {
        return master;
    }
    public void setApplypersontype(String applypersontype) 
    {
        this.applypersontype = applypersontype;
    }

    public String getApplypersontype() 
    {
        return applypersontype;
    }
    public void setScientificresearchprojects(String scientificresearchprojects) 
    {
        this.scientificresearchprojects = scientificresearchprojects;
    }

    public String getScientificresearchprojects() 
    {
        return scientificresearchprojects;
    }
    public void setScientificproblemattributes(String scientificproblemattributes) 
    {
        this.scientificproblemattributes = scientificproblemattributes;
    }

    public String getScientificproblemattributes() 
    {
        return scientificproblemattributes;
    }
    public void setScientificproblemattributescontent(String scientificproblemattributescontent) 
    {
        this.scientificproblemattributescontent = scientificproblemattributescontent;
    }

    public String getScientificproblemattributescontent() 
    {
        return scientificproblemattributescontent;
    }
    public void setPdfdownloadaddress(String pdfdownloadaddress) 
    {
        this.pdfdownloadaddress = pdfdownloadaddress;
    }

    public String getPdfdownloadaddress() 
    {
        return pdfdownloadaddress;
    }
    public void setProcessed(Integer processed) 
    {
        this.processed = processed;
    }

    public Integer getProcessed() 
    {
        return processed;
    }
    public void setDetected(Integer detected) 
    {
        this.detected = detected;
    }

    public Integer getDetected() 
    {
        return detected;
    }
    public void setStatusweb(Integer statusweb) 
    {
        this.statusweb = statusweb;
    }

    public Integer getStatusweb() 
    {
        return statusweb;
    }
    public void setCheckrate(String checkrate)
    {
        this.checkrate = checkrate;
    }

    public String getCheckrate()
    {
        return checkrate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applycode1", getApplycode1())
            .append("projectname", getProjectname())
            .append("personname", getPersonname())
            .append("fundingtype", getFundingtype())
            .append("sciencenumber", getSciencenumber())
            .append("versionnumber", getVersionnumber())
            .append("college", getCollege())
            .append("applyyear", getApplyyear())
            .append("submittime", getSubmittime())
            .append("status", getStatus())
            .append("projectenglishname", getProjectenglishname())
            .append("applycode2", getApplycode2())
            .append("subclassdescription", getSubclassdescription())
            .append("notedescription", getNotedescription())
            .append("startdata", getStartdata())
            .append("enddata", getEnddata())
            .append("base", getBase())
            .append("mainresearch", getMainresearch())
            .append("researchdirection", getResearchdirection())
            .append("chineseabstract", getChineseabstract())
            .append("englishabstract", getEnglishabstract())
            .append("chinesekeyword", getChinesekeyword())
            .append("englishkeyword", getEnglishkeyword())
            .append("supportingunit", getSupportingunit())
            .append("unitcontact", getUnitcontact())
            .append("unitcontactemail", getUnitcontactemail())
            .append("unitcontactphone", getUnitcontactphone())
            .append("collegecontact", getCollegecontact())
            .append("collegecontactemail", getCollegecontactemail())
            .append("collegecontactphone", getCollegecontactphone())
            .append("peaplelistname", getPeaplelistname())
            .append("peaplelistemail", getPeaplelistemail())
            .append("peaplelistjob", getPeaplelistjob())
            .append("peaplelistunitname", getPeaplelistunitname())
            .append("peaplelistwork", getPeaplelistwork())
            .append("totalnumber", getTotalnumber())
            .append("advanced", getAdvanced())
            .append("intermediate", getIntermediate())
            .append("primary1", getPrimary1())
            .append("postdoc", getPostdoc())
            .append("phd", getPhd())
            .append("master", getMaster())
            .append("applypersontype", getApplypersontype())
            .append("scientificresearchprojects", getScientificresearchprojects())
            .append("scientificproblemattributes", getScientificproblemattributes())
            .append("scientificproblemattributescontent", getScientificproblemattributescontent())
            .append("pdfdownloadaddress", getPdfdownloadaddress())
            .append("processed", getProcessed())
            .append("detected", getDetected())
            .append("statusweb", getStatusweb())

            .append("checkrate", getCheckrate())
            .toString();
    }
}
