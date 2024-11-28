package org.example.mywcs.domain.model;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain.model
 * @Project：my-wcs
 * @Date：28/11/2024 10:16 am
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel{

    @ExcelProperty(value="用户名",index = 0)
    private String userName;
    @ExcelProperty(value = "邮箱",index = 1)
    private String email;
    @ExcelProperty(value = "密码",index=2)
    private String password;
}
