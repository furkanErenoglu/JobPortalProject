package com.jobportal.Service;

import com.jobportal.Data.Application;

import java.util.List;

public interface ApplicationService {

    void toApply(long employeeId, long projectId);
    void addApplication(long applicationId);
    Application getApplicationById(long applicationId);


}
