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
 * @TableName wcs_low_battery
 */
@TableName(value ="wcs_low_battery")
@Data
public class WcsLowBattery implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer low_battery_id;

    /**
     * 
     */
    private Integer bat_soc;

    /**
     * 
     */
    private Integer mark_low_soc;

    /**
     * 
     */
    private Date low_time;

    /**
     * 
     */
    private Date recover_time;

    /**
     * 
     */
    private String series;

    /**
     * 
     */
    private Integer device_type;

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
        WcsLowBattery other = (WcsLowBattery) that;
        return (this.getLow_battery_id() == null ? other.getLow_battery_id() == null : this.getLow_battery_id().equals(other.getLow_battery_id()))
            && (this.getBat_soc() == null ? other.getBat_soc() == null : this.getBat_soc().equals(other.getBat_soc()))
            && (this.getMark_low_soc() == null ? other.getMark_low_soc() == null : this.getMark_low_soc().equals(other.getMark_low_soc()))
            && (this.getLow_time() == null ? other.getLow_time() == null : this.getLow_time().equals(other.getLow_time()))
            && (this.getRecover_time() == null ? other.getRecover_time() == null : this.getRecover_time().equals(other.getRecover_time()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLow_battery_id() == null) ? 0 : getLow_battery_id().hashCode());
        result = prime * result + ((getBat_soc() == null) ? 0 : getBat_soc().hashCode());
        result = prime * result + ((getMark_low_soc() == null) ? 0 : getMark_low_soc().hashCode());
        result = prime * result + ((getLow_time() == null) ? 0 : getLow_time().hashCode());
        result = prime * result + ((getRecover_time() == null) ? 0 : getRecover_time().hashCode());
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getDevice_type() == null) ? 0 : getDevice_type().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", low_battery_id=").append(low_battery_id);
        sb.append(", bat_soc=").append(bat_soc);
        sb.append(", mark_low_soc=").append(mark_low_soc);
        sb.append(", low_time=").append(low_time);
        sb.append(", recover_time=").append(recover_time);
        sb.append(", series=").append(series);
        sb.append(", device_type=").append(device_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}