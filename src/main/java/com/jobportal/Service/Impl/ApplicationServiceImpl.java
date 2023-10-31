package com.jobportal.Service.Impl;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employee;
import com.jobportal.Data.Project;
import com.jobportal.Service.ApplicationService;

import java.util.*;

public class ApplicationServiceImpl implements ApplicationService {
    private final EmployeeServiceImpl employeeService;
    public ApplicationServiceImpl(EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }
    private final Map<String , Application> applicationMap = new HashMap<>();
    private List<Employee> applicants = new ArrayList<>();

    @Override
    public void toApply(long employeeId, long projectId) {
        Employee applicant = employeeService.getEmployeeById(employeeId);

        if (applicant != null){
            applicants.add(applicant);
            Application application = new Application();
            application.setId(generateApplicationId());
            application.setProjectList(applicant.getProjects());
            application.getApplicant().add(applicant);
            addApplication(application.getId());
            System.out.println("applied completed" );
        }
    }

    @Override
    public void addApplication(String  applicationId) {
        applicationMap.put(applicationId, getApplicationById(applicationId));
        System.out.println("application created your Id"+ applicationId);
    }

    @Override
    public Application getApplicationById(String applicationId) {
        return applicationMap.get(applicationId);
    }


    public List<Employee> getApplicants(){
        return applicants;
    }


    private String  generateApplicationId(){
        return UUID.randomUUID().toString();
    }



}


