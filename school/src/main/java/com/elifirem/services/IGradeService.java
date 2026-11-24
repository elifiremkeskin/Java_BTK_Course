package com.elifirem.services;

import com.elifirem.entity.Grade;

import java.util.List;

public interface IGradeService {
    public Grade saveGrade(Grade grade);
    public List<Grade> getAllGrade(Grade grade);
}
