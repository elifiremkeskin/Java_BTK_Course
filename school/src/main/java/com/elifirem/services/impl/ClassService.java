package com.elifirem.services.impl;

import com.elifirem.entity.Class;
import com.elifirem.entity.Teacher;
import com.elifirem.repository.ClassRepository;
import com.elifirem.repository.TeacherRepository;
import com.elifirem.services.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {

    //repo bean enjekte et
    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    //interface overridela
    @Override
    public Class saveClass(Class clazz) {
        if (clazz.getTeacher() != null && clazz.getTeacher().getTeacherId() != null) {
            // Veritabanından gerçek öğretmeni tüm bilgileriyle çekiyoruz
            Teacher existingTeacher = teacherRepository.findById(clazz.getTeacher().getTeacherId())
                    .orElseThrow(() -> new RuntimeException("Öğretmen bulunamadı!"));

            // Dolu nesneyi sınıfa atıyoruz
            clazz.setTeacher(existingTeacher);
        }
        return classRepository.save(clazz);
    }

    @Override
    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }
}
