package com.jobportal.Data;

import java.time.LocalDate;

public class Experience {
    private long id;
    private String title;
    private String company;
    private double duration;
    private LocalDate startingDate;
    private LocalDate endDate;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(int year, int mounth, int day) {
        this.startingDate = LocalDate.of(year, mounth, day);
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(int year, int mounth, int day) {
        this.endDate = LocalDate.of(year, mounth, day);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
