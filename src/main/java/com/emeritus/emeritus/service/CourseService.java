package com.emeritus.emeritus.service;

import com.emeritus.emeritus.model.Course;

import java.util.List;
public interface CourseService {
    List<Course> getAllCourse();

    Course createCourse(Course course);

    Course getCourseById(String course_id);

    Course updateCourse(String course_id, Course courseDetails);

    void deleteCourse(String course_id);
}