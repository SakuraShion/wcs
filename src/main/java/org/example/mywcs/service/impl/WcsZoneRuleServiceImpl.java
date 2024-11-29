package org.example.mywcs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.example.mywcs.domain.WcsZoneRule;
import org.example.mywcs.domain.vo.RuleZoneVo;
import org.example.mywcs.service.WcsZoneRuleService;
import org.example.mywcs.mapper.WcsZoneRuleMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
* @author 15268
* @description 针对表【wcs_zone_rule】的数据库操作Service实现
* @createDate 2024-11-26 11:21:10
*/
@Service
public class WcsZoneRuleServiceImpl extends ServiceImpl<WcsZoneRuleMapper, WcsZoneRule>
    implements WcsZoneRuleService{
    @Autowired
    private WcsZoneRuleMapper wcsZoneRuleMapper;

    @Override
    public List<RuleZoneVo> selectList(int pageNum,int pageSize) {
        List<WcsZoneRule> list=wcsZoneRuleMapper.selectList();
        List<RuleZoneVo> result = new ArrayList<>();
        list.stream().forEach(x->{
            RuleZoneVo vo = new RuleZoneVo();
            BeanUtils.copyProperties(x, vo);
            result.add(vo);
        });
        result.stream().forEach(x -> {
            String gridz = x.getGridz();
            String substring = gridz.substring(1, gridz.length() - 1);
            String[] split = substring.split(",");
            List<Integer> gridzList = new ArrayList<>(split.length);
            for (String s : split) {
                gridzList.add(Integer.parseInt(s));
            }
            x.setGridzList(gridzList);
        });
        return result;
    }
}




