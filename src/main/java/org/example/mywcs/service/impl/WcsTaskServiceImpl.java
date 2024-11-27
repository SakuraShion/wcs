package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsTask;
import org.example.mywcs.service.WcsTaskService;
import org.example.mywcs.mapper.WcsTaskMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_task】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsTaskServiceImpl extends ServiceImpl<WcsTaskMapper, WcsTask>
    implements WcsTaskService{

}




