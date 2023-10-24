package com.jobportal.Service;

import com.jobportal.Data.Project;
import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public interface ProjectService {
    void createdProject(Project project);
    Project getProjectById(long projectId);
}
