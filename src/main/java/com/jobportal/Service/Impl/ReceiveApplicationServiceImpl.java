package com.jobportal.Service.Impl;

import com.jobportal.Data.Employee;
import com.jobportal.Data.Employer;
import com.jobportal.Data.ReceiveApplication;
import com.jobportal.Service.ReceiveApplicationService;

import java.util.HashMap;
import java.util.Map;

public class ReceiveApplicationServiceImpl implements ReceiveApplicationService {
    private final ApplicationServiceImpl applicationService;
    private final EmployeeServiceImpl employeeService;
    private final EmployerServiceImpl employerService;
    public ReceiveApplicationServiceImpl(ApplicationServiceImpl applicationService, EmployeeServiceImpl employeeService, EmployerServiceImpl employerService){
        this.applicationService = applicationService;
        this.employeeService = employeeService;
        this.employerService = employerService;
    }
    Map<Long  , Employee> receiveApplications = new HashMap<>();


    @Override
    public void receiveApplication(long applicationId, long employeeId, long employerId) {
        for (Employee employee: employeeService.employeeList){
            if (employee.getId() == employeeId){
                Employer employer = employerService.getEmployerById(employerId);
                receiveApplications.put(applicationId, employeeService.getEmployeeById(employeeId));
                ReceiveApplication receiveApplication = new ReceiveApplication();
                receiveApplication.getEmployerList().add(employer);
                System.out.println(" application received ");
            }
        }

    }

    public Map<Long  , Employee> comformentApplication(){
        return receiveApplications;
    }
}
