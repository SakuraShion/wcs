package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色信息表
 * @TableName wcs_role
 */
@TableName(value ="wcs_role")
@Data
public class WcsRole implements Serializable {
    /**
     * 角色ID
     */
    @TableId(type = IdType.AUTO)
    private Long role_id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色权限字符串
     */
    private String role_key;

    /**
     * 显示顺序
     */
    private Integer role_sort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     */
    private String data_scope;

    /**
     * 菜单树选择项是否关联显示
     */
    private Integer menu_check_strictly;

    /**
     * 部门树选择项是否关联显示
     */
    private Integer dept_check_strictly;

    /**
     * 角色状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String del_flag;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新者
     */
    private String update_by;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", role_id=").append(role_id);
        sb.append(", role_name=").append(roleName);
        sb.append(", role_key=").append(role_key);
        sb.append(", role_sort=").append(role_sort);
        sb.append(", data_scope=").append(data_scope);
        sb.append(", menu_check_strictly=").append(menu_check_strictly);
        sb.append(", dept_check_strictly=").append(dept_check_strictly);
        sb.append(", status=").append(status);
        sb.append(", del_flag=").append(del_flag);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}