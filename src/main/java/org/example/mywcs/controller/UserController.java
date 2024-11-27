package org.example.mywcs.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.mywcs.domain.WcsUser;
import org.example.mywcs.domain.node.MenuNode;
import org.example.mywcs.domain.vo.UserVo;
import org.example.mywcs.service.WcsUserService;
import org.example.mywcs.untils.R;
import org.example.mywcs.untils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.controller
 * @Project：my-wcs
 * @Date：26/11/2024 11:27 am
 */
@RestController
@RequestMapping("/user")
public class UserController {
    HashMap<String, Object> map = new HashMap<>();
    @Autowired
    RedisTemplate redisTemplate;

    private static final Log LOG = LogFactory.getLog(UserController.class);
    @Autowired
    private WcsUserService wcsUserService;



    Calendar instance = Calendar.getInstance();


    @GetMapping("/login")
    public R login(WcsUser wcsUser) {
        try {
            instance.add(Calendar.SECOND, 2);
            String password = wcsUserService.selectPassword(wcsUser.getUser_name());
            if (password.equals(wcsUser.getPassword())) {
                String token = JWT.create().withHeader(map).withClaim("userName", wcsUser.getUser_name())
                        .withClaim("password", wcsUser.getPassword())
                        .withExpiresAt(instance.getTime()).sign(Algorithm.HMAC256("hub-in"));
                Snowflake snowflake = IdUtil.createSnowflake(1, 1);
                long id = snowflake.nextId();

                redisTemplate.opsForValue().set(String.valueOf(id), token);
                LOG.info("登入成功");
                return R.ok().put("token",token);
            }
            return R.error("登入失败，请检查账号或密码");
        } catch (Exception e) {
            LOG.error("登入失败"+e);
            return R.error("登入失败");
        }
    }


    @GetMapping("/logout")
    public R logout(){
        try {
            String token = JWT.create().withHeader(map).withClaim("userName", "").withClaim("password", "").sign(Algorithm.HMAC256("hub-in"));
            redisTemplate.delete(token);
            LOG.info("登出成功");
            return R.ok();
        } catch (Exception e) {
            LOG.error("登出失败");
            return R.error("登出失败");
        }
    }
    @GetMapping("detail")
    public R getInfo() {
        //TODO Auto-generated
        //String userId = ThreadLocalUtil.getUserId();
        UserVo vo=wcsUserService.getDetails("1");
        return R.ok().put("userId", vo);
    }

    @GetMapping("/getRouters")
    //TODO Auto-generated
    public R getRouters(){
//        String userId = ThreadLocalUtil.getUserId();
        List<MenuNode> routers = wcsUserService.getRouters("1");
        return R.ok().put("menuNodes", routers);
    }

    @GetMapping("/list")
    public R list(){
        List<UserVo> wcsUsers=wcsUserService.listAll();
        return R.ok().put("list", wcsUsers);
    }

    @PostMapping("/addUser")
    public R addUser(WcsUser wcsUser){
        wcsUserService.save(wcsUser);
        return R.ok();
    }
    @DeleteMapping("/deleteUser")
    public R deleteUser(WcsUser wcsUser){
        wcsUserService.save(wcsUser);
        return R.ok();
    }
    @PostMapping("/resetPassword")
    public R resetPassword(@RequestParam Long id, @RequestParam String password){
        //String userId = ThreadLocalUtil.getUserId();
        // TODO: 27/11/2024 reset password
        wcsUserService.updatePassword(id, password);
        return R.ok();
    }
}
