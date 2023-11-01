package com.jobportal.Service;

import com.jobportal.Data.Experience;

public interface ExperienceService {
    Experience getExperienceById(long experienceId);
    void addExperience(Experience experience, long profileId);
}
