package com.jobportal.Service.Impl;

import com.jobportal.Data.Employee;
import com.jobportal.Data.Experience;
import com.jobportal.Service.ProfileService;
import com.jobportal.Data.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileServiceImpl implements ProfileService {
    private EmployeeServiceImpl employeeService;

    public ProfileServiceImpl(EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }

    private List<Profile> profileList = new ArrayList<>();

    @Override
    public void createProfile(Profile profile, long employeeId) {
        Employee employee = employeeService.getEmployeeById(employeeId);
        if (employee != null){
            profileList.add(profile);

            employee.setProfile(profile);
            System.out.println("Profile created successfully");
        }else {
            System.out.println("Employee not found for id: " + employeeId);
        }

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

