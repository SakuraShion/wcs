package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsNode;
import org.example.mywcs.service.WcsNodeService;
import org.example.mywcs.mapper.WcsNodeMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_node】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsNodeServiceImpl extends ServiceImpl<WcsNodeMapper, WcsNode>
    implements WcsNodeService{

}




