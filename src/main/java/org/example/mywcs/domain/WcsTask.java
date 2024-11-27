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
 * @TableName wcs_task
 */
@TableName(value ="wcs_task")
@Data
public class WcsTask implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer task_Id;

    /**
     * 托盘码
     */
    private String bar_code;

    /**
     * plc执行编号
     */
    private Integer plc_id;

    /**
     * 提交WMS时间
     */
    private Date commit_time;

    /**
     * 任务完成时间
     */
    private Date complete_time;

    /**
     * 小车目的节点
     */
    private String end_node_str;

    /**
     * 开始执行时间
     */
    private Date execute_time;

    /**
     * 小车进度
     */
    private Integer rgv_progress;

    /**
     * 优先级（1-1000），默认500
     */
    private Integer priority_code;

    /**
     * 小车起始节点
     */
    private String start_node_str;

    /**
     * 任务进度
     */
    private Integer plc_progress;

    /**
     * 任务类型
     */
    private Integer task_type;

    /**
     * WMS编号
     */
    private String wms_task_id;

    /**
     * 前置任务主键
     */
    private Integer pre_task_id;

    /**
     * 分配小车ID
     */
    private Integer processing_rgv_no;

    /**
     * 任务状态
     */
    private Integer task_status;

    /**
     * 任务库区
     */
    private String district;

    /**
     * 任务的出入库口
     */
    private String task_port_id;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 
     */
    private String group_id;

    /**
     * 任务库口方案grid_id
     */
    private String task_programme_grid_id;

    /**
     * 预分配小车编号
     */
    private Integer pre_processing_rgv_no;

    /**
     * 
     */
    private Integer to_start_time;

    /**
     * 
     */
    private Integer start_to_end_time;

    /**
     * 是否可分车0：false，1：true
     */
    private Boolean allow_assignment_rgv;

    /**
     * 
     */
    private String time_consuming;

    /**
     * 移库任务，终点对应的巷道，只有移库任务有
     */
    private String group_id_second;

    /**
     * 该标志下的任务只能分给同一个车
     */
    private String single_rgv_flag;

    /**
     * 区域ID，库区可能划分为多个区域
     */
    private Integer zone_id;

    /**
     * 
     */
    private String tips;

    /**
     * 
     */
    private String remark;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 
     */
    private String update_by;

    /**
     * 
     */
    private String lifter_path;

    /**
     * 节点限制执行任务车数量标识
     */
    private Integer node_limit_rgv_flag;

    /**
     * 移库终点节点限制执行任务车数量标识
     */
    private Integer trans_end_node_limit_rgv_flag;

    /**
     * 任务初始目的点
     */
    private String original_end_node_str;

    /**
     * 
     */
    private String path;

    /**
     * 
     */
    private Integer connect_task_id;

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
        WcsTask other = (WcsTask) that;
        return (this.getTask_Id() == null ? other.getTask_Id() == null : this.getTask_Id().equals(other.getTask_Id()))
            && (this.getBar_code() == null ? other.getBar_code() == null : this.getBar_code().equals(other.getBar_code()))
            && (this.getPlc_id() == null ? other.getPlc_id() == null : this.getPlc_id().equals(other.getPlc_id()))
            && (this.getCommit_time() == null ? other.getCommit_time() == null : this.getCommit_time().equals(other.getCommit_time()))
            && (this.getComplete_time() == null ? other.getComplete_time() == null : this.getComplete_time().equals(other.getComplete_time()))
            && (this.getEnd_node_str() == null ? other.getEnd_node_str() == null : this.getEnd_node_str().equals(other.getEnd_node_str()))
            && (this.getExecute_time() == null ? other.getExecute_time() == null : this.getExecute_time().equals(other.getExecute_time()))
            && (this.getRgv_progress() == null ? other.getRgv_progress() == null : this.getRgv_progress().equals(other.getRgv_progress()))
            && (this.getPriority_code() == null ? other.getPriority_code() == null : this.getPriority_code().equals(other.getPriority_code()))
            && (this.getStart_node_str() == null ? other.getStart_node_str() == null : this.getStart_node_str().equals(other.getStart_node_str()))
            && (this.getPlc_progress() == null ? other.getPlc_progress() == null : this.getPlc_progress().equals(other.getPlc_progress()))
            && (this.getTask_type() == null ? other.getTask_type() == null : this.getTask_type().equals(other.getTask_type()))
            && (this.getWms_task_id() == null ? other.getWms_task_id() == null : this.getWms_task_id().equals(other.getWms_task_id()))
            && (this.getPre_task_id() == null ? other.getPre_task_id() == null : this.getPre_task_id().equals(other.getPre_task_id()))
            && (this.getProcessing_rgv_no() == null ? other.getProcessing_rgv_no() == null : this.getProcessing_rgv_no().equals(other.getProcessing_rgv_no()))
            && (this.getTask_status() == null ? other.getTask_status() == null : this.getTask_status().equals(other.getTask_status()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getTask_port_id() == null ? other.getTask_port_id() == null : this.getTask_port_id().equals(other.getTask_port_id()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getGroup_id() == null ? other.getGroup_id() == null : this.getGroup_id().equals(other.getGroup_id()))
            && (this.getTask_programme_grid_id() == null ? other.getTask_programme_grid_id() == null : this.getTask_programme_grid_id().equals(other.getTask_programme_grid_id()))
            && (this.getPre_processing_rgv_no() == null ? other.getPre_processing_rgv_no() == null : this.getPre_processing_rgv_no().equals(other.getPre_processing_rgv_no()))
            && (this.getTo_start_time() == null ? other.getTo_start_time() == null : this.getTo_start_time().equals(other.getTo_start_time()))
            && (this.getStart_to_end_time() == null ? other.getStart_to_end_time() == null : this.getStart_to_end_time().equals(other.getStart_to_end_time()))
            && (this.getAllow_assignment_rgv() == null ? other.getAllow_assignment_rgv() == null : this.getAllow_assignment_rgv().equals(other.getAllow_assignment_rgv()))
            && (this.getTime_consuming() == null ? other.getTime_consuming() == null : this.getTime_consuming().equals(other.getTime_consuming()))
            && (this.getGroup_id_second() == null ? other.getGroup_id_second() == null : this.getGroup_id_second().equals(other.getGroup_id_second()))
            && (this.getSingle_rgv_flag() == null ? other.getSingle_rgv_flag() == null : this.getSingle_rgv_flag().equals(other.getSingle_rgv_flag()))
            && (this.getZone_id() == null ? other.getZone_id() == null : this.getZone_id().equals(other.getZone_id()))
            && (this.getTips() == null ? other.getTips() == null : this.getTips().equals(other.getTips()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getLifter_path() == null ? other.getLifter_path() == null : this.getLifter_path().equals(other.getLifter_path()))
            && (this.getNode_limit_rgv_flag() == null ? other.getNode_limit_rgv_flag() == null : this.getNode_limit_rgv_flag().equals(other.getNode_limit_rgv_flag()))
            && (this.getTrans_end_node_limit_rgv_flag() == null ? other.getTrans_end_node_limit_rgv_flag() == null : this.getTrans_end_node_limit_rgv_flag().equals(other.getTrans_end_node_limit_rgv_flag()))
            && (this.getOriginal_end_node_str() == null ? other.getOriginal_end_node_str() == null : this.getOriginal_end_node_str().equals(other.getOriginal_end_node_str()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getConnect_task_id() == null ? other.getConnect_task_id() == null : this.getConnect_task_id().equals(other.getConnect_task_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTask_Id() == null) ? 0 : getTask_Id().hashCode());
        result = prime * result + ((getBar_code() == null) ? 0 : getBar_code().hashCode());
        result = prime * result + ((getPlc_id() == null) ? 0 : getPlc_id().hashCode());
        result = prime * result + ((getCommit_time() == null) ? 0 : getCommit_time().hashCode());
        result = prime * result + ((getComplete_time() == null) ? 0 : getComplete_time().hashCode());
        result = prime * result + ((getEnd_node_str() == null) ? 0 : getEnd_node_str().hashCode());
        result = prime * result + ((getExecute_time() == null) ? 0 : getExecute_time().hashCode());
        result = prime * result + ((getRgv_progress() == null) ? 0 : getRgv_progress().hashCode());
        result = prime * result + ((getPriority_code() == null) ? 0 : getPriority_code().hashCode());
        result = prime * result + ((getStart_node_str() == null) ? 0 : getStart_node_str().hashCode());
        result = prime * result + ((getPlc_progress() == null) ? 0 : getPlc_progress().hashCode());
        result = prime * result + ((getTask_type() == null) ? 0 : getTask_type().hashCode());
        result = prime * result + ((getWms_task_id() == null) ? 0 : getWms_task_id().hashCode());
        result = prime * result + ((getPre_task_id() == null) ? 0 : getPre_task_id().hashCode());
        result = prime * result + ((getProcessing_rgv_no() == null) ? 0 : getProcessing_rgv_no().hashCode());
        result = prime * result + ((getTask_status() == null) ? 0 : getTask_status().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getTask_port_id() == null) ? 0 : getTask_port_id().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getGroup_id() == null) ? 0 : getGroup_id().hashCode());
        result = prime * result + ((getTask_programme_grid_id() == null) ? 0 : getTask_programme_grid_id().hashCode());
        result = prime * result + ((getPre_processing_rgv_no() == null) ? 0 : getPre_processing_rgv_no().hashCode());
        result = prime * result + ((getTo_start_time() == null) ? 0 : getTo_start_time().hashCode());
        result = prime * result + ((getStart_to_end_time() == null) ? 0 : getStart_to_end_time().hashCode());
        result = prime * result + ((getAllow_assignment_rgv() == null) ? 0 : getAllow_assignment_rgv().hashCode());
        result = prime * result + ((getTime_consuming() == null) ? 0 : getTime_consuming().hashCode());
        result = prime * result + ((getGroup_id_second() == null) ? 0 : getGroup_id_second().hashCode());
        result = prime * result + ((getSingle_rgv_flag() == null) ? 0 : getSingle_rgv_flag().hashCode());
        result = prime * result + ((getZone_id() == null) ? 0 : getZone_id().hashCode());
        result = prime * result + ((getTips() == null) ? 0 : getTips().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getLifter_path() == null) ? 0 : getLifter_path().hashCode());
        result = prime * result + ((getNode_limit_rgv_flag() == null) ? 0 : getNode_limit_rgv_flag().hashCode());
        result = prime * result + ((getTrans_end_node_limit_rgv_flag() == null) ? 0 : getTrans_end_node_limit_rgv_flag().hashCode());
        result = prime * result + ((getOriginal_end_node_str() == null) ? 0 : getOriginal_end_node_str().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getConnect_task_id() == null) ? 0 : getConnect_task_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", task_Id=").append(task_Id);
        sb.append(", bar_code=").append(bar_code);
        sb.append(", plc_id=").append(plc_id);
        sb.append(", commit_time=").append(commit_time);
        sb.append(", complete_time=").append(complete_time);
        sb.append(", end_node_str=").append(end_node_str);
        sb.append(", execute_time=").append(execute_time);
        sb.append(", rgv_progress=").append(rgv_progress);
        sb.append(", priority_code=").append(priority_code);
        sb.append(", start_node_str=").append(start_node_str);
        sb.append(", plc_progress=").append(plc_progress);
        sb.append(", task_type=").append(task_type);
        sb.append(", wms_task_id=").append(wms_task_id);
        sb.append(", pre_task_id=").append(pre_task_id);
        sb.append(", processing_rgv_no=").append(processing_rgv_no);
        sb.append(", task_status=").append(task_status);
        sb.append(", district=").append(district);
        sb.append(", task_port_id=").append(task_port_id);
        sb.append(", update_time=").append(update_time);
        sb.append(", group_id=").append(group_id);
        sb.append(", task_programme_grid_id=").append(task_programme_grid_id);
        sb.append(", pre_processing_rgv_no=").append(pre_processing_rgv_no);
        sb.append(", to_start_time=").append(to_start_time);
        sb.append(", start_to_end_time=").append(start_to_end_time);
        sb.append(", allow_assignment_rgv=").append(allow_assignment_rgv);
        sb.append(", time_consuming=").append(time_consuming);
        sb.append(", group_id_second=").append(group_id_second);
        sb.append(", single_rgv_flag=").append(single_rgv_flag);
        sb.append(", zone_id=").append(zone_id);
        sb.append(", tips=").append(tips);
        sb.append(", remark=").append(remark);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", lifter_path=").append(lifter_path);
        sb.append(", node_limit_rgv_flag=").append(node_limit_rgv_flag);
        sb.append(", trans_end_node_limit_rgv_flag=").append(trans_end_node_limit_rgv_flag);
        sb.append(", original_end_node_str=").append(original_end_node_str);
        sb.append(", path=").append(path);
        sb.append(", connect_task_id=").append(connect_task_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}