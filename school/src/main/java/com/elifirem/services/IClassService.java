package com.elifirem.services;

import com.elifirem.entity.Class;

import java.util.List;

public interface IClassService {
    public Class saveClass(Class clazz);

    public List<Class> getAllClasses();
}
