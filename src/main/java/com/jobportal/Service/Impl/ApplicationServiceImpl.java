package com.jobportal.Service.Impl;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employee;
import com.jobportal.Data.Employer;
import com.jobportal.Service.ApplicationService;

import java.util.*;

public class ApplicationServiceImpl implements ApplicationService {
    private final EmployeeServiceImpl employeeService;
    private final EmployerServiceImpl employerService;

    private Map<Long, Application> applicationMap;
    private List<Employee> applicants;

    public ApplicationServiceImpl(EmployeeServiceImpl employeeService, EmployerServiceImpl employerService) {
        this.employeeService = employeeService;
        this.applicationMap = new HashMap<>();
        this.applicants = new ArrayList<>();
        this.employerService = employerService;

    }

    @Override
    public void toApply(long employeeId, long applicationId) {
        Employee applicant = employeeService.getEmployeeById(employeeId);
        Application application = getApplicationById(applicationId);
        if (applicant != null) {
            application.getApplicants().add(applicant);
            applicants.add(applicant);
            applicant.getApplications().add(application);
            System.out.println("applied completed");
        }
    }

    @Override
    public void addApplication(Application application, long employerId) {
        Employer employer = employerService.getEmployerById(employerId);
        employer.getApplications().add(application);
        applicationMap.put(application.getId(), application);
        System.out.println("application created your Id" + application.getId());
    }

    @Override
    public Application getApplicationById(long applicationId) {
        Application application = applicationMap.get(applicationId);
        return application;
    }


    public List<Employee> getApplicants() {
        return applicants;
    }



}


