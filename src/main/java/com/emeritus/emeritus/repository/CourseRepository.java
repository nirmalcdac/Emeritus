package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}