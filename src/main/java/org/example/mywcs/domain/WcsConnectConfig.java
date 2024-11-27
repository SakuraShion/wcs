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
 * @TableName wcs_connect_config
 */
@TableName(value ="wcs_connect_config")
@Data
public class WcsConnectConfig implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer connect_id;

    /**
     * 接驳方案名称
     */
    private String connect_name;

    /**
     * 前置任务终点接驳点
     */
    private String pre_connect;

    /**
     * 后置任务起点接驳点
     */
    private String suf_connect;

    /**
     * 终点所在层
     */
    private Integer connect_layer;

    /**
     * 接驳任务类型
     */
    private Integer connect_type;

    /**
     * 对应库口编号
     */
    private String port_code;

    /**
     * 备注
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
     * 更新者
     */
    private String update_by;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 接驳开启关闭
     */
    private String connect_flag;

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
        WcsConnectConfig other = (WcsConnectConfig) that;
        return (this.getConnect_id() == null ? other.getConnect_id() == null : this.getConnect_id().equals(other.getConnect_id()))
            && (this.getConnect_name() == null ? other.getConnect_name() == null : this.getConnect_name().equals(other.getConnect_name()))
            && (this.getPre_connect() == null ? other.getPre_connect() == null : this.getPre_connect().equals(other.getPre_connect()))
            && (this.getSuf_connect() == null ? other.getSuf_connect() == null : this.getSuf_connect().equals(other.getSuf_connect()))
            && (this.getConnect_layer() == null ? other.getConnect_layer() == null : this.getConnect_layer().equals(other.getConnect_layer()))
            && (this.getConnect_type() == null ? other.getConnect_type() == null : this.getConnect_type().equals(other.getConnect_type()))
            && (this.getPort_code() == null ? other.getPort_code() == null : this.getPort_code().equals(other.getPort_code()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getConnect_flag() == null ? other.getConnect_flag() == null : this.getConnect_flag().equals(other.getConnect_flag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConnect_id() == null) ? 0 : getConnect_id().hashCode());
        result = prime * result + ((getConnect_name() == null) ? 0 : getConnect_name().hashCode());
        result = prime * result + ((getPre_connect() == null) ? 0 : getPre_connect().hashCode());
        result = prime * result + ((getSuf_connect() == null) ? 0 : getSuf_connect().hashCode());
        result = prime * result + ((getConnect_layer() == null) ? 0 : getConnect_layer().hashCode());
        result = prime * result + ((getConnect_type() == null) ? 0 : getConnect_type().hashCode());
        result = prime * result + ((getPort_code() == null) ? 0 : getPort_code().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getConnect_flag() == null) ? 0 : getConnect_flag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", connect_id=").append(connect_id);
        sb.append(", connect_name=").append(connect_name);
        sb.append(", pre_connect=").append(pre_connect);
        sb.append(", suf_connect=").append(suf_connect);
        sb.append(", connect_layer=").append(connect_layer);
        sb.append(", connect_type=").append(connect_type);
        sb.append(", port_code=").append(port_code);
        sb.append(", remark=").append(remark);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", connect_flag=").append(connect_flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}