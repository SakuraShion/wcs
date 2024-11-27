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
 * @TableName wcs_exception_log
 */
@TableName(value ="wcs_exception_log")
@Data
public class WcsExceptionLog implements Serializable {
    /**
     * 表主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 异常类型 1. res异常，2. plc异常
     */
    private Integer exception_type;

    /**
     * 异常描述
     */
    private String exception_info;

    /**
     * 此时的WCS任务编号
     */
    private Integer task_id;

    /**
     * 如果设备问题，设备名称
     */
    private String device_name;

    /**
     * 此时对应设备的网络状态
     */
    private Integer device_status;

    /**
     * 异常码（对应的字典表10进制）
     */
    private Integer err_code;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新者
     */
    private String update_by;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private Date create_time;

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
        WcsExceptionLog other = (WcsExceptionLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getException_type() == null ? other.getException_type() == null : this.getException_type().equals(other.getException_type()))
            && (this.getException_info() == null ? other.getException_info() == null : this.getException_info().equals(other.getException_info()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getDevice_name() == null ? other.getDevice_name() == null : this.getDevice_name().equals(other.getDevice_name()))
            && (this.getDevice_status() == null ? other.getDevice_status() == null : this.getDevice_status().equals(other.getDevice_status()))
            && (this.getErr_code() == null ? other.getErr_code() == null : this.getErr_code().equals(other.getErr_code()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getException_type() == null) ? 0 : getException_type().hashCode());
        result = prime * result + ((getException_info() == null) ? 0 : getException_info().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getDevice_name() == null) ? 0 : getDevice_name().hashCode());
        result = prime * result + ((getDevice_status() == null) ? 0 : getDevice_status().hashCode());
        result = prime * result + ((getErr_code() == null) ? 0 : getErr_code().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", exception_type=").append(exception_type);
        sb.append(", exception_info=").append(exception_info);
        sb.append(", task_id=").append(task_id);
        sb.append(", device_name=").append(device_name);
        sb.append(", device_status=").append(device_status);
        sb.append(", err_code=").append(err_code);
        sb.append(", remark=").append(remark);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}