package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mywcs.domain.WcsLowBattery;
import org.example.mywcs.service.WcsLowBatteryService;
import org.example.mywcs.mapper.WcsLowBatteryMapper;
import org.springframework.stereotype.Service;

/**
* @author 15268
* @description 针对表【wcs_low_battery】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsLowBatteryServiceImpl extends ServiceImpl<WcsLowBatteryMapper, WcsLowBattery>
    implements WcsLowBatteryService{

}




