package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName wcs_assign_config
 */
@TableName(value ="wcs_assign_config")
@Data
public class WcsAssignConfig implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 层
     */
    private Integer floor;

    /**
     * 限制小车数量
     */
    private Integer rgv_limit;

    /**
     * 平均任务数量
     */
    private Integer average;

    /**
     * 区域ID，库区可能划分为多个区域
     */
    private Integer zone_id;

    /**
     * 调车模式,0跨层调车；1跨区调车
     */
    private Integer move_rgv_type;

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
        WcsAssignConfig other = (WcsAssignConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFloor() == null ? other.getFloor() == null : this.getFloor().equals(other.getFloor()))
            && (this.getRgv_limit() == null ? other.getRgv_limit() == null : this.getRgv_limit().equals(other.getRgv_limit()))
            && (this.getAverage() == null ? other.getAverage() == null : this.getAverage().equals(other.getAverage()))
            && (this.getZone_id() == null ? other.getZone_id() == null : this.getZone_id().equals(other.getZone_id()))
            && (this.getMove_rgv_type() == null ? other.getMove_rgv_type() == null : this.getMove_rgv_type().equals(other.getMove_rgv_type()))
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
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFloor() == null) ? 0 : getFloor().hashCode());
        result = prime * result + ((getRgv_limit() == null) ? 0 : getRgv_limit().hashCode());
        result = prime * result + ((getAverage() == null) ? 0 : getAverage().hashCode());
        result = prime * result + ((getZone_id() == null) ? 0 : getZone_id().hashCode());
        result = prime * result + ((getMove_rgv_type() == null) ? 0 : getMove_rgv_type().hashCode());
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
        sb.append(", id=").append(id);
        sb.append(", floor=").append(floor);
        sb.append(", rgv_limit=").append(rgv_limit);
        sb.append(", average=").append(average);
        sb.append(", zone_id=").append(zone_id);
        sb.append(", move_rgv_type=").append(move_rgv_type);
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