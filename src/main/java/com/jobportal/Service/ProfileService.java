package com.jobportal.Service;

import com.jobportal.Data.Experience;
import com.jobportal.Data.Profile;

import java.util.ArrayList;
import java.util.List;

public interface ProfileService {
    void createProfile(Profile profile, long employeeId);
    Profile getProfileById(long profileId);
    void createSkills(long profileId ,String skills);

}
