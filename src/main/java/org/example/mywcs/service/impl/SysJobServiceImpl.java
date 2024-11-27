package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.SysJob;
import org.example.mywcs.service.SysJobService;
import org.example.mywcs.mapper.SysJobMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【sys_job(定时任务调度表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:09
*/
@Service
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob>
    implements SysJobService{

}




