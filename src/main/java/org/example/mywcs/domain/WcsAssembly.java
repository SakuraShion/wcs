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
 * @TableName wcs_assembly
 */
@TableName(value ="wcs_assembly")
@Data
public class WcsAssembly implements Serializable {
    /**
     * 控件主键
     */
    @TableId
    private String control_id;

    /**
     * 
     */
    private String prems;

    /**
     * 操作类型 
 1  增
 2  删
 3  改
 4  查
 5  一般，默认
     */
    private String operation_id;

    /**
     * 控件类型
     * 1  按钮   分类型   增  改   删   查
     * 2  输入框
     *    21  可输入
     *    22  不可输入
     *    23  时间选择
     *    24  定时器
     * 3  下拉菜单
     *    31  单选
     *    32  多选
     * 4  双击
     *    41  事件
     * 5  单击
     *    51  事件
     * 6  失去焦点
     *    61 事件
     * 7  单选
     * 8  多选
     * 9  标签
     */
    private String assembly_type;

    /**
     * 组件描述
     */
    private String assembly_des;

    /**
     * 插入时间
     */
    private Date insert_time;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 备用1
     */
    private String reserve1;

    /**
     * 备用2
     */
    private String reserve2;

    /**
     * 备用3
     */
    private String reserve3;

    /**
     * 
     */
    private String menu_id;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String parent_menu_id;

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
        WcsAssembly other = (WcsAssembly) that;
        return (this.getControl_id() == null ? other.getControl_id() == null : this.getControl_id().equals(other.getControl_id()))
            && (this.getPrems() == null ? other.getPrems() == null : this.getPrems().equals(other.getPrems()))
            && (this.getOperation_id() == null ? other.getOperation_id() == null : this.getOperation_id().equals(other.getOperation_id()))
            && (this.getAssembly_type() == null ? other.getAssembly_type() == null : this.getAssembly_type().equals(other.getAssembly_type()))
            && (this.getAssembly_des() == null ? other.getAssembly_des() == null : this.getAssembly_des().equals(other.getAssembly_des()))
            && (this.getInsert_time() == null ? other.getInsert_time() == null : this.getInsert_time().equals(other.getInsert_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getReserve1() == null ? other.getReserve1() == null : this.getReserve1().equals(other.getReserve1()))
            && (this.getReserve2() == null ? other.getReserve2() == null : this.getReserve2().equals(other.getReserve2()))
            && (this.getReserve3() == null ? other.getReserve3() == null : this.getReserve3().equals(other.getReserve3()))
            && (this.getMenu_id() == null ? other.getMenu_id() == null : this.getMenu_id().equals(other.getMenu_id()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getParent_menu_id() == null ? other.getParent_menu_id() == null : this.getParent_menu_id().equals(other.getParent_menu_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getControl_id() == null) ? 0 : getControl_id().hashCode());
        result = prime * result + ((getPrems() == null) ? 0 : getPrems().hashCode());
        result = prime * result + ((getOperation_id() == null) ? 0 : getOperation_id().hashCode());
        result = prime * result + ((getAssembly_type() == null) ? 0 : getAssembly_type().hashCode());
        result = prime * result + ((getAssembly_des() == null) ? 0 : getAssembly_des().hashCode());
        result = prime * result + ((getInsert_time() == null) ? 0 : getInsert_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getReserve1() == null) ? 0 : getReserve1().hashCode());
        result = prime * result + ((getReserve2() == null) ? 0 : getReserve2().hashCode());
        result = prime * result + ((getReserve3() == null) ? 0 : getReserve3().hashCode());
        result = prime * result + ((getMenu_id() == null) ? 0 : getMenu_id().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getParent_menu_id() == null) ? 0 : getParent_menu_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", control_id=").append(control_id);
        sb.append(", prems=").append(prems);
        sb.append(", operation_id=").append(operation_id);
        sb.append(", assembly_type=").append(assembly_type);
        sb.append(", assembly_des=").append(assembly_des);
        sb.append(", insert_time=").append(insert_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", reserve1=").append(reserve1);
        sb.append(", reserve2=").append(reserve2);
        sb.append(", reserve3=").append(reserve3);
        sb.append(", menu_id=").append(menu_id);
        sb.append(", url=").append(url);
        sb.append(", parent_menu_id=").append(parent_menu_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}