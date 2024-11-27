package org.example.mywcs.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 字典数据表
 * @TableName sys_dict_data
 */
@TableName(value ="sys_dict_data")
@Data
public class SysDictData  implements Serializable {
    /**
     * 字典编码
     */
    @TableId(type = IdType.AUTO)
    private Long dict_code;

    /**
     * 备注
     */
    private String remark;

    /**
     * 字典名称
     */
    private String dict_name;

    /**
     * 字典排序
     */
    private Integer dict_sort;

    /**
     * 字典标签
     */
    private String dict_label;

    /**
     * 字典键值
     */
    private String dict_value;

    /**
     * 字典类型
     */
    private String dict_type;

    /**
     * 样式属性（其他样式扩展）
     */
    private String css_class;

    /**
     * 表格回显样式
     */
    private String list_class;

    /**
     * 是否默认（Y是 N否）
     */
    private String is_default;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新者
     */
    private String update_by;

    /**
     * 更新时间
     */
    private Date update_time;


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
        SysDictData other = (SysDictData) that;
        return (this.getDict_code() == null ? other.getDict_code() == null : this.getDict_code().equals(other.getDict_code()))
            && (this.getDict_sort() == null ? other.getDict_sort() == null : this.getDict_sort().equals(other.getDict_sort()))
            && (this.getDict_label() == null ? other.getDict_label() == null : this.getDict_label().equals(other.getDict_label()))
            && (this.getDict_value() == null ? other.getDict_value() == null : this.getDict_value().equals(other.getDict_value()))
            && (this.getDict_type() == null ? other.getDict_type() == null : this.getDict_type().equals(other.getDict_type()))
            && (this.getCss_class() == null ? other.getCss_class() == null : this.getCss_class().equals(other.getCss_class()))
            && (this.getList_class() == null ? other.getList_class() == null : this.getList_class().equals(other.getList_class()))
            && (this.getIs_default() == null ? other.getIs_default() == null : this.getIs_default().equals(other.getIs_default()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
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
        result = prime * result + ((getDict_code() == null) ? 0 : getDict_code().hashCode());
        result = prime * result + ((getDict_sort() == null) ? 0 : getDict_sort().hashCode());
        result = prime * result + ((getDict_label() == null) ? 0 : getDict_label().hashCode());
        result = prime * result + ((getDict_value() == null) ? 0 : getDict_value().hashCode());
        result = prime * result + ((getDict_type() == null) ? 0 : getDict_type().hashCode());
        result = prime * result + ((getCss_class() == null) ? 0 : getCss_class().hashCode());
        result = prime * result + ((getList_class() == null) ? 0 : getList_class().hashCode());
        result = prime * result + ((getIs_default() == null) ? 0 : getIs_default().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", dict_code=").append(dict_code);
        sb.append(", dict_sort=").append(dict_sort);
        sb.append(", dict_label=").append(dict_label);
        sb.append(", dict_value=").append(dict_value);
        sb.append(", dict_type=").append(dict_type);
        sb.append(", css_class=").append(css_class);
        sb.append(", list_class=").append(list_class);
        sb.append(", is_default=").append(is_default);
        sb.append(", status=").append(status);
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