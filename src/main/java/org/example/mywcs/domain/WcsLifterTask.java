package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wcs_lifter_task
 */
@TableName(value ="wcs_lifter_task")
@Data
public class WcsLifterTask implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String lifter_name;

    /**
     * 
     */
    private Integer task_id;

    /**
     * 
     */
    private String lifter_location;

    /**
     * 
     */
    private String start_node;

    /**
     * 
     */
    private String end_node;

    /**
     * 
     */
    private Integer lifter_mode;

    /**
     * 
     */
    private Integer task_obj_type;

    /**
     * 
     */
    private Integer task_obj_id;

    /**
     * 
     */
    private Integer lifter_task_process;

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
        WcsLifterTask other = (WcsLifterTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLifter_name() == null ? other.getLifter_name() == null : this.getLifter_name().equals(other.getLifter_name()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getLifter_location() == null ? other.getLifter_location() == null : this.getLifter_location().equals(other.getLifter_location()))
            && (this.getStart_node() == null ? other.getStart_node() == null : this.getStart_node().equals(other.getStart_node()))
            && (this.getEnd_node() == null ? other.getEnd_node() == null : this.getEnd_node().equals(other.getEnd_node()))
            && (this.getLifter_mode() == null ? other.getLifter_mode() == null : this.getLifter_mode().equals(other.getLifter_mode()))
            && (this.getTask_obj_type() == null ? other.getTask_obj_type() == null : this.getTask_obj_type().equals(other.getTask_obj_type()))
            && (this.getTask_obj_id() == null ? other.getTask_obj_id() == null : this.getTask_obj_id().equals(other.getTask_obj_id()))
            && (this.getLifter_task_process() == null ? other.getLifter_task_process() == null : this.getLifter_task_process().equals(other.getLifter_task_process()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLifter_name() == null) ? 0 : getLifter_name().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getLifter_location() == null) ? 0 : getLifter_location().hashCode());
        result = prime * result + ((getStart_node() == null) ? 0 : getStart_node().hashCode());
        result = prime * result + ((getEnd_node() == null) ? 0 : getEnd_node().hashCode());
        result = prime * result + ((getLifter_mode() == null) ? 0 : getLifter_mode().hashCode());
        result = prime * result + ((getTask_obj_type() == null) ? 0 : getTask_obj_type().hashCode());
        result = prime * result + ((getTask_obj_id() == null) ? 0 : getTask_obj_id().hashCode());
        result = prime * result + ((getLifter_task_process() == null) ? 0 : getLifter_task_process().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lifter_name=").append(lifter_name);
        sb.append(", task_id=").append(task_id);
        sb.append(", lifter_location=").append(lifter_location);
        sb.append(", start_node=").append(start_node);
        sb.append(", end_node=").append(end_node);
        sb.append(", lifter_mode=").append(lifter_mode);
        sb.append(", task_obj_type=").append(task_obj_type);
        sb.append(", task_obj_id=").append(task_obj_id);
        sb.append(", lifter_task_process=").append(lifter_task_process);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}