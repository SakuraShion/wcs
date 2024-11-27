package org.example.mywcs.domain.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain.vo
 * @Project：my-wcs
 * @Date：26/11/2024 2:18 pm
 */
@Data
public class DeptVo {
        private String loginStatus;
        private String updateTime;
        private String createBy;
        private String createTime;
        private String updateBy;
        private String remark;
        private String params;
        private String deptId;
        private String parentId;
        private String ancestors;
        private String deptName;
        private String orderNum;
        private String leader;
        private String phone;
        private String email;
        private String status;
        private String delFlag;
        private String parentName;
        private List<DeptVo> children;
}
