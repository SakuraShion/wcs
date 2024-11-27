package org.example.mywcs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mywcs.domain.SysJob;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 15268
* @description 针对表【sys_job(定时任务调度表)】的数据库操作Mapper
* @createDate 2024-11-26 11:21:09
* @Entity generator.domain.SysJob
*/
@Mapper
public interface SysJobMapper extends BaseMapper<SysJob> {

}




