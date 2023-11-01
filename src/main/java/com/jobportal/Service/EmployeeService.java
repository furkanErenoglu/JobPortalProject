package com.jobportal.Service;

import com.jobportal.Data.Employee;

public interface EmployeeService {

    Employee getEmployeeById(long employeeId);

    void createEmployee(Employee employee);
}
