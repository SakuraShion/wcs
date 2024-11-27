package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色和菜单关联表
 * @TableName wcs_role_menu
 */
@TableName(value ="wcs_role_menu")
@Data
public class WcsRoleMenu implements Serializable {
    /**
     * 角色ID
     */
    @TableId
    private Long role_id;

    /**
     * 菜单ID
     */
    private Long menu_id;

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
        WcsRoleMenu other = (WcsRoleMenu) that;
        return (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()))
            && (this.getMenu_id() == null ? other.getMenu_id() == null : this.getMenu_id().equals(other.getMenu_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        result = prime * result + ((getMenu_id() == null) ? 0 : getMenu_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", role_id=").append(role_id);
        sb.append(", menu_id=").append(menu_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}