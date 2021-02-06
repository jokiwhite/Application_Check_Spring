package com.ruoyi.project.system.service;

import java.util.List;
import com.ruoyi.project.system.domain.Feedbackprojectinformation;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-01-02
 */
public interface IFeedbackprojectinformationService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Feedbackprojectinformation selectFeedbackprojectinformationById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param feedbackprojectinformation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Feedbackprojectinformation> selectFeedbackprojectinformationList(Feedbackprojectinformation feedbackprojectinformation);

    /**
     * 新增【请填写功能名称】
     * 
     * @param feedbackprojectinformation 【请填写功能名称】
     * @return 结果
     */
    public int insertFeedbackprojectinformation(Feedbackprojectinformation feedbackprojectinformation);

    /**
     * 修改【请填写功能名称】
     * 
     * @param feedbackprojectinformation 【请填写功能名称】
     * @return 结果
     */
    public int updateFeedbackprojectinformation(Feedbackprojectinformation feedbackprojectinformation);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFeedbackprojectinformationByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFeedbackprojectinformationById(String id);

    public void updataStatus(String id);

    public void updataStatusAll(String[] ids);


}
