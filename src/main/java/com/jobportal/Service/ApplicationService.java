package com.jobportal.Service;

import com.jobportal.Data.Application;

import java.util.List;

public interface ApplicationService {

    void toApply(long employeeId, long applicationId) throws Exception;
    void addApplication(Application application, long emloyerId) throws Exception;
    Application getApplicationById(long applicationId) throws Exception;


}
