package com.jobportal.Service.Impl;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employee;
import com.jobportal.Data.Project;
import com.jobportal.Service.ApplicationService;

import java.util.ArrayList;
import java.util.List;

public class ApplicationServiceImpl implements ApplicationService {
    private final ProjectServiceImpl projectService;
    private final EmployeeServiceImpl employeeService;
    public ApplicationServiceImpl(EmployeeServiceImpl employeeService, ProjectServiceImpl projectService){
        this.employeeService = employeeService;
        this.projectService = projectService;
    }

    @Override
    public void toApply(long employeeId, long projectId) {
        if (projectService.getProjectList().equals(projectService.getProjectById(projectId))){
            projectService.getProjectById(projectId).getEmployeeList().add(employeeService.getEmployeeById(employeeId));
        }else {
            System.out.println("project not found");
        }


    }




}


