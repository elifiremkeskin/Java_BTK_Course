package com.elifirem.controller.impl;

import com.elifirem.controller.ITeacherController;
import com.elifirem.entity.Teacher;
import com.elifirem.services.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/teacher")
public class RestTeacherController implements ITeacherController {

    @Autowired
    private ITeacherService teacherService;

    @PostMapping("/save")
    @Override
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/list")
    @Override
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }
}
