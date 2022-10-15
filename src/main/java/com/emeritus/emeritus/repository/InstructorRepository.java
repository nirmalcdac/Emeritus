package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, String> {
}