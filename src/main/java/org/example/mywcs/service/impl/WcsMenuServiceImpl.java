package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsMenu;
import org.example.mywcs.service.WcsMenuService;
import org.example.mywcs.mapper.WcsMenuMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_menu(菜单权限表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsMenuServiceImpl extends ServiceImpl<WcsMenuMapper, WcsMenu>
    implements WcsMenuService{

}




