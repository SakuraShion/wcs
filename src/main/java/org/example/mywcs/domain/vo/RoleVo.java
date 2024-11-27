package org.example.mywcs.domain.vo;

import lombok.Data;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain.vo
 * @Project：my-wcs
 * @Date：26/11/2024 2:28 pm
 */
@Data
public class RoleVo {
     private String loginStatus;
     private String updateTime;
     private String createBy;
     private String createTime;
     private String updateBy;
     private String remark;
     private String params;
     private String roleId;
     private String roleName;
     private String roleKey;
     private String admin;
     private String roleSort;
     private String dataScope;
     private String menuCheckStrictly;
     private String deptCheckStrictly;
     private String status;
     private String delFlag;
     private String flag;
     private String menuIds;
     private String deptIds;
}
