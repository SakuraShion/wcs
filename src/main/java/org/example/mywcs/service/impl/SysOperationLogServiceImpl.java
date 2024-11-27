package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.SysOperationLog;
import org.example.mywcs.service.SysOperationLogService;
import org.example.mywcs.mapper.SysOperationLogMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【sys_operation_log(操作日志)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:09
*/
@Service
public class SysOperationLogServiceImpl extends ServiceImpl<SysOperationLogMapper, SysOperationLog>
    implements SysOperationLogService{

}




