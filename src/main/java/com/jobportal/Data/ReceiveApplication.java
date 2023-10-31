package com.jobportal.Data;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employer;

import java.util.List;

public class ReceiveApplication {
    private long id;
    private List<Employer> employerList;

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
}
