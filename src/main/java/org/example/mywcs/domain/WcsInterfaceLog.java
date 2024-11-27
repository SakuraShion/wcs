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
 * @TableName wcs_interface_log
 */
@TableName(value ="wcs_interface_log")
@Data
public class WcsInterfaceLog implements Serializable {
    /**
     * 日志主鍵
     */
    @TableId(type = IdType.AUTO)
    private Long interface_log_id;

    /**
     * 任务编号
     */
    private Integer task_id;

    /**
     * 设备名称
     */
    private String device_name;

    /**
     * 发送源
     */
    private String sender;

    /**
     * 反馈源
     */
    private String recipient;

    /**
     * 接口方法描述
     */
    private String interface_method_des;

    /**
     * 接口传入参数
     */
    private String interface_params_in;

    /**
     * 接口返回参数
     */
    private String interface_params_ret;

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

    /**
     * 操作状态
     */
    private Integer status;

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
        WcsInterfaceLog other = (WcsInterfaceLog) that;
        return (this.getInterface_log_id() == null ? other.getInterface_log_id() == null : this.getInterface_log_id().equals(other.getInterface_log_id()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getDevice_name() == null ? other.getDevice_name() == null : this.getDevice_name().equals(other.getDevice_name()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getRecipient() == null ? other.getRecipient() == null : this.getRecipient().equals(other.getRecipient()))
            && (this.getInterface_method_des() == null ? other.getInterface_method_des() == null : this.getInterface_method_des().equals(other.getInterface_method_des()))
            && (this.getInterface_params_in() == null ? other.getInterface_params_in() == null : this.getInterface_params_in().equals(other.getInterface_params_in()))
            && (this.getInterface_params_ret() == null ? other.getInterface_params_ret() == null : this.getInterface_params_ret().equals(other.getInterface_params_ret()))
            && (this.getSend_time() == null ? other.getSend_time() == null : this.getSend_time().equals(other.getSend_time()))
            && (this.getRece_time() == null ? other.getRece_time() == null : this.getRece_time().equals(other.getRece_time()))
            && (this.getUse_time() == null ? other.getUse_time() == null : this.getUse_time().equals(other.getUse_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInterface_log_id() == null) ? 0 : getInterface_log_id().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getDevice_name() == null) ? 0 : getDevice_name().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        result = prime * result + ((getInterface_method_des() == null) ? 0 : getInterface_method_des().hashCode());
        result = prime * result + ((getInterface_params_in() == null) ? 0 : getInterface_params_in().hashCode());
        result = prime * result + ((getInterface_params_ret() == null) ? 0 : getInterface_params_ret().hashCode());
        result = prime * result + ((getSend_time() == null) ? 0 : getSend_time().hashCode());
        result = prime * result + ((getRece_time() == null) ? 0 : getRece_time().hashCode());
        result = prime * result + ((getUse_time() == null) ? 0 : getUse_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", interface_log_id=").append(interface_log_id);
        sb.append(", task_id=").append(task_id);
        sb.append(", device_name=").append(device_name);
        sb.append(", sender=").append(sender);
        sb.append(", recipient=").append(recipient);
        sb.append(", interface_method_des=").append(interface_method_des);
        sb.append(", interface_params_in=").append(interface_params_in);
        sb.append(", interface_params_ret=").append(interface_params_ret);
        sb.append(", send_time=").append(send_time);
        sb.append(", rece_time=").append(rece_time);
        sb.append(", use_time=").append(use_time);
        sb.append(", remark=").append(remark);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}