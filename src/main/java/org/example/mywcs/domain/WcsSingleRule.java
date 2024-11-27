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
 * @TableName wcs_single_rule
 */
@TableName(value ="wcs_single_rule")
@Data
public class WcsSingleRule implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long rule_id;

    /**
     * x轴起始坐标
     */
    private Integer gridx_start;

    /**
     * x轴结束坐标
     */
    private Integer gridx_end;

    /**
     * y轴起始坐标
     */
    private Integer gridy_start;

    /**
     * y轴结束坐标
     */
    private Integer gridy_end;

    /**
     * z轴坐标
     */
    private String gridz;

    /**
     * 方向：x+；x-；y+；y-
     */
    private String direction;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 
     */
    private String update_by;

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
        WcsSingleRule other = (WcsSingleRule) that;
        return (this.getRule_id() == null ? other.getRule_id() == null : this.getRule_id().equals(other.getRule_id()))
            && (this.getGridx_start() == null ? other.getGridx_start() == null : this.getGridx_start().equals(other.getGridx_start()))
            && (this.getGridx_end() == null ? other.getGridx_end() == null : this.getGridx_end().equals(other.getGridx_end()))
            && (this.getGridy_start() == null ? other.getGridy_start() == null : this.getGridy_start().equals(other.getGridy_start()))
            && (this.getGridy_end() == null ? other.getGridy_end() == null : this.getGridy_end().equals(other.getGridy_end()))
            && (this.getGridz() == null ? other.getGridz() == null : this.getGridz().equals(other.getGridz()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRule_id() == null) ? 0 : getRule_id().hashCode());
        result = prime * result + ((getGridx_start() == null) ? 0 : getGridx_start().hashCode());
        result = prime * result + ((getGridx_end() == null) ? 0 : getGridx_end().hashCode());
        result = prime * result + ((getGridy_start() == null) ? 0 : getGridy_start().hashCode());
        result = prime * result + ((getGridy_end() == null) ? 0 : getGridy_end().hashCode());
        result = prime * result + ((getGridz() == null) ? 0 : getGridz().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rule_id=").append(rule_id);
        sb.append(", gridx_start=").append(gridx_start);
        sb.append(", gridx_end=").append(gridx_end);
        sb.append(", gridy_start=").append(gridy_start);
        sb.append(", gridy_end=").append(gridy_end);
        sb.append(", gridz=").append(gridz);
        sb.append(", direction=").append(direction);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", create_by=").append(create_by);
        sb.append(", update_by=").append(update_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}