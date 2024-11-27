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
 * @TableName wcs_code
 */
@TableName(value ="wcs_code")
@Data
public class WcsCode implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer code_id;

    /**
     * 
     */
    private String code_hex;

    /**
     * 
     */
    private String code_dec;

    /**
     * 
     */
    private String code_desc;

    /**
     * 
     */
    private Integer code_type;

    /**
     * 
     */
    private Integer code_level;

    /**
     * 
     */
    private String solution;

    /**
     * 
     */
    private String create_by;

    /**
     * 
     */
    private Date create_time;

    /**
     * 
     */
    private String update_by;

    /**
     * 
     */
    private Date update_time;

    /**
     * 
     */
    private String remark;

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
        WcsCode other = (WcsCode) that;
        return (this.getCode_id() == null ? other.getCode_id() == null : this.getCode_id().equals(other.getCode_id()))
            && (this.getCode_hex() == null ? other.getCode_hex() == null : this.getCode_hex().equals(other.getCode_hex()))
            && (this.getCode_dec() == null ? other.getCode_dec() == null : this.getCode_dec().equals(other.getCode_dec()))
            && (this.getCode_desc() == null ? other.getCode_desc() == null : this.getCode_desc().equals(other.getCode_desc()))
            && (this.getCode_type() == null ? other.getCode_type() == null : this.getCode_type().equals(other.getCode_type()))
            && (this.getCode_level() == null ? other.getCode_level() == null : this.getCode_level().equals(other.getCode_level()))
            && (this.getSolution() == null ? other.getSolution() == null : this.getSolution().equals(other.getSolution()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode_id() == null) ? 0 : getCode_id().hashCode());
        result = prime * result + ((getCode_hex() == null) ? 0 : getCode_hex().hashCode());
        result = prime * result + ((getCode_dec() == null) ? 0 : getCode_dec().hashCode());
        result = prime * result + ((getCode_desc() == null) ? 0 : getCode_desc().hashCode());
        result = prime * result + ((getCode_type() == null) ? 0 : getCode_type().hashCode());
        result = prime * result + ((getCode_level() == null) ? 0 : getCode_level().hashCode());
        result = prime * result + ((getSolution() == null) ? 0 : getSolution().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code_id=").append(code_id);
        sb.append(", code_hex=").append(code_hex);
        sb.append(", code_dec=").append(code_dec);
        sb.append(", code_desc=").append(code_desc);
        sb.append(", code_type=").append(code_type);
        sb.append(", code_level=").append(code_level);
        sb.append(", solution=").append(solution);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}