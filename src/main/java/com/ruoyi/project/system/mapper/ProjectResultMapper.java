package com.ruoyi.project.system.mapper;


import com.ruoyi.project.system.domain.ProjectResult;
import com.ruoyi.project.system.domain.vo.quChongVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectResultMapper {

    @Select("SELECT * from projec_result where CurrentArticleID= #{currentArticleID}")
    List<ProjectResult> getAddressById(@Param("currentArticleID") String id1);

    List<quChongVO> getCurrentID();

    @Select("SELECT DISTINCT ComparedArticleID from projec_result where CurrentArticleID =#{currentArticleID}")
    List<Integer> getComparedArticleIDById(@Param("currentArticleID") String id1);
}
