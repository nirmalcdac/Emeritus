package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {
    List<Course> findByActiveTrue();
}