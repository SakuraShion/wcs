package org.example.mywcs.mapper;

import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.mywcs.domain.SysDictData;

import java.util.List;

/**
* @author 15268
* @description 针对表【sys_dict_data(字典数据表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:09
* @Entity generator.domain.SysDictData
*/
@Mapper
public interface SysDictDataMapper extends BaseMapper<SysDictData> {
    List<SysDictData> selectList();

    List<SysDictData> selectByType(String type);
}




