package com.milsmile.databindingdemo.javaex7fragment;
public class EmployeeModel {
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public EmployeeModel(String ename, int eage) {
        this.ename = ename;
        this.eage = eage;
    }

    private String ename;
    private int eage;
}
