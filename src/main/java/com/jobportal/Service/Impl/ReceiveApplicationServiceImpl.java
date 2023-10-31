package com.jobportal.Service.Impl;

import com.jobportal.Data.Application;
import com.jobportal.Data.Employee;
import com.jobportal.Data.Project;
import com.jobportal.Data.ReceiveApplication;
import com.jobportal.Service.ApplicationService;
import com.jobportal.Service.ReceiveApplicationService;

import java.util.HashMap;
import java.util.Map;

public class ReceiveApplicationServiceImpl implements ReceiveApplicationService {
    private final ApplicationServiceImpl applicationService;
    private final EmployeeServiceImpl employeeService;

    public ReceiveApplicationServiceImpl(ApplicationServiceImpl applicationService, EmployeeServiceImpl employeeService){
        this.applicationService = applicationService;
        this.employeeService = employeeService;
    }
    Map<String   , Employee> receiveApplications = new HashMap<>();


    @Override
    public void receiveApplication(String applicationId, long employeeId) {
        for (Employee employee: employeeService.employeeList){
            if (employee.getId() == employeeId){
                receiveApplications.put(applicationId, employeeService.getEmployeeById(employeeId));
                System.out.println(" application received ");
            }
        }

    }

    public Map<String  , Employee> comformentApplication(){
        return receiveApplications;
    }
}
