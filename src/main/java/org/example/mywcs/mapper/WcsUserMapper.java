package org.example.mywcs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.mywcs.domain.WcsRole;
import org.example.mywcs.domain.WcsUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 15268
* @description 针对表【wcs_user(用户信息表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:10
* @Entity generator.domain.WcsUser
*/
@Mapper
public interface WcsUserMapper extends BaseMapper<WcsUser> {
    WcsUser select(String userId);

    List<WcsUser> selectList();

    int updatePassword(@Param("id") Long id,@Param("password") String password);
}




