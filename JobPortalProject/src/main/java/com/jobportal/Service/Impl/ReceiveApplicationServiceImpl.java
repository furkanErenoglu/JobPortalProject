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
    private ApplicationServiceImpl applicationService;

    public ReceiveApplicationServiceImpl(ApplicationServiceImpl applicationService){
        this.applicationService = applicationService;

    }
    Map<String , Project> receiveApplications = new HashMap<>();


    @Override
    public void receiveApplication(long applicationId) {

        receiveApplications.put(applicationService.applicants(),)

    }
}
