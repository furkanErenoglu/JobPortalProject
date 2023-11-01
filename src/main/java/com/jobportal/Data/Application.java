package com.jobportal.Data;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private long  id;
    private List<Employee> applicants;

    public Application(){
        this.applicants = new ArrayList<>();
    }

    public long  getId() {
        return id;
    }

    public void setId(long  id) {
        this.id = id;
    }

    public List<Employee> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Employee> applicants) {
        this.applicants = applicants;
    }
}
