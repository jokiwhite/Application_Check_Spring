package com.ruoyi.project.system.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.ruoyi.project.system.domain.vo.EchartsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mapper.CurrentprojectinformationMapper;
import com.ruoyi.project.system.domain.Currentprojectinformation;
import com.ruoyi.project.system.service.ICurrentprojectinformationService;

/**
 * 本年度项目书Service业务层处理
 * 
 * @author bhd
 * @date 2021-01-03
 */
@Service
public class CurrentprojectinformationServiceImpl implements ICurrentprojectinformationService 
{


    @Autowired
    private CurrentprojectinformationMapper currentprojectinformationMapper;

    /**
     * 查询本年度项目书
     * 
     * @param id 本年度项目书ID
     * @return 本年度项目书
     */
    @Override
    public Currentprojectinformation selectCurrentprojectinformationById(Long id)
    {
        return currentprojectinformationMapper.selectCurrentprojectinformationById(id);
    }

    /**
     * 查询本年度项目书列表
     * 
     * @param currentprojectinformation 本年度项目书
     * @return 本年度项目书
     */
    @Override
    public List<Currentprojectinformation> selectCurrentprojectinformationList(Currentprojectinformation currentprojectinformation)
    {
        currentprojectinformation.setApplyyear(getCurrentYear());
        return currentprojectinformationMapper.selectCurrentprojectinformationList(currentprojectinformation);
    }

    @Override
    public List<Currentprojectinformation> selectCurrentprojectinformationListFeedBack(Currentprojectinformation currentprojectinformation) {
        if (currentprojectinformation.getApplyyear()==null){
            currentprojectinformation.setApplyyear(getCurrentYear());
            return currentprojectinformationMapper.selectFeedBackprojectinformationList2(currentprojectinformation);
        }

        return currentprojectinformationMapper.selectFeedBackprojectinformationList(currentprojectinformation);
    }

    /**
     * 新增本年度项目书
     * 
     * @param currentprojectinformation 本年度项目书
     * @return 结果
     */
    @Override
    public int insertCurrentprojectinformation(Currentprojectinformation currentprojectinformation)
    {
        return currentprojectinformationMapper.insertCurrentprojectinformation(currentprojectinformation);
    }

    /**
     * 修改本年度项目书
     * 
     * @param currentprojectinformation 本年度项目书
     * @return 结果
     */
    @Override
    public int updateCurrentprojectinformation(Currentprojectinformation currentprojectinformation)
    {
        return currentprojectinformationMapper.updateCurrentprojectinformation(currentprojectinformation);
    }

    /**
     * 批量删除本年度项目书
     * 
     * @param ids 需要删除的本年度项目书ID
     * @return 结果
     */
    @Override
    public int deleteCurrentprojectinformationByIds(Long[] ids)
    {
        return currentprojectinformationMapper.deleteCurrentprojectinformationByIds(ids);
    }

    /**
     * 删除本年度项目书信息
     * 
     * @param id 本年度项目书ID
     * @return 结果
     */
    @Override
    public int deleteCurrentprojectinformationById(Long id)
    {
        return currentprojectinformationMapper.deleteCurrentprojectinformationById(id);
    }
    @Override
    public void updataStatus(String id) {
        currentprojectinformationMapper.updataStatus(id);
    }

    @Override
    public void updataStatusAll(String[] ids) {
        currentprojectinformationMapper.updataStatusAll(ids);
    }

    @Override
    public List<Currentprojectinformation> selectCurrentprojectinformationListAfter(Currentprojectinformation currentprojectinformation) {
        return currentprojectinformationMapper.selectCurrentprojectinformationListAfter(currentprojectinformation);
    }

    public  String getCurrentYear(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return sdf.format(date);
    }

    @Override
    public List<EchartsVo> selectCollege() {

        return currentprojectinformationMapper.selectCollege(Integer.parseInt(getCurrentYear()));
    }

    @Override
    public List<EchartsVo> sortCollege(List<EchartsVo> list) {

        list.sort((x, y) -> Double.compare(x.getCountCollege(), y.getCountCollege()));
        Collections.reverse(list);
        List<EchartsVo> listTemp = new ArrayList<>();
        for (int i=0; i<9;i++){
            listTemp.add(list.get(i));
        }
        Integer countResult=0;
        for (int i=9;i<list.size();i++){
            Integer countOther = list.get(i).getCountCollege();
            countResult = countResult+countOther;
        }
        EchartsVo echartsVoOther = new EchartsVo();
        echartsVoOther.setCollege("其他学院");
        echartsVoOther.setCountCollege(countResult);
        listTemp.add(echartsVoOther);
        return listTemp;
    }

    @Override
    public List<EchartsVo> selectFundingType() {
        return currentprojectinformationMapper.selectFundingType(Integer.parseInt(getCurrentYear()));
    }

    @Override
    public List<EchartsVo> sortFundingType(List<EchartsVo> list) {
        list.sort((x, y) -> Double.compare(x.getCountFundingType(), y.getCountFundingType()));
        Collections.reverse(list);
        List<EchartsVo> listTemp = new ArrayList<>();
        for (int i=0; i<9;i++){
            listTemp.add(list.get(i));
        }
        Integer countResult=0;
        for (int i=9;i<list.size();i++){
            Integer countOther = list.get(i).getCountFundingType();
            countResult = countResult+countOther;
        }
        EchartsVo echartsVoOther = new EchartsVo();
        echartsVoOther.setFundingType("其他类型");
        echartsVoOther.setCountFundingType(countResult);
        listTemp.add(echartsVoOther);
        return listTemp;
    }

    @Override
    public List<EchartsVo> selectApplyCode() {
        return currentprojectinformationMapper.selectApplyCode(Integer.parseInt(getCurrentYear()));
    }

    @Override
    public List<EchartsVo> handleApplyCode(List<EchartsVo> list) {

        for (EchartsVo listAC : list) {
            if (listAC.getApplyCode()!=null){
                switch (listAC.getApplyCode())
                {
                    case "A" :
                        listAC.setApplyCode("数理科学部");
                        break;
                    case "B" :
                        listAC.setApplyCode("化学科学部");
                        break;
                    case "C" :
                        listAC.setApplyCode("生物科学部");
                        break;
                    case "D" :
                        listAC.setApplyCode("地球科学部");
                        break;
                    case "E" :
                        listAC.setApplyCode("工程与材料科学部");
                        break;
                    case "F" :
                        listAC.setApplyCode("信息科学部");
                        break;
                    case "G" :
                        listAC.setApplyCode("管理科学部");
                        break;
                    case "H" :
                        listAC.setApplyCode("医学科学部");
                        break;
                    default :
                        listAC.setApplyCode("未知");

                }
            }


        }
//        for (int i = 0; i < 2; i++) {
        list.remove(list.size()-1);
//        }
        return list;
    }

    @Override
    public List<EchartsVo> selectSubmitTime() {
        return currentprojectinformationMapper.selectSubmitTime();
    }


}
