package org.example.mywcs.controller;

import org.example.mywcs.domain.SysDictData;
import org.example.mywcs.domain.SysDictType;
import org.example.mywcs.mapper.SysDictDataMapper;
import org.example.mywcs.mapper.SysDictTypeMapper;
import org.example.mywcs.untils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.controller
 * @Project：my-wcs
 * @Date：27/11/2024 4:25 pm
 */
@RestController
@RequestMapping("/dict")
public class SysDictController {
    @Autowired
    private SysDictDataMapper sysDictDataMapper;
    @Autowired
    private SysDictTypeMapper dictTypeMapper;
    @GetMapping("/data")
    public R getDictData(){
        List<SysDictData> sysDictData = sysDictDataMapper.selectList();
        return R.ok().put("sysDictDate",sysDictData);
    }

    @GetMapping("/type")
    public R getByType(@RequestParam String type){
        List<SysDictData>sysDictData= sysDictDataMapper.selectByType(type);
        return R.ok().put("sysDictData",sysDictData);
    }

    @PostMapping("/add")
    public R add(@RequestBody SysDictData sysDictData){
        int insert = sysDictDataMapper.insert(sysDictData);
        return R.ok(String.valueOf(insert));
    }
    @PutMapping("/update")
    public R update(@RequestBody SysDictData sysDictData){
        int update = sysDictDataMapper.updateById(sysDictData);
        return R.ok(String.valueOf(update));
    }
    @DeleteMapping("/delete")
    public R delete(@RequestParam Long id){
        int delete = sysDictDataMapper.deleteById(id);
        return R.ok(String.valueOf(delete));
    }

    @PostMapping("/addType")
    public R addType(@RequestBody SysDictType dictType){
        int insert = dictTypeMapper.insert(dictType);
        return R.ok(String.valueOf(insert));
    }
    @PostMapping("/updateType")
    public R updateType(@RequestBody SysDictType dictType){
        int update = dictTypeMapper.updateById(dictType);
        return R.ok(String.valueOf(update));
    }
    @DeleteMapping("/deleteType")
    public R deleteType(@RequestParam Long id){
        int delete = dictTypeMapper.deleteById(id);
        return R.ok(String.valueOf(delete));
    }





}
