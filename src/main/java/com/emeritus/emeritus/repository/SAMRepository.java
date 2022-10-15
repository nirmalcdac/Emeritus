package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.StudentAssignmentMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SAMRepository extends JpaRepository<StudentAssignmentMapping, String> {
}