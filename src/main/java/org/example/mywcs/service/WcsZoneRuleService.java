package org.example.mywcs.service;

import org.example.mywcs.domain.WcsZoneRule;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.mywcs.domain.vo.RuleZoneVo;

import java.util.List;

/**
* @author 15268
* @description 针对表【wcs_zone_rule】的数据库操作Service
* @createDate 2024-11-26 11:21:10
*/
public interface WcsZoneRuleService extends IService<WcsZoneRule> {

    List<RuleZoneVo> selectList(int pageNum,int pageSize);
}
