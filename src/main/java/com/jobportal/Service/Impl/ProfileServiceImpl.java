package com.jobportal.Service.Impl;

import com.jobportal.Service.ProfileService;
import com.jobportal.Data.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileServiceImpl implements ProfileService {

    private List<Profile> profileList = new ArrayList<>();
    private List<String > skills = new ArrayList<>();

    @Override
    public void createProfile(Profile profile) {
        profileList.add(profile);
        System.out.println("Profile created successfully");
    }

    @Override
    public Profile getProfileById(long profileId) {
        for (Profile profile : profileList) {
            if (profile.getId() == profileId) {
                return profile;
            }
        }
        return null;
        }

        @Override
        public List<Profile> getProfileList() {
            return profileList;
        }

    @Override
    public void createSkills(long profileId, String skills) {
        for (Profile profile : profileList){
            if (profile.getId() == profileId){
                getProfileById(profileId).getSkills().add(skills);
                System.out.println("Skill added");
            }
        }

    }

}

