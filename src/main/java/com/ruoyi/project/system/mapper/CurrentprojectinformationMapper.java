package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.Currentprojectinformation;
import com.ruoyi.project.system.domain.vo.EchartsVo;

/**
 * 本年度项目书Mapper接口
 * 
 * @author bhd
 * @date 2021-01-03
 */
public interface CurrentprojectinformationMapper 
{
    /**
     * 查询本年度项目书
     * 
     * @param id 本年度项目书ID
     * @return 本年度项目书
     */
    public Currentprojectinformation selectCurrentprojectinformationById(Long id);

    /**
     * 查询本年度项目书列表
     * 
     * @param currentprojectinformation 本年度项目书
     * @return 本年度项目书集合
     */
    public List<Currentprojectinformation> selectCurrentprojectinformationList(Currentprojectinformation currentprojectinformation);

    /**
     * 新增本年度项目书
     * 
     * @param currentprojectinformation 本年度项目书
     * @return 结果
     */
    public int insertCurrentprojectinformation(Currentprojectinformation currentprojectinformation);

    /**
     * 修改本年度项目书
     * 
     * @param currentprojectinformation 本年度项目书
     * @return 结果
     */
    public int updateCurrentprojectinformation(Currentprojectinformation currentprojectinformation);

    /**
     * 删除本年度项目书
     * 
     * @param id 本年度项目书ID
     * @return 结果
     */
    public int deleteCurrentprojectinformationById(Long id);

    /**
     * 批量删除本年度项目书
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCurrentprojectinformationByIds(Long[] ids);

    void updataStatus(String id);

    void updataStatusAll(String[] ids);

    List<Currentprojectinformation> selectCurrentprojectinformationListAfter(Currentprojectinformation currentprojectinformation);

    List<EchartsVo> selectCollege(int applyYear);

    List<EchartsVo> selectFundingType(int applyYear);

    List<EchartsVo> selectApplyCode(int applyYear);

    List<EchartsVo> selectSubmitTime();

    List<Currentprojectinformation> selectFeedBackprojectinformationList(Currentprojectinformation currentprojectinformation);

    List<Currentprojectinformation> selectFeedBackprojectinformationList2(Currentprojectinformation currentprojectinformation);
}
