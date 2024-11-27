package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName wcs_led
 */
@TableName(value ="wcs_led")
@Data
public class WcsLed implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer led_no;

    /**
     * 
     */
    private String led_ip;

    /**
     * 
     */
    private Integer led_port;

    /**
     * 
     */
    private String led_address;

    /**
     * 
     */
    private String led_area;

    /**
     * 
     */
    private String move_way;

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
        WcsLed other = (WcsLed) that;
        return (this.getLed_no() == null ? other.getLed_no() == null : this.getLed_no().equals(other.getLed_no()))
            && (this.getLed_ip() == null ? other.getLed_ip() == null : this.getLed_ip().equals(other.getLed_ip()))
            && (this.getLed_port() == null ? other.getLed_port() == null : this.getLed_port().equals(other.getLed_port()))
            && (this.getLed_address() == null ? other.getLed_address() == null : this.getLed_address().equals(other.getLed_address()))
            && (this.getLed_area() == null ? other.getLed_area() == null : this.getLed_area().equals(other.getLed_area()))
            && (this.getMove_way() == null ? other.getMove_way() == null : this.getMove_way().equals(other.getMove_way()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLed_no() == null) ? 0 : getLed_no().hashCode());
        result = prime * result + ((getLed_ip() == null) ? 0 : getLed_ip().hashCode());
        result = prime * result + ((getLed_port() == null) ? 0 : getLed_port().hashCode());
        result = prime * result + ((getLed_address() == null) ? 0 : getLed_address().hashCode());
        result = prime * result + ((getLed_area() == null) ? 0 : getLed_area().hashCode());
        result = prime * result + ((getMove_way() == null) ? 0 : getMove_way().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", led_no=").append(led_no);
        sb.append(", led_ip=").append(led_ip);
        sb.append(", led_port=").append(led_port);
        sb.append(", led_address=").append(led_address);
        sb.append(", led_area=").append(led_area);
        sb.append(", move_way=").append(move_way);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}