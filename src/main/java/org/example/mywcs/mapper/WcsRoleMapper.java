package org.example.mywcs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mywcs.domain.WcsRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 15268
* @description 针对表【wcs_role(角色信息表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:10
* @Entity generator.domain.WcsRole
*/
@Mapper
public interface WcsRoleMapper extends BaseMapper<WcsRole> {

    WcsRole select(Integer roleId);


}




