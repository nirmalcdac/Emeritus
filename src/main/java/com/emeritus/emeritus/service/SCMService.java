package com.emeritus.emeritus.service;

import com.emeritus.emeritus.model.Student;
import com.emeritus.emeritus.model.StudentCourseMapping;

import java.util.List;

public interface SCMService {
    List<StudentCourseMapping> getAllStudentCourseMapping();
}