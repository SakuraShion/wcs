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
 * @TableName wcs_plc
 */
@TableName(value ="wcs_plc")
@Data
public class WcsPlc implements Serializable {
    /**
     * plc模块id
     */
    @TableId(type = IdType.AUTO)
    private Integer plc_id;

    /**
     * plc名称
     */
    private String plc_name;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * plcIP地址
     */
    private String plc_ip;

    /**
     * plc端口
     */
    private Integer plc_port;

    /**
     * plc起始地址
     */
    private Integer plc_start_num;

    /**
     * plc最大地址
     */
    private Integer plc_max_num;

    /**
     * 创建人
     */
    private Long create_user;

    /**
     * 创建时间
     */
    private Date insert_time;

    /**
     * plc类型（1-松下提升机 2-西门子提升机 3-托盘线）
     */
    private Integer plc_type;

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

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private String update_by;

    /**
     * 状态（0正常 1停用）
     */
    private String disable;

    /**
     * plc空闲指令
     */
    private Integer plc_free_action;

    /**
     * 自卸式提升机移库时判断1楼移库货和车是否同步
     */
    private Boolean cargo_rgv;

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
        WcsPlc other = (WcsPlc) that;
        return (this.getPlc_id() == null ? other.getPlc_id() == null : this.getPlc_id().equals(other.getPlc_id()))
            && (this.getPlc_name() == null ? other.getPlc_name() == null : this.getPlc_name().equals(other.getPlc_name()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPlc_ip() == null ? other.getPlc_ip() == null : this.getPlc_ip().equals(other.getPlc_ip()))
            && (this.getPlc_port() == null ? other.getPlc_port() == null : this.getPlc_port().equals(other.getPlc_port()))
            && (this.getPlc_start_num() == null ? other.getPlc_start_num() == null : this.getPlc_start_num().equals(other.getPlc_start_num()))
            && (this.getPlc_max_num() == null ? other.getPlc_max_num() == null : this.getPlc_max_num().equals(other.getPlc_max_num()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getInsert_time() == null ? other.getInsert_time() == null : this.getInsert_time().equals(other.getInsert_time()))
            && (this.getPlc_type() == null ? other.getPlc_type() == null : this.getPlc_type().equals(other.getPlc_type()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getDisable() == null ? other.getDisable() == null : this.getDisable().equals(other.getDisable()))
            && (this.getPlc_free_action() == null ? other.getPlc_free_action() == null : this.getPlc_free_action().equals(other.getPlc_free_action()))
            && (this.getCargo_rgv() == null ? other.getCargo_rgv() == null : this.getCargo_rgv().equals(other.getCargo_rgv()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlc_id() == null) ? 0 : getPlc_id().hashCode());
        result = prime * result + ((getPlc_name() == null) ? 0 : getPlc_name().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPlc_ip() == null) ? 0 : getPlc_ip().hashCode());
        result = prime * result + ((getPlc_port() == null) ? 0 : getPlc_port().hashCode());
        result = prime * result + ((getPlc_start_num() == null) ? 0 : getPlc_start_num().hashCode());
        result = prime * result + ((getPlc_max_num() == null) ? 0 : getPlc_max_num().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getInsert_time() == null) ? 0 : getInsert_time().hashCode());
        result = prime * result + ((getPlc_type() == null) ? 0 : getPlc_type().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getDisable() == null) ? 0 : getDisable().hashCode());
        result = prime * result + ((getPlc_free_action() == null) ? 0 : getPlc_free_action().hashCode());
        result = prime * result + ((getCargo_rgv() == null) ? 0 : getCargo_rgv().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plc_id=").append(plc_id);
        sb.append(", plc_name=").append(plc_name);
        sb.append(", status=").append(status);
        sb.append(", plc_ip=").append(plc_ip);
        sb.append(", plc_port=").append(plc_port);
        sb.append(", plc_start_num=").append(plc_start_num);
        sb.append(", plc_max_num=").append(plc_max_num);
        sb.append(", create_user=").append(create_user);
        sb.append(", insert_time=").append(insert_time);
        sb.append(", plc_type=").append(plc_type);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", update_by=").append(update_by);
        sb.append(", disable=").append(disable);
        sb.append(", plc_free_action=").append(plc_free_action);
        sb.append(", cargo_rgv=").append(cargo_rgv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}