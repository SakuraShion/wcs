package org.example.mywcs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mywcs.domain.WcsZoneRule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.mywcs.domain.vo.RuleZoneVo;

import java.util.List;
import java.util.Map;

/**
* @author 15268
* @description 针对表【wcs_zone_rule】的数据库操作Mapper
* @createDate 2024-11-26 11:21:10
* @Entity generator.domain.WcsZoneRule
*/
@Mapper
public interface WcsZoneRuleMapper extends BaseMapper<WcsZoneRule> {
    List<WcsZoneRule> selectList();
}




