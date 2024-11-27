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
 * @TableName wcs_programme
 */
@TableName(value ="wcs_programme")
@Data
public class WcsProgramme implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer programme_id;

    /**
     * 出入库口平台所在层
     */
    private Integer programme_floor;

    /**
     * 方案名称
     */
    private String programme_name;

    /**
     * 出入库类型
     */
    private Integer programme_type;

    /**
     * 方案
     */
    private String programme;

    /**
     * 库口id
     */
    private Integer port_id;

    /**
     * 接驳点坐标
     */
    private String coords;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 更新人
     */
    private String update_by;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 创建者
     */
    private String create_by;

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
        WcsProgramme other = (WcsProgramme) that;
        return (this.getProgramme_id() == null ? other.getProgramme_id() == null : this.getProgramme_id().equals(other.getProgramme_id()))
            && (this.getProgramme_floor() == null ? other.getProgramme_floor() == null : this.getProgramme_floor().equals(other.getProgramme_floor()))
            && (this.getProgramme_name() == null ? other.getProgramme_name() == null : this.getProgramme_name().equals(other.getProgramme_name()))
            && (this.getProgramme_type() == null ? other.getProgramme_type() == null : this.getProgramme_type().equals(other.getProgramme_type()))
            && (this.getProgramme() == null ? other.getProgramme() == null : this.getProgramme().equals(other.getProgramme()))
            && (this.getPort_id() == null ? other.getPort_id() == null : this.getPort_id().equals(other.getPort_id()))
            && (this.getCoords() == null ? other.getCoords() == null : this.getCoords().equals(other.getCoords()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProgramme_id() == null) ? 0 : getProgramme_id().hashCode());
        result = prime * result + ((getProgramme_floor() == null) ? 0 : getProgramme_floor().hashCode());
        result = prime * result + ((getProgramme_name() == null) ? 0 : getProgramme_name().hashCode());
        result = prime * result + ((getProgramme_type() == null) ? 0 : getProgramme_type().hashCode());
        result = prime * result + ((getProgramme() == null) ? 0 : getProgramme().hashCode());
        result = prime * result + ((getPort_id() == null) ? 0 : getPort_id().hashCode());
        result = prime * result + ((getCoords() == null) ? 0 : getCoords().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", programme_id=").append(programme_id);
        sb.append(", programme_floor=").append(programme_floor);
        sb.append(", programme_name=").append(programme_name);
        sb.append(", programme_type=").append(programme_type);
        sb.append(", programme=").append(programme);
        sb.append(", port_id=").append(port_id);
        sb.append(", coords=").append(coords);
        sb.append(", status=").append(status);
        sb.append(", update_by=").append(update_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}