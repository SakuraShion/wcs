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
 * @TableName wcs_exec_task
 */
@TableName(value ="wcs_exec_task")
@Data
public class WcsExecTask implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer exec_task_id;

    /**
     * 
     */
    private Date exec_time;

    /**
     * 
     */
    private Date end_time;

    /**
     * 
     */
    private String task_id;

    /**
     * 
     */
    private Integer task_type;

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
        WcsExecTask other = (WcsExecTask) that;
        return (this.getExec_task_id() == null ? other.getExec_task_id() == null : this.getExec_task_id().equals(other.getExec_task_id()))
            && (this.getExec_time() == null ? other.getExec_time() == null : this.getExec_time().equals(other.getExec_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getTask_type() == null ? other.getTask_type() == null : this.getTask_type().equals(other.getTask_type()))
            && (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExec_task_id() == null) ? 0 : getExec_task_id().hashCode());
        result = prime * result + ((getExec_time() == null) ? 0 : getExec_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getTask_type() == null) ? 0 : getTask_type().hashCode());
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
        sb.append(", exec_task_id=").append(exec_task_id);
        sb.append(", exec_time=").append(exec_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", task_id=").append(task_id);
        sb.append(", task_type=").append(task_type);
        sb.append(", series=").append(series);
        sb.append(", device_type=").append(device_type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}