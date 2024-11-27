package org.example.mywcs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mywcs.domain.WcsMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.mywcs.domain.node.MenuNode;

import java.util.List;

/**
* @author 15268
* @description 针对表【wcs_menu(菜单权限表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:10
* @Entity generator.domain.WcsMenu
*/
@Mapper
public interface WcsMenuMapper extends BaseMapper<WcsMenu> {
    List<WcsMenu> selectList(List<String> id);


}




