package com.jobportal.Service;

import com.jobportal.Data.Application;

public interface ApplicationService {

    void toApply(long employeeId, long applicationId) throws Exception;
    void createApplication(Application application, long emloyerId) throws Exception;
    Application getApplicationById(long applicationId) throws Exception;


}
