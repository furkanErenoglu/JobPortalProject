package com.jobportal.Service.Impl;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employee;
import com.jobportal.Data.Project;
import com.jobportal.Service.ApplicationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationServiceImpl implements ApplicationService {
    private final ProjectServiceImpl projectService;
    private final EmployeeServiceImpl employeeService;
    public ApplicationServiceImpl(EmployeeServiceImpl employeeService, ProjectServiceImpl projectService){
        this.employeeService = employeeService;
        this.projectService = projectService;
    }
    private final Map<Long, Application> applicationMap = new HashMap<>();
    List<Employee> applicants = new ArrayList<>();

    @Override
    public void toApply(long employeeId, long projectId) {
        Project project = projectService.getProjectById(projectId);
        Employee applicant = employeeService.getEmployeeById(employeeId);

        if (project != null && applicant != null){
            project.getEmployeeList().add(applicant);
            applicants.add(applicant);

            Application application = new Application();
            application.setId(generateApplicationId());
            application.setProject(project);

            System.out.println("applied completed your application id is" + application.getId());
        }
    }



    @Override
    public void addApplication(long applicationId) {
        applicationMap.put(applicationId, getApplicationById(applicationId));
        System.out.println("application created ");
    }

    @Override
    public Application getApplicationById(long applicationId) {
        return applicationMap.get(applicationId);
    }


    public List<Employee> getApplicants(){
        return applicants;
    }


    private long generateApplicationId(){

        return System.currentTimeMillis();
    }



}


