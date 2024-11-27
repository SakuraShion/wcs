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
 * @TableName wcs_machine_task
 */
@TableName(value ="wcs_machine_task")
@Data
public class WcsMachineTask implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Integer task_id;

    /**
     * 产品种类
     */
    private Integer product_type;

    /**
     * 起始工位
     */
    private String start_station;

    /**
     * 终点工位
     */
    private String end_station;

    /**
     * 拆码垛数量
     */
    private Integer cargo_count;

    /**
     * 任务状态
     */
    private Integer task_status;

    /**
     * 插入时间
     */
    private Date create_time;

    /**
     * 修改时间
     */
    private Date update_time;

    /**
     * 机械臂编号
     */
    private String machine_no;

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
        WcsMachineTask other = (WcsMachineTask) that;
        return (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getProduct_type() == null ? other.getProduct_type() == null : this.getProduct_type().equals(other.getProduct_type()))
            && (this.getStart_station() == null ? other.getStart_station() == null : this.getStart_station().equals(other.getStart_station()))
            && (this.getEnd_station() == null ? other.getEnd_station() == null : this.getEnd_station().equals(other.getEnd_station()))
            && (this.getCargo_count() == null ? other.getCargo_count() == null : this.getCargo_count().equals(other.getCargo_count()))
            && (this.getTask_status() == null ? other.getTask_status() == null : this.getTask_status().equals(other.getTask_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getMachine_no() == null ? other.getMachine_no() == null : this.getMachine_no().equals(other.getMachine_no()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getProduct_type() == null) ? 0 : getProduct_type().hashCode());
        result = prime * result + ((getStart_station() == null) ? 0 : getStart_station().hashCode());
        result = prime * result + ((getEnd_station() == null) ? 0 : getEnd_station().hashCode());
        result = prime * result + ((getCargo_count() == null) ? 0 : getCargo_count().hashCode());
        result = prime * result + ((getTask_status() == null) ? 0 : getTask_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getMachine_no() == null) ? 0 : getMachine_no().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", task_id=").append(task_id);
        sb.append(", product_type=").append(product_type);
        sb.append(", start_station=").append(start_station);
        sb.append(", end_station=").append(end_station);
        sb.append(", cargo_count=").append(cargo_count);
        sb.append(", task_status=").append(task_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", machine_no=").append(machine_no);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}