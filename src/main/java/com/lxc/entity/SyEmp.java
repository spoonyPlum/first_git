package com.lxc.entity;

import javax.persistence.*;

@Table(name = "sy_emp")
public class SyEmp {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 员工姓名
     */
    @Column(name = "empName")
    private String empname;

    /**
     * 工号
     */
    @Column(name = "empNo")
    private String empno;

    /**
     * 密码 （MD5加密）
     */
    private String pwd;

    /**
     * 部门ID
     */
    @Column(name = "deptID")
    private Integer deptid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 禁用 （0可使用 1已禁用）
     */
    private Integer disabled;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取员工姓名
     *
     * @return empName - 员工姓名
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * 设置员工姓名
     *
     * @param empname 员工姓名
     */
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    /**
     * 获取工号
     *
     * @return empNo - 工号
     */
    public String getEmpno() {
        return empno;
    }

    /**
     * 设置工号
     *
     * @param empno 工号
     */
    public void setEmpno(String empno) {
        this.empno = empno;
    }

    /**
     * 获取密码 （MD5加密）
     *
     * @return pwd - 密码 （MD5加密）
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码 （MD5加密）
     *
     * @param pwd 密码 （MD5加密）
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取部门ID
     *
     * @return deptID - 部门ID
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 设置部门ID
     *
     * @param deptid 部门ID
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取禁用 （0可使用 1已禁用）
     *
     * @return disabled - 禁用 （0可使用 1已禁用）
     */
    public Integer getDisabled() {
        return disabled;
    }

    /**
     * 设置禁用 （0可使用 1已禁用）
     *
     * @param disabled 禁用 （0可使用 1已禁用）
     */
    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "SyEmp{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", empno='" + empno + '\'' +
                ", pwd='" + pwd + '\'' +
                ", deptid=" + deptid +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}