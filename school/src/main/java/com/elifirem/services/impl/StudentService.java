package com.elifirem.services.impl;

import com.elifirem.entity.Student;
import com.elifirem.repository.StudentRepository;
import com.elifirem.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //bu olmasa bean oluşmaz
public class StudentService implements IStudentService {

    @Autowired //reponun beanini enjekte ettik
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
        //jpa extend ettiğimiz için save metodunu kullanabiliyoruz
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Student deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
        return null;
    }


    @Override
    public Student updateStudent(Student student) {
        // 1. Önce güncellenecek öğrenci veritabanında var mı diye ID ile arıyoruz
        Optional<Student> optional = studentRepository.findById(student.getStudentId());

        // 2. Eğer öğrenci veritabanında mevcutsa güncelleme işlemini yapıyoruz
        if (optional.isPresent()) {
            Student dbStudent = optional.get(); // Veritabanındaki mevcut kaydı aldık

            // Kendi Student sınıfındaki alanlara (field) göre burayı doldurmalısın:
            dbStudent.setStudentName(student.getStudentName());
            dbStudent.setStudentSurname(student.getStudentSurname());
            dbStudent.setStudentNo(student.getStudentNo());

            // Güncellenmiş nesneyi save ile kaydediyoruz (ID olduğu için JPA update sorgusu atar)
            return studentRepository.save(dbStudent);
        }

        // 3. Öğrenci bulunamazsa null dönüyoruz
        return null;
    }

    /*public List<Student> getAllStudents() {
        //controllerın amacı bu isteği göndermeden önce kontrol yapmaktır
        studentRepository.getAllStudents();
        return null;
    }*/
}
