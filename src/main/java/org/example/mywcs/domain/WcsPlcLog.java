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
 * @TableName wcs_plc_log
 */
@TableName(value ="wcs_plc_log")
@Data
public class WcsPlcLog implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer plc_log_id;

    /**
     * 设备名称
     */
    private String device_name;

    /**
     * plc发送信息
     */
    private String plc_method_detail;

    /**
     * 发送时间
     */
    private Date send_time;

    /**
     * 方法传入参数
     */
    private String plc_send_params;

    /**
     * 接口返回参数
     */
    private String plc_return_params;

    /**
     * 消耗时间
     */
    private Integer use_time;

    /**
     * 任务编号
     */
    private Integer task_id;

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
     * 更新时间
     */
    private Date update_time;

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
        WcsPlcLog other = (WcsPlcLog) that;
        return (this.getPlc_log_id() == null ? other.getPlc_log_id() == null : this.getPlc_log_id().equals(other.getPlc_log_id()))
            && (this.getDevice_name() == null ? other.getDevice_name() == null : this.getDevice_name().equals(other.getDevice_name()))
            && (this.getPlc_method_detail() == null ? other.getPlc_method_detail() == null : this.getPlc_method_detail().equals(other.getPlc_method_detail()))
            && (this.getSend_time() == null ? other.getSend_time() == null : this.getSend_time().equals(other.getSend_time()))
            && (this.getPlc_send_params() == null ? other.getPlc_send_params() == null : this.getPlc_send_params().equals(other.getPlc_send_params()))
            && (this.getPlc_return_params() == null ? other.getPlc_return_params() == null : this.getPlc_return_params().equals(other.getPlc_return_params()))
            && (this.getUse_time() == null ? other.getUse_time() == null : this.getUse_time().equals(other.getUse_time()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlc_log_id() == null) ? 0 : getPlc_log_id().hashCode());
        result = prime * result + ((getDevice_name() == null) ? 0 : getDevice_name().hashCode());
        result = prime * result + ((getPlc_method_detail() == null) ? 0 : getPlc_method_detail().hashCode());
        result = prime * result + ((getSend_time() == null) ? 0 : getSend_time().hashCode());
        result = prime * result + ((getPlc_send_params() == null) ? 0 : getPlc_send_params().hashCode());
        result = prime * result + ((getPlc_return_params() == null) ? 0 : getPlc_return_params().hashCode());
        result = prime * result + ((getUse_time() == null) ? 0 : getUse_time().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plc_log_id=").append(plc_log_id);
        sb.append(", device_name=").append(device_name);
        sb.append(", plc_method_detail=").append(plc_method_detail);
        sb.append(", send_time=").append(send_time);
        sb.append(", plc_send_params=").append(plc_send_params);
        sb.append(", plc_return_params=").append(plc_return_params);
        sb.append(", use_time=").append(use_time);
        sb.append(", task_id=").append(task_id);
        sb.append(", remark=").append(remark);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}