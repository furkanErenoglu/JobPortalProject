package com.jobportal.Service;

import com.jobportal.Data.Project;


public interface ProjectService {
    void createdProject(Project project, long profileId);
    Project getProjectById(long projectId);
}
