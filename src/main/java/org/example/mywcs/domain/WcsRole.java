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
    private String role_name;

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
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WcsRole other = (WcsRole) that;
        return (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getRole_name() == null ? other.getRole_name() == null : this.getRole_name().equals(other.getRole_name()))
            && (this.getRole_key() == null ? other.getRole_key() == null : this.getRole_key().equals(other.getRole_key()))
            && (this.getRole_sort() == null ? other.getRole_sort() == null : this.getRole_sort().equals(other.getRole_sort()))
            && (this.getData_scope() == null ? other.getData_scope() == null : this.getData_scope().equals(other.getData_scope()))
            && (this.getMenu_check_strictly() == null ? other.getMenu_check_strictly() == null : this.getMenu_check_strictly().equals(other.getMenu_check_strictly()))
            && (this.getDept_check_strictly() == null ? other.getDept_check_strictly() == null : this.getDept_check_strictly().equals(other.getDept_check_strictly()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDel_flag() == null ? other.getDel_flag() == null : this.getDel_flag().equals(other.getDel_flag()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getRole_name() == null) ? 0 : getRole_name().hashCode());
        result = prime * result + ((getRole_key() == null) ? 0 : getRole_key().hashCode());
        result = prime * result + ((getRole_sort() == null) ? 0 : getRole_sort().hashCode());
        result = prime * result + ((getData_scope() == null) ? 0 : getData_scope().hashCode());
        result = prime * result + ((getMenu_check_strictly() == null) ? 0 : getMenu_check_strictly().hashCode());
        result = prime * result + ((getDept_check_strictly() == null) ? 0 : getDept_check_strictly().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDel_flag() == null) ? 0 : getDel_flag().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", role_id=").append(role_id);
        sb.append(", role_name=").append(role_name);
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