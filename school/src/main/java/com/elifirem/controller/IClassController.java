package com.elifirem.controller;
import com.elifirem.entity.Class;

import java.util.List;

public interface IClassController {
    public Class saveClass(Class clazz);

    public List<Class> getAllClasses();
}
