package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.SysJobLog;
import org.example.mywcs.service.SysJobLogService;
import org.example.mywcs.mapper.SysJobLogMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【sys_job_log(定时任务调度日志表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:09
*/
@Service
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog>
    implements SysJobLogService{

}




