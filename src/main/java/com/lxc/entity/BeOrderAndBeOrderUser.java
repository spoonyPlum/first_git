package com.lxc.entity;


public class BeOrderAndBeOrderUser {
    private BeOrder order;
    private String[] bouName;
    private String[] bouhPone;
    private String[] bouSmsPhone;
    private String[] bouAddress;

    public BeOrder getOrder() {
        return order;
    }

    public void setOrder(BeOrder order) {
        this.order = order;
    }

    public String[] getBouName() {
        return bouName;
    }

    public void setBouName(String[] bouName) {
        this.bouName = bouName;
    }

    public String[] getBouhPone() {
        return bouhPone;
    }

    public void setBouhPone(String[] bouhPone) {
        this.bouhPone = bouhPone;
    }

    public String[] getBouSmsPhone() {
        return bouSmsPhone;
    }

    public void setBouSmsPhone(String[] bouSmsPhone) {
        this.bouSmsPhone = bouSmsPhone;
    }

    public String[] getBouAddress() {
        return bouAddress;
    }

    public void setBouAddress(String[] bouAddress) {
        this.bouAddress = bouAddress;
    }
}
