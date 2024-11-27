package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.SysOperLog;
import org.example.mywcs.service.SysOperLogService;
import org.example.mywcs.mapper.SysOperLogMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【sys_oper_log(操作日志记录)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:09
*/
@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog>
    implements SysOperLogService{

}




