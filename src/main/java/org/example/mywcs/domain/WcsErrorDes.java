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
 * @TableName wcs_error_des
 */
@TableName(value ="wcs_error_des")
@Data
public class WcsErrorDes implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer error_des_id;

    /**
     * 
     */
    private String error_message;

    /**
     * 
     */
    private Date error_time;

    /**
     * 
     */
    private Date end_error_time;

    /**
     * 
     */
    private String error_location;

    /**
     * 
     */
    private String error_task_id;

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
        WcsErrorDes other = (WcsErrorDes) that;
        return (this.getError_des_id() == null ? other.getError_des_id() == null : this.getError_des_id().equals(other.getError_des_id()))
            && (this.getError_message() == null ? other.getError_message() == null : this.getError_message().equals(other.getError_message()))
            && (this.getError_time() == null ? other.getError_time() == null : this.getError_time().equals(other.getError_time()))
            && (this.getEnd_error_time() == null ? other.getEnd_error_time() == null : this.getEnd_error_time().equals(other.getEnd_error_time()))
            && (this.getError_location() == null ? other.getError_location() == null : this.getError_location().equals(other.getError_location()))
            && (this.getError_task_id() == null ? other.getError_task_id() == null : this.getError_task_id().equals(other.getError_task_id()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getError_des_id() == null) ? 0 : getError_des_id().hashCode());
        result = prime * result + ((getError_message() == null) ? 0 : getError_message().hashCode());
        result = prime * result + ((getError_time() == null) ? 0 : getError_time().hashCode());
        result = prime * result + ((getEnd_error_time() == null) ? 0 : getEnd_error_time().hashCode());
        result = prime * result + ((getError_location() == null) ? 0 : getError_location().hashCode());
        result = prime * result + ((getError_task_id() == null) ? 0 : getError_task_id().hashCode());
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
        sb.append(", error_des_id=").append(error_des_id);
        sb.append(", error_message=").append(error_message);
        sb.append(", error_time=").append(error_time);
        sb.append(", end_error_time=").append(end_error_time);
        sb.append(", error_location=").append(error_location);
        sb.append(", error_task_id=").append(error_task_id);
        sb.append(", series=").append(series);
        sb.append(", device_type=").append(device_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}