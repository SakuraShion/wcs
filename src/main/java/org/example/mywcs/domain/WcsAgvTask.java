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
 * @TableName wcs_agv_task
 */
@TableName(value ="wcs_agv_task")
@Data
public class WcsAgvTask implements Serializable {
    /**
     * 任务Id
     */
    @TableId
    private Integer task_id;

    /**
     * 任务进度
     */
    private Integer task_pro;

    /**
     * 任务状态
     */
    private Integer task_status;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 任务类型
     */
    private Integer task_type;

    /**
     * 托盘码
     */
    private String pallet_code;

    /**
     * 取货点
     */
    private String start_point;

    /**
     * 取货点外面
     */
    private String start_pre_point;

    /**
     * 放货点
     */
    private String end_point;

    /**
     * 放货点外面
     */
    private String end_pre_point;

    /**
     * wms任务id
     */
    private String wms_task_id;

    /**
     * 库区
     */
    private String district;

    /**
     * 是否需要上报wms
     */
    private Boolean need_report_wms;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 执行时间
     */
    private Date execute_time;

    /**
     * 完成时间
     */
    private Date complete_time;

    /**
     * 上报时间
     */
    private Date report_time;

    /**
     * rgv任务终点
     */
    private String rgv_task_end_node;

    /**
     * agv Id
     */
    private String agv_id;

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
        WcsAgvTask other = (WcsAgvTask) that;
        return (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getTask_pro() == null ? other.getTask_pro() == null : this.getTask_pro().equals(other.getTask_pro()))
            && (this.getTask_status() == null ? other.getTask_status() == null : this.getTask_status().equals(other.getTask_status()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getTask_type() == null ? other.getTask_type() == null : this.getTask_type().equals(other.getTask_type()))
            && (this.getPallet_code() == null ? other.getPallet_code() == null : this.getPallet_code().equals(other.getPallet_code()))
            && (this.getStart_point() == null ? other.getStart_point() == null : this.getStart_point().equals(other.getStart_point()))
            && (this.getStart_pre_point() == null ? other.getStart_pre_point() == null : this.getStart_pre_point().equals(other.getStart_pre_point()))
            && (this.getEnd_point() == null ? other.getEnd_point() == null : this.getEnd_point().equals(other.getEnd_point()))
            && (this.getEnd_pre_point() == null ? other.getEnd_pre_point() == null : this.getEnd_pre_point().equals(other.getEnd_pre_point()))
            && (this.getWms_task_id() == null ? other.getWms_task_id() == null : this.getWms_task_id().equals(other.getWms_task_id()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getNeed_report_wms() == null ? other.getNeed_report_wms() == null : this.getNeed_report_wms().equals(other.getNeed_report_wms()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getExecute_time() == null ? other.getExecute_time() == null : this.getExecute_time().equals(other.getExecute_time()))
            && (this.getComplete_time() == null ? other.getComplete_time() == null : this.getComplete_time().equals(other.getComplete_time()))
            && (this.getReport_time() == null ? other.getReport_time() == null : this.getReport_time().equals(other.getReport_time()))
            && (this.getRgv_task_end_node() == null ? other.getRgv_task_end_node() == null : this.getRgv_task_end_node().equals(other.getRgv_task_end_node()))
            && (this.getAgv_id() == null ? other.getAgv_id() == null : this.getAgv_id().equals(other.getAgv_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getTask_pro() == null) ? 0 : getTask_pro().hashCode());
        result = prime * result + ((getTask_status() == null) ? 0 : getTask_status().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getTask_type() == null) ? 0 : getTask_type().hashCode());
        result = prime * result + ((getPallet_code() == null) ? 0 : getPallet_code().hashCode());
        result = prime * result + ((getStart_point() == null) ? 0 : getStart_point().hashCode());
        result = prime * result + ((getStart_pre_point() == null) ? 0 : getStart_pre_point().hashCode());
        result = prime * result + ((getEnd_point() == null) ? 0 : getEnd_point().hashCode());
        result = prime * result + ((getEnd_pre_point() == null) ? 0 : getEnd_pre_point().hashCode());
        result = prime * result + ((getWms_task_id() == null) ? 0 : getWms_task_id().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getNeed_report_wms() == null) ? 0 : getNeed_report_wms().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getExecute_time() == null) ? 0 : getExecute_time().hashCode());
        result = prime * result + ((getComplete_time() == null) ? 0 : getComplete_time().hashCode());
        result = prime * result + ((getReport_time() == null) ? 0 : getReport_time().hashCode());
        result = prime * result + ((getRgv_task_end_node() == null) ? 0 : getRgv_task_end_node().hashCode());
        result = prime * result + ((getAgv_id() == null) ? 0 : getAgv_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", task_id=").append(task_id);
        sb.append(", task_pro=").append(task_pro);
        sb.append(", task_status=").append(task_status);
        sb.append(", priority=").append(priority);
        sb.append(", task_type=").append(task_type);
        sb.append(", pallet_code=").append(pallet_code);
        sb.append(", start_point=").append(start_point);
        sb.append(", start_pre_point=").append(start_pre_point);
        sb.append(", end_point=").append(end_point);
        sb.append(", end_pre_point=").append(end_pre_point);
        sb.append(", wms_task_id=").append(wms_task_id);
        sb.append(", district=").append(district);
        sb.append(", need_report_wms=").append(need_report_wms);
        sb.append(", create_time=").append(create_time);
        sb.append(", execute_time=").append(execute_time);
        sb.append(", complete_time=").append(complete_time);
        sb.append(", report_time=").append(report_time);
        sb.append(", rgv_task_end_node=").append(rgv_task_end_node);
        sb.append(", agv_id=").append(agv_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}