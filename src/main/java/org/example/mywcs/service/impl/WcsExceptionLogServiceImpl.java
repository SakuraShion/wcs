package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsExceptionLog;
import org.example.mywcs.service.WcsExceptionLogService;
import org.example.mywcs.mapper.WcsExceptionLogMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_exception_log】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsExceptionLogServiceImpl extends ServiceImpl<WcsExceptionLogMapper, WcsExceptionLog>
    implements WcsExceptionLogService{

}




