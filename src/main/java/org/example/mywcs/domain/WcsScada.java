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
 * @TableName wcs_scada
 */
@TableName(value ="wcs_scada")
@Data
public class WcsScada implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer scada_id;

    /**
     * 小车编号
     */
    private Integer rgv_no;

    /**
     * 
     */
    private Integer car_status;

    /**
     * 小车运行时间
     */
    private Integer run_time;

    /**
     * 行驶转速
     */
    private Integer driving_speed;

    /**
     * 小车前方障碍物
     */
    private Integer obstacle_ahead;

    /**
     * 行驶驱动电压
     */
    private Integer driving_volt;

    /**
     * 行驶驱动电流
     */
    private Integer driving_curr;

    /**
     * 托盘障碍物激光雷达距离:显示的是行驶方向所在位置的激光雷达数据    若小车静止时为0
     */
    private Integer tray_obsta_dis;

    /**
     * 四周障碍物激光雷达距离:显示的是行驶方向所在位置的激光雷达数据    若小车静止时为0
     */
    private Integer suround_obsta_dis;

    /**
     * 液压转速（r）
     */
    private Integer hydraulic_speed;

    /**
     * 液压油温
     */
    private Integer hydra_oil_temp;

    /**
     * 液压驱动电压
     */
    private Integer hydra_drive_volt;

    /**
     * 液压驱动电流
     */
    private Integer hydra_drive_curr;

    /**
     * 
     */
    private Integer single_battery_volt1;

    /**
     * 
     */
    private Integer single_battery_volt2;

    /**
     * 
     */
    private Integer single_battery_volt3;

    /**
     * 
     */
    private Integer single_battery_volt4;

    /**
     * 
     */
    private Integer single_battery_volt5;

    /**
     * 
     */
    private Integer single_battery_volt6;

    /**
     * 
     */
    private Integer single_battery_volt7;

    /**
     * 
     */
    private Integer single_battery_volt8;

    /**
     * 
     */
    private Integer single_battery_volt9;

    /**
     * 
     */
    private Integer single_battery_volt10;

    /**
     * 
     */
    private Integer single_battery_volt11;

    /**
     * 
     */
    private Integer single_battery_volt12;

    /**
     * 
     */
    private Integer single_battery_volt13;

    /**
     * 
     */
    private Integer single_battery_volt14;

    /**
     * 
     */
    private Integer single_battery_volt15;

    /**
     * 
     */
    private Integer single_battery_volt16;

    /**
     * 
     */
    private Integer single_battery_volt17;

    /**
     * 
     */
    private Integer single_battery_volt18;

    /**
     * 
     */
    private Integer single_battery_volt19;

    /**
     * 
     */
    private Integer single_battery_volt20;

    /**
     * 
     */
    private Integer single_battery_volt21;

    /**
     * 
     */
    private Integer single_battery_volt22;

    /**
     * 
     */
    private Integer single_battery_volt23;

    /**
     * 
     */
    private Integer single_battery_volt24;

    /**
     * 
     */
    private Integer single_battery_volt25;

    /**
     * 
     */
    private Integer single_battery_volt26;

    /**
     * 
     */
    private Integer single_battery_volt27;

    /**
     * 
     */
    private Integer single_battery_volt28;

    /**
     * 
     */
    private Integer single_battery_volt29;

    /**
     * 
     */
    private Integer single_battery_volt30;

    /**
     * 
     */
    private Integer single_battery_volt31;

    /**
     * 
     */
    private Integer single_battery_volt32;

    /**
     * 
     */
    private Integer single_battery_volt33;

    /**
     * 
     */
    private Integer single_battery_volt34;

    /**
     * 
     */
    private Integer single_battery_volt35;

    /**
     * 
     */
    private Integer single_battery_volt36;

    /**
     * 
     */
    private Integer single_battery_volt37;

    /**
     * 
     */
    private Integer single_battery_volt38;

    /**
     * 
     */
    private Integer single_battery_volt39;

    /**
     * 
     */
    private Integer single_battery_volt40;

    /**
     * 
     */
    private Integer single_battery_volt41;

    /**
     * 
     */
    private Integer single_battery_volt42;

    /**
     * 
     */
    private Integer single_battery_volt43;

    /**
     * 
     */
    private Integer single_battery_volt44;

    /**
     * 
     */
    private Integer single_battery_volt45;

    /**
     * 
     */
    private Integer single_battery_volt46;

    /**
     * 
     */
    private Integer single_battery_volt47;

    /**
     * 
     */
    private Integer single_battery_volt48;

    /**
     * 
     */
    private Integer single_battery_volt49;

    /**
     * 
     */
    private Integer single_battery_volt50;

    /**
     * 
     */
    private Integer single_battery_volt51;

    /**
     * 
     */
    private Integer single_battery_volt52;

    /**
     * 
     */
    private Integer single_battery_volt53;

    /**
     * 
     */
    private Integer single_battery_volt54;

    /**
     * 
     */
    private Integer single_battery_volt55;

    /**
     * 
     */
    private Integer single_battery_volt56;

    /**
     * 
     */
    private Integer single_battery_volt57;

    /**
     * 
     */
    private Integer single_battery_volt58;

    /**
     * 
     */
    private Integer single_battery_volt59;

    /**
     * 
     */
    private Integer single_battery_volt60;

    /**
     * 电池单节最低电压节号
     */
    private Integer min_volt_cell_num;

    /**
     * 电池单节最高电压节号
     */
    private Integer max_volt_cell_num;

    /**
     * 最大压差
     */
    private Integer max_volt_differ;

    /**
     * 总电压
     */
    private Integer total_volt;

    /**
     * 充电电流
     */
    private Integer battery_open_charge_curr;

    /**
     * 放电电流
     */
    private Integer battery_close_charge_curr;

    /**
     * 剩余电量
     */
    private Integer left_battery_ele;

    /**
     * 电芯温度1
     */
    private Integer battery_temp1;

    /**
     * 电芯温度2
     */
    private Integer battery_temp2;

    /**
     * 电芯温度3
     */
    private Integer battery_temp3;

    /**
     * 电芯温度4
     */
    private Integer battery_temp4;

    /**
     * 电芯温度5
     */
    private Integer battery_temp5;

    /**
     * 电芯温度6
     */
    private Integer battery_temp6;

    /**
     * 电芯温度7
     */
    private Integer battery_temp7;

    /**
     * 电芯温度8
     */
    private Integer battery_temp8;

    /**
     * 均衡MOS管温度1
     */
    private Integer balan_resist_temp1;

    /**
     * 均衡MOS管温度2
     */
    private Integer balan_resist_temp2;

    /**
     * 充放MOS管温度1
     */
    private Integer mos_temp1;

    /**
     * 充放MOS管温度2
     */
    private Integer mos_temp2;

    /**
     * 循环次数
     */
    private Integer cycle_count;

    /**
     * 故障信息
     */
    private Integer error_msg;

    /**
     * 警告信息
     */
    private Integer warning_msg;

    /**
     * 行驶里程数
     */
    private Integer travel_distance;

    /**
     * 行驶驱动器故障次数
     */
    private Integer travel_drive_err_count;

    /**
     * 行驶驱动器执行动作次数
     */
    private Integer travel_drive_exec_count;

    /**
     * 托盘扫码器状态
     */
    private Integer plt_code_scanner_status;

    /**
     * 换向、托盘动作执行总次数
     */
    private Integer oil_drive_Exec_count;

    /**
     * 油泵驱动器故障次数
     */
    private Integer oil_drive_err_count;

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
     * 备注信息
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
        WcsScada other = (WcsScada) that;
        return (this.getScada_id() == null ? other.getScada_id() == null : this.getScada_id().equals(other.getScada_id()))
            && (this.getRgv_no() == null ? other.getRgv_no() == null : this.getRgv_no().equals(other.getRgv_no()))
            && (this.getCar_status() == null ? other.getCar_status() == null : this.getCar_status().equals(other.getCar_status()))
            && (this.getRun_time() == null ? other.getRun_time() == null : this.getRun_time().equals(other.getRun_time()))
            && (this.getDriving_speed() == null ? other.getDriving_speed() == null : this.getDriving_speed().equals(other.getDriving_speed()))
            && (this.getObstacle_ahead() == null ? other.getObstacle_ahead() == null : this.getObstacle_ahead().equals(other.getObstacle_ahead()))
            && (this.getDriving_volt() == null ? other.getDriving_volt() == null : this.getDriving_volt().equals(other.getDriving_volt()))
            && (this.getDriving_curr() == null ? other.getDriving_curr() == null : this.getDriving_curr().equals(other.getDriving_curr()))
            && (this.getTray_obsta_dis() == null ? other.getTray_obsta_dis() == null : this.getTray_obsta_dis().equals(other.getTray_obsta_dis()))
            && (this.getSuround_obsta_dis() == null ? other.getSuround_obsta_dis() == null : this.getSuround_obsta_dis().equals(other.getSuround_obsta_dis()))
            && (this.getHydraulic_speed() == null ? other.getHydraulic_speed() == null : this.getHydraulic_speed().equals(other.getHydraulic_speed()))
            && (this.getHydra_oil_temp() == null ? other.getHydra_oil_temp() == null : this.getHydra_oil_temp().equals(other.getHydra_oil_temp()))
            && (this.getHydra_drive_volt() == null ? other.getHydra_drive_volt() == null : this.getHydra_drive_volt().equals(other.getHydra_drive_volt()))
            && (this.getHydra_drive_curr() == null ? other.getHydra_drive_curr() == null : this.getHydra_drive_curr().equals(other.getHydra_drive_curr()))
            && (this.getSingle_battery_volt1() == null ? other.getSingle_battery_volt1() == null : this.getSingle_battery_volt1().equals(other.getSingle_battery_volt1()))
            && (this.getSingle_battery_volt2() == null ? other.getSingle_battery_volt2() == null : this.getSingle_battery_volt2().equals(other.getSingle_battery_volt2()))
            && (this.getSingle_battery_volt3() == null ? other.getSingle_battery_volt3() == null : this.getSingle_battery_volt3().equals(other.getSingle_battery_volt3()))
            && (this.getSingle_battery_volt4() == null ? other.getSingle_battery_volt4() == null : this.getSingle_battery_volt4().equals(other.getSingle_battery_volt4()))
            && (this.getSingle_battery_volt5() == null ? other.getSingle_battery_volt5() == null : this.getSingle_battery_volt5().equals(other.getSingle_battery_volt5()))
            && (this.getSingle_battery_volt6() == null ? other.getSingle_battery_volt6() == null : this.getSingle_battery_volt6().equals(other.getSingle_battery_volt6()))
            && (this.getSingle_battery_volt7() == null ? other.getSingle_battery_volt7() == null : this.getSingle_battery_volt7().equals(other.getSingle_battery_volt7()))
            && (this.getSingle_battery_volt8() == null ? other.getSingle_battery_volt8() == null : this.getSingle_battery_volt8().equals(other.getSingle_battery_volt8()))
            && (this.getSingle_battery_volt9() == null ? other.getSingle_battery_volt9() == null : this.getSingle_battery_volt9().equals(other.getSingle_battery_volt9()))
            && (this.getSingle_battery_volt10() == null ? other.getSingle_battery_volt10() == null : this.getSingle_battery_volt10().equals(other.getSingle_battery_volt10()))
            && (this.getSingle_battery_volt11() == null ? other.getSingle_battery_volt11() == null : this.getSingle_battery_volt11().equals(other.getSingle_battery_volt11()))
            && (this.getSingle_battery_volt12() == null ? other.getSingle_battery_volt12() == null : this.getSingle_battery_volt12().equals(other.getSingle_battery_volt12()))
            && (this.getSingle_battery_volt13() == null ? other.getSingle_battery_volt13() == null : this.getSingle_battery_volt13().equals(other.getSingle_battery_volt13()))
            && (this.getSingle_battery_volt14() == null ? other.getSingle_battery_volt14() == null : this.getSingle_battery_volt14().equals(other.getSingle_battery_volt14()))
            && (this.getSingle_battery_volt15() == null ? other.getSingle_battery_volt15() == null : this.getSingle_battery_volt15().equals(other.getSingle_battery_volt15()))
            && (this.getSingle_battery_volt16() == null ? other.getSingle_battery_volt16() == null : this.getSingle_battery_volt16().equals(other.getSingle_battery_volt16()))
            && (this.getSingle_battery_volt17() == null ? other.getSingle_battery_volt17() == null : this.getSingle_battery_volt17().equals(other.getSingle_battery_volt17()))
            && (this.getSingle_battery_volt18() == null ? other.getSingle_battery_volt18() == null : this.getSingle_battery_volt18().equals(other.getSingle_battery_volt18()))
            && (this.getSingle_battery_volt19() == null ? other.getSingle_battery_volt19() == null : this.getSingle_battery_volt19().equals(other.getSingle_battery_volt19()))
            && (this.getSingle_battery_volt20() == null ? other.getSingle_battery_volt20() == null : this.getSingle_battery_volt20().equals(other.getSingle_battery_volt20()))
            && (this.getSingle_battery_volt21() == null ? other.getSingle_battery_volt21() == null : this.getSingle_battery_volt21().equals(other.getSingle_battery_volt21()))
            && (this.getSingle_battery_volt22() == null ? other.getSingle_battery_volt22() == null : this.getSingle_battery_volt22().equals(other.getSingle_battery_volt22()))
            && (this.getSingle_battery_volt23() == null ? other.getSingle_battery_volt23() == null : this.getSingle_battery_volt23().equals(other.getSingle_battery_volt23()))
            && (this.getSingle_battery_volt24() == null ? other.getSingle_battery_volt24() == null : this.getSingle_battery_volt24().equals(other.getSingle_battery_volt24()))
            && (this.getSingle_battery_volt25() == null ? other.getSingle_battery_volt25() == null : this.getSingle_battery_volt25().equals(other.getSingle_battery_volt25()))
            && (this.getSingle_battery_volt26() == null ? other.getSingle_battery_volt26() == null : this.getSingle_battery_volt26().equals(other.getSingle_battery_volt26()))
            && (this.getSingle_battery_volt27() == null ? other.getSingle_battery_volt27() == null : this.getSingle_battery_volt27().equals(other.getSingle_battery_volt27()))
            && (this.getSingle_battery_volt28() == null ? other.getSingle_battery_volt28() == null : this.getSingle_battery_volt28().equals(other.getSingle_battery_volt28()))
            && (this.getSingle_battery_volt29() == null ? other.getSingle_battery_volt29() == null : this.getSingle_battery_volt29().equals(other.getSingle_battery_volt29()))
            && (this.getSingle_battery_volt30() == null ? other.getSingle_battery_volt30() == null : this.getSingle_battery_volt30().equals(other.getSingle_battery_volt30()))
            && (this.getSingle_battery_volt31() == null ? other.getSingle_battery_volt31() == null : this.getSingle_battery_volt31().equals(other.getSingle_battery_volt31()))
            && (this.getSingle_battery_volt32() == null ? other.getSingle_battery_volt32() == null : this.getSingle_battery_volt32().equals(other.getSingle_battery_volt32()))
            && (this.getSingle_battery_volt33() == null ? other.getSingle_battery_volt33() == null : this.getSingle_battery_volt33().equals(other.getSingle_battery_volt33()))
            && (this.getSingle_battery_volt34() == null ? other.getSingle_battery_volt34() == null : this.getSingle_battery_volt34().equals(other.getSingle_battery_volt34()))
            && (this.getSingle_battery_volt35() == null ? other.getSingle_battery_volt35() == null : this.getSingle_battery_volt35().equals(other.getSingle_battery_volt35()))
            && (this.getSingle_battery_volt36() == null ? other.getSingle_battery_volt36() == null : this.getSingle_battery_volt36().equals(other.getSingle_battery_volt36()))
            && (this.getSingle_battery_volt37() == null ? other.getSingle_battery_volt37() == null : this.getSingle_battery_volt37().equals(other.getSingle_battery_volt37()))
            && (this.getSingle_battery_volt38() == null ? other.getSingle_battery_volt38() == null : this.getSingle_battery_volt38().equals(other.getSingle_battery_volt38()))
            && (this.getSingle_battery_volt39() == null ? other.getSingle_battery_volt39() == null : this.getSingle_battery_volt39().equals(other.getSingle_battery_volt39()))
            && (this.getSingle_battery_volt40() == null ? other.getSingle_battery_volt40() == null : this.getSingle_battery_volt40().equals(other.getSingle_battery_volt40()))
            && (this.getSingle_battery_volt41() == null ? other.getSingle_battery_volt41() == null : this.getSingle_battery_volt41().equals(other.getSingle_battery_volt41()))
            && (this.getSingle_battery_volt42() == null ? other.getSingle_battery_volt42() == null : this.getSingle_battery_volt42().equals(other.getSingle_battery_volt42()))
            && (this.getSingle_battery_volt43() == null ? other.getSingle_battery_volt43() == null : this.getSingle_battery_volt43().equals(other.getSingle_battery_volt43()))
            && (this.getSingle_battery_volt44() == null ? other.getSingle_battery_volt44() == null : this.getSingle_battery_volt44().equals(other.getSingle_battery_volt44()))
            && (this.getSingle_battery_volt45() == null ? other.getSingle_battery_volt45() == null : this.getSingle_battery_volt45().equals(other.getSingle_battery_volt45()))
            && (this.getSingle_battery_volt46() == null ? other.getSingle_battery_volt46() == null : this.getSingle_battery_volt46().equals(other.getSingle_battery_volt46()))
            && (this.getSingle_battery_volt47() == null ? other.getSingle_battery_volt47() == null : this.getSingle_battery_volt47().equals(other.getSingle_battery_volt47()))
            && (this.getSingle_battery_volt48() == null ? other.getSingle_battery_volt48() == null : this.getSingle_battery_volt48().equals(other.getSingle_battery_volt48()))
            && (this.getSingle_battery_volt49() == null ? other.getSingle_battery_volt49() == null : this.getSingle_battery_volt49().equals(other.getSingle_battery_volt49()))
            && (this.getSingle_battery_volt50() == null ? other.getSingle_battery_volt50() == null : this.getSingle_battery_volt50().equals(other.getSingle_battery_volt50()))
            && (this.getSingle_battery_volt51() == null ? other.getSingle_battery_volt51() == null : this.getSingle_battery_volt51().equals(other.getSingle_battery_volt51()))
            && (this.getSingle_battery_volt52() == null ? other.getSingle_battery_volt52() == null : this.getSingle_battery_volt52().equals(other.getSingle_battery_volt52()))
            && (this.getSingle_battery_volt53() == null ? other.getSingle_battery_volt53() == null : this.getSingle_battery_volt53().equals(other.getSingle_battery_volt53()))
            && (this.getSingle_battery_volt54() == null ? other.getSingle_battery_volt54() == null : this.getSingle_battery_volt54().equals(other.getSingle_battery_volt54()))
            && (this.getSingle_battery_volt55() == null ? other.getSingle_battery_volt55() == null : this.getSingle_battery_volt55().equals(other.getSingle_battery_volt55()))
            && (this.getSingle_battery_volt56() == null ? other.getSingle_battery_volt56() == null : this.getSingle_battery_volt56().equals(other.getSingle_battery_volt56()))
            && (this.getSingle_battery_volt57() == null ? other.getSingle_battery_volt57() == null : this.getSingle_battery_volt57().equals(other.getSingle_battery_volt57()))
            && (this.getSingle_battery_volt58() == null ? other.getSingle_battery_volt58() == null : this.getSingle_battery_volt58().equals(other.getSingle_battery_volt58()))
            && (this.getSingle_battery_volt59() == null ? other.getSingle_battery_volt59() == null : this.getSingle_battery_volt59().equals(other.getSingle_battery_volt59()))
            && (this.getSingle_battery_volt60() == null ? other.getSingle_battery_volt60() == null : this.getSingle_battery_volt60().equals(other.getSingle_battery_volt60()))
            && (this.getMin_volt_cell_num() == null ? other.getMin_volt_cell_num() == null : this.getMin_volt_cell_num().equals(other.getMin_volt_cell_num()))
            && (this.getMax_volt_cell_num() == null ? other.getMax_volt_cell_num() == null : this.getMax_volt_cell_num().equals(other.getMax_volt_cell_num()))
            && (this.getMax_volt_differ() == null ? other.getMax_volt_differ() == null : this.getMax_volt_differ().equals(other.getMax_volt_differ()))
            && (this.getTotal_volt() == null ? other.getTotal_volt() == null : this.getTotal_volt().equals(other.getTotal_volt()))
            && (this.getBattery_open_charge_curr() == null ? other.getBattery_open_charge_curr() == null : this.getBattery_open_charge_curr().equals(other.getBattery_open_charge_curr()))
            && (this.getBattery_close_charge_curr() == null ? other.getBattery_close_charge_curr() == null : this.getBattery_close_charge_curr().equals(other.getBattery_close_charge_curr()))
            && (this.getLeft_battery_ele() == null ? other.getLeft_battery_ele() == null : this.getLeft_battery_ele().equals(other.getLeft_battery_ele()))
            && (this.getBattery_temp1() == null ? other.getBattery_temp1() == null : this.getBattery_temp1().equals(other.getBattery_temp1()))
            && (this.getBattery_temp2() == null ? other.getBattery_temp2() == null : this.getBattery_temp2().equals(other.getBattery_temp2()))
            && (this.getBattery_temp3() == null ? other.getBattery_temp3() == null : this.getBattery_temp3().equals(other.getBattery_temp3()))
            && (this.getBattery_temp4() == null ? other.getBattery_temp4() == null : this.getBattery_temp4().equals(other.getBattery_temp4()))
            && (this.getBattery_temp5() == null ? other.getBattery_temp5() == null : this.getBattery_temp5().equals(other.getBattery_temp5()))
            && (this.getBattery_temp6() == null ? other.getBattery_temp6() == null : this.getBattery_temp6().equals(other.getBattery_temp6()))
            && (this.getBattery_temp7() == null ? other.getBattery_temp7() == null : this.getBattery_temp7().equals(other.getBattery_temp7()))
            && (this.getBattery_temp8() == null ? other.getBattery_temp8() == null : this.getBattery_temp8().equals(other.getBattery_temp8()))
            && (this.getBalan_resist_temp1() == null ? other.getBalan_resist_temp1() == null : this.getBalan_resist_temp1().equals(other.getBalan_resist_temp1()))
            && (this.getBalan_resist_temp2() == null ? other.getBalan_resist_temp2() == null : this.getBalan_resist_temp2().equals(other.getBalan_resist_temp2()))
            && (this.getMos_temp1() == null ? other.getMos_temp1() == null : this.getMos_temp1().equals(other.getMos_temp1()))
            && (this.getMos_temp2() == null ? other.getMos_temp2() == null : this.getMos_temp2().equals(other.getMos_temp2()))
            && (this.getCycle_count() == null ? other.getCycle_count() == null : this.getCycle_count().equals(other.getCycle_count()))
            && (this.getError_msg() == null ? other.getError_msg() == null : this.getError_msg().equals(other.getError_msg()))
            && (this.getWarning_msg() == null ? other.getWarning_msg() == null : this.getWarning_msg().equals(other.getWarning_msg()))
            && (this.getTravel_distance() == null ? other.getTravel_distance() == null : this.getTravel_distance().equals(other.getTravel_distance()))
            && (this.getTravel_drive_err_count() == null ? other.getTravel_drive_err_count() == null : this.getTravel_drive_err_count().equals(other.getTravel_drive_err_count()))
            && (this.getTravel_drive_exec_count() == null ? other.getTravel_drive_exec_count() == null : this.getTravel_drive_exec_count().equals(other.getTravel_drive_exec_count()))
            && (this.getPlt_code_scanner_status() == null ? other.getPlt_code_scanner_status() == null : this.getPlt_code_scanner_status().equals(other.getPlt_code_scanner_status()))
            && (this.getOil_drive_Exec_count() == null ? other.getOil_drive_Exec_count() == null : this.getOil_drive_Exec_count().equals(other.getOil_drive_Exec_count()))
            && (this.getOil_drive_err_count() == null ? other.getOil_drive_err_count() == null : this.getOil_drive_err_count().equals(other.getOil_drive_err_count()))
            && (this.getUpdate_by() == null ? other.getUpdate_by() == null : this.getUpdate_by().equals(other.getUpdate_by()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getCreate_by() == null ? other.getCreate_by() == null : this.getCreate_by().equals(other.getCreate_by()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScada_id() == null) ? 0 : getScada_id().hashCode());
        result = prime * result + ((getRgv_no() == null) ? 0 : getRgv_no().hashCode());
        result = prime * result + ((getCar_status() == null) ? 0 : getCar_status().hashCode());
        result = prime * result + ((getRun_time() == null) ? 0 : getRun_time().hashCode());
        result = prime * result + ((getDriving_speed() == null) ? 0 : getDriving_speed().hashCode());
        result = prime * result + ((getObstacle_ahead() == null) ? 0 : getObstacle_ahead().hashCode());
        result = prime * result + ((getDriving_volt() == null) ? 0 : getDriving_volt().hashCode());
        result = prime * result + ((getDriving_curr() == null) ? 0 : getDriving_curr().hashCode());
        result = prime * result + ((getTray_obsta_dis() == null) ? 0 : getTray_obsta_dis().hashCode());
        result = prime * result + ((getSuround_obsta_dis() == null) ? 0 : getSuround_obsta_dis().hashCode());
        result = prime * result + ((getHydraulic_speed() == null) ? 0 : getHydraulic_speed().hashCode());
        result = prime * result + ((getHydra_oil_temp() == null) ? 0 : getHydra_oil_temp().hashCode());
        result = prime * result + ((getHydra_drive_volt() == null) ? 0 : getHydra_drive_volt().hashCode());
        result = prime * result + ((getHydra_drive_curr() == null) ? 0 : getHydra_drive_curr().hashCode());
        result = prime * result + ((getSingle_battery_volt1() == null) ? 0 : getSingle_battery_volt1().hashCode());
        result = prime * result + ((getSingle_battery_volt2() == null) ? 0 : getSingle_battery_volt2().hashCode());
        result = prime * result + ((getSingle_battery_volt3() == null) ? 0 : getSingle_battery_volt3().hashCode());
        result = prime * result + ((getSingle_battery_volt4() == null) ? 0 : getSingle_battery_volt4().hashCode());
        result = prime * result + ((getSingle_battery_volt5() == null) ? 0 : getSingle_battery_volt5().hashCode());
        result = prime * result + ((getSingle_battery_volt6() == null) ? 0 : getSingle_battery_volt6().hashCode());
        result = prime * result + ((getSingle_battery_volt7() == null) ? 0 : getSingle_battery_volt7().hashCode());
        result = prime * result + ((getSingle_battery_volt8() == null) ? 0 : getSingle_battery_volt8().hashCode());
        result = prime * result + ((getSingle_battery_volt9() == null) ? 0 : getSingle_battery_volt9().hashCode());
        result = prime * result + ((getSingle_battery_volt10() == null) ? 0 : getSingle_battery_volt10().hashCode());
        result = prime * result + ((getSingle_battery_volt11() == null) ? 0 : getSingle_battery_volt11().hashCode());
        result = prime * result + ((getSingle_battery_volt12() == null) ? 0 : getSingle_battery_volt12().hashCode());
        result = prime * result + ((getSingle_battery_volt13() == null) ? 0 : getSingle_battery_volt13().hashCode());
        result = prime * result + ((getSingle_battery_volt14() == null) ? 0 : getSingle_battery_volt14().hashCode());
        result = prime * result + ((getSingle_battery_volt15() == null) ? 0 : getSingle_battery_volt15().hashCode());
        result = prime * result + ((getSingle_battery_volt16() == null) ? 0 : getSingle_battery_volt16().hashCode());
        result = prime * result + ((getSingle_battery_volt17() == null) ? 0 : getSingle_battery_volt17().hashCode());
        result = prime * result + ((getSingle_battery_volt18() == null) ? 0 : getSingle_battery_volt18().hashCode());
        result = prime * result + ((getSingle_battery_volt19() == null) ? 0 : getSingle_battery_volt19().hashCode());
        result = prime * result + ((getSingle_battery_volt20() == null) ? 0 : getSingle_battery_volt20().hashCode());
        result = prime * result + ((getSingle_battery_volt21() == null) ? 0 : getSingle_battery_volt21().hashCode());
        result = prime * result + ((getSingle_battery_volt22() == null) ? 0 : getSingle_battery_volt22().hashCode());
        result = prime * result + ((getSingle_battery_volt23() == null) ? 0 : getSingle_battery_volt23().hashCode());
        result = prime * result + ((getSingle_battery_volt24() == null) ? 0 : getSingle_battery_volt24().hashCode());
        result = prime * result + ((getSingle_battery_volt25() == null) ? 0 : getSingle_battery_volt25().hashCode());
        result = prime * result + ((getSingle_battery_volt26() == null) ? 0 : getSingle_battery_volt26().hashCode());
        result = prime * result + ((getSingle_battery_volt27() == null) ? 0 : getSingle_battery_volt27().hashCode());
        result = prime * result + ((getSingle_battery_volt28() == null) ? 0 : getSingle_battery_volt28().hashCode());
        result = prime * result + ((getSingle_battery_volt29() == null) ? 0 : getSingle_battery_volt29().hashCode());
        result = prime * result + ((getSingle_battery_volt30() == null) ? 0 : getSingle_battery_volt30().hashCode());
        result = prime * result + ((getSingle_battery_volt31() == null) ? 0 : getSingle_battery_volt31().hashCode());
        result = prime * result + ((getSingle_battery_volt32() == null) ? 0 : getSingle_battery_volt32().hashCode());
        result = prime * result + ((getSingle_battery_volt33() == null) ? 0 : getSingle_battery_volt33().hashCode());
        result = prime * result + ((getSingle_battery_volt34() == null) ? 0 : getSingle_battery_volt34().hashCode());
        result = prime * result + ((getSingle_battery_volt35() == null) ? 0 : getSingle_battery_volt35().hashCode());
        result = prime * result + ((getSingle_battery_volt36() == null) ? 0 : getSingle_battery_volt36().hashCode());
        result = prime * result + ((getSingle_battery_volt37() == null) ? 0 : getSingle_battery_volt37().hashCode());
        result = prime * result + ((getSingle_battery_volt38() == null) ? 0 : getSingle_battery_volt38().hashCode());
        result = prime * result + ((getSingle_battery_volt39() == null) ? 0 : getSingle_battery_volt39().hashCode());
        result = prime * result + ((getSingle_battery_volt40() == null) ? 0 : getSingle_battery_volt40().hashCode());
        result = prime * result + ((getSingle_battery_volt41() == null) ? 0 : getSingle_battery_volt41().hashCode());
        result = prime * result + ((getSingle_battery_volt42() == null) ? 0 : getSingle_battery_volt42().hashCode());
        result = prime * result + ((getSingle_battery_volt43() == null) ? 0 : getSingle_battery_volt43().hashCode());
        result = prime * result + ((getSingle_battery_volt44() == null) ? 0 : getSingle_battery_volt44().hashCode());
        result = prime * result + ((getSingle_battery_volt45() == null) ? 0 : getSingle_battery_volt45().hashCode());
        result = prime * result + ((getSingle_battery_volt46() == null) ? 0 : getSingle_battery_volt46().hashCode());
        result = prime * result + ((getSingle_battery_volt47() == null) ? 0 : getSingle_battery_volt47().hashCode());
        result = prime * result + ((getSingle_battery_volt48() == null) ? 0 : getSingle_battery_volt48().hashCode());
        result = prime * result + ((getSingle_battery_volt49() == null) ? 0 : getSingle_battery_volt49().hashCode());
        result = prime * result + ((getSingle_battery_volt50() == null) ? 0 : getSingle_battery_volt50().hashCode());
        result = prime * result + ((getSingle_battery_volt51() == null) ? 0 : getSingle_battery_volt51().hashCode());
        result = prime * result + ((getSingle_battery_volt52() == null) ? 0 : getSingle_battery_volt52().hashCode());
        result = prime * result + ((getSingle_battery_volt53() == null) ? 0 : getSingle_battery_volt53().hashCode());
        result = prime * result + ((getSingle_battery_volt54() == null) ? 0 : getSingle_battery_volt54().hashCode());
        result = prime * result + ((getSingle_battery_volt55() == null) ? 0 : getSingle_battery_volt55().hashCode());
        result = prime * result + ((getSingle_battery_volt56() == null) ? 0 : getSingle_battery_volt56().hashCode());
        result = prime * result + ((getSingle_battery_volt57() == null) ? 0 : getSingle_battery_volt57().hashCode());
        result = prime * result + ((getSingle_battery_volt58() == null) ? 0 : getSingle_battery_volt58().hashCode());
        result = prime * result + ((getSingle_battery_volt59() == null) ? 0 : getSingle_battery_volt59().hashCode());
        result = prime * result + ((getSingle_battery_volt60() == null) ? 0 : getSingle_battery_volt60().hashCode());
        result = prime * result + ((getMin_volt_cell_num() == null) ? 0 : getMin_volt_cell_num().hashCode());
        result = prime * result + ((getMax_volt_cell_num() == null) ? 0 : getMax_volt_cell_num().hashCode());
        result = prime * result + ((getMax_volt_differ() == null) ? 0 : getMax_volt_differ().hashCode());
        result = prime * result + ((getTotal_volt() == null) ? 0 : getTotal_volt().hashCode());
        result = prime * result + ((getBattery_open_charge_curr() == null) ? 0 : getBattery_open_charge_curr().hashCode());
        result = prime * result + ((getBattery_close_charge_curr() == null) ? 0 : getBattery_close_charge_curr().hashCode());
        result = prime * result + ((getLeft_battery_ele() == null) ? 0 : getLeft_battery_ele().hashCode());
        result = prime * result + ((getBattery_temp1() == null) ? 0 : getBattery_temp1().hashCode());
        result = prime * result + ((getBattery_temp2() == null) ? 0 : getBattery_temp2().hashCode());
        result = prime * result + ((getBattery_temp3() == null) ? 0 : getBattery_temp3().hashCode());
        result = prime * result + ((getBattery_temp4() == null) ? 0 : getBattery_temp4().hashCode());
        result = prime * result + ((getBattery_temp5() == null) ? 0 : getBattery_temp5().hashCode());
        result = prime * result + ((getBattery_temp6() == null) ? 0 : getBattery_temp6().hashCode());
        result = prime * result + ((getBattery_temp7() == null) ? 0 : getBattery_temp7().hashCode());
        result = prime * result + ((getBattery_temp8() == null) ? 0 : getBattery_temp8().hashCode());
        result = prime * result + ((getBalan_resist_temp1() == null) ? 0 : getBalan_resist_temp1().hashCode());
        result = prime * result + ((getBalan_resist_temp2() == null) ? 0 : getBalan_resist_temp2().hashCode());
        result = prime * result + ((getMos_temp1() == null) ? 0 : getMos_temp1().hashCode());
        result = prime * result + ((getMos_temp2() == null) ? 0 : getMos_temp2().hashCode());
        result = prime * result + ((getCycle_count() == null) ? 0 : getCycle_count().hashCode());
        result = prime * result + ((getError_msg() == null) ? 0 : getError_msg().hashCode());
        result = prime * result + ((getWarning_msg() == null) ? 0 : getWarning_msg().hashCode());
        result = prime * result + ((getTravel_distance() == null) ? 0 : getTravel_distance().hashCode());
        result = prime * result + ((getTravel_drive_err_count() == null) ? 0 : getTravel_drive_err_count().hashCode());
        result = prime * result + ((getTravel_drive_exec_count() == null) ? 0 : getTravel_drive_exec_count().hashCode());
        result = prime * result + ((getPlt_code_scanner_status() == null) ? 0 : getPlt_code_scanner_status().hashCode());
        result = prime * result + ((getOil_drive_Exec_count() == null) ? 0 : getOil_drive_Exec_count().hashCode());
        result = prime * result + ((getOil_drive_err_count() == null) ? 0 : getOil_drive_err_count().hashCode());
        result = prime * result + ((getUpdate_by() == null) ? 0 : getUpdate_by().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getCreate_by() == null) ? 0 : getCreate_by().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scada_id=").append(scada_id);
        sb.append(", rgv_no=").append(rgv_no);
        sb.append(", car_status=").append(car_status);
        sb.append(", run_time=").append(run_time);
        sb.append(", driving_speed=").append(driving_speed);
        sb.append(", obstacle_ahead=").append(obstacle_ahead);
        sb.append(", driving_volt=").append(driving_volt);
        sb.append(", driving_curr=").append(driving_curr);
        sb.append(", tray_obsta_dis=").append(tray_obsta_dis);
        sb.append(", suround_obsta_dis=").append(suround_obsta_dis);
        sb.append(", hydraulic_speed=").append(hydraulic_speed);
        sb.append(", hydra_oil_temp=").append(hydra_oil_temp);
        sb.append(", hydra_drive_volt=").append(hydra_drive_volt);
        sb.append(", hydra_drive_curr=").append(hydra_drive_curr);
        sb.append(", single_battery_volt1=").append(single_battery_volt1);
        sb.append(", single_battery_volt2=").append(single_battery_volt2);
        sb.append(", single_battery_volt3=").append(single_battery_volt3);
        sb.append(", single_battery_volt4=").append(single_battery_volt4);
        sb.append(", single_battery_volt5=").append(single_battery_volt5);
        sb.append(", single_battery_volt6=").append(single_battery_volt6);
        sb.append(", single_battery_volt7=").append(single_battery_volt7);
        sb.append(", single_battery_volt8=").append(single_battery_volt8);
        sb.append(", single_battery_volt9=").append(single_battery_volt9);
        sb.append(", single_battery_volt10=").append(single_battery_volt10);
        sb.append(", single_battery_volt11=").append(single_battery_volt11);
        sb.append(", single_battery_volt12=").append(single_battery_volt12);
        sb.append(", single_battery_volt13=").append(single_battery_volt13);
        sb.append(", single_battery_volt14=").append(single_battery_volt14);
        sb.append(", single_battery_volt15=").append(single_battery_volt15);
        sb.append(", single_battery_volt16=").append(single_battery_volt16);
        sb.append(", single_battery_volt17=").append(single_battery_volt17);
        sb.append(", single_battery_volt18=").append(single_battery_volt18);
        sb.append(", single_battery_volt19=").append(single_battery_volt19);
        sb.append(", single_battery_volt20=").append(single_battery_volt20);
        sb.append(", single_battery_volt21=").append(single_battery_volt21);
        sb.append(", single_battery_volt22=").append(single_battery_volt22);
        sb.append(", single_battery_volt23=").append(single_battery_volt23);
        sb.append(", single_battery_volt24=").append(single_battery_volt24);
        sb.append(", single_battery_volt25=").append(single_battery_volt25);
        sb.append(", single_battery_volt26=").append(single_battery_volt26);
        sb.append(", single_battery_volt27=").append(single_battery_volt27);
        sb.append(", single_battery_volt28=").append(single_battery_volt28);
        sb.append(", single_battery_volt29=").append(single_battery_volt29);
        sb.append(", single_battery_volt30=").append(single_battery_volt30);
        sb.append(", single_battery_volt31=").append(single_battery_volt31);
        sb.append(", single_battery_volt32=").append(single_battery_volt32);
        sb.append(", single_battery_volt33=").append(single_battery_volt33);
        sb.append(", single_battery_volt34=").append(single_battery_volt34);
        sb.append(", single_battery_volt35=").append(single_battery_volt35);
        sb.append(", single_battery_volt36=").append(single_battery_volt36);
        sb.append(", single_battery_volt37=").append(single_battery_volt37);
        sb.append(", single_battery_volt38=").append(single_battery_volt38);
        sb.append(", single_battery_volt39=").append(single_battery_volt39);
        sb.append(", single_battery_volt40=").append(single_battery_volt40);
        sb.append(", single_battery_volt41=").append(single_battery_volt41);
        sb.append(", single_battery_volt42=").append(single_battery_volt42);
        sb.append(", single_battery_volt43=").append(single_battery_volt43);
        sb.append(", single_battery_volt44=").append(single_battery_volt44);
        sb.append(", single_battery_volt45=").append(single_battery_volt45);
        sb.append(", single_battery_volt46=").append(single_battery_volt46);
        sb.append(", single_battery_volt47=").append(single_battery_volt47);
        sb.append(", single_battery_volt48=").append(single_battery_volt48);
        sb.append(", single_battery_volt49=").append(single_battery_volt49);
        sb.append(", single_battery_volt50=").append(single_battery_volt50);
        sb.append(", single_battery_volt51=").append(single_battery_volt51);
        sb.append(", single_battery_volt52=").append(single_battery_volt52);
        sb.append(", single_battery_volt53=").append(single_battery_volt53);
        sb.append(", single_battery_volt54=").append(single_battery_volt54);
        sb.append(", single_battery_volt55=").append(single_battery_volt55);
        sb.append(", single_battery_volt56=").append(single_battery_volt56);
        sb.append(", single_battery_volt57=").append(single_battery_volt57);
        sb.append(", single_battery_volt58=").append(single_battery_volt58);
        sb.append(", single_battery_volt59=").append(single_battery_volt59);
        sb.append(", single_battery_volt60=").append(single_battery_volt60);
        sb.append(", min_volt_cell_num=").append(min_volt_cell_num);
        sb.append(", max_volt_cell_num=").append(max_volt_cell_num);
        sb.append(", max_volt_differ=").append(max_volt_differ);
        sb.append(", total_volt=").append(total_volt);
        sb.append(", battery_open_charge_curr=").append(battery_open_charge_curr);
        sb.append(", battery_close_charge_curr=").append(battery_close_charge_curr);
        sb.append(", left_battery_ele=").append(left_battery_ele);
        sb.append(", battery_temp1=").append(battery_temp1);
        sb.append(", battery_temp2=").append(battery_temp2);
        sb.append(", battery_temp3=").append(battery_temp3);
        sb.append(", battery_temp4=").append(battery_temp4);
        sb.append(", battery_temp5=").append(battery_temp5);
        sb.append(", battery_temp6=").append(battery_temp6);
        sb.append(", battery_temp7=").append(battery_temp7);
        sb.append(", battery_temp8=").append(battery_temp8);
        sb.append(", balan_resist_temp1=").append(balan_resist_temp1);
        sb.append(", balan_resist_temp2=").append(balan_resist_temp2);
        sb.append(", mos_temp1=").append(mos_temp1);
        sb.append(", mos_temp2=").append(mos_temp2);
        sb.append(", cycle_count=").append(cycle_count);
        sb.append(", error_msg=").append(error_msg);
        sb.append(", warning_msg=").append(warning_msg);
        sb.append(", travel_distance=").append(travel_distance);
        sb.append(", travel_drive_err_count=").append(travel_drive_err_count);
        sb.append(", travel_drive_exec_count=").append(travel_drive_exec_count);
        sb.append(", plt_code_scanner_status=").append(plt_code_scanner_status);
        sb.append(", oil_drive_Exec_count=").append(oil_drive_Exec_count);
        sb.append(", oil_drive_err_count=").append(oil_drive_err_count);
        sb.append(", update_by=").append(update_by);
        sb.append(", update_time=").append(update_time);
        sb.append(", create_by=").append(create_by);
        sb.append(", create_time=").append(create_time);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}