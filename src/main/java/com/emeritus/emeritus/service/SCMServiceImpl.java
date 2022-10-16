package com.emeritus.emeritus.service;

import com.emeritus.emeritus.model.StudentCourseMapping;
import com.emeritus.emeritus.repository.SCMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SCMServiceImpl implements SCMService {
    @Autowired
    private final SCMRepository scmRepository;

    public SCMServiceImpl(SCMRepository scmRepository) {
        this.scmRepository = scmRepository;
    }

    @Override
    public List<StudentCourseMapping> getAllStudentCourseMapping() {
//        return scmRepository.findAll();
        return scmRepository.findAllActiveUsersNative();
//        findAllActiveUsersNative
    }
}