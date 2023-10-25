package com.jobportal.Service;

import com.jobportal.Data.Employer;

public interface EmployerService {
    Employer getEmployerById(long employerId);
    void addEmployer(Employer employer);
}
