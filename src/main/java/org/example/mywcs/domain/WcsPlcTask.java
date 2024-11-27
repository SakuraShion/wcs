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
 * @TableName wcs_plc_task
 */
@TableName(value ="wcs_plc_task")
@Data
public class WcsPlcTask implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer plc_task_id;

    /**
     * 
     */
    private Integer task_no;

    /**
     * 
     */
    private Integer start_no;

    /**
     * 
     */
    private Integer end_no;

    /**
     * 
     */
    private Integer process;

    /**
     * 
     */
    private Integer current_no;

    /**
     * 
     */
    private Date create_time;

    /**
     * 
     */
    private Date exec_time;

    /**
     * 
     */
    private Date finish_time;

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
        WcsPlcTask other = (WcsPlcTask) that;
        return (this.getPlc_task_id() == null ? other.getPlc_task_id() == null : this.getPlc_task_id().equals(other.getPlc_task_id()))
            && (this.getTask_no() == null ? other.getTask_no() == null : this.getTask_no().equals(other.getTask_no()))
            && (this.getStart_no() == null ? other.getStart_no() == null : this.getStart_no().equals(other.getStart_no()))
            && (this.getEnd_no() == null ? other.getEnd_no() == null : this.getEnd_no().equals(other.getEnd_no()))
            && (this.getProcess() == null ? other.getProcess() == null : this.getProcess().equals(other.getProcess()))
            && (this.getCurrent_no() == null ? other.getCurrent_no() == null : this.getCurrent_no().equals(other.getCurrent_no()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getExec_time() == null ? other.getExec_time() == null : this.getExec_time().equals(other.getExec_time()))
            && (this.getFinish_time() == null ? other.getFinish_time() == null : this.getFinish_time().equals(other.getFinish_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlc_task_id() == null) ? 0 : getPlc_task_id().hashCode());
        result = prime * result + ((getTask_no() == null) ? 0 : getTask_no().hashCode());
        result = prime * result + ((getStart_no() == null) ? 0 : getStart_no().hashCode());
        result = prime * result + ((getEnd_no() == null) ? 0 : getEnd_no().hashCode());
        result = prime * result + ((getProcess() == null) ? 0 : getProcess().hashCode());
        result = prime * result + ((getCurrent_no() == null) ? 0 : getCurrent_no().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getExec_time() == null) ? 0 : getExec_time().hashCode());
        result = prime * result + ((getFinish_time() == null) ? 0 : getFinish_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plc_task_id=").append(plc_task_id);
        sb.append(", task_no=").append(task_no);
        sb.append(", start_no=").append(start_no);
        sb.append(", end_no=").append(end_no);
        sb.append(", process=").append(process);
        sb.append(", current_no=").append(current_no);
        sb.append(", create_time=").append(create_time);
        sb.append(", exec_time=").append(exec_time);
        sb.append(", finish_time=").append(finish_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}