package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsCode;
import org.example.mywcs.service.WcsCodeService;
import org.example.mywcs.mapper.WcsCodeMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_code】的数据库操作Service实现
* @createDate 2024-11-26 11:21:09
*/
@Service
public class WcsCodeServiceImpl extends ServiceImpl<WcsCodeMapper, WcsCode>
    implements WcsCodeService{

}



