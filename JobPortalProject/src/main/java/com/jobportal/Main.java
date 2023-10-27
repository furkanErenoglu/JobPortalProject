package com.jobportal;

import com.jobportal.Data.*;
import com.jobportal.Service.EmployerService;
import com.jobportal.Service.Impl.*;

public class Main {
    public static void main(String[] args) {

        EmployerServiceImpl employerService = new EmployerServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        ProjectServiceImpl projectService = new ProjectServiceImpl();
        ProfileServiceImpl profileService = new ProfileServiceImpl();
        ApplicationServiceImpl applicationService = new ApplicationServiceImpl(employeeService, projectService);
        ReceiveApplicationServiceImpl receiveApplicationService =new ReceiveApplicationServiceImpl(applicationService);

        Experience experience = new Experience();
        experience.setId(12356879);
        experience.setTitle("Back-end Developer");
        experience.setCompany("Red had");
        experience.setStartingDate(2022,1,12);
        experience.setEndDate(2023,5,23);
        experience.setDuration(1);

        Employer employer = new Employer();
        employer.setId(123456789);
        employer.setEmail("example@gmail.com");
        employer.setFullName("Jack Sparrow");
        employer.setExperience(experience);


        employerService.addEmployer(employer);

        Profile profile = new Profile();
        profile.setId(456123789);
        profile.setDepartment("Mathematics");
        profile.setEmail("example@gmail.com");
        profile.setUniversity("Eskisehir Technical University");
        profile.setBirthDate(1999,1,29);
        profile.setGraduationDate(2021,6,25);

        profileService.createSkills(456123789,"Time management");

        profileService.createProfile(profile);


        Employee employee = new Employee();
        employee.setId(321564789);
        employee.setEmail("example@gmail.com");
        employee.setFullName("Homelander");

        employeeService.createEmployee(employee);

        Project project = new Project();
        project.setId(741852963);
        project.setTitle("Flight Reservation System");
        project.setDescription("I want to hire a back-end developer for the Flight Reservation System");

        projectService.createdProject(project);

        Application application = new Application();
        application.setId(963852741);
        application.setProject(project);

        applicationService.toApply(321564789,741852963);





    }
}