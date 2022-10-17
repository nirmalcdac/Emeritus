package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.AppUser;
import com.emeritus.emeritus.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    List<Student> findByActiveTrue();
}