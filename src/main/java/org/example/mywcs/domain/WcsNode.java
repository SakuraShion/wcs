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
 * @TableName wcs_node
 */
@TableName(value ="wcs_node")
@Data
public class WcsNode implements Serializable {
    /**
     * 节点主键
     */
    @TableId(type = IdType.AUTO)
    private Integer node_id;

    /**
     * 节点编号，WMS提供
     */
    private String grid_id;

    /**
     * 节点状态，是否有货
     */
    private String grid_status;

    /**
     * 节点类型
     */
    private String grid_type;

    /**
     * X坐标
     */
    private Integer gridx;

    /**
     * Y坐标
     */
    private Integer gridy;

    /**
     * Z坐标
     */
    private Integer gridz;

    /**
     * 节点是否被锁定
     */
    private Boolean is_block;

    /**
     * X方向位移量
     */
    private Integer offsetx;

    /**
     * Y方向位移量
     */
    private Integer offsety;

    /**
     * 方向可向下
     */
    private Boolean can_to_down;

    /**
     * 方向可向左
     */
    private Boolean can_to_left;

    /**
     * 方向可向右
     */
    private Boolean can_to_right;

    /**
     * 方向可向上
     */
    private Boolean can_to_up;

    /**
     * 地码
     */
    private String ground_code;

    /**
     * 托盘码
     */
    private String pallet_code;

    /**
     * 巷道类型：S单开口巷道；D双开口巷道
     */
    private String road_type;

    /**
     * 巷道编号
     */
    private String road_no;

    /**
     * 区域ID，库区可能划分为多个区域
     */
    private Integer zone_id;

    /**
     * 小车是否可停留 0：可停留；1：不可停留
     */
    private Boolean can_to_stop;

    /**
     * 巷道号
     */
    private String single_no;

    /**
     * 巷道顺序
     */
    private String single_order;

    /**
     * 自动门是否开启0：开启；1：不开启
     */
    private Boolean is_door;

    /**
     * 限制该节点做为起点或终点（出入移）执行任务的车的数量
     */
    private Integer limit_rgv_count;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 更新者
     */
    private String update_by;

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
     * 
     */
    private Integer run_up_for_ground_code_status;

    /**
     * 
     */
    private Integer run_down_for_ground_code_status;

    /**
     * 
     */
    private Integer run_left_for_ground_code_status;

    /**
     * 
     */
    private Integer run_right_for_ground_code_status;

    /**
     * 
     */
    private Integer up_calibration_time;

    /**
     * 
     */
    private Integer down_calibration_time;

    /**
     * 
     */
    private Integer left_calibration_time;

    /**
     * 
     */
    private Integer right_calibration_time;

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
        WcsNode other = (WcsNode) that;
        return (this.getNode_id() == null ? other.getNode_id() == null : this.getNode_id().equals(other.getNode_id()))
            && (this.getGrid_id() == null ? other.getGrid_id() == null : this.getGrid_id().equals(other.getGrid_id()))
            && (this.getGrid_status() == null ? other.getGrid_status() == null : this.getGrid_status().equals(other.getGrid_status()))
            && (this.getGrid_type() == null ? other.getGrid_type() == null : this.getGrid_type().equals(other.getGrid_type()))
            && (this.getGridx() == null ? other.getGridx() == null : this.getGridx().equals(other.getGridx()))
            && (this.getGridy() == null ? other.getGridy() == null : this.getGridy().equals(other.getGridy()))
            && (this.getGridz() == null ? other.getGridz() == null : this.getGridz().equals(other.getGridz()))
            && (this.getIs_block() == null ? other.getIs_block() == null : this.getIs_block().equals(other.getIs_block()))
            && (this.getOffsetx() == null ? other.getOffsetx() == null : this.getOffsetx().equals(other.getOffsetx()))
            && (this.getOffsety() == null ? other.getOffsety() == null : this.getOffsety().equals(other.getOffsety()))
            && (this.getCan_to_down() == null ? other.getCan_to_down() == null : this.getCan_to_down().equals(other.getCan_to_down()))
            && (this.getCan_to_left() == null ? other.getCan_to_left() == null : this.getCan_to_left().equals(other.getCan_to_left()))
            && (this.getCan_to_right() == null ? other.getCan_to_right() == null : this.getCan_to_right().equals(other.getCan_to_right()))
            && (this.getCan_to_up() == null ? other.getCan_to_up() == null : this.getCan_to_up().equals(other.getCan_to_up()))
            && (this.getGround_code() == null ? other.getGround_code() == null : this.getGround_code().equals(other.getGround_code()))
            && (this.getPallet_code() == null ? other.getPallet_code() == null : this.getPallet_code().equals(other.getPallet_code()))
            && (this.getRoad_type() == null ? other.getRoad_type() == null : this.getRoad_type().equals(other.getRoad_type()))
            && (this.getRoad_no() == null ? other.getRoad_no() == null : this.getRoad_no().equals(other.getRoad_no()))
            && (this.getZone_id() == null ? other.getZone_id() == null : this.getZone_id().equals(other.getZone_id()))
            && (this.getCan_to_stop() == null ? other.getCan_to_stop() == null : this.getCan_to_stop().equals(other.getCan_to_stop()))
            && (this.getSingle_no() == null ? other.getSingle_no() == null : this.getSingle_no().equals(other.getSingle_no()))
            && (this.getSingle_order() == null ? other.getSingle_order() == null : this.getSingle_order().equals(other.getSingle_order()))
            && (this.getIs_door() == null ? other.getIs_door() == null : this.getIs_door().equals(other.getIs_door()))
            && (this.getLimit_rgv_count() == null ? other.getLimit_rgv_count() == null : this.getLimit_rgv_count().equals(other.getLimit_rgv_count()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRun_up_for_ground_code_status() == null ? other.getRun_up_for_ground_code_status() == null : this.getRun_up_for_ground_code_status().equals(other.getRun_up_for_ground_code_status()))
            && (this.getRun_down_for_ground_code_status() == null ? other.getRun_down_for_ground_code_status() == null : this.getRun_down_for_ground_code_status().equals(other.getRun_down_for_ground_code_status()))
            && (this.getRun_left_for_ground_code_status() == null ? other.getRun_left_for_ground_code_status() == null : this.getRun_left_for_ground_code_status().equals(other.getRun_left_for_ground_code_status()))
            && (this.getRun_right_for_ground_code_status() == null ? other.getRun_right_for_ground_code_status() == null : this.getRun_right_for_ground_code_status().equals(other.getRun_right_for_ground_code_status()))
            && (this.getUp_calibration_time() == null ? other.getUp_calibration_time() == null : this.getUp_calibration_time().equals(other.getUp_calibration_time()))
            && (this.getDown_calibration_time() == null ? other.getDown_calibration_time() == null : this.getDown_calibration_time().equals(other.getDown_calibration_time()))
            && (this.getLeft_calibration_time() == null ? other.getLeft_calibration_time() == null : this.getLeft_calibration_time().equals(other.getLeft_calibration_time()))
            && (this.getRight_calibration_time() == null ? other.getRight_calibration_time() == null : this.getRight_calibration_time().equals(other.getRight_calibration_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNode_id() == null) ? 0 : getNode_id().hashCode());
        result = prime * result + ((getGrid_id() == null) ? 0 : getGrid_id().hashCode());
        result = prime * result + ((getGrid_status() == null) ? 0 : getGrid_status().hashCode());
        result = prime * result + ((getGrid_type() == null) ? 0 : getGrid_type().hashCode());
        result = prime * result + ((getGridx() == null) ? 0 : getGridx().hashCode());
        result = prime * result + ((getGridy() == null) ? 0 : getGridy().hashCode());
        result = prime * result + ((getGridz() == null) ? 0 : getGridz().hashCode());
        result = prime * result + ((getIs_block() == null) ? 0 : getIs_block().hashCode());
        result = prime * result + ((getOffsetx() == null) ? 0 : getOffsetx().hashCode());
        result = prime * result + ((getOffsety() == null) ? 0 : getOffsety().hashCode());
        result = prime * result + ((getCan_to_down() == null) ? 0 : getCan_to_down().hashCode());
        result = prime * result + ((getCan_to_left() == null) ? 0 : getCan_to_left().hashCode());
        result = prime * result + ((getCan_to_right() == null) ? 0 : getCan_to_right().hashCode());
        result = prime * result + ((getCan_to_up() == null) ? 0 : getCan_to_up().hashCode());
        result = prime * result + ((getGround_code() == null) ? 0 : getGround_code().hashCode());
        result = prime * result + ((getPallet_code() == null) ? 0 : getPallet_code().hashCode());
        result = prime * result + ((getRoad_type() == null) ? 0 : getRoad_type().hashCode());
        result = prime * result + ((getRoad_no() == null) ? 0 : getRoad_no().hashCode());
        result = prime * result + ((getZone_id() == null) ? 0 : getZone_id().hashCode());
        result = prime * result + ((getCan_to_stop() == null) ? 0 : getCan_to_stop().hashCode());
        result = prime * result + ((getSingle_no() == null) ? 0 : getSingle_no().hashCode());
        result = prime * result + ((getSingle_order() == null) ? 0 : getSingle_order().hashCode());
        result = prime * result + ((getIs_door() == null) ? 0 : getIs_door().hashCode());
        result = prime * result + ((getLimit_rgv_count() == null) ? 0 : getLimit_rgv_count().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRun_up_for_ground_code_status() == null) ? 0 : getRun_up_for_ground_code_status().hashCode());
        result = prime * result + ((getRun_down_for_ground_code_status() == null) ? 0 : getRun_down_for_ground_code_status().hashCode());
        result = prime * result + ((getRun_left_for_ground_code_status() == null) ? 0 : getRun_left_for_ground_code_status().hashCode());
        result = prime * result + ((getRun_right_for_ground_code_status() == null) ? 0 : getRun_right_for_ground_code_status().hashCode());
        result = prime * result + ((getUp_calibration_time() == null) ? 0 : getUp_calibration_time().hashCode());
        result = prime * result + ((getDown_calibration_time() == null) ? 0 : getDown_calibration_time().hashCode());
        result = prime * result + ((getLeft_calibration_time() == null) ? 0 : getLeft_calibration_time().hashCode());
        result = prime * result + ((getRight_calibration_time() == null) ? 0 : getRight_calibration_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", node_id=").append(node_id);
        sb.append(", grid_id=").append(grid_id);
        sb.append(", grid_status=").append(grid_status);
        sb.append(", grid_type=").append(grid_type);
        sb.append(", gridx=").append(gridx);
        sb.append(", gridy=").append(gridy);
        sb.append(", gridz=").append(gridz);
        sb.append(", is_block=").append(is_block);
        sb.append(", offsetx=").append(offsetx);
        sb.append(", offsety=").append(offsety);
        sb.append(", can_to_down=").append(can_to_down);
        sb.append(", can_to_left=").append(can_to_left);
        sb.append(", can_to_right=").append(can_to_right);
        sb.append(", can_to_up=").append(can_to_up);
        sb.append(", ground_code=").append(ground_code);
        sb.append(", pallet_code=").append(pallet_code);
        sb.append(", road_type=").append(road_type);
        sb.append(", road_no=").append(road_no);
        sb.append(", zone_id=").append(zone_id);
        sb.append(", can_to_stop=").append(can_to_stop);
        sb.append(", single_no=").append(single_no);
        sb.append(", single_order=").append(single_order);
        sb.append(", is_door=").append(is_door);
        sb.append(", limit_rgv_count=").append(limit_rgv_count);
        sb.append(", remark=").append(remark);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", run_up_for_ground_code_status=").append(run_up_for_ground_code_status);
        sb.append(", run_down_for_ground_code_status=").append(run_down_for_ground_code_status);
        sb.append(", run_left_for_ground_code_status=").append(run_left_for_ground_code_status);
        sb.append(", run_right_for_ground_code_status=").append(run_right_for_ground_code_status);
        sb.append(", up_calibration_time=").append(up_calibration_time);
        sb.append(", down_calibration_time=").append(down_calibration_time);
        sb.append(", left_calibration_time=").append(left_calibration_time);
        sb.append(", right_calibration_time=").append(right_calibration_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}