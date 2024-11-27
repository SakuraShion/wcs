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
 * @TableName wcs_plcdevice
 */
@TableName(value ="wcs_plcdevice")
@Data
public class WcsPlcdevice implements Serializable {
    /**
     * plc设备主键
     */
    @TableId(type = IdType.AUTO)
    private Integer device_Id;

    /**
     * 提升机表示左右中，其他设备不需要填写此字段
     */
    private Integer location;

    /**
     * 设备编号（用于和电控交互）
     */
    private Integer device_no;

    /**
     * plc设备的位置，单个格式(2,24,1,100,)多个格式(15,36,1,100,);(15,37,1,100,);
     */
    private String device_location;

    /**
     * plc设备的名字
     */
    private String device_name;

    /**
     * plc设备的类型
     */
    private Integer device_type;

    /**
     * 该设备的锁定位置，格式(2,24,1,100,)
     */
    private String plc_lock_location;

    /**
     * plc起始地址
     */
    private Integer start_address;

    /**
     * 创建时间
     */
    private Date insert_time;

    /**
     * 该设备所属的plc
     */
    private Integer plc_id;

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
     * 更新者
     */
    private String update_by;

    /**
     * 创建者
     */
    private String create_user;

    /**
     * 创建者
     */
    private String district;

    /**
     * 自卸式提升机移库时判断1楼移库货和车是否同步
     */
    private Boolean cargo_rgv;

    /**
     * 提升机最大层数
     */
    private Integer gridz_max;

    /**
     * 提升机相对于货架层数
     */
    private Integer gridz_relative;

    /**
     * 
     */
    private Boolean lock_device;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 
     */
    private Integer task_no;

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
        WcsPlcdevice other = (WcsPlcdevice) that;
        return (this.getDevice_Id() == null ? other.getDevice_Id() == null : this.getDevice_Id().equals(other.getDevice_Id()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getDevice_no() == null ? other.getDevice_no() == null : this.getDevice_no().equals(other.getDevice_no()))
            && (this.getDevice_location() == null ? other.getDevice_location() == null : this.getDevice_location().equals(other.getDevice_location()))
            && (this.getDevice_name() == null ? other.getDevice_name() == null : this.getDevice_name().equals(other.getDevice_name()))
            && (this.getDevice_type() == null ? other.getDevice_type() == null : this.getDevice_type().equals(other.getDevice_type()))
            && (this.getPlc_lock_location() == null ? other.getPlc_lock_location() == null : this.getPlc_lock_location().equals(other.getPlc_lock_location()))
            && (this.getStart_address() == null ? other.getStart_address() == null : this.getStart_address().equals(other.getStart_address()))
            && (this.getInsert_time() == null ? other.getInsert_time() == null : this.getInsert_time().equals(other.getInsert_time()))
            && (this.getPlc_id() == null ? other.getPlc_id() == null : this.getPlc_id().equals(other.getPlc_id()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getCargo_rgv() == null ? other.getCargo_rgv() == null : this.getCargo_rgv().equals(other.getCargo_rgv()))
            && (this.getGridz_max() == null ? other.getGridz_max() == null : this.getGridz_max().equals(other.getGridz_max()))
            && (this.getGridz_relative() == null ? other.getGridz_relative() == null : this.getGridz_relative().equals(other.getGridz_relative()))
            && (this.getLock_device() == null ? other.getLock_device() == null : this.getLock_device().equals(other.getLock_device()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTask_no() == null ? other.getTask_no() == null : this.getTask_no().equals(other.getTask_no()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDevice_Id() == null) ? 0 : getDevice_Id().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getDevice_no() == null) ? 0 : getDevice_no().hashCode());
        result = prime * result + ((getDevice_location() == null) ? 0 : getDevice_location().hashCode());
        result = prime * result + ((getDevice_name() == null) ? 0 : getDevice_name().hashCode());
        result = prime * result + ((getDevice_type() == null) ? 0 : getDevice_type().hashCode());
        result = prime * result + ((getPlc_lock_location() == null) ? 0 : getPlc_lock_location().hashCode());
        result = prime * result + ((getStart_address() == null) ? 0 : getStart_address().hashCode());
        result = prime * result + ((getInsert_time() == null) ? 0 : getInsert_time().hashCode());
        result = prime * result + ((getPlc_id() == null) ? 0 : getPlc_id().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getCargo_rgv() == null) ? 0 : getCargo_rgv().hashCode());
        result = prime * result + ((getGridz_max() == null) ? 0 : getGridz_max().hashCode());
        result = prime * result + ((getGridz_relative() == null) ? 0 : getGridz_relative().hashCode());
        result = prime * result + ((getLock_device() == null) ? 0 : getLock_device().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTask_no() == null) ? 0 : getTask_no().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", device_Id=").append(device_Id);
        sb.append(", location=").append(location);
        sb.append(", device_no=").append(device_no);
        sb.append(", device_location=").append(device_location);
        sb.append(", device_name=").append(device_name);
        sb.append(", device_type=").append(device_type);
        sb.append(", plc_lock_location=").append(plc_lock_location);
        sb.append(", start_address=").append(start_address);
        sb.append(", insert_time=").append(insert_time);
        sb.append(", plc_id=").append(plc_id);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", update_by=").append(update_by);
        sb.append(", create_user=").append(create_user);
        sb.append(", district=").append(district);
        sb.append(", cargo_rgv=").append(cargo_rgv);
        sb.append(", gridz_max=").append(gridz_max);
        sb.append(", gridz_relative=").append(gridz_relative);
        sb.append(", lock_device=").append(lock_device);
        sb.append(", status=").append(status);
        sb.append(", task_no=").append(task_no);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}