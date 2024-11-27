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
 * @TableName wcs_off_line_des
 */
@TableName(value ="wcs_off_line_des")
@Data
public class WcsOffLineDes implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer off_line_des_id;

    /**
     * 
     */
    private Date off_line_start_date;

    /**
     * 
     */
    private Date off_line_end_date;

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
        WcsOffLineDes other = (WcsOffLineDes) that;
        return (this.getOff_line_des_id() == null ? other.getOff_line_des_id() == null : this.getOff_line_des_id().equals(other.getOff_line_des_id()))
            && (this.getOff_line_start_date() == null ? other.getOff_line_start_date() == null : this.getOff_line_start_date().equals(other.getOff_line_start_date()))
            && (this.getOff_line_end_date() == null ? other.getOff_line_end_date() == null : this.getOff_line_end_date().equals(other.getOff_line_end_date()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOff_line_des_id() == null) ? 0 : getOff_line_des_id().hashCode());
        result = prime * result + ((getOff_line_start_date() == null) ? 0 : getOff_line_start_date().hashCode());
        result = prime * result + ((getOff_line_end_date() == null) ? 0 : getOff_line_end_date().hashCode());
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
        sb.append(", off_line_des_id=").append(off_line_des_id);
        sb.append(", off_line_start_date=").append(off_line_start_date);
        sb.append(", off_line_end_date=").append(off_line_end_date);
        sb.append(", series=").append(series);
        sb.append(", device_type=").append(device_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}