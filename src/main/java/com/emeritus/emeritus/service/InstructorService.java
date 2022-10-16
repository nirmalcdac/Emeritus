package com.emeritus.emeritus.service;

import com.emeritus.emeritus.model.Instructor;

import java.util.List;

public interface InstructorService {
    List<Instructor> getAllInstructor();

    Instructor createInstructor(Instructor instructor);

    Instructor getInstructorById(String instructorId);

    Instructor updateInstructor(String instructorId, Instructor instructorDetails);

    void deleteInstructor(String instructorId);
}