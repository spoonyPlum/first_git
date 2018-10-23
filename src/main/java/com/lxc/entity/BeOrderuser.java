package com.lxc.entity;

import javax.persistence.*;

@Table(name = "be_orderuser")
public class BeOrderuser {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 所属工单
     */
    @Column(name = "orderNo")
    private String orderno;

    /**
     * 用户姓名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 短信电话
     */
    @Column(name = "sMSPhone")
    private String smsphone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 应交金额
     */
    @Column(name = "projectMoney")
    private Double projectmoney;

    /**
     * 实交金额
     */
    @Column(name = "realMoney")
    private Double realmoney;

    /**
     * 发票号
     */
    @Column(name = "invoiceNo")
    private String invoiceno;

    /**
     * 提比提量值
     */
    private String formula;

    /**
     * 合同编号
     */
    @Column(name = "contractNum")
    private String contractnum;

    /**
     * 表径（即水表类型）
     */
    @Column(name = "meterTypeID")
    private Integer metertypeid;

    /**
     * 身表码
     */
    @Column(name = "meterName")
    private String metername;

    /**
     * 最大表码值
     */
    @Column(name = "`maxValue`")
    private Integer maxvalue;

    /**
     * 起始底码
     */
    @Column(name = "startValue")
    private Integer startvalue;

    /**
     * 水表厂家
     */
    @Column(name = "meterFactory")
    private String meterfactory;

    /**
     * 档案编号
     */
    @Column(name = "docNum")
    private String docnum;

    /**
     * 最终产生的用户编号
     */
    @Column(name = "userNo")
    private String userno;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取所属工单
     *
     * @return orderNo - 所属工单
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * 设置所属工单
     *
     * @param orderno 所属工单
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * 获取用户姓名
     *
     * @return userName - 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户姓名
     *
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取短信电话
     *
     * @return sMSPhone - 短信电话
     */
    public String getSmsphone() {
        return smsphone;
    }

    /**
     * 设置短信电话
     *
     * @param smsphone 短信电话
     */
    public void setSmsphone(String smsphone) {
        this.smsphone = smsphone;
    }

    /**
     * 获取联系地址
     *
     * @return address - 联系地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置联系地址
     *
     * @param address 联系地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取应交金额
     *
     * @return projectMoney - 应交金额
     */
    public Double getProjectmoney() {
        return projectmoney;
    }

    /**
     * 设置应交金额
     *
     * @param projectmoney 应交金额
     */
    public void setProjectmoney(Double projectmoney) {
        this.projectmoney = projectmoney;
    }

    /**
     * 获取实交金额
     *
     * @return realMoney - 实交金额
     */
    public Double getRealmoney() {
        return realmoney;
    }

    /**
     * 设置实交金额
     *
     * @param realmoney 实交金额
     */
    public void setRealmoney(Double realmoney) {
        this.realmoney = realmoney;
    }

    /**
     * 获取发票号
     *
     * @return invoiceNo - 发票号
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
     * 设置发票号
     *
     * @param invoiceno 发票号
     */
    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    /**
     * 获取提比提量值
     *
     * @return formula - 提比提量值
     */
    public String getFormula() {
        return formula;
    }

    /**
     * 设置提比提量值
     *
     * @param formula 提比提量值
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * 获取合同编号
     *
     * @return contractNum - 合同编号
     */
    public String getContractnum() {
        return contractnum;
    }

    /**
     * 设置合同编号
     *
     * @param contractnum 合同编号
     */
    public void setContractnum(String contractnum) {
        this.contractnum = contractnum;
    }

    /**
     * 获取表径（即水表类型）
     *
     * @return meterTypeID - 表径（即水表类型）
     */
    public Integer getMetertypeid() {
        return metertypeid;
    }

    /**
     * 设置表径（即水表类型）
     *
     * @param metertypeid 表径（即水表类型）
     */
    public void setMetertypeid(Integer metertypeid) {
        this.metertypeid = metertypeid;
    }

    /**
     * 获取身表码
     *
     * @return meterName - 身表码
     */
    public String getMetername() {
        return metername;
    }

    /**
     * 设置身表码
     *
     * @param metername 身表码
     */
    public void setMetername(String metername) {
        this.metername = metername;
    }

    /**
     * 获取最大表码值
     *
     * @return maxValue - 最大表码值
     */
    public Integer getMaxvalue() {
        return maxvalue;
    }

    /**
     * 设置最大表码值
     *
     * @param maxvalue 最大表码值
     */
    public void setMaxvalue(Integer maxvalue) {
        this.maxvalue = maxvalue;
    }

    /**
     * 获取起始底码
     *
     * @return startValue - 起始底码
     */
    public Integer getStartvalue() {
        return startvalue;
    }

    /**
     * 设置起始底码
     *
     * @param startvalue 起始底码
     */
    public void setStartvalue(Integer startvalue) {
        this.startvalue = startvalue;
    }

    /**
     * 获取水表厂家
     *
     * @return meterFactory - 水表厂家
     */
    public String getMeterfactory() {
        return meterfactory;
    }

    /**
     * 设置水表厂家
     *
     * @param meterfactory 水表厂家
     */
    public void setMeterfactory(String meterfactory) {
        this.meterfactory = meterfactory;
    }

    /**
     * 获取档案编号
     *
     * @return docNum - 档案编号
     */
    public String getDocnum() {
        return docnum;
    }

    /**
     * 设置档案编号
     *
     * @param docnum 档案编号
     */
    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    /**
     * 获取最终产生的用户编号
     *
     * @return userNo - 最终产生的用户编号
     */
    public String getUserno() {
        return userno;
    }

    /**
     * 设置最终产生的用户编号
     *
     * @param userno 最终产生的用户编号
     */
    public void setUserno(String userno) {
        this.userno = userno;
    }

    @Override
    public String toString() {
        return "BeOrderuser{" +
                "id=" + id +
                ", orderno='" + orderno + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", smsphone='" + smsphone + '\'' +
                ", address='" + address + '\'' +
                ", projectmoney=" + projectmoney +
                ", realmoney=" + realmoney +
                ", invoiceno='" + invoiceno + '\'' +
                ", formula='" + formula + '\'' +
                ", contractnum='" + contractnum + '\'' +
                ", metertypeid=" + metertypeid +
                ", metername='" + metername + '\'' +
                ", maxvalue=" + maxvalue +
                ", startvalue=" + startvalue +
                ", meterfactory='" + meterfactory + '\'' +
                ", docnum='" + docnum + '\'' +
                ", userno='" + userno + '\'' +
                '}';
    }

    public BeOrderuser() {
    }

    public BeOrderuser(String username, String phone, String smsphone, String address,Integer metertypeid) {
        this.username = username;
        this.phone = phone;
        this.smsphone = smsphone;
        this.address = address;
        this.metertypeid = metertypeid;
    }
}