package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定时任务调度表
 * @TableName sys_job
 */
@TableName(value ="sys_job")
@Data
public class SysJob implements Serializable {
    /**
     * 任务ID
     */
    @TableId(type = IdType.AUTO)
    private Long job_id;

    /**
     * 任务名称
     */
    @TableId
    private String job_name;

    /**
     * 任务组名
     */
    @TableId
    private String job_group;

    /**
     * 调用目标字符串
     */
    private String invoke_target;

    /**
     * cron执行表达式
     */
    private String cron_expression;

    /**
     * 计划执行错误策略（1立即执行 2执行一次 3放弃执行）
     */
    private String misfire_policy;

    /**
     * 是否并发执行（0允许 1禁止）
     */
    private String concurrent;

    /**
     * 状态（0正常 1暂停）
     */
    private String status;

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
     * 备注信息
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
        SysJob other = (SysJob) that;
        return (this.getJob_id() == null ? other.getJob_id() == null : this.getJob_id().equals(other.getJob_id()))
            && (this.getJob_name() == null ? other.getJob_name() == null : this.getJob_name().equals(other.getJob_name()))
            && (this.getJob_group() == null ? other.getJob_group() == null : this.getJob_group().equals(other.getJob_group()))
            && (this.getInvoke_target() == null ? other.getInvoke_target() == null : this.getInvoke_target().equals(other.getInvoke_target()))
            && (this.getCron_expression() == null ? other.getCron_expression() == null : this.getCron_expression().equals(other.getCron_expression()))
            && (this.getMisfire_policy() == null ? other.getMisfire_policy() == null : this.getMisfire_policy().equals(other.getMisfire_policy()))
            && (this.getConcurrent() == null ? other.getConcurrent() == null : this.getConcurrent().equals(other.getConcurrent()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getJob_id() == null) ? 0 : getJob_id().hashCode());
        result = prime * result + ((getJob_name() == null) ? 0 : getJob_name().hashCode());
        result = prime * result + ((getJob_group() == null) ? 0 : getJob_group().hashCode());
        result = prime * result + ((getInvoke_target() == null) ? 0 : getInvoke_target().hashCode());
        result = prime * result + ((getCron_expression() == null) ? 0 : getCron_expression().hashCode());
        result = prime * result + ((getMisfire_policy() == null) ? 0 : getMisfire_policy().hashCode());
        result = prime * result + ((getConcurrent() == null) ? 0 : getConcurrent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", job_id=").append(job_id);
        sb.append(", job_name=").append(job_name);
        sb.append(", job_group=").append(job_group);
        sb.append(", invoke_target=").append(invoke_target);
        sb.append(", cron_expression=").append(cron_expression);
        sb.append(", misfire_policy=").append(misfire_policy);
        sb.append(", concurrent=").append(concurrent);
        sb.append(", status=").append(status);
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