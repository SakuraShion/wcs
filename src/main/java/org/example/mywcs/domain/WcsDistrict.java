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
 * @TableName wcs_district
 */
@TableName(value ="wcs_district")
@Data
public class WcsDistrict implements Serializable {
    /**
     * 库区主键
     */
    @TableId(type = IdType.AUTO)
    private Integer district_id;

    /**
     * 库区名称
     */
    private String district_name;

    /**
     * 此库区的地图版本
     */
    private Integer map_version;

    /**
     * 地图中X增大方向对应的小车方向
     */
    private Integer map_direction;

    /**
     * 地图旋转角度（0°，90°，180°，270°）
     */
    private Integer map_rotate;

    /**
     * 基站IP
     */
    private String station_ip;

    /**
     * 基站端口
     */
    private String station_port;

    /**
     * 上位系统IP
     */
    private String wms_ip;

    /**
     * 上位系统端口
     */
    private String wms_port;

    /**
     * 多车同层（0不可 1可）
     */
    private Integer more_for_one;

    /**
     * 插入时间
     */
    private Date insert_time;

    /**
     * 
     */
    private Integer is_accept;

    /**
     * 优先模式：0入库优先，1出库优先，2出入库均衡，3优先级降序加插入时间升序优先
     */
    private Integer priority_mode;

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
        WcsDistrict other = (WcsDistrict) that;
        return (this.getDistrict_id() == null ? other.getDistrict_id() == null : this.getDistrict_id().equals(other.getDistrict_id()))
            && (this.getDistrict_name() == null ? other.getDistrict_name() == null : this.getDistrict_name().equals(other.getDistrict_name()))
            && (this.getMap_version() == null ? other.getMap_version() == null : this.getMap_version().equals(other.getMap_version()))
            && (this.getMap_direction() == null ? other.getMap_direction() == null : this.getMap_direction().equals(other.getMap_direction()))
            && (this.getMap_rotate() == null ? other.getMap_rotate() == null : this.getMap_rotate().equals(other.getMap_rotate()))
            && (this.getStation_ip() == null ? other.getStation_ip() == null : this.getStation_ip().equals(other.getStation_ip()))
            && (this.getStation_port() == null ? other.getStation_port() == null : this.getStation_port().equals(other.getStation_port()))
            && (this.getWms_ip() == null ? other.getWms_ip() == null : this.getWms_ip().equals(other.getWms_ip()))
            && (this.getWms_port() == null ? other.getWms_port() == null : this.getWms_port().equals(other.getWms_port()))
            && (this.getMore_for_one() == null ? other.getMore_for_one() == null : this.getMore_for_one().equals(other.getMore_for_one()))
            && (this.getInsert_time() == null ? other.getInsert_time() == null : this.getInsert_time().equals(other.getInsert_time()))
            && (this.getIs_accept() == null ? other.getIs_accept() == null : this.getIs_accept().equals(other.getIs_accept()))
            && (this.getPriority_mode() == null ? other.getPriority_mode() == null : this.getPriority_mode().equals(other.getPriority_mode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDistrict_id() == null) ? 0 : getDistrict_id().hashCode());
        result = prime * result + ((getDistrict_name() == null) ? 0 : getDistrict_name().hashCode());
        result = prime * result + ((getMap_version() == null) ? 0 : getMap_version().hashCode());
        result = prime * result + ((getMap_direction() == null) ? 0 : getMap_direction().hashCode());
        result = prime * result + ((getMap_rotate() == null) ? 0 : getMap_rotate().hashCode());
        result = prime * result + ((getStation_ip() == null) ? 0 : getStation_ip().hashCode());
        result = prime * result + ((getStation_port() == null) ? 0 : getStation_port().hashCode());
        result = prime * result + ((getWms_ip() == null) ? 0 : getWms_ip().hashCode());
        result = prime * result + ((getWms_port() == null) ? 0 : getWms_port().hashCode());
        result = prime * result + ((getMore_for_one() == null) ? 0 : getMore_for_one().hashCode());
        result = prime * result + ((getInsert_time() == null) ? 0 : getInsert_time().hashCode());
        result = prime * result + ((getIs_accept() == null) ? 0 : getIs_accept().hashCode());
        result = prime * result + ((getPriority_mode() == null) ? 0 : getPriority_mode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", district_id=").append(district_id);
        sb.append(", district_name=").append(district_name);
        sb.append(", map_version=").append(map_version);
        sb.append(", map_direction=").append(map_direction);
        sb.append(", map_rotate=").append(map_rotate);
        sb.append(", station_ip=").append(station_ip);
        sb.append(", station_port=").append(station_port);
        sb.append(", wms_ip=").append(wms_ip);
        sb.append(", wms_port=").append(wms_port);
        sb.append(", more_for_one=").append(more_for_one);
        sb.append(", insert_time=").append(insert_time);
        sb.append(", is_accept=").append(is_accept);
        sb.append(", priority_mode=").append(priority_mode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}