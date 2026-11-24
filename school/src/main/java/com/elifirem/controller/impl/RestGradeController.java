package com.elifirem.controller.impl;

import com.elifirem.controller.IGradeController;
import com.elifirem.entity.Grade;
import com.elifirem.services.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/grade")
public class RestGradeController implements IGradeController {

    @Autowired
    private IGradeService gradeService;

    @PostMapping("/save")
    @Override
    public Grade saveGrade(@RequestBody Grade grade) {
        return gradeService.saveGrade(grade);
    }

    @GetMapping("/list")
    @Override
    public List<Grade> getAllGrade(Grade grade) {
        return gradeService.getAllGrade(grade);
    }
}
