package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.*;
import org.example.mywcs.domain.node.MenuNode;
import org.example.mywcs.domain.vo.UserVo;
import org.example.mywcs.mapper.*;
import org.example.mywcs.service.WcsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
* @author 15268
* @description 针对表【wcs_user(用户信息表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsUserServiceImpl extends ServiceImpl<WcsUserMapper, WcsUser>
    implements WcsUserService{
    @Autowired(required = false)
    private WcsUserMapper wcsUserMapper;
    @Autowired(required = false)
    private WcsDeptMapper wcsDeptMapper;
    @Autowired(required = false)
    private WcsRoleMapper wcsRoleMapper;
    @Autowired(required = false)
    private WcsUserRoleMapper wcsUserRoleMapper;
    @Autowired(required = false)
    private WcsMenuMapper wcsMenuMapper;



    @Override
    public String selectPassword(String username) {
        QueryWrapper<WcsUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name", username);
        WcsUser wcsUser = wcsUserMapper.selectOne(queryWrapper);
        return wcsUser.getPassword();
    }

    @Override
    public UserVo getDetails(String number) {
        QueryWrapper<WcsUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id", number);
        WcsUser wcsUser = wcsUserMapper.selectOne(queryWrapper);
        QueryWrapper<WcsDept> deptWrapper=new QueryWrapper<>();
        deptWrapper.eq("id", wcsUser.getDept_id());
        WcsDept wcsDept = wcsDeptMapper.selectOne(deptWrapper);
        UserVo user = new UserVo();
        user.setAvatar(wcsUser.getAvatar());
        user.setEmail(wcsUser.getEmail());
        user.setPhonenumber(wcsUser.getPhonenumber());
        user.setUser_name(wcsUser.getUser_name());
        user.setNick_name(wcsUser.getNick_name());
        user.setDel_flag(wcsUser.getDel_flag());
        user.setCreate_by(wcsUser.getCreate_by());
        user.setUpdate_by(wcsUser.getUpdate_by());
        user.setDept_id(wcsUser.getDept_id());
        user.setDeptVo(wcsDept);
        user.setLogin_date(wcsUser.getLogin_date());
        user.setEmail(wcsUser.getEmail());
        user.setRemark(wcsUser.getRemark());
        user.setSex(wcsUser.getSex());
        user.setUser_type(wcsUser.getUser_type());
        QueryWrapper<WcsRole> wcsRoleQueryWrapper=new QueryWrapper<>();
        WcsRole wcsRole = wcsRoleMapper.selectOne(wcsRoleQueryWrapper);
        user.setRoleVo(wcsRole);
        return user;
    }

    @Override
    public List<MenuNode> getRouters(String number) {
        QueryWrapper<WcsUserRole> wcsRoleQueryWrapper=new QueryWrapper<>();
        wcsRoleQueryWrapper.eq("user_id", number);
        WcsUserRole wcsUserRole = wcsUserRoleMapper.selectOne(wcsRoleQueryWrapper);
        List<String> menuId =wcsUserRoleMapper.getRoleId(wcsUserRole.getRole_id());
        QueryWrapper<WcsMenu> wcsMenuQueryWrapper=new QueryWrapper<>();
        List<MenuNode> wcsMenus = wcsMenuMapper.selectList(menuId);
        List<MenuNode> wcsMenus1 = this.recursionBuildingGroup(wcsMenus , wcsMenus.get(0).getMenu_id());
        return wcsMenus1;
    }

    @Override
    public List<UserVo> listAll() {
        List<WcsUserRole> userRoles=wcsUserRoleMapper.selectAllUserMenuId();
        QueryWrapper<WcsUserRole>queryWrapper=new QueryWrapper<>();

        return null;
    }

    private List<MenuNode> recursionBuildingGroup(List<MenuNode> wcsMenus, Long i) {
        List<MenuNode> sonList = new ArrayList<>();
        //迭代数据得到所有节点
        for (MenuNode res : wcsMenus) {
            //判断此节点的父ID是否等于要得到的节点
            if (res.getParent_id().equals(i)) {
                //递归调用当前的ID是否存在子节点
                List<MenuNode> list = recursionBuildingGroup
                        (wcsMenus, res.getMenu_id());
                //得到对应的子节点的集合
                res.setChildren(list);
                sonList.add(res);
            }
        }
        return sonList;
    }
}




