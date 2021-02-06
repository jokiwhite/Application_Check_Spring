package com.ruoyi.project.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.domain.Feedbackprojectinformation;
import com.ruoyi.project.system.service.IFeedbackprojectinformationService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 *
 * @author bhd
 * @date 2021-01-02
 */
@RestController
@RequestMapping("/system/feedbackprojectinformation")
public class FeedbackprojectinformationController extends BaseController
{
    @Autowired
    private IFeedbackprojectinformationService feedbackprojectinformationService;


    @Log(title = "查重通过", businessType = BusinessType.UPDATE)
    @PostMapping("/status/{id}")
    public AjaxResult updateStatus(@PathVariable String id)
    {
        feedbackprojectinformationService.updataStatus(id);
       return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('system:feedbackprojectinformation:statusAll')")
    @Log(title = "查重通过", businessType = BusinessType.UPDATE)
    @PostMapping("/statusAll/{ids}")
    public AjaxResult updateStatusAll(@PathVariable String[] ids)
    {
        feedbackprojectinformationService.updataStatusAll(ids);
        return AjaxResult.success();
    }

    /**
     * 查询
     */

    @GetMapping("/list")
    public TableDataInfo list(Feedbackprojectinformation feedbackprojectinformation)
    {
        startPage();
        List<Feedbackprojectinformation> list = feedbackprojectinformationService.selectFeedbackprojectinformationList(feedbackprojectinformation);
        return getDataTable(list);
    }

//    /**
//     * 导出
//     */
//    @PreAuthorize("@ss.hasPermi('system:feedbackprojectinformation:export')")
//    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
//    @GetMapping("/export")
//    public AjaxResult export(Feedbackprojectinformation feedbackprojectinformation)
//    {
//        List<Feedbackprojectinformation> list = feedbackprojectinformationService.selectFeedbackprojectinformationList(feedbackprojectinformation);
//        ExcelUtil<Feedbackprojectinformation> util = new ExcelUtil<Feedbackprojectinformation>(Feedbackprojectinformation.class);
//        return util.exportExcel(list, "feedbackprojectinformation");
//    }

    /**
     * 获取
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(feedbackprojectinformationService.selectFeedbackprojectinformationById(id));
    }

    /**
     * 新增
     */
//    @PreAuthorize("@ss.hasPermi('system:feedbackprojectinformation:add')")
//    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
//    @PostMapping
//    public AjaxResult add(@RequestBody Feedbackprojectinformation feedbackprojectinformation)
//    {
//        return toAjax(feedbackprojectinformationService.insertFeedbackprojectinformation(feedbackprojectinformation));
//    }
//
//    /**
//     * 修改
//     */
//    @PreAuthorize("@ss.hasPermi('system:feedbackprojectinformation:edit')")
//    @Log(title = "", businessType = BusinessType.UPDATE)
//    @PutMapping
//    public AjaxResult edit(@RequestBody Feedbackprojectinformation feedbackprojectinformation)
//    {
//        return toAjax(feedbackprojectinformationService.updateFeedbackprojectinformation(feedbackprojectinformation));
//    }
//
//    /**
//     * 删除
//     */
//    @PreAuthorize("@ss.hasPermi('system:feedbackprojectinformation:remove')")
//    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
//	@DeleteMapping("/{ids}")
//    public AjaxResult remove(@PathVariable String[] ids)
//    {
//        return toAjax(feedbackprojectinformationService.deleteFeedbackprojectinformationByIds(ids));
//    }
}
