package com.jobportal.Data;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employer;

import java.util.ArrayList;
import java.util.List;

public class ReceiveApplication {
    private long id;
    private List<Employer> employerList;

    private List<Employee> employeeList;

    public ReceiveApplication(){
        this.employerList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Employer> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(List<Employer> employerList) {
        this.employerList = employerList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
