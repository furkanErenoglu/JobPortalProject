package com.jobportal.Service.Impl;


import com.jobportal.Data.Employee;
import com.jobportal.Data.Profile;
import com.jobportal.Data.Project;
import com.jobportal.Service.ProjectService;

import java.util.ArrayList;
import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    private ProfileServiceImpl profileService;

    public ProjectServiceImpl(ProfileServiceImpl profileService){
        this.profileService= profileService;
    }

    private List<Project> projectList = new ArrayList<>();

    @Override
    public void createdProject(Project project, long profileId) {
        Profile profile = profileService.getProfileById(profileId);
        if (profile != null){
            profile.getProjects().add(project);
            projectList.add(project);
            System.out.println("Project created successfully");
        }else{
            System.out.println("Profile not found for id: " + profileId);
        }


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
