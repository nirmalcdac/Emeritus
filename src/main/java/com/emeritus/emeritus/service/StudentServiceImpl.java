package com.emeritus.emeritus.service;

import com.emeritus.emeritus.exception.ResourceNotFoundException;
import com.emeritus.emeritus.model.Student;
import com.emeritus.emeritus.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found for given id" + studentId));
    }
    @Override
    public Student updateStudent(String studentId, Student studentDetails) {
        Student updateStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found for given id" + studentId));
        updateStudent.setStudentFirstName(studentDetails.getStudentFirstName());
        updateStudent.setStudentLastName(studentDetails.getStudentLastName());
        updateStudent.setAppUser(studentDetails.getAppUser());
        updateStudent.setCreatedBy(studentDetails.getCreatedBy());
        updateStudent.setUpdatedBy(studentDetails.getUpdatedBy());
        updateStudent.setCreatedAt(studentDetails.getCreatedAt());
        updateStudent.setUpdatedAt(studentDetails.getUpdatedAt());
        updateStudent.setIsActive(studentDetails.getIsActive());
        studentRepository.save(updateStudent);
        return updateStudent;
    }

    @Override
    public void deleteStudent(String studentId) {
        Student deleteStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found for given id" + studentId));
        studentRepository.delete(deleteStudent);
    }
}