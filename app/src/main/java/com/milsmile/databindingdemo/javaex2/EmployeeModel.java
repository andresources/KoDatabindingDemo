package com.milsmile.databindingdemo.javaex2;
public class EmployeeModel {
    public EmployeeModel(String ename, String salary) {
        this.ename = ename;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public String getSalary() {
        return salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    String ename;
    String salary;

}
