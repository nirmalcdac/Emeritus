package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.model.StudentCourseMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SCMRepository extends JpaRepository<StudentCourseMapping, String> {
    List<StudentCourseMapping> findByActiveTrue();
}