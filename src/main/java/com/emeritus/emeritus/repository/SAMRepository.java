package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.model.StudentAssignmentMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SAMRepository extends JpaRepository<StudentAssignmentMapping, String> {
    List<StudentAssignmentMapping> findByActiveTrue();
}