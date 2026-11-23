package com.elifirem.services.impl;

import com.elifirem.entity.Student;
import com.elifirem.repository.StudentRepository;
import com.elifirem.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bu olmasa bean oluşmaz
public class StudentService implements IStudentService {

    @Autowired //reponun beanini enjekte ettik
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
        //jpa extend ettiğimiz için save metodunu kullanabiliyoruz
    }

    /*public List<Student> getAllStudents() {
        //controllerın amacı bu isteği göndermeden önce kontrol yapmaktır
        studentRepository.getAllStudents();
        return null;
    }*/
}
