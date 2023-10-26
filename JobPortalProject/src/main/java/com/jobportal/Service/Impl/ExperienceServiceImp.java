package com.jobportal.Service.Impl;

import com.jobportal.Data.Experience;
import com.jobportal.Service.ExperienceService;

import java.util.ArrayList;
import java.util.List;

public class ExperienceServiceImp implements ExperienceService {
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



}
