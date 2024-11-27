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
 * @TableName wcs_rgv
 */
@TableName(value ="wcs_rgv")
@Data
public class WcsRgv implements Serializable {
    /**
     * 小车数据库主键
     */
    @TableId(type = IdType.AUTO)
    private Integer rgv_id;

    /**
     * 开启自动充电模式
     */
    private Boolean is_auto_charge;

    /**
     * 自动充电电量
     */
    private Integer auto_battery_size;

    /**
     * 小车专用充电桩位置
     */
    private String charge_location;

    /**
     * 小车与RES交互编号
     */
    private Integer rgv_no;

    /**
     * 低电量预警值
     */
    private Integer alarm_battery_size;

    /**
     * 行驶里程
     */
    private String mileage;

    /**
     * 能否被跨层调用
     */
    private Boolean is_pass_floor;

    /**
     * 自动结束充电电量
     */
    private Integer max_battery_size;

    /**
     * 插入时间
     */
    private Date insert_time;

    /**
     * 小车当前位置
     */
    private String location;

    /**
     * 空闲时间（执行完任务后空闲指定时间后并达到充电条件则自动去充电，单位分钟）
     */
    private Integer free_time;

    /**
     * 小车空闲时的位置
     */
    private String free_location;

    /**
     * 可执行的X区域
     */
    private String x_region;

    /**
     * 可执行的Y区域
     */
    private String y_region;

    /**
     * 可执行的Z区域
     */
    private String z_region;

    /**
     * 小车ip
     */
    private String rgv_ip;

    /**
     * 小车端口
     */
    private Integer rgv_port;

    /**
     * X增大方向对应小车方向
     */
    private Integer rgv_direction;

    /**
     * 小车的Mac地址
     */
    private String rgv_mac;

    /**
     * 小车的广播地址
     */
    private String rgv_ba_ip;

    /**
     * 车辆行驶速度
     */
    private Integer speed;

    /**
     * 车辆行驶加速度
     */
    private Integer acc_speed;

    /**
     * 托盘顶升时间
     */
    private Integer pallet_up_time;

    /**
     * 托盘下降时间
     */
    private Integer pallet_down_time;

    /**
     * 转向时间
     */
    private Integer direction_time;

    /**
     * 充电中可分配任务电量
     */
    private Integer assign_battery_size;

    /**
     * 0：下线；1：上线
     */
    private Boolean online;

    /**
     * 一次最大锁定节点数
     */
    private Integer max_lock_num;

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
     * 1. 4代车 2. 5.4TL
     */
    private Integer rgv_type;

    /**
     * 最后一次电量均衡时间
     */
    private Date battery_full_time;

    /**
     * 是否开启托盘校准
     */
    private Boolean is_calibration;

    /**
     * 执行任务类型
     */
    private Integer priority_mode;

    /**
     * 
     */
    private Boolean code_calibration;

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
        WcsRgv other = (WcsRgv) that;
        return (this.getRgv_id() == null ? other.getRgv_id() == null : this.getRgv_id().equals(other.getRgv_id()))
            && (this.getIs_auto_charge() == null ? other.getIs_auto_charge() == null : this.getIs_auto_charge().equals(other.getIs_auto_charge()))
            && (this.getAuto_battery_size() == null ? other.getAuto_battery_size() == null : this.getAuto_battery_size().equals(other.getAuto_battery_size()))
            && (this.getCharge_location() == null ? other.getCharge_location() == null : this.getCharge_location().equals(other.getCharge_location()))
            && (this.getRgv_no() == null ? other.getRgv_no() == null : this.getRgv_no().equals(other.getRgv_no()))
            && (this.getAlarm_battery_size() == null ? other.getAlarm_battery_size() == null : this.getAlarm_battery_size().equals(other.getAlarm_battery_size()))
            && (this.getMileage() == null ? other.getMileage() == null : this.getMileage().equals(other.getMileage()))
            && (this.getIs_pass_floor() == null ? other.getIs_pass_floor() == null : this.getIs_pass_floor().equals(other.getIs_pass_floor()))
            && (this.getMax_battery_size() == null ? other.getMax_battery_size() == null : this.getMax_battery_size().equals(other.getMax_battery_size()))
            && (this.getInsert_time() == null ? other.getInsert_time() == null : this.getInsert_time().equals(other.getInsert_time()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getFree_time() == null ? other.getFree_time() == null : this.getFree_time().equals(other.getFree_time()))
            && (this.getFree_location() == null ? other.getFree_location() == null : this.getFree_location().equals(other.getFree_location()))
            && (this.getX_region() == null ? other.getX_region() == null : this.getX_region().equals(other.getX_region()))
            && (this.getY_region() == null ? other.getY_region() == null : this.getY_region().equals(other.getY_region()))
            && (this.getZ_region() == null ? other.getZ_region() == null : this.getZ_region().equals(other.getZ_region()))
            && (this.getRgv_ip() == null ? other.getRgv_ip() == null : this.getRgv_ip().equals(other.getRgv_ip()))
            && (this.getRgv_port() == null ? other.getRgv_port() == null : this.getRgv_port().equals(other.getRgv_port()))
            && (this.getRgv_direction() == null ? other.getRgv_direction() == null : this.getRgv_direction().equals(other.getRgv_direction()))
            && (this.getRgv_mac() == null ? other.getRgv_mac() == null : this.getRgv_mac().equals(other.getRgv_mac()))
            && (this.getRgv_ba_ip() == null ? other.getRgv_ba_ip() == null : this.getRgv_ba_ip().equals(other.getRgv_ba_ip()))
            && (this.getSpeed() == null ? other.getSpeed() == null : this.getSpeed().equals(other.getSpeed()))
            && (this.getAcc_speed() == null ? other.getAcc_speed() == null : this.getAcc_speed().equals(other.getAcc_speed()))
            && (this.getPallet_up_time() == null ? other.getPallet_up_time() == null : this.getPallet_up_time().equals(other.getPallet_up_time()))
            && (this.getPallet_down_time() == null ? other.getPallet_down_time() == null : this.getPallet_down_time().equals(other.getPallet_down_time()))
            && (this.getDirection_time() == null ? other.getDirection_time() == null : this.getDirection_time().equals(other.getDirection_time()))
            && (this.getAssign_battery_size() == null ? other.getAssign_battery_size() == null : this.getAssign_battery_size().equals(other.getAssign_battery_size()))
            && (this.getOnline() == null ? other.getOnline() == null : this.getOnline().equals(other.getOnline()))
            && (this.getMax_lock_num() == null ? other.getMax_lock_num() == null : this.getMax_lock_num().equals(other.getMax_lock_num()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getRgv_type() == null ? other.getRgv_type() == null : this.getRgv_type().equals(other.getRgv_type()))
            && (this.getBattery_full_time() == null ? other.getBattery_full_time() == null : this.getBattery_full_time().equals(other.getBattery_full_time()))
            && (this.getIs_calibration() == null ? other.getIs_calibration() == null : this.getIs_calibration().equals(other.getIs_calibration()))
            && (this.getPriority_mode() == null ? other.getPriority_mode() == null : this.getPriority_mode().equals(other.getPriority_mode()))
            && (this.getCode_calibration() == null ? other.getCode_calibration() == null : this.getCode_calibration().equals(other.getCode_calibration()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRgv_id() == null) ? 0 : getRgv_id().hashCode());
        result = prime * result + ((getIs_auto_charge() == null) ? 0 : getIs_auto_charge().hashCode());
        result = prime * result + ((getAuto_battery_size() == null) ? 0 : getAuto_battery_size().hashCode());
        result = prime * result + ((getCharge_location() == null) ? 0 : getCharge_location().hashCode());
        result = prime * result + ((getRgv_no() == null) ? 0 : getRgv_no().hashCode());
        result = prime * result + ((getAlarm_battery_size() == null) ? 0 : getAlarm_battery_size().hashCode());
        result = prime * result + ((getMileage() == null) ? 0 : getMileage().hashCode());
        result = prime * result + ((getIs_pass_floor() == null) ? 0 : getIs_pass_floor().hashCode());
        result = prime * result + ((getMax_battery_size() == null) ? 0 : getMax_battery_size().hashCode());
        result = prime * result + ((getInsert_time() == null) ? 0 : getInsert_time().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getFree_time() == null) ? 0 : getFree_time().hashCode());
        result = prime * result + ((getFree_location() == null) ? 0 : getFree_location().hashCode());
        result = prime * result + ((getX_region() == null) ? 0 : getX_region().hashCode());
        result = prime * result + ((getY_region() == null) ? 0 : getY_region().hashCode());
        result = prime * result + ((getZ_region() == null) ? 0 : getZ_region().hashCode());
        result = prime * result + ((getRgv_ip() == null) ? 0 : getRgv_ip().hashCode());
        result = prime * result + ((getRgv_port() == null) ? 0 : getRgv_port().hashCode());
        result = prime * result + ((getRgv_direction() == null) ? 0 : getRgv_direction().hashCode());
        result = prime * result + ((getRgv_mac() == null) ? 0 : getRgv_mac().hashCode());
        result = prime * result + ((getRgv_ba_ip() == null) ? 0 : getRgv_ba_ip().hashCode());
        result = prime * result + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        result = prime * result + ((getAcc_speed() == null) ? 0 : getAcc_speed().hashCode());
        result = prime * result + ((getPallet_up_time() == null) ? 0 : getPallet_up_time().hashCode());
        result = prime * result + ((getPallet_down_time() == null) ? 0 : getPallet_down_time().hashCode());
        result = prime * result + ((getDirection_time() == null) ? 0 : getDirection_time().hashCode());
        result = prime * result + ((getAssign_battery_size() == null) ? 0 : getAssign_battery_size().hashCode());
        result = prime * result + ((getOnline() == null) ? 0 : getOnline().hashCode());
        result = prime * result + ((getMax_lock_num() == null) ? 0 : getMax_lock_num().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getRgv_type() == null) ? 0 : getRgv_type().hashCode());
        result = prime * result + ((getBattery_full_time() == null) ? 0 : getBattery_full_time().hashCode());
        result = prime * result + ((getIs_calibration() == null) ? 0 : getIs_calibration().hashCode());
        result = prime * result + ((getPriority_mode() == null) ? 0 : getPriority_mode().hashCode());
        result = prime * result + ((getCode_calibration() == null) ? 0 : getCode_calibration().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rgv_id=").append(rgv_id);
        sb.append(", is_auto_charge=").append(is_auto_charge);
        sb.append(", auto_battery_size=").append(auto_battery_size);
        sb.append(", charge_location=").append(charge_location);
        sb.append(", rgv_no=").append(rgv_no);
        sb.append(", alarm_battery_size=").append(alarm_battery_size);
        sb.append(", mileage=").append(mileage);
        sb.append(", is_pass_floor=").append(is_pass_floor);
        sb.append(", max_battery_size=").append(max_battery_size);
        sb.append(", insert_time=").append(insert_time);
        sb.append(", location=").append(location);
        sb.append(", free_time=").append(free_time);
        sb.append(", free_location=").append(free_location);
        sb.append(", x_region=").append(x_region);
        sb.append(", y_region=").append(y_region);
        sb.append(", z_region=").append(z_region);
        sb.append(", rgv_ip=").append(rgv_ip);
        sb.append(", rgv_port=").append(rgv_port);
        sb.append(", rgv_direction=").append(rgv_direction);
        sb.append(", rgv_mac=").append(rgv_mac);
        sb.append(", rgv_ba_ip=").append(rgv_ba_ip);
        sb.append(", speed=").append(speed);
        sb.append(", acc_speed=").append(acc_speed);
        sb.append(", pallet_up_time=").append(pallet_up_time);
        sb.append(", pallet_down_time=").append(pallet_down_time);
        sb.append(", direction_time=").append(direction_time);
        sb.append(", assign_battery_size=").append(assign_battery_size);
        sb.append(", online=").append(online);
        sb.append(", max_lock_num=").append(max_lock_num);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", update_by=").append(update_by);
        sb.append(", rgv_type=").append(rgv_type);
        sb.append(", battery_full_time=").append(battery_full_time);
        sb.append(", is_calibration=").append(is_calibration);
        sb.append(", priority_mode=").append(priority_mode);
        sb.append(", code_calibration=").append(code_calibration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}