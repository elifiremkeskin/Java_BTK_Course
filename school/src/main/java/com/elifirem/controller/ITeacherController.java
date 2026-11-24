package com.elifirem.controller;

import com.elifirem.entity.Teacher;

import java.util.List;

public interface ITeacherController {
    public Teacher saveTeacher(Teacher teacher);
    public List<Teacher> getTeachers();
}
