package com.ruoyi.project.system.controller;

import java.util.*;

import com.ruoyi.common.utils.R;
import com.ruoyi.project.system.domain.vo.EchartsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.project.system.domain.Currentprojectinformation;
import com.ruoyi.project.system.service.ICurrentprojectinformationService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 本年度项目书Controller
 * 
 * @author bhd
 * @date 2021-01-03
 */
@Api("用户信息管理")
@RestController
@RequestMapping("/system/currentprojectinformation")
public class CurrentprojectinformationController extends BaseController
{
    @Autowired
    private ICurrentprojectinformationService currentprojectinformationService;

    //柱状图学院
    @ApiOperation("collegePie")
    @PostMapping("/collegePie")
    public R collegePie(){

        List<EchartsVo> list = currentprojectinformationService.selectCollege();
        List<EchartsVo> result =currentprojectinformationService.sortCollege(list);

       return R.ok().data("list",result);
    }

    //饼图项目类型
    @PostMapping("/fundingTypePie")
    public R fundingTypePie(){

        List<EchartsVo> list = currentprojectinformationService.selectFundingType();
        List<EchartsVo> result =currentprojectinformationService.sortFundingType(list);
        return R.ok().data("list",result);
    }
    //饼图学科分类
    @PostMapping("/applyCodePie")
    public R applyCodePie(){

        List<EchartsVo> list = currentprojectinformationService.selectApplyCode();
        List<EchartsVo> result =currentprojectinformationService.handleApplyCode(list);
        return R.ok().data("list",result);
    }
    //折线图最近七日提交
    @PostMapping("/submitTimeline")
    public R submitTimeline(){
        List<EchartsVo> list = currentprojectinformationService.selectSubmitTime();
        List<EchartsVo> result= new ArrayList<>();

        for (int i=0;i<7;i++){
            result.add(list.get(i));
        }
        Collections.reverse(result);

        return  R.ok().data("list",result);
    }

    @Log(title = "查重通过", businessType = BusinessType.UPDATE)
    @PostMapping("/status/{id}")
    public AjaxResult updateStatus(@PathVariable String id)
    {
        currentprojectinformationService.updataStatus(id);
        return AjaxResult.success();
    }

    @PreAuthorize("@ss.hasPermi('system:feedbackprojectinformation:statusAll')")
    @Log(title = "查重通过", businessType = BusinessType.UPDATE)
    @PostMapping("/statusAll/{ids}")
    public AjaxResult updateStatusAll(@PathVariable String[] ids)
    {
        currentprojectinformationService.updataStatusAll(ids);
        return AjaxResult.success();
    }

    @GetMapping("/listAfter")
    public TableDataInfo listAfter(Currentprojectinformation currentprojectinformation)
    {
        startPage();
        List<Currentprojectinformation> list = currentprojectinformationService.selectCurrentprojectinformationListAfter(currentprojectinformation);
        return getDataTable(list);
    }


    /**
     * 查询本年度项目书列表
     */

    @GetMapping("/list")
    public TableDataInfo list(Currentprojectinformation currentprojectinformation)
    {
        startPage();
        List<Currentprojectinformation> list = currentprojectinformationService.selectCurrentprojectinformationList(currentprojectinformation);
        return getDataTable(list);
    }

//    /**
//     * 导出本年度项目书列表
//     */
//
//    @Log(title = "本年度项目书", businessType = BusinessType.EXPORT)
//    @GetMapping("/export")
//    public AjaxResult export(Currentprojectinformation currentprojectinformation)
//    {
//        List<Currentprojectinformation> list = currentprojectinformationService.selectCurrentprojectinformationList(currentprojectinformation);
//        ExcelUtil<Currentprojectinformation> util = new ExcelUtil<Currentprojectinformation>(Currentprojectinformation.class);
//        return util.exportExcel(list, "currentprojectinformation");
//    }

    /**
     * 获取本年度项目书详细信息
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(currentprojectinformationService.selectCurrentprojectinformationById(id));
    }


}
