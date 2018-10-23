package com.lxc.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "be_order")
public class BeOrder {
    /**
     * 业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）
     */
    @Id
    @Column(name = "orderNo")
    private String orderno;

    /**
     * 工单类型（1新户 2分户 3过户 4代扣 5换表 6重签 7销户）
     */
    @Column(name = "orderType")
    private Integer ordertype;

    /**
     * 当前步骤ID（1-8步骤，0完成，-1终止）
     */
    @Column(name = "stepID")
    private Integer stepid;

    /**
     * 建单人
     */
    @Column(name = "createEmp")
    private Integer createemp;

    /**
     * 工单创建日期
     */
    @Column(name = "createDate")
    private Date createdate;

    /**
     * 归档人
     */
    @Column(name = "completeEmp")
    private Integer completeemp;

    /**
     * 工单完成日期
     */
    @Column(name = "completeDate")
    private Date completedate;

    /**
     * 最后操作人
     */
    @Column(name = "lastEditEmp")
    private Integer lasteditemp;

    /**
     * 最后操作时间
     */
    @Column(name = "lastEditDate")
    private Date lasteditdate;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private String username;

    /**
     * 用户类型（私户 公户）
     */
    @Column(name = "userType")
    private String usertype;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 联系人
     */
    @Column(name = "linkMan")
    private String linkman;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 接水用途
     */
    @Column(name = "useTarget")
    private String usetarget;

    /**
     * 房屋层次
     */
    @Column(name = "houseHeight")
    private Integer househeight;

    /**
     * 用水量
     */
    @Column(name = "maxAmount")
    private Integer maxamount;

    /**
     * 申请表径
     */
    @Column(name = "meterTypeID")
    private Integer metertypeid;

    /**
     * 申请装表表数
     */
    @Column(name = "meterCount")
    private Integer metercount;

    /**
     * 用户申请的备注说明
     */
    @Column(name = "userRemark")
    private String userremark;

    /**
     * 收费方式（坐收 走收 银行代扣）
     */
    @Column(name = "payType")
    private String paytype;

    /**
     * 开户银行
     */
    @Column(name = "bankCompany")
    private String bankcompany;

    /**
     * 银行账号
     */
    @Column(name = "bankNum")
    private String banknum;

    /**
     * 原用户编码
     */
    @Column(name = "oldUserNo")
    private String olduserno;

    /**
     * 原用户姓名
     */
    @Column(name = "oldUserName")
    private String oldusername;

    /**
     * 原用户电话
     */
    @Column(name = "oldUserPhone")
    private String olduserphone;

    /**
     * 原用户地址
     */
    @Column(name = "oldUserAddr")
    private String olduseraddr;

    /**
     * 原用户表径（不存ID，直接存文字 ）
     */
    @Column(name = "oldMeter")
    private String oldmeter;

    /**
     * 初步审核人
     */
    @Column(name = "auditEmpID")
    private Integer auditempid;

    /**
     * 初审意见
     */
    @Column(name = "auditMessage")
    private String auditmessage;

    /**
     * 总应收金额
     */
    @Column(name = "projectMoney")
    private Double projectmoney;

    /**
     * 总实收金额
     */
    @Column(name = "realMoney")
    private Double realmoney;

    /**
     * 交费日期
     */
    @Column(name = "payDate")
    private Date paydate;

    /**
     * 开工日期
     */
    @Column(name = "projectDate1")
    private Date projectdate1;

    /**
     * 竣工日期
     */
    @Column(name = "projectDate2")
    private Date projectdate2;

    /**
     * 所属辖区
     */
    @Column(name = "areaID")
    private Integer areaid;

    /**
     * 工单终止原因
     */
    @Column(name = "abortCause")
    private String abortcause;

    //工单用户详情
    private List<BeOrderuser> orderusers;

    public List<BeOrderuser> getOrderusers() {
        return orderusers;
    }

    public void setOrderusers(List<BeOrderuser> orderusers) {
        this.orderusers = orderusers;
    }

    @Override
    public String toString() {
        return "BeOrder{" +
                "orderno='" + orderno + '\'' +
                ", ordertype=" + ordertype +
                ", stepid=" + stepid +
                ", createemp=" + createemp +
                ", createdate=" + createdate +
                ", completeemp=" + completeemp +
                ", completedate=" + completedate +
                ", lasteditemp=" + lasteditemp +
                ", lasteditdate=" + lasteditdate +
                ", username='" + username + '\'' +
                ", usertype='" + usertype + '\'' +
                ", address='" + address + '\'' +
                ", linkman='" + linkman + '\'' +
                ", phone='" + phone + '\'' +
                ", usetarget='" + usetarget + '\'' +
                ", househeight=" + househeight +
                ", maxamount=" + maxamount +
                ", metertypeid=" + metertypeid +
                ", metercount=" + metercount +
                ", userremark='" + userremark + '\'' +
                ", paytype='" + paytype + '\'' +
                ", bankcompany='" + bankcompany + '\'' +
                ", banknum='" + banknum + '\'' +
                ", olduserno='" + olduserno + '\'' +
                ", oldusername='" + oldusername + '\'' +
                ", olduserphone='" + olduserphone + '\'' +
                ", olduseraddr='" + olduseraddr + '\'' +
                ", oldmeter='" + oldmeter + '\'' +
                ", auditempid=" + auditempid +
                ", auditmessage='" + auditmessage + '\'' +
                ", projectmoney=" + projectmoney +
                ", realmoney=" + realmoney +
                ", paydate=" + paydate +
                ", projectdate1=" + projectdate1 +
                ", projectdate2=" + projectdate2 +
                ", areaid=" + areaid +
                ", abortcause='" + abortcause + '\'' +
                '}';
    }

    /**
     * 获取业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）
     *
     * @return orderNo - 业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * 设置业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）
     *
     * @param orderno 业扩工单（规则：16位，如：B1-20140105-0001。前两位表示工单类型，中间8位表示建单日期，最后四位是按工单类型和月份的流水号）
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * 获取工单类型（1新户 2分户 3过户 4代扣 5换表 6重签 7销户）
     *
     * @return orderType - 工单类型（1新户 2分户 3过户 4代扣 5换表 6重签 7销户）
     */
    public Integer getOrdertype() {
        return ordertype;
    }

    /**
     * 设置工单类型（1新户 2分户 3过户 4代扣 5换表 6重签 7销户）
     *
     * @param ordertype 工单类型（1新户 2分户 3过户 4代扣 5换表 6重签 7销户）
     */
    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * 获取当前步骤ID（1-8步骤，0完成，-1终止）
     *
     * @return stepID - 当前步骤ID（1-8步骤，0完成，-1终止）
     */
    public Integer getStepid() {
        return stepid;
    }

    /**
     * 设置当前步骤ID（1-8步骤，0完成，-1终止）
     *
     * @param stepid 当前步骤ID（1-8步骤，0完成，-1终止）
     */
    public void setStepid(Integer stepid) {
        this.stepid = stepid;
    }

    /**
     * 获取建单人
     *
     * @return createEmp - 建单人
     */
    public Integer getCreateemp() {
        return createemp;
    }

    /**
     * 设置建单人
     *
     * @param createemp 建单人
     */
    public void setCreateemp(Integer createemp) {
        this.createemp = createemp;
    }

    /**
     * 获取工单创建日期
     *
     * @return createDate - 工单创建日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置工单创建日期
     *
     * @param createdate 工单创建日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取归档人
     *
     * @return completeEmp - 归档人
     */
    public Integer getCompleteemp() {
        return completeemp;
    }

    /**
     * 设置归档人
     *
     * @param completeemp 归档人
     */
    public void setCompleteemp(Integer completeemp) {
        this.completeemp = completeemp;
    }

    /**
     * 获取工单完成日期
     *
     * @return completeDate - 工单完成日期
     */
    public Date getCompletedate() {
        return completedate;
    }

    /**
     * 设置工单完成日期
     *
     * @param completedate 工单完成日期
     */
    public void setCompletedate(Date completedate) {
        this.completedate = completedate;
    }

    /**
     * 获取最后操作人
     *
     * @return lastEditEmp - 最后操作人
     */
    public Integer getLasteditemp() {
        return lasteditemp;
    }

    /**
     * 设置最后操作人
     *
     * @param lasteditemp 最后操作人
     */
    public void setLasteditemp(Integer lasteditemp) {
        this.lasteditemp = lasteditemp;
    }

    /**
     * 获取最后操作时间
     *
     * @return lastEditDate - 最后操作时间
     */
    public Date getLasteditdate() {
        return lasteditdate;
    }

    /**
     * 设置最后操作时间
     *
     * @param lasteditdate 最后操作时间
     */
    public void setLasteditdate(Date lasteditdate) {
        this.lasteditdate = lasteditdate;
    }

    /**
     * 获取用户名称
     *
     * @return userName - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户类型（私户 公户）
     *
     * @return userType - 用户类型（私户 公户）
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 设置用户类型（私户 公户）
     *
     * @param usertype 用户类型（私户 公户）
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取用户地址
     *
     * @return address - 用户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置用户地址
     *
     * @param address 用户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取联系人
     *
     * @return linkMan - 联系人
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * 设置联系人
     *
     * @param linkman 联系人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取接水用途
     *
     * @return useTarget - 接水用途
     */
    public String getUsetarget() {
        return usetarget;
    }

    /**
     * 设置接水用途
     *
     * @param usetarget 接水用途
     */
    public void setUsetarget(String usetarget) {
        this.usetarget = usetarget;
    }

    /**
     * 获取房屋层次
     *
     * @return houseHeight - 房屋层次
     */
    public Integer getHouseheight() {
        return househeight;
    }

    /**
     * 设置房屋层次
     *
     * @param househeight 房屋层次
     */
    public void setHouseheight(Integer househeight) {
        this.househeight = househeight;
    }

    /**
     * 获取用水量
     *
     * @return maxAmount - 用水量
     */
    public Integer getMaxamount() {
        return maxamount;
    }

    /**
     * 设置用水量
     *
     * @param maxamount 用水量
     */
    public void setMaxamount(Integer maxamount) {
        this.maxamount = maxamount;
    }

    /**
     * 获取申请表径
     *
     * @return meterTypeID - 申请表径
     */
    public Integer getMetertypeid() {
        return metertypeid;
    }

    /**
     * 设置申请表径
     *
     * @param metertypeid 申请表径
     */
    public void setMetertypeid(Integer metertypeid) {
        this.metertypeid = metertypeid;
    }

    /**
     * 获取申请装表表数
     *
     * @return meterCount - 申请装表表数
     */
    public Integer getMetercount() {
        return metercount;
    }

    /**
     * 设置申请装表表数
     *
     * @param metercount 申请装表表数
     */
    public void setMetercount(Integer metercount) {
        this.metercount = metercount;
    }

    /**
     * 获取用户申请的备注说明
     *
     * @return userRemark - 用户申请的备注说明
     */
    public String getUserremark() {
        return userremark;
    }

    /**
     * 设置用户申请的备注说明
     *
     * @param userremark 用户申请的备注说明
     */
    public void setUserremark(String userremark) {
        this.userremark = userremark;
    }

    /**
     * 获取收费方式（坐收 走收 银行代扣）
     *
     * @return payType - 收费方式（坐收 走收 银行代扣）
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 设置收费方式（坐收 走收 银行代扣）
     *
     * @param paytype 收费方式（坐收 走收 银行代扣）
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
     * 获取开户银行
     *
     * @return bankCompany - 开户银行
     */
    public String getBankcompany() {
        return bankcompany;
    }

    /**
     * 设置开户银行
     *
     * @param bankcompany 开户银行
     */
    public void setBankcompany(String bankcompany) {
        this.bankcompany = bankcompany;
    }

    /**
     * 获取银行账号
     *
     * @return bankNum - 银行账号
     */
    public String getBanknum() {
        return banknum;
    }

    /**
     * 设置银行账号
     *
     * @param banknum 银行账号
     */
    public void setBanknum(String banknum) {
        this.banknum = banknum;
    }

    /**
     * 获取原用户编码
     *
     * @return oldUserNo - 原用户编码
     */
    public String getOlduserno() {
        return olduserno;
    }

    /**
     * 设置原用户编码
     *
     * @param olduserno 原用户编码
     */
    public void setOlduserno(String olduserno) {
        this.olduserno = olduserno;
    }

    /**
     * 获取原用户姓名
     *
     * @return oldUserName - 原用户姓名
     */
    public String getOldusername() {
        return oldusername;
    }

    /**
     * 设置原用户姓名
     *
     * @param oldusername 原用户姓名
     */
    public void setOldusername(String oldusername) {
        this.oldusername = oldusername;
    }

    /**
     * 获取原用户电话
     *
     * @return oldUserPhone - 原用户电话
     */
    public String getOlduserphone() {
        return olduserphone;
    }

    /**
     * 设置原用户电话
     *
     * @param olduserphone 原用户电话
     */
    public void setOlduserphone(String olduserphone) {
        this.olduserphone = olduserphone;
    }

    /**
     * 获取原用户地址
     *
     * @return oldUserAddr - 原用户地址
     */
    public String getOlduseraddr() {
        return olduseraddr;
    }

    /**
     * 设置原用户地址
     *
     * @param olduseraddr 原用户地址
     */
    public void setOlduseraddr(String olduseraddr) {
        this.olduseraddr = olduseraddr;
    }

    /**
     * 获取原用户表径（不存ID，直接存文字 ）
     *
     * @return oldMeter - 原用户表径（不存ID，直接存文字 ）
     */
    public String getOldmeter() {
        return oldmeter;
    }

    /**
     * 设置原用户表径（不存ID，直接存文字 ）
     *
     * @param oldmeter 原用户表径（不存ID，直接存文字 ）
     */
    public void setOldmeter(String oldmeter) {
        this.oldmeter = oldmeter;
    }

    /**
     * 获取初步审核人
     *
     * @return auditEmpID - 初步审核人
     */
    public Integer getAuditempid() {
        return auditempid;
    }

    /**
     * 设置初步审核人
     *
     * @param auditempid 初步审核人
     */
    public void setAuditempid(Integer auditempid) {
        this.auditempid = auditempid;
    }

    /**
     * 获取初审意见
     *
     * @return auditMessage - 初审意见
     */
    public String getAuditmessage() {
        return auditmessage;
    }

    /**
     * 设置初审意见
     *
     * @param auditmessage 初审意见
     */
    public void setAuditmessage(String auditmessage) {
        this.auditmessage = auditmessage;
    }

    /**
     * 获取总应收金额
     *
     * @return projectMoney - 总应收金额
     */
    public Double getProjectmoney() {
        return projectmoney;
    }

    /**
     * 设置总应收金额
     *
     * @param projectmoney 总应收金额
     */
    public void setProjectmoney(Double projectmoney) {
        this.projectmoney = projectmoney;
    }

    /**
     * 获取总实收金额
     *
     * @return realMoney - 总实收金额
     */
    public Double getRealmoney() {
        return realmoney;
    }

    /**
     * 设置总实收金额
     *
     * @param realmoney 总实收金额
     */
    public void setRealmoney(Double realmoney) {
        this.realmoney = realmoney;
    }

    /**
     * 获取交费日期
     *
     * @return payDate - 交费日期
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
     * 设置交费日期
     *
     * @param paydate 交费日期
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
     * 获取开工日期
     *
     * @return projectDate1 - 开工日期
     */
    public Date getProjectdate1() {
        return projectdate1;
    }

    /**
     * 设置开工日期
     *
     * @param projectdate1 开工日期
     */
    public void setProjectdate1(Date projectdate1) {
        this.projectdate1 = projectdate1;
    }

    /**
     * 获取竣工日期
     *
     * @return projectDate2 - 竣工日期
     */
    public Date getProjectdate2() {
        return projectdate2;
    }

    /**
     * 设置竣工日期
     *
     * @param projectdate2 竣工日期
     */
    public void setProjectdate2(Date projectdate2) {
        this.projectdate2 = projectdate2;
    }

    /**
     * 获取所属辖区
     *
     * @return areaID - 所属辖区
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * 设置所属辖区
     *
     * @param areaid 所属辖区
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * 获取工单终止原因
     *
     * @return abortCause - 工单终止原因
     */
    public String getAbortcause() {
        return abortcause;
    }

    /**
     * 设置工单终止原因
     *
     * @param abortcause 工单终止原因
     */
    public void setAbortcause(String abortcause) {
        this.abortcause = abortcause;
    }
}