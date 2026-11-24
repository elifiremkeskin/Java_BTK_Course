package com.elifirem.controller;

import com.elifirem.entity.Student;

import java.util.List;

//controller sınıfları doğrudan metot içermez
//interfacelerden implemente ederler
public interface IStudentController {
    //dısarıdan bir adet student alıp kaydetmesi için
    //DTO : postman servise istek atar 50 tane fieldin vardır sen 30unu dönmek istersin
    //student sınıfını dönmezsin DTO sınıfı oluşturursun
    //DTO istediğin fieldların içine girip dışarı çıkmasını sağlar
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public Student deleteStudentById(Integer id);
    public Student updateStudent(Student student);
}
