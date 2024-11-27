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
 * @TableName wcs_port
 */
@TableName(value ="wcs_port")
@Data
public class WcsPort implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer port_id;

    /**
     * 
     */
    private String port_name;

    /**
     * 
     */
    private Integer port_mode;

    /**
     * 
     */
    private String scan_name;

    /**
     * 
     */
    private String weight_name;

    /**
     * 
     */
    private String shape_name;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private String update_by;

    /**
     * 
     */
    private String port_code;

    /**
     * 
     */
    private Integer direction;

    /**
     * 有货后入库的延迟时间，单位s, 0s则认为是判断入库按钮信号
     */
    private Integer cargo_time;

    /**
     * 
     */
    private String stations;

    /**
     * 
     */
    private Integer control_model;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 是否接驳、接驳模式
     */
    private Integer connect_mode;

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
        WcsPort other = (WcsPort) that;
        return (this.getPort_id() == null ? other.getPort_id() == null : this.getPort_id().equals(other.getPort_id()))
            && (this.getPort_name() == null ? other.getPort_name() == null : this.getPort_name().equals(other.getPort_name()))
            && (this.getPort_mode() == null ? other.getPort_mode() == null : this.getPort_mode().equals(other.getPort_mode()))
            && (this.getScan_name() == null ? other.getScan_name() == null : this.getScan_name().equals(other.getScan_name()))
            && (this.getWeight_name() == null ? other.getWeight_name() == null : this.getWeight_name().equals(other.getWeight_name()))
            && (this.getShape_name() == null ? other.getShape_name() == null : this.getShape_name().equals(other.getShape_name()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getPort_code() == null ? other.getPort_code() == null : this.getPort_code().equals(other.getPort_code()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getCargo_time() == null ? other.getCargo_time() == null : this.getCargo_time().equals(other.getCargo_time()))
            && (this.getStations() == null ? other.getStations() == null : this.getStations().equals(other.getStations()))
            && (this.getControl_model() == null ? other.getControl_model() == null : this.getControl_model().equals(other.getControl_model()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getConnect_mode() == null ? other.getConnect_mode() == null : this.getConnect_mode().equals(other.getConnect_mode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPort_id() == null) ? 0 : getPort_id().hashCode());
        result = prime * result + ((getPort_name() == null) ? 0 : getPort_name().hashCode());
        result = prime * result + ((getPort_mode() == null) ? 0 : getPort_mode().hashCode());
        result = prime * result + ((getScan_name() == null) ? 0 : getScan_name().hashCode());
        result = prime * result + ((getWeight_name() == null) ? 0 : getWeight_name().hashCode());
        result = prime * result + ((getShape_name() == null) ? 0 : getShape_name().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getPort_code() == null) ? 0 : getPort_code().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getCargo_time() == null) ? 0 : getCargo_time().hashCode());
        result = prime * result + ((getStations() == null) ? 0 : getStations().hashCode());
        result = prime * result + ((getControl_model() == null) ? 0 : getControl_model().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getConnect_mode() == null) ? 0 : getConnect_mode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", port_id=").append(port_id);
        sb.append(", port_name=").append(port_name);
        sb.append(", port_mode=").append(port_mode);
        sb.append(", scan_name=").append(scan_name);
        sb.append(", weight_name=").append(weight_name);
        sb.append(", shape_name=").append(shape_name);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", update_by=").append(update_by);
        sb.append(", port_code=").append(port_code);
        sb.append(", direction=").append(direction);
        sb.append(", cargo_time=").append(cargo_time);
        sb.append(", stations=").append(stations);
        sb.append(", control_model=").append(control_model);
        sb.append(", status=").append(status);
        sb.append(", connect_mode=").append(connect_mode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}