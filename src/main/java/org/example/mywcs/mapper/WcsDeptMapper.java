package org.example.mywcs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mywcs.domain.WcsDept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 15268
* @description 针对表【wcs_dept(部门表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:10
* @Entity generator.domain.WcsDept
*/
@Mapper
public interface WcsDeptMapper extends BaseMapper<WcsDept> {
    WcsDept selectDeptByUser(Long deptId);

    List<WcsDept> selectList();

}




