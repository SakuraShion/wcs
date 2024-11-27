package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsRoleMenu;
import org.example.mywcs.service.WcsRoleMenuService;
import org.example.mywcs.mapper.WcsRoleMenuMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_role_menu(角色和菜单关联表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsRoleMenuServiceImpl extends ServiceImpl<WcsRoleMenuMapper, WcsRoleMenu>
    implements WcsRoleMenuService{

}




