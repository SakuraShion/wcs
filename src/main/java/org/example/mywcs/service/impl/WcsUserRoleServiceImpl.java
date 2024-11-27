package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsUserRole;
import org.example.mywcs.service.WcsUserRoleService;
import org.example.mywcs.mapper.WcsUserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_user_role(用户和角色关联表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsUserRoleServiceImpl extends ServiceImpl<WcsUserRoleMapper, WcsUserRole>
    implements WcsUserRoleService{

}




