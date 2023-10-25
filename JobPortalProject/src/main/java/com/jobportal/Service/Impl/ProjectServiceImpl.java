package com.jobportal.Service.Impl;


import com.jobportal.Data.Project;
import com.jobportal.Service.ProjectService;

import java.util.ArrayList;
import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    private List<Project> projectList = new ArrayList<>();
    @Override
    public void createdProject(Project project) {
        projectList.add(project);
        System.out.println("Project created successfully");

    }

    @Override
    public Project getProjectById(long projectId) {
        for (Project project : projectList){
            if (project.getId() == projectId){
                return project;
            }
        }
        return null;
    }

    public List<Project> getProjectList(){
        return projectList;
    }

}
