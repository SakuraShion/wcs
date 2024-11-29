package org.example.mywcs.domain.vo;

import org.example.mywcs.domain.WcsZoneRule;

import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain.vo
 * @Project：my-wcs
 * @Date：29/11/2024 11:03 am
 */
public class RuleZoneVo extends WcsZoneRule {

    List<Integer> gridzList;

    public List<Integer> getGridzList() {
        return gridzList;
    }

    public void setGridzList(List<Integer> gridzList) {
        this.gridzList = gridzList;
    }
}
