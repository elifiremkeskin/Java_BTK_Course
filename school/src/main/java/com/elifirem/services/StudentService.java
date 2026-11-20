package com.elifirem.services;

import com.elifirem.entity.Student;
import com.elifirem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bu olmasa bean oluşmaz
public class StudentService {

    @Autowired //reponun beanini enjekte ettik
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        //controllerın amacı bu isteği göndermeden önce kontrol yapmaktır
        studentRepository.getAllStudents();
        return null;
    }
}
