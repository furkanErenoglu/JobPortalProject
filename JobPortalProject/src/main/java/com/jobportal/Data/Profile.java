package com.jobportal.Data;

import java.time.LocalDate;
import java.util.List;

public class Profile {
    private long id;
    private String university;
    private String department;
    private List<Project> projects;
    private LocalDate graduationDate;
    private LocalDate birthDate;
    private List<String> skills;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int year, int mounth, int day) {
        this.graduationDate = LocalDate.of(year, mounth, day);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int year, int mounth, int day) {
        this.birthDate = LocalDate.of(year, mounth, day);
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
