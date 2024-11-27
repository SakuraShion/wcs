package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定时任务调度日志表
 * @TableName sys_job_log
 */
@TableName(value ="sys_job_log")
@Data
public class SysJobLog implements Serializable {
    /**
     * 任务日志ID
     */
    @TableId(type = IdType.AUTO)
    private Long job_log_id;

    /**
     * 任务名称
     */
    private String job_name;

    /**
     * 任务组名
     */
    private String job_group;

    /**
     * 调用目标字符串
     */
    private String invoke_target;

    /**
     * 日志信息
     */
    private String job_message;

    /**
     * 执行状态（0正常 1失败）
     */
    private String status;

    /**
     * 异常信息
     */
    private String exception_info;

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
        SysJobLog other = (SysJobLog) that;
        return (this.getJob_log_id() == null ? other.getJob_log_id() == null : this.getJob_log_id().equals(other.getJob_log_id()))
            && (this.getJob_name() == null ? other.getJob_name() == null : this.getJob_name().equals(other.getJob_name()))
            && (this.getJob_group() == null ? other.getJob_group() == null : this.getJob_group().equals(other.getJob_group()))
            && (this.getInvoke_target() == null ? other.getInvoke_target() == null : this.getInvoke_target().equals(other.getInvoke_target()))
            && (this.getJob_message() == null ? other.getJob_message() == null : this.getJob_message().equals(other.getJob_message()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getException_info() == null ? other.getException_info() == null : this.getException_info().equals(other.getException_info()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJob_log_id() == null) ? 0 : getJob_log_id().hashCode());
        result = prime * result + ((getJob_name() == null) ? 0 : getJob_name().hashCode());
        result = prime * result + ((getJob_group() == null) ? 0 : getJob_group().hashCode());
        result = prime * result + ((getInvoke_target() == null) ? 0 : getInvoke_target().hashCode());
        result = prime * result + ((getJob_message() == null) ? 0 : getJob_message().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getException_info() == null) ? 0 : getException_info().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", job_log_id=").append(job_log_id);
        sb.append(", job_name=").append(job_name);
        sb.append(", job_group=").append(job_group);
        sb.append(", invoke_target=").append(invoke_target);
        sb.append(", job_message=").append(job_message);
        sb.append(", status=").append(status);
        sb.append(", exception_info=").append(exception_info);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}