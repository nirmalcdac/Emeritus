package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}