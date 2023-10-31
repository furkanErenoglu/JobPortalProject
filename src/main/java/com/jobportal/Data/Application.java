package com.jobportal.Data;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private String  id;
    private List<Project> projectList;
    private List<Employee> applicant;

    public Application(){
        this.applicant = new ArrayList<>();
        this.projectList = new ArrayList<>();
    }

    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public List<Employee> getApplicant() {
        return applicant;
    }

    public void setApplicant(List<Employee> applicant) {
        this.applicant = applicant;
    }
}
