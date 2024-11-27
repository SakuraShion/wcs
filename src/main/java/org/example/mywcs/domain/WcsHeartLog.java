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
 * @TableName wcs_heart_log
 */
@TableName(value ="wcs_heart_log")
@Data
public class WcsHeartLog implements Serializable {
    /**
     * 小车心跳编号
     */
    @TableId(type = IdType.AUTO)
    private Integer interface_log_id;

    /**
     * 设备名称
     */
    private String device_name;

    /**
     * 小车位置
     */
    private String rgv_location;

    /**
     * 当前段序号
     */
    private Integer rgv_current_segment;

    /**
     * 当前段终点坐标
     */
    private String segment_end_location;

    /**
     * 当前条码值
     */
    private String cur_barcode;

    /**
     * 小车状态
     */
    private Integer rgv_status;

    /**
     * 托板状态
     */
    private Integer pallet_status;

    /**
     * 换向状态
     */
    private Integer reserve_status;

    /**
     * 行驶方向
     */
    private Integer drive_direction;

    /**
     * 电量
     */
    private Integer electric;

    /**
     * 发送时间
     */
    private Date send_time;

    /**
     * 接收时间
     */
    private Date rece_time;

    /**
     * 消耗时间
     */
    private Integer use_time;

    /**
     * 任务编号
     */
    private Integer task_no;

    /**
     * 任务类型
     */
    private Integer task_type;

    /**
     * 指令执行结果
     */
    private Integer task_result;

    /**
     * 指令命令序号
     */
    private Integer cmd_no;

    /**
     * 指令执行结果
     */
    private Integer cmd_result;

    /**
     * 指令执行结果 1字节
     */
    private Integer cmd_execute_result;

    /**
     * 指令结果参数
     */
    private Integer cmd_execute_result_param;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新者
     */
    private String update_by;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 备注
     */
    private String remark;

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
        WcsHeartLog other = (WcsHeartLog) that;
        return (this.getInterface_log_id() == null ? other.getInterface_log_id() == null : this.getInterface_log_id().equals(other.getInterface_log_id()))
            && (this.getDevice_name() == null ? other.getDevice_name() == null : this.getDevice_name().equals(other.getDevice_name()))
            && (this.getRgv_location() == null ? other.getRgv_location() == null : this.getRgv_location().equals(other.getRgv_location()))
            && (this.getRgv_current_segment() == null ? other.getRgv_current_segment() == null : this.getRgv_current_segment().equals(other.getRgv_current_segment()))
            && (this.getSegment_end_location() == null ? other.getSegment_end_location() == null : this.getSegment_end_location().equals(other.getSegment_end_location()))
            && (this.getCur_barcode() == null ? other.getCur_barcode() == null : this.getCur_barcode().equals(other.getCur_barcode()))
            && (this.getRgv_status() == null ? other.getRgv_status() == null : this.getRgv_status().equals(other.getRgv_status()))
            && (this.getPallet_status() == null ? other.getPallet_status() == null : this.getPallet_status().equals(other.getPallet_status()))
            && (this.getReserve_status() == null ? other.getReserve_status() == null : this.getReserve_status().equals(other.getReserve_status()))
            && (this.getDrive_direction() == null ? other.getDrive_direction() == null : this.getDrive_direction().equals(other.getDrive_direction()))
            && (this.getElectric() == null ? other.getElectric() == null : this.getElectric().equals(other.getElectric()))
            && (this.getSend_time() == null ? other.getSend_time() == null : this.getSend_time().equals(other.getSend_time()))
            && (this.getRece_time() == null ? other.getRece_time() == null : this.getRece_time().equals(other.getRece_time()))
            && (this.getUse_time() == null ? other.getUse_time() == null : this.getUse_time().equals(other.getUse_time()))
            && (this.getTask_no() == null ? other.getTask_no() == null : this.getTask_no().equals(other.getTask_no()))
            && (this.getTask_type() == null ? other.getTask_type() == null : this.getTask_type().equals(other.getTask_type()))
            && (this.getTask_result() == null ? other.getTask_result() == null : this.getTask_result().equals(other.getTask_result()))
            && (this.getCmd_no() == null ? other.getCmd_no() == null : this.getCmd_no().equals(other.getCmd_no()))
            && (this.getCmd_result() == null ? other.getCmd_result() == null : this.getCmd_result().equals(other.getCmd_result()))
            && (this.getCmd_execute_result() == null ? other.getCmd_execute_result() == null : this.getCmd_execute_result().equals(other.getCmd_execute_result()))
            && (this.getCmd_execute_result_param() == null ? other.getCmd_execute_result_param() == null : this.getCmd_execute_result_param().equals(other.getCmd_execute_result_param()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInterface_log_id() == null) ? 0 : getInterface_log_id().hashCode());
        result = prime * result + ((getDevice_name() == null) ? 0 : getDevice_name().hashCode());
        result = prime * result + ((getRgv_location() == null) ? 0 : getRgv_location().hashCode());
        result = prime * result + ((getRgv_current_segment() == null) ? 0 : getRgv_current_segment().hashCode());
        result = prime * result + ((getSegment_end_location() == null) ? 0 : getSegment_end_location().hashCode());
        result = prime * result + ((getCur_barcode() == null) ? 0 : getCur_barcode().hashCode());
        result = prime * result + ((getRgv_status() == null) ? 0 : getRgv_status().hashCode());
        result = prime * result + ((getPallet_status() == null) ? 0 : getPallet_status().hashCode());
        result = prime * result + ((getReserve_status() == null) ? 0 : getReserve_status().hashCode());
        result = prime * result + ((getDrive_direction() == null) ? 0 : getDrive_direction().hashCode());
        result = prime * result + ((getElectric() == null) ? 0 : getElectric().hashCode());
        result = prime * result + ((getSend_time() == null) ? 0 : getSend_time().hashCode());
        result = prime * result + ((getRece_time() == null) ? 0 : getRece_time().hashCode());
        result = prime * result + ((getUse_time() == null) ? 0 : getUse_time().hashCode());
        result = prime * result + ((getTask_no() == null) ? 0 : getTask_no().hashCode());
        result = prime * result + ((getTask_type() == null) ? 0 : getTask_type().hashCode());
        result = prime * result + ((getTask_result() == null) ? 0 : getTask_result().hashCode());
        result = prime * result + ((getCmd_no() == null) ? 0 : getCmd_no().hashCode());
        result = prime * result + ((getCmd_result() == null) ? 0 : getCmd_result().hashCode());
        result = prime * result + ((getCmd_execute_result() == null) ? 0 : getCmd_execute_result().hashCode());
        result = prime * result + ((getCmd_execute_result_param() == null) ? 0 : getCmd_execute_result_param().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", interface_log_id=").append(interface_log_id);
        sb.append(", device_name=").append(device_name);
        sb.append(", rgv_location=").append(rgv_location);
        sb.append(", rgv_current_segment=").append(rgv_current_segment);
        sb.append(", segment_end_location=").append(segment_end_location);
        sb.append(", cur_barcode=").append(cur_barcode);
        sb.append(", rgv_status=").append(rgv_status);
        sb.append(", pallet_status=").append(pallet_status);
        sb.append(", reserve_status=").append(reserve_status);
        sb.append(", drive_direction=").append(drive_direction);
        sb.append(", electric=").append(electric);
        sb.append(", send_time=").append(send_time);
        sb.append(", rece_time=").append(rece_time);
        sb.append(", use_time=").append(use_time);
        sb.append(", task_no=").append(task_no);
        sb.append(", task_type=").append(task_type);
        sb.append(", task_result=").append(task_result);
        sb.append(", cmd_no=").append(cmd_no);
        sb.append(", cmd_result=").append(cmd_result);
        sb.append(", cmd_execute_result=").append(cmd_execute_result);
        sb.append(", cmd_execute_result_param=").append(cmd_execute_result_param);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}