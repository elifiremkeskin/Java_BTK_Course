package com.elifirem.controller;

import com.elifirem.entity.Grade;

import java.util.List;

public interface IGradeController {
    public Grade saveGrade(Grade grade);
    public List<Grade> getAllGrade(Grade grade);
}
