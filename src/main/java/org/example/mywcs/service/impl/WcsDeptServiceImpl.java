package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsDept;
import org.example.mywcs.service.WcsDeptService;
import org.example.mywcs.mapper.WcsDeptMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_dept(部门表)】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsDeptServiceImpl extends ServiceImpl<WcsDeptMapper, WcsDept>
    implements WcsDeptService{

}




