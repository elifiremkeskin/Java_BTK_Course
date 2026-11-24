package com.elifirem.services;

import com.elifirem.entity.Teacher;

import java.util.List;

public interface ITeacherService {
    public Teacher saveTeacher(Teacher teacher);

    public List<Teacher> getTeachers();
}
