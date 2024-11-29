package org.example.mywcs.service;

import io.minio.errors.*;
import org.example.mywcs.domain.WcsUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.mywcs.domain.node.MenuNode;
import org.example.mywcs.domain.vo.UserVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
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

    List<WcsUser> select();

    List<UserVo> listAll();

    boolean updatePassword(Long id, String password);

    String upload(MultipartFile file) throws IOException, ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, InvalidExpiresRangeException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException;
}
