package com.elifirem.services;

import com.elifirem.entity.Student;

//service sınıfları doğrudan metot içermez
//interfacelerden implemente ederler
public interface IStudentService {
    public Student saveStudent(Student student);
}
