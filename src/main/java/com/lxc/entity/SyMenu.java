package com.lxc.entity;

import javax.persistence.*;

@Table(name = "sy_menu")
public class SyMenu {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 菜单名称
     */
    @Column(name = "menuName")
    private String menuname;

    /**
     * 菜单上级ID
     */
    private Integer parent;

    /**
     * 菜单链接的URL
     */
    private String url;

    /**
     * 菜单点击时的js代码
     */
    @Column(name = "onClick")
    private String onclick;

    /**
     * 菜单图标对应的样式类
     */
    private String icon;

    /**
     * 菜单排序号
     */
    @Column(name = "orderIndex")
    private Integer orderindex;

    /**
     * 此菜单项对应业扩流程中的流程ID
     */
    @Column(name = "flowID")
    private Integer flowid;

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
     * 获取菜单名称
     *
     * @return menuName - 菜单名称
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * 设置菜单名称
     *
     * @param menuname 菜单名称
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * 获取菜单上级ID
     *
     * @return parent - 菜单上级ID
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 设置菜单上级ID
     *
     * @param parent 菜单上级ID
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * 获取菜单链接的URL
     *
     * @return url - 菜单链接的URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置菜单链接的URL
     *
     * @param url 菜单链接的URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取菜单点击时的js代码
     *
     * @return onClick - 菜单点击时的js代码
     */
    public String getOnclick() {
        return onclick;
    }

    /**
     * 设置菜单点击时的js代码
     *
     * @param onclick 菜单点击时的js代码
     */
    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    /**
     * 获取菜单图标对应的样式类
     *
     * @return icon - 菜单图标对应的样式类
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置菜单图标对应的样式类
     *
     * @param icon 菜单图标对应的样式类
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取菜单排序号
     *
     * @return orderIndex - 菜单排序号
     */
    public Integer getOrderindex() {
        return orderindex;
    }

    /**
     * 设置菜单排序号
     *
     * @param orderindex 菜单排序号
     */
    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    /**
     * 获取此菜单项对应业扩流程中的流程ID
     *
     * @return flowID - 此菜单项对应业扩流程中的流程ID
     */
    public Integer getFlowid() {
        return flowid;
    }

    /**
     * 设置此菜单项对应业扩流程中的流程ID
     *
     * @param flowid 此菜单项对应业扩流程中的流程ID
     */
    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
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
        return "SyMenu{" +
                "id=" + id +
                ", menuname='" + menuname + '\'' +
                ", parent=" + parent +
                ", url='" + url + '\'' +
                ", onclick='" + onclick + '\'' +
                ", icon='" + icon + '\'' +
                ", orderindex=" + orderindex +
                ", flowid=" + flowid +
                ", disabled=" + disabled +
                '}';
    }
}