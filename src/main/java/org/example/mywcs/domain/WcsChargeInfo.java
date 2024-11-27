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
 * @TableName wcs_charge_info
 */
@TableName(value ="wcs_charge_info")
@Data
public class WcsChargeInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer charge_info_id;

    /**
     * 
     */
    private Integer charge_time;

    /**
     * 
     */
    private Date charge_start_time;

    /**
     * 
     */
    private Integer charge_start_soc;

    /**
     * 
     */
    private Date charge_end_time;

    /**
     * 
     */
    private Integer charge_end_soc;

    /**
     * 
     */
    private Boolean charge_error;

    /**
     * 
     */
    private String charge_error_message;

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
        WcsChargeInfo other = (WcsChargeInfo) that;
        return (this.getCharge_info_id() == null ? other.getCharge_info_id() == null : this.getCharge_info_id().equals(other.getCharge_info_id()))
            && (this.getCharge_time() == null ? other.getCharge_time() == null : this.getCharge_time().equals(other.getCharge_time()))
            && (this.getCharge_start_time() == null ? other.getCharge_start_time() == null : this.getCharge_start_time().equals(other.getCharge_start_time()))
            && (this.getCharge_start_soc() == null ? other.getCharge_start_soc() == null : this.getCharge_start_soc().equals(other.getCharge_start_soc()))
            && (this.getCharge_end_time() == null ? other.getCharge_end_time() == null : this.getCharge_end_time().equals(other.getCharge_end_time()))
            && (this.getCharge_end_soc() == null ? other.getCharge_end_soc() == null : this.getCharge_end_soc().equals(other.getCharge_end_soc()))
            && (this.getCharge_error() == null ? other.getCharge_error() == null : this.getCharge_error().equals(other.getCharge_error()))
            && (this.getCharge_error_message() == null ? other.getCharge_error_message() == null : this.getCharge_error_message().equals(other.getCharge_error_message()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCharge_info_id() == null) ? 0 : getCharge_info_id().hashCode());
        result = prime * result + ((getCharge_time() == null) ? 0 : getCharge_time().hashCode());
        result = prime * result + ((getCharge_start_time() == null) ? 0 : getCharge_start_time().hashCode());
        result = prime * result + ((getCharge_start_soc() == null) ? 0 : getCharge_start_soc().hashCode());
        result = prime * result + ((getCharge_end_time() == null) ? 0 : getCharge_end_time().hashCode());
        result = prime * result + ((getCharge_end_soc() == null) ? 0 : getCharge_end_soc().hashCode());
        result = prime * result + ((getCharge_error() == null) ? 0 : getCharge_error().hashCode());
        result = prime * result + ((getCharge_error_message() == null) ? 0 : getCharge_error_message().hashCode());
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
        sb.append(", charge_info_id=").append(charge_info_id);
        sb.append(", charge_time=").append(charge_time);
        sb.append(", charge_start_time=").append(charge_start_time);
        sb.append(", charge_start_soc=").append(charge_start_soc);
        sb.append(", charge_end_time=").append(charge_end_time);
        sb.append(", charge_end_soc=").append(charge_end_soc);
        sb.append(", charge_error=").append(charge_error);
        sb.append(", charge_error_message=").append(charge_error_message);
        sb.append(", series=").append(series);
        sb.append(", device_type=").append(device_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}