package com.jobportal.Service;

import com.jobportal.Data.Project;


public interface ProjectService {
    void createdProject(Project project, long employeeId);
    Project getProjectById(long projectId);
}
