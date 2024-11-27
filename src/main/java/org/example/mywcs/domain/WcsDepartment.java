package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wcs_department
 */
@TableName(value ="wcs_department")
@Data
public class WcsDepartment implements Serializable {
    /**
     * 
     */
    private String sector_id;

    /**
     * 
     */
    private String sector_name;

    /**
     * 
     */
    private String sector_action;

    /**
     * 
     */
    private String sector_Level;

    /**
     * 
     */
    private String is_leaf;

    /**
     * 
     */
    private String root_id;

    /**
     * 
     */
    private String parents_id;

    /**
     * 
     */
    private String display_order;

    /**
     * 
     */
    private String sector_seq;

    /**
     * 
     */
    private String insert_ymd;

    /**
     * 
     */
    private String insert_id;

    /**
     * 
     */
    private String update_ymd;

    /**
     * 
     */
    private String update_id;

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
        WcsDepartment other = (WcsDepartment) that;
        return (this.getSector_id() == null ? other.getSector_id() == null : this.getSector_id().equals(other.getSector_id()))
            && (this.getSector_name() == null ? other.getSector_name() == null : this.getSector_name().equals(other.getSector_name()))
            && (this.getSector_action() == null ? other.getSector_action() == null : this.getSector_action().equals(other.getSector_action()))
            && (this.getSector_Level() == null ? other.getSector_Level() == null : this.getSector_Level().equals(other.getSector_Level()))
            && (this.getIs_leaf() == null ? other.getIs_leaf() == null : this.getIs_leaf().equals(other.getIs_leaf()))
            && (this.getRoot_id() == null ? other.getRoot_id() == null : this.getRoot_id().equals(other.getRoot_id()))
            && (this.getParents_id() == null ? other.getParents_id() == null : this.getParents_id().equals(other.getParents_id()))
            && (this.getDisplay_order() == null ? other.getDisplay_order() == null : this.getDisplay_order().equals(other.getDisplay_order()))
            && (this.getSector_seq() == null ? other.getSector_seq() == null : this.getSector_seq().equals(other.getSector_seq()))
            && (this.getInsert_ymd() == null ? other.getInsert_ymd() == null : this.getInsert_ymd().equals(other.getInsert_ymd()))
            && (this.getInsert_id() == null ? other.getInsert_id() == null : this.getInsert_id().equals(other.getInsert_id()))
            && (this.getUpdate_ymd() == null ? other.getUpdate_ymd() == null : this.getUpdate_ymd().equals(other.getUpdate_ymd()))
            && (this.getUpdate_id() == null ? other.getUpdate_id() == null : this.getUpdate_id().equals(other.getUpdate_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSector_id() == null) ? 0 : getSector_id().hashCode());
        result = prime * result + ((getSector_name() == null) ? 0 : getSector_name().hashCode());
        result = prime * result + ((getSector_action() == null) ? 0 : getSector_action().hashCode());
        result = prime * result + ((getSector_Level() == null) ? 0 : getSector_Level().hashCode());
        result = prime * result + ((getIs_leaf() == null) ? 0 : getIs_leaf().hashCode());
        result = prime * result + ((getRoot_id() == null) ? 0 : getRoot_id().hashCode());
        result = prime * result + ((getParents_id() == null) ? 0 : getParents_id().hashCode());
        result = prime * result + ((getDisplay_order() == null) ? 0 : getDisplay_order().hashCode());
        result = prime * result + ((getSector_seq() == null) ? 0 : getSector_seq().hashCode());
        result = prime * result + ((getInsert_ymd() == null) ? 0 : getInsert_ymd().hashCode());
        result = prime * result + ((getInsert_id() == null) ? 0 : getInsert_id().hashCode());
        result = prime * result + ((getUpdate_ymd() == null) ? 0 : getUpdate_ymd().hashCode());
        result = prime * result + ((getUpdate_id() == null) ? 0 : getUpdate_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sector_id=").append(sector_id);
        sb.append(", sector_name=").append(sector_name);
        sb.append(", sector_action=").append(sector_action);
        sb.append(", sector_Level=").append(sector_Level);
        sb.append(", is_leaf=").append(is_leaf);
        sb.append(", root_id=").append(root_id);
        sb.append(", parents_id=").append(parents_id);
        sb.append(", display_order=").append(display_order);
        sb.append(", sector_seq=").append(sector_seq);
        sb.append(", insert_ymd=").append(insert_ymd);
        sb.append(", insert_id=").append(insert_id);
        sb.append(", update_ymd=").append(update_ymd);
        sb.append(", update_id=").append(update_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}