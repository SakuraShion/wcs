package org.example.mywcs.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;

import com.alibaba.excel.read.listener.PageReadListener;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import io.minio.errors.*;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.sl.usermodel.Sheet;
import org.example.mywcs.domain.WcsUser;
import org.example.mywcs.domain.model.UserModel;
import org.example.mywcs.domain.node.MenuNode;
import org.example.mywcs.domain.vo.UserVo;
import org.example.mywcs.service.WcsUserService;
import org.example.mywcs.untils.R;
import org.example.mywcs.untils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.core.io.InputStreamResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

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
    public R resetPassword(@RequestParam Long id, @RequestParam String password,@RequestParam String tokenId){
        //String userId = ThreadLocalUtil.getUserId();
        // TODO: 27/11/2024 reset password
        boolean b = wcsUserService.updatePassword(id, password);
        if (b) {
            redisTemplate.delete(tokenId);
            return R.ok();
        }
        return R.error();

    }

    @GetMapping("/export")
    public ResponseEntity<InputStreamResource> exportUser() throws IOException {
        // Output stream for the generated Excel file
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Create a writer for the output stream
        ExcelWriter writer = EasyExcel.write(outputStream,UserModel.class).build();

        // Prepare the data
        List<WcsUser> wcsUser = wcsUserService.select();
        List<UserModel> userModels = new ArrayList<>();

        // Convert WcsUser to UserModel
        wcsUser.forEach(x -> {
            UserModel userModel = new UserModel();
            userModel.setUserName(x.getUser_name());
            userModel.setPassword(x.getPassword());
            userModel.setEmail(x.getEmail());
            userModels.add(userModel);
        });

        // Write the user data to the Excel sheet
        writer.write(userModels, EasyExcel.writerSheet("user").build());

        // Finish writing
        writer.finish();

        // Create an input stream from the output stream
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());

        // Set the headers for the response
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=test.xlsx");
        headers.add(HttpHeaders.CONTENT_TYPE, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

        // Return the response entity with the Excel file as the body
        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(inputStream));

    }
    @PostMapping("/importData")
    public R importData(@RequestParam("file") MultipartFile file) throws IOException {
        EasyExcelFactory.read(file.getInputStream(),WcsUser.class,new PageReadListener<WcsUser>(dateList->{
            for (WcsUser user :dateList){
                wcsUserService.save(user);
            }
        })).sheet().doRead();
        return R.ok();
    }

    @PostMapping("/uploadimg")
    public R uploadImg(@RequestParam("file") MultipartFile file) throws IOException, ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, InvalidExpiresRangeException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        String result=wcsUserService.upload(file);
        return R.ok().put("r",result);
    }
}
