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

    public ReceiveApplicationServiceImpl(ApplicationServiceImpl applicationService){
        this.applicationService = applicationService;

    }
    Map<Long  , Project> receiveApplications = new HashMap<>();


    @Override
    public void receiveApplication(long applicationId) {
        Application application = applicationService.getApplicationById(applicationId);
        receiveApplications.put(application.getId(),application.getProject());
    }

    public Map<Long , Project> comformentApplication(){
        return receiveApplications;
    }
}
