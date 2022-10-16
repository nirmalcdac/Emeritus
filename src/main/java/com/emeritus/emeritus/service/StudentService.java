package com.emeritus.emeritus.service;
import com.emeritus.emeritus.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student createStudent(Student student);

    Student getStudentById(String studentId);

    Student updateStudent(String studentId, Student studentDetails);

    void deleteStudent(String studentId);
}