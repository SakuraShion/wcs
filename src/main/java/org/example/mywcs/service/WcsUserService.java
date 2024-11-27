package org.example.mywcs.service;

import org.example.mywcs.domain.WcsUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.mywcs.domain.node.MenuNode;
import org.example.mywcs.domain.vo.UserVo;

import java.util.List;

/**
* @author 15268
* @description 针对表【wcs_user(用户信息表)】的数据库操作Service
* @createDate 2024-11-26 11:21:10
*/
public interface WcsUserService extends IService<WcsUser> {

    String selectPassword(String password);

    UserVo getDetails(String number);

    List<MenuNode> getRouters(String number);

    List<UserVo> listAll();

    boolean updatePassword(Long id, String password);
}
