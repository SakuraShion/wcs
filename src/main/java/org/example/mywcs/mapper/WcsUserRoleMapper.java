package org.example.mywcs.mapper;

import org.example.mywcs.domain.WcsUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 15268
* @description 针对表【wcs_user_role(用户和角色关联表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:10
* @Entity generator.domain.WcsUserRole
*/
public interface WcsUserRoleMapper extends BaseMapper<WcsUserRole> {

    List<String> getRoleId(Long roleId);

    List<WcsUserRole> selectAllUserMenuId();
}




