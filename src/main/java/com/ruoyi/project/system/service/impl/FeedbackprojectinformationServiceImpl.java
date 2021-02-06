package com.ruoyi.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.FeedbackprojectinformationMapper;
import com.ruoyi.project.system.domain.Feedbackprojectinformation;
import com.ruoyi.project.system.service.IFeedbackprojectinformationService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-02
 */
@Service
public class FeedbackprojectinformationServiceImpl implements IFeedbackprojectinformationService 
{
    @Autowired
    private FeedbackprojectinformationMapper feedbackprojectinformationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Feedbackprojectinformation selectFeedbackprojectinformationById(String id)
    {
        return feedbackprojectinformationMapper.selectFeedbackprojectinformationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param feedbackprojectinformation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Feedbackprojectinformation> selectFeedbackprojectinformationList(Feedbackprojectinformation feedbackprojectinformation)
    {
        return feedbackprojectinformationMapper.selectFeedbackprojectinformationList(feedbackprojectinformation);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param feedbackprojectinformation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFeedbackprojectinformation(Feedbackprojectinformation feedbackprojectinformation)
    {
        return feedbackprojectinformationMapper.insertFeedbackprojectinformation(feedbackprojectinformation);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param feedbackprojectinformation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFeedbackprojectinformation(Feedbackprojectinformation feedbackprojectinformation)
    {
        return feedbackprojectinformationMapper.updateFeedbackprojectinformation(feedbackprojectinformation);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFeedbackprojectinformationByIds(String[] ids)
    {
        return feedbackprojectinformationMapper.deleteFeedbackprojectinformationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFeedbackprojectinformationById(String id)
    {
        return feedbackprojectinformationMapper.deleteFeedbackprojectinformationById(id);
    }

    @Override
    public void updataStatus(String id) {
        feedbackprojectinformationMapper.updataStatus(id);
    }

    @Override
    public void updataStatusAll(String[] ids) {
        feedbackprojectinformationMapper.updataStatusAll(ids);
    }


}
