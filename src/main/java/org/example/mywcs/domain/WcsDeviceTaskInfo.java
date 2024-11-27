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
 * @TableName wcs_device_task_info
 */
@TableName(value ="wcs_device_task_info")
@Data
public class WcsDeviceTaskInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer device_task_info_id;

    /**
     * 
     */
    private Long exec_today_task_time;

    /**
     * 
     */
    private Date cur_date;

    /**
     * 
     */
    private Long exec_all_task_time;

    /**
     * 
     */
    private Integer exec_task_num;

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
        WcsDeviceTaskInfo other = (WcsDeviceTaskInfo) that;
        return (this.getDevice_task_info_id() == null ? other.getDevice_task_info_id() == null : this.getDevice_task_info_id().equals(other.getDevice_task_info_id()))
            && (this.getExec_today_task_time() == null ? other.getExec_today_task_time() == null : this.getExec_today_task_time().equals(other.getExec_today_task_time()))
            && (this.getCur_date() == null ? other.getCur_date() == null : this.getCur_date().equals(other.getCur_date()))
            && (this.getExec_all_task_time() == null ? other.getExec_all_task_time() == null : this.getExec_all_task_time().equals(other.getExec_all_task_time()))
            && (this.getExec_task_num() == null ? other.getExec_task_num() == null : this.getExec_task_num().equals(other.getExec_task_num()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDevice_task_info_id() == null) ? 0 : getDevice_task_info_id().hashCode());
        result = prime * result + ((getExec_today_task_time() == null) ? 0 : getExec_today_task_time().hashCode());
        result = prime * result + ((getCur_date() == null) ? 0 : getCur_date().hashCode());
        result = prime * result + ((getExec_all_task_time() == null) ? 0 : getExec_all_task_time().hashCode());
        result = prime * result + ((getExec_task_num() == null) ? 0 : getExec_task_num().hashCode());
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
        sb.append(", device_task_info_id=").append(device_task_info_id);
        sb.append(", exec_today_task_time=").append(exec_today_task_time);
        sb.append(", cur_date=").append(cur_date);
        sb.append(", exec_all_task_time=").append(exec_all_task_time);
        sb.append(", exec_task_num=").append(exec_task_num);
        sb.append(", series=").append(series);
        sb.append(", device_type=").append(device_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}