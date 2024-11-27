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
 * @TableName wcs_warehouse
 */
@TableName(value ="wcs_warehouse")
@Data
public class WcsWarehouse implements Serializable {
    /**
     * 入库时候改变入库终点
     */
    @TableId(type = IdType.AUTO)
    private Integer warehouse_id;

    /**
     * 库区名称
     */
    private String warehouse_name;

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
     * 状态（0正常 1暂停）
     */
    private String status;

    /**
     * 优先模式：0入库优先，1出库优先，2出入库均衡，3优先级降序加插入时间升序优先
     */
    private Integer priority_mode;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 库区编码
     */
    private String warehouse_code;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 
     */
    private String update_by;

    /**
     * 单巷道标志：0，否；1，是
     */
    private Boolean single_rgv_flag;

    /**
     * 回缓存位标志：0，否；1，是
     */
    private Boolean free_location_flag;

    /**
     * 入库时候改变入库终点
     */
    private String change_end_flag;

    /**
     * 电量均衡周期
     */
    private Integer battery_time;

    /**
     * 
     */
    private Integer rgv_max_calibration_time;

    /**
     * 
     */
    private Integer taskdb_check_time;

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
        WcsWarehouse other = (WcsWarehouse) that;
        return (this.getWarehouse_id() == null ? other.getWarehouse_id() == null : this.getWarehouse_id().equals(other.getWarehouse_id()))
            && (this.getWarehouse_name() == null ? other.getWarehouse_name() == null : this.getWarehouse_name().equals(other.getWarehouse_name()))
            && (this.getMap_version() == null ? other.getMap_version() == null : this.getMap_version().equals(other.getMap_version()))
            && (this.getMap_direction() == null ? other.getMap_direction() == null : this.getMap_direction().equals(other.getMap_direction()))
            && (this.getMap_rotate() == null ? other.getMap_rotate() == null : this.getMap_rotate().equals(other.getMap_rotate()))
            && (this.getStation_ip() == null ? other.getStation_ip() == null : this.getStation_ip().equals(other.getStation_ip()))
            && (this.getStation_port() == null ? other.getStation_port() == null : this.getStation_port().equals(other.getStation_port()))
            && (this.getWms_ip() == null ? other.getWms_ip() == null : this.getWms_ip().equals(other.getWms_ip()))
            && (this.getWms_port() == null ? other.getWms_port() == null : this.getWms_port().equals(other.getWms_port()))
            && (this.getMore_for_one() == null ? other.getMore_for_one() == null : this.getMore_for_one().equals(other.getMore_for_one()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPriority_mode() == null ? other.getPriority_mode() == null : this.getPriority_mode().equals(other.getPriority_mode()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getWarehouse_code() == null ? other.getWarehouse_code() == null : this.getWarehouse_code().equals(other.getWarehouse_code()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getSingle_rgv_flag() == null ? other.getSingle_rgv_flag() == null : this.getSingle_rgv_flag().equals(other.getSingle_rgv_flag()))
            && (this.getFree_location_flag() == null ? other.getFree_location_flag() == null : this.getFree_location_flag().equals(other.getFree_location_flag()))
            && (this.getChange_end_flag() == null ? other.getChange_end_flag() == null : this.getChange_end_flag().equals(other.getChange_end_flag()))
            && (this.getBattery_time() == null ? other.getBattery_time() == null : this.getBattery_time().equals(other.getBattery_time()))
            && (this.getRgv_max_calibration_time() == null ? other.getRgv_max_calibration_time() == null : this.getRgv_max_calibration_time().equals(other.getRgv_max_calibration_time()))
            && (this.getTaskdb_check_time() == null ? other.getTaskdb_check_time() == null : this.getTaskdb_check_time().equals(other.getTaskdb_check_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWarehouse_id() == null) ? 0 : getWarehouse_id().hashCode());
        result = prime * result + ((getWarehouse_name() == null) ? 0 : getWarehouse_name().hashCode());
        result = prime * result + ((getMap_version() == null) ? 0 : getMap_version().hashCode());
        result = prime * result + ((getMap_direction() == null) ? 0 : getMap_direction().hashCode());
        result = prime * result + ((getMap_rotate() == null) ? 0 : getMap_rotate().hashCode());
        result = prime * result + ((getStation_ip() == null) ? 0 : getStation_ip().hashCode());
        result = prime * result + ((getStation_port() == null) ? 0 : getStation_port().hashCode());
        result = prime * result + ((getWms_ip() == null) ? 0 : getWms_ip().hashCode());
        result = prime * result + ((getWms_port() == null) ? 0 : getWms_port().hashCode());
        result = prime * result + ((getMore_for_one() == null) ? 0 : getMore_for_one().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPriority_mode() == null) ? 0 : getPriority_mode().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getWarehouse_code() == null) ? 0 : getWarehouse_code().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getSingle_rgv_flag() == null) ? 0 : getSingle_rgv_flag().hashCode());
        result = prime * result + ((getFree_location_flag() == null) ? 0 : getFree_location_flag().hashCode());
        result = prime * result + ((getChange_end_flag() == null) ? 0 : getChange_end_flag().hashCode());
        result = prime * result + ((getBattery_time() == null) ? 0 : getBattery_time().hashCode());
        result = prime * result + ((getRgv_max_calibration_time() == null) ? 0 : getRgv_max_calibration_time().hashCode());
        result = prime * result + ((getTaskdb_check_time() == null) ? 0 : getTaskdb_check_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", warehouse_id=").append(warehouse_id);
        sb.append(", warehouse_name=").append(warehouse_name);
        sb.append(", map_version=").append(map_version);
        sb.append(", map_direction=").append(map_direction);
        sb.append(", map_rotate=").append(map_rotate);
        sb.append(", station_ip=").append(station_ip);
        sb.append(", station_port=").append(station_port);
        sb.append(", wms_ip=").append(wms_ip);
        sb.append(", wms_port=").append(wms_port);
        sb.append(", more_for_one=").append(more_for_one);
        sb.append(", status=").append(status);
        sb.append(", priority_mode=").append(priority_mode);
        sb.append(", create_time=").append(create_time);
        sb.append(", warehouse_code=").append(warehouse_code);
        sb.append(", create_by=").append(create_by);
        sb.append(", update_by=").append(update_by);
        sb.append(", single_rgv_flag=").append(single_rgv_flag);
        sb.append(", free_location_flag=").append(free_location_flag);
        sb.append(", change_end_flag=").append(change_end_flag);
        sb.append(", battery_time=").append(battery_time);
        sb.append(", rgv_max_calibration_time=").append(rgv_max_calibration_time);
        sb.append(", taskdb_check_time=").append(taskdb_check_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}