package com.jobportal.Service.Impl;

import com.jobportal.Data.Experience;
import com.jobportal.Data.Profile;
import com.jobportal.Service.ExperienceService;
import com.jobportal.Service.ProfileService;

import java.util.ArrayList;
import java.util.List;

public class ExperienceServiceImp implements ExperienceService {
    private ProfileServiceImpl profileService;
    public ExperienceServiceImp(ProfileServiceImpl profileService){
        this.profileService = profileService;
    }
    private final List<Experience> experienceList = new ArrayList<>();
    @Override
    public Experience getExperienceById(long experienceId) {
        for (Experience experience : experienceList){
            if (experience.getId() == experienceId){
                return experience;
            }
        }
        return null;
    }

    @Override
    public void addExperience(Experience experience, long profileId) {
        for(Profile profile : profileService.getProfileList()){
            if (profile.getId() == profileId){
                profileService.getProfileById(profileId).getExperiences().add(experience);
                System.out.println("Experience added");
            }
        }




    }


}
