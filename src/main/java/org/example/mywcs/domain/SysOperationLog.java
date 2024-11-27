package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 操作日志
 * @TableName sys_operation_log
 */
@TableName(value ="sys_operation_log")
@Data
public class SysOperationLog implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long operation_log_id;

    /**
     * 用户名
     */
    private String user_name;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 是否成功(字典)
     */
    private String succeed;

    /**
     * 发送时间
     */
    private Date send_data;

    /**
     * 返回时间
     */
    private Date rece_data;

    /**
     * 消耗时间
     */
    private Integer use_time;

    /**
     * 修改内容
     */
    private String operation_data;

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
        SysOperationLog other = (SysOperationLog) that;
        return (this.getOperation_log_id() == null ? other.getOperation_log_id() == null : this.getOperation_log_id().equals(other.getOperation_log_id()))
            && (this.getUser_name() == null ? other.getUser_name() == null : this.getUser_name().equals(other.getUser_name()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getSucceed() == null ? other.getSucceed() == null : this.getSucceed().equals(other.getSucceed()))
            && (this.getSend_data() == null ? other.getSend_data() == null : this.getSend_data().equals(other.getSend_data()))
            && (this.getRece_data() == null ? other.getRece_data() == null : this.getRece_data().equals(other.getRece_data()))
            && (this.getUse_time() == null ? other.getUse_time() == null : this.getUse_time().equals(other.getUse_time()))
            && (this.getOperation_data() == null ? other.getOperation_data() == null : this.getOperation_data().equals(other.getOperation_data()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperation_log_id() == null) ? 0 : getOperation_log_id().hashCode());
        result = prime * result + ((getUser_name() == null) ? 0 : getUser_name().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getSucceed() == null) ? 0 : getSucceed().hashCode());
        result = prime * result + ((getSend_data() == null) ? 0 : getSend_data().hashCode());
        result = prime * result + ((getRece_data() == null) ? 0 : getRece_data().hashCode());
        result = prime * result + ((getUse_time() == null) ? 0 : getUse_time().hashCode());
        result = prime * result + ((getOperation_data() == null) ? 0 : getOperation_data().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operation_log_id=").append(operation_log_id);
        sb.append(", user_name=").append(user_name);
        sb.append(", method=").append(method);
        sb.append(", succeed=").append(succeed);
        sb.append(", send_data=").append(send_data);
        sb.append(", rece_data=").append(rece_data);
        sb.append(", use_time=").append(use_time);
        sb.append(", operation_data=").append(operation_data);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}