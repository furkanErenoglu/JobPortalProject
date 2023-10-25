package com.jobportal.Service.Impl;

import com.jobportal.Data.Employer;
import com.jobportal.Service.EmployerService;

import java.util.ArrayList;
import java.util.List;

public class EmployerServiceImpl implements EmployerService {
    private final List<Employer> employerList = new ArrayList<>();
    @Override
    public Employer getEmployerById(long employerId) {
        for (Employer employer:employerList){
            if (employer.getId() == employerId){
                return employer;
            }
        }
        return null;
    }

    @Override
    public void addEmployer(Employer employer) {
        employerList.add(employer);
        System.out.println("Employer added");
    }


}
