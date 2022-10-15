package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, String> {
}