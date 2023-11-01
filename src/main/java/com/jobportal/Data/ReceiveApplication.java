package com.jobportal.Data;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employer;

import java.util.ArrayList;
import java.util.List;

public class ReceiveApplication {
    private long id;
    private Employer employer;

    private List<Employee> employeeList;

    public ReceiveApplication(){
        this.employeeList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
