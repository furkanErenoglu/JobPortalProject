package com.jobportal.Service;

import com.jobportal.Data.Profile;

import java.util.ArrayList;
import java.util.List;

public interface ProfileService {
    void createProfile(Profile profile);
    Profile getProfileById(long profileId);

    List<Profile> getProfileList();

    void createSkills(long ProfileId ,String skills);
}
