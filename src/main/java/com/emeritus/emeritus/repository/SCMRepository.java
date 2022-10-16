package com.emeritus.emeritus.repository;

import com.emeritus.emeritus.model.StudentCourseMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface SCMRepository extends JpaRepository<StudentCourseMapping, String> {

    @Query(
            value = "SELECT * FROM StudentCourseMapping scm WHERE scm.is_active = 1",
//            value = "SELECT * FROM USERS u WHERE u.status = 1",
            nativeQuery = true)
    List<StudentCourseMapping> findAllActiveUsersNative();

}