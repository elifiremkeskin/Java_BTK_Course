package com.elifirem.services;

import com.elifirem.entity.Student;

import java.util.List;

//service sınıfları doğrudan metot içermez
//interfacelerden implemente ederler
public interface IStudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public Student deleteStudentById(Integer id);
    public Student updateStudent(Student student);
}
