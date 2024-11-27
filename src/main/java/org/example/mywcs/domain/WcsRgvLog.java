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
 * @TableName wcs_rgv_log
 */
@TableName(value ="wcs_rgv_log")
@Data
public class WcsRgvLog implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer rgv_id;

    /**
     * 任务编号
     */
    private Integer tack_id;

    /**
     * 设备号
     */
    private String device_name;

    /**
     * 接口描述消息
     */
    private String message;

    /**
     * 接口传入参数
     */
    private String rgv_params_in;

    /**
     * 接口返回参数
     */
    private String backtrack;

    /**
     * 状态 0，1
     */
    private Integer state;

    /**
     * 消耗时间
     */
    private Integer use_time;

    /**
     * 操作时间
     */
    private Date operate_time;

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
        WcsRgvLog other = (WcsRgvLog) that;
        return (this.getRgv_id() == null ? other.getRgv_id() == null : this.getRgv_id().equals(other.getRgv_id()))
            && (this.getTack_id() == null ? other.getTack_id() == null : this.getTack_id().equals(other.getTack_id()))
            && (this.getDevice_name() == null ? other.getDevice_name() == null : this.getDevice_name().equals(other.getDevice_name()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getRgv_params_in() == null ? other.getRgv_params_in() == null : this.getRgv_params_in().equals(other.getRgv_params_in()))
            && (this.getBacktrack() == null ? other.getBacktrack() == null : this.getBacktrack().equals(other.getBacktrack()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getUse_time() == null ? other.getUse_time() == null : this.getUse_time().equals(other.getUse_time()))
            && (this.getOperate_time() == null ? other.getOperate_time() == null : this.getOperate_time().equals(other.getOperate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRgv_id() == null) ? 0 : getRgv_id().hashCode());
        result = prime * result + ((getTack_id() == null) ? 0 : getTack_id().hashCode());
        result = prime * result + ((getDevice_name() == null) ? 0 : getDevice_name().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getRgv_params_in() == null) ? 0 : getRgv_params_in().hashCode());
        result = prime * result + ((getBacktrack() == null) ? 0 : getBacktrack().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getUse_time() == null) ? 0 : getUse_time().hashCode());
        result = prime * result + ((getOperate_time() == null) ? 0 : getOperate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rgv_id=").append(rgv_id);
        sb.append(", tack_id=").append(tack_id);
        sb.append(", device_name=").append(device_name);
        sb.append(", message=").append(message);
        sb.append(", rgv_params_in=").append(rgv_params_in);
        sb.append(", backtrack=").append(backtrack);
        sb.append(", state=").append(state);
        sb.append(", use_time=").append(use_time);
        sb.append(", operate_time=").append(operate_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}