package com.elifirem.services.impl;

import com.elifirem.entity.Teacher;
import com.elifirem.repository.TeacherRepository;
import com.elifirem.services.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
