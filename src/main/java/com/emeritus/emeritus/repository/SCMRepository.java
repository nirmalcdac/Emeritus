package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.StudentCourseMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SCMRepository extends JpaRepository<StudentCourseMapping, String> {
}