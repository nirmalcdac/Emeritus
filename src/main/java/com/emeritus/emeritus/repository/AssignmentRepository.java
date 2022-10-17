package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, String> {
    List<Assignment> findByActiveTrue();
}