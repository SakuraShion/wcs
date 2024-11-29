package org.example.mywcs.service.impl;

import ch.qos.logback.classic.html.UrlCssBuilder;
import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.minio.PutObjectArgs;
import io.minio.errors.*;
import org.example.mywcs.domain.*;
import org.example.mywcs.domain.node.DeptNode;
import org.example.mywcs.domain.node.MenuNode;
import org.example.mywcs.domain.vo.UserVo;
import org.example.mywcs.mapper.*;
import org.example.mywcs.service.WcsUserService;
import org.example.mywcs.untils.MinioUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.example.mywcs.untils.MinioUtil.minioUtil;

/**
* @author 15268
* @description 针对表【wcs_user(用户信息表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsUserServiceImpl extends ServiceImpl<WcsUserMapper, WcsUser>
    implements WcsUserService{
    @Autowired
    private WcsUserMapper wcsUserMapper;
    @Autowired
    private WcsDeptMapper wcsDeptMapper;
    @Autowired
    private WcsRoleMapper wcsRoleMapper;
    @Autowired
    private WcsUserRoleMapper wcsUserRoleMapper;
    @Autowired
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
        WcsUser wcsUser = wcsUserMapper.select(number);
        QueryWrapper<WcsDept> deptWrapper=new QueryWrapper<>();
        deptWrapper.eq("dept_id", wcsUser.getDept_id());
        WcsDept wcsDept = wcsDeptMapper.selectOne(deptWrapper);
        UserVo user = new UserVo();
        user.setAvatar(wcsUser.getAvatar());
        user.setEmail(wcsUser.getEmail());
        user.setUser_id(wcsUser.getUser_id());
        user.setPhonenumber(wcsUser.getPhonenumber());
        user.setUser_name(wcsUser.getUser_name());
        user.setNick_name(wcsUser.getNick_name());
        user.setDel_flag(wcsUser.getDel_flag());
        user.setCreate_by(wcsUser.getCreate_by());
        user.setUpdate_by(wcsUser.getUpdate_by());
        user.setDept_id(wcsUser.getDept_id());
        user.setLogin_date(wcsUser.getLogin_date());
        user.setEmail(wcsUser.getEmail());
        user.setRemark(wcsUser.getRemark());
        user.setSex(wcsUser.getSex());
        user.setUser_type(wcsUser.getUser_type());

        Integer i = wcsUserRoleMapper.selectRole(String.valueOf(user.getUser_id()));

        WcsRole wcsRole = wcsRoleMapper.select(i);
        user.setWcsRole(wcsRole);
        return user;
    }

    @Override
    public List<MenuNode> getRouters(String number) {

        WcsUserRole wcsUserRole = wcsUserRoleMapper.selectByUserId(Long.valueOf(number));
        List<String> menuId =wcsUserRoleMapper.getRoleId(wcsUserRole.getRole_id());
        QueryWrapper<WcsMenu> wcsMenuQueryWrapper=new QueryWrapper<>();
        List<WcsMenu> wcsMenus = wcsMenuMapper.selectList(menuId);
        List<MenuNode> menuNodes=new ArrayList<>();
        for (WcsMenu wcsMenuNode : wcsMenus) {
            MenuNode menuNode=new MenuNode();
            BeanUtil.copyProperties(wcsMenuNode, menuNode);
            menuNodes.add(menuNode);
        }
        List<MenuNode> wcsMenus1 = this.recursionBuildingGroup(menuNodes , menuNodes.get(0).getMenu_id());
        return wcsMenus1;
    }

    @Override
    public List<WcsUser> select() {
        List<WcsUser> wcsUsers = wcsUserMapper.selectList();
        return wcsUsers;
    }

    @Override
    public List<UserVo> listAll() {
        List<WcsUserRole> userRoles=wcsUserRoleMapper.selectAllUserMenuId();
        QueryWrapper<WcsUserRole>queryWrapper=new QueryWrapper<>();
        List<UserVo> userVos = new ArrayList<>();
        userRoles.stream().forEach(wcsUserRole -> {
            UserVo vo=new UserVo();
            List<String> menuId = wcsUserRoleMapper.getRoleId(wcsUserRole.getRole_id());
            List<WcsMenu> wcsMenus = wcsMenuMapper.selectList(menuId);
            //菜单树
            List<MenuNode> menuNodes=new ArrayList<>();
            for (WcsMenu wcsMenu : wcsMenus) {
                MenuNode menuNode=new MenuNode();
                BeanUtil.copyProperties(wcsMenu,menuNode);
                menuNodes.add(menuNode);
            }
            WcsUser wcsUser = wcsUserMapper.select(String.valueOf(wcsUserRole.getUser_id()));
            List<MenuNode> wcsMenus1 = this.recursionBuildingGroup(menuNodes , wcsMenus.get(0).getMenu_id());
            vo.setMenuNode(wcsMenus1);
            //部门树

            WcsDept wcsDepts = wcsDeptMapper.selectDeptByUser(wcsUser.getDept_id());
            List<WcsDept> wcsDepts1 = wcsDeptMapper.selectList();
            List<DeptNode> deptNodes=new ArrayList<>(wcsDepts1.size());
            for (WcsDept wcsDept : wcsDepts1){
                DeptNode deptNode=new DeptNode();
                BeanUtil.copyProperties(wcsDept,deptNode);
                deptNodes.add(deptNode);
            }
            List<DeptNode> deptNodes1 = this.recursionBuildingGroupDept(deptNodes, wcsUser.getDept_id());
            vo.setDeptNode(deptNodes1);


            vo.setAvatar(wcsUser.getAvatar());
            vo.setEmail(wcsUser.getEmail());
            vo.setPhonenumber(wcsUser.getPhonenumber());
            vo.setUser_name(wcsUser.getUser_name());
            vo.setNick_name(wcsUser.getNick_name());
            vo.setDel_flag(wcsUser.getDel_flag());
            vo.setCreate_by(wcsUser.getCreate_by());
            vo.setUpdate_by(wcsUser.getUpdate_by());
            vo.setDept_id(wcsUser.getDept_id());
            vo.setLogin_date(wcsUser.getLogin_date());
            vo.setRemark(wcsUser.getRemark());
            vo.setSex(wcsUser.getSex());
            vo.setUser_type(wcsUser.getUser_type());


            userVos.add(vo);
        });


        return userVos;
    }

    @Override
    public boolean updatePassword(Long id, String password) {
        int i=wcsUserMapper.updatePassword(id, password);
        return false;
    }

    @Override
    public String upload(MultipartFile file) throws IOException, ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, InvalidExpiresRangeException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        String s = MinioUtil.uploadFile(file.getInputStream(), "myfile", file.getOriginalFilename());
        String[] split = s.split("/");
        String sb=new String();
        sb+=split[split.length-2];
        sb+="/";
        sb+=split[split.length-1];
        String getpresign = MinioUtil.getpresign(sb);
        return getpresign;
    }

    private List<MenuNode> recursionBuildingGroup(List<MenuNode> wcsMenus, Long i) {
        List<MenuNode> sonList = new ArrayList<>();
        //迭代数据得到所有节点
        for (MenuNode res : wcsMenus) {
            //判断此节点的父ID是否等于要得到的节点
            if (res.getParent_id().equals(i)) {
                //递归调用当前的ID是否存在子节点
                List<MenuNode> list = recursionBuildingGroup(wcsMenus, res.getMenu_id());
                //得到对应的子节点的集合
                res.setChildren(list);
                sonList.add(res);
            }
        }
        return sonList;
    }


    private List<DeptNode> recursionBuildingGroupDept(List<DeptNode> deptMenus, Long i) {
        List<DeptNode> sonList = new ArrayList<>();
        //迭代数据得到所有节点
        for (DeptNode res : deptMenus) {
            //判断此节点的父ID是否等于要得到的节点
            if (res.getParent_id().equals(i)) {
                //递归调用当前的ID是否存在子节点
                List<DeptNode> list = recursionBuildingGroupDept(deptMenus, res.getDept_id());
                //得到对应的子节点的集合
                res.setChildren(list);
                sonList.add(res);
            }
        }
        return sonList;
    }



}






