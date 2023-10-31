package com.jobportal.Service;

import com.jobportal.Data.Application;
import com.jobportal.Data.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReceiveApplicationService {

    void receiveApplication(String  applicationId , long employeeId);

}
