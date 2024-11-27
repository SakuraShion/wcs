package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wcs_point_map
 */
@TableName(value ="wcs_point_map")
@Data
public class WcsPointMap implements Serializable {
    /**
     * 涓婚敭
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 鍚嶇О
     */
    private String map_name;

    /**
     * wms鐐逛綅
     */
    private String wms_point;

    /**
     * plc鐐逛綅
     */
    private String plc_point;

    /**
     * agv鐐逛綅
     */
    private String agv_point;

    /**
     * 鐐逛綅绫诲瀷
     */
    private Integer type;

    /**
     * 瀵瑰簲鍧愭爣
     */
    private String map_node;

    /**
     * 鐐逛綅鏂瑰悜
     */
    private Integer direction;

    /**
     * 搴撳尯
     */
    private String district;

    /**
     * 
     */
    private String near_point;

    /**
     * 
     */
    private String lock_Obj;

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
        WcsPointMap other = (WcsPointMap) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMap_name() == null ? other.getMap_name() == null : this.getMap_name().equals(other.getMap_name()))
            && (this.getWms_point() == null ? other.getWms_point() == null : this.getWms_point().equals(other.getWms_point()))
            && (this.getPlc_point() == null ? other.getPlc_point() == null : this.getPlc_point().equals(other.getPlc_point()))
            && (this.getAgv_point() == null ? other.getAgv_point() == null : this.getAgv_point().equals(other.getAgv_point()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMap_node() == null ? other.getMap_node() == null : this.getMap_node().equals(other.getMap_node()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getNear_point() == null ? other.getNear_point() == null : this.getNear_point().equals(other.getNear_point()))
            && (this.getLock_Obj() == null ? other.getLock_Obj() == null : this.getLock_Obj().equals(other.getLock_Obj()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMap_name() == null) ? 0 : getMap_name().hashCode());
        result = prime * result + ((getWms_point() == null) ? 0 : getWms_point().hashCode());
        result = prime * result + ((getPlc_point() == null) ? 0 : getPlc_point().hashCode());
        result = prime * result + ((getAgv_point() == null) ? 0 : getAgv_point().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMap_node() == null) ? 0 : getMap_node().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getNear_point() == null) ? 0 : getNear_point().hashCode());
        result = prime * result + ((getLock_Obj() == null) ? 0 : getLock_Obj().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", map_name=").append(map_name);
        sb.append(", wms_point=").append(wms_point);
        sb.append(", plc_point=").append(plc_point);
        sb.append(", agv_point=").append(agv_point);
        sb.append(", type=").append(type);
        sb.append(", map_node=").append(map_node);
        sb.append(", direction=").append(direction);
        sb.append(", district=").append(district);
        sb.append(", near_point=").append(near_point);
        sb.append(", lock_Obj=").append(lock_Obj);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}