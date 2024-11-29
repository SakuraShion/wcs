package org.example.mywcs.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.mywcs.domain.WcsZoneRule;
import org.example.mywcs.domain.vo.RuleZoneVo;
import org.example.mywcs.service.WcsZoneRuleService;
import org.example.mywcs.untils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.controller
 * @Project：my-wcs
 * @Date：29/11/2024 11:00 am
 */
@RestController
@RequestMapping("/rule")
public class RoleController {
    @Autowired
    private WcsZoneRuleService wcsZoneRuleService;

    @GetMapping("/getZoneRuleList")
    public R getZoneRuleList(@RequestParam(defaultValue = "1") int pageNum , @RequestParam(defaultValue = "2") int pageSize) {
        HashMap<Integer,List<RuleZoneVo>> map=new HashMap<>();
        List<RuleZoneVo> ruleZoneVos=wcsZoneRuleService.selectList(pageNum,pageSize);
        int maxPageNum=0;
        if (ruleZoneVos.size()%pageSize==0){
            maxPageNum=ruleZoneVos.size()/pageSize;
        }else{
            maxPageNum=ruleZoneVos.size()/pageSize+1;
        }
        if (pageNum>maxPageNum){
            pageNum=maxPageNum;
        }
        int index=(pageNum-1)*pageSize;
        int indexMax=0;
 /*       if (ruleZoneVos.size()%pageSize==0){
            indexMax=ruleZoneVos.size()/pageSize;
        }else {
            indexMax=ruleZoneVos.size()/pageSize+1;
        }
        if (index>indexMax){
            index=indexMax;
        }*/
        int end=index+pageSize;
        if (end>ruleZoneVos.size()){
            end= ruleZoneVos.size();
        }
        List<RuleZoneVo> ruleZoneVos1 = ruleZoneVos.subList(index, end);

        return R.ok().put("ruleZoneVos", ruleZoneVos1);
    }
}
