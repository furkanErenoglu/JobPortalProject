package com.jobportal.Data;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private long id;
    private Project project;
    List<Employee> applicant;

    public Application(){
        this.applicant = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}
