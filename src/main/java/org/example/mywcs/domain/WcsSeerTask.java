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
 * @TableName wcs_seer_task
 */
@TableName(value ="wcs_seer_task")
@Data
public class WcsSeerTask implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String task_id;

    /**
     * 
     */
    private Integer process;

    /**
     * 
     */
    private String start_point;

    /**
     * 
     */
    private String end_point;

    /**
     * 
     */
    private String start_out_point;

    /**
     * 
     */
    private String end_out_point;

    /**
     * 
     */
    private String barcode;

    /**
     * 
     */
    private Date create_time;

    /**
     * 
     */
    private Date end_time;

    /**
     * 
     */
    private String start_operation;

    /**
     * 
     */
    private String end_operation;

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
        WcsSeerTask other = (WcsSeerTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getProcess() == null ? other.getProcess() == null : this.getProcess().equals(other.getProcess()))
            && (this.getStart_point() == null ? other.getStart_point() == null : this.getStart_point().equals(other.getStart_point()))
            && (this.getEnd_point() == null ? other.getEnd_point() == null : this.getEnd_point().equals(other.getEnd_point()))
            && (this.getStart_out_point() == null ? other.getStart_out_point() == null : this.getStart_out_point().equals(other.getStart_out_point()))
            && (this.getEnd_out_point() == null ? other.getEnd_out_point() == null : this.getEnd_out_point().equals(other.getEnd_out_point()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getEnd_time() == null ? other.getEnd_time() == null : this.getEnd_time().equals(other.getEnd_time()))
            && (this.getStart_operation() == null ? other.getStart_operation() == null : this.getStart_operation().equals(other.getStart_operation()))
            && (this.getEnd_operation() == null ? other.getEnd_operation() == null : this.getEnd_operation().equals(other.getEnd_operation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getProcess() == null) ? 0 : getProcess().hashCode());
        result = prime * result + ((getStart_point() == null) ? 0 : getStart_point().hashCode());
        result = prime * result + ((getEnd_point() == null) ? 0 : getEnd_point().hashCode());
        result = prime * result + ((getStart_out_point() == null) ? 0 : getStart_out_point().hashCode());
        result = prime * result + ((getEnd_out_point() == null) ? 0 : getEnd_out_point().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getEnd_time() == null) ? 0 : getEnd_time().hashCode());
        result = prime * result + ((getStart_operation() == null) ? 0 : getStart_operation().hashCode());
        result = prime * result + ((getEnd_operation() == null) ? 0 : getEnd_operation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", task_id=").append(task_id);
        sb.append(", process=").append(process);
        sb.append(", start_point=").append(start_point);
        sb.append(", end_point=").append(end_point);
        sb.append(", start_out_point=").append(start_out_point);
        sb.append(", end_out_point=").append(end_out_point);
        sb.append(", barcode=").append(barcode);
        sb.append(", create_time=").append(create_time);
        sb.append(", end_time=").append(end_time);
        sb.append(", start_operation=").append(start_operation);
        sb.append(", end_operation=").append(end_operation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}