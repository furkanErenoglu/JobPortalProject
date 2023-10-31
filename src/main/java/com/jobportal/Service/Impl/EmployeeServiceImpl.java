package com.jobportal.Service.Impl;

import com.jobportal.Data.Employee;
import com.jobportal.Service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee getEmployeeById(long employeeId) {
        for (Employee employee : employeeList){
            if (employee.getId() == employeeId){
                return employee;
            }
        }
        return null;

    }

    @Override
    public void createEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added");
    }
}
