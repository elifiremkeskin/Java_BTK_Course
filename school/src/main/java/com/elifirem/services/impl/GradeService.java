package com.elifirem.services.impl;

import com.elifirem.entity.Class;
import com.elifirem.entity.Grade;
import com.elifirem.entity.GradeId;
import com.elifirem.entity.Student;
import com.elifirem.repository.ClassRepository;
import com.elifirem.repository.GradeRepository;
import com.elifirem.repository.StudentRepository;
import com.elifirem.services.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService implements IGradeService {
        @Autowired
        private GradeRepository gradeRepository;

        @Autowired
        private StudentRepository studentRepository;

        @Autowired
        private ClassRepository classRepository;

        @Override
        public Grade saveGrade(Grade grade) {
            // 1. JSON'dan gelen ID'leri al (İster id nesnesinin içinden, ister student/classs içinden gelsin)
            Integer studentId = (grade.getId() != null && grade.getId().getStudentId() != null)
                    ? grade.getId().getStudentId()
                    : grade.getStudent().getStudentId();

            Integer classId = (grade.getId() != null && grade.getId().getClassId() != null)
                    ? grade.getId().getClassId()
                    : grade.getClasss().getClassId();

            // 2. Veritabanından gerçek Student ve Class kayıtlarını bul
            Student existingStudent = studentRepository.findById(studentId)
                    .orElseThrow(() -> new RuntimeException("Öğrenci bulunamadı: " + studentId));

            Class existingClass = classRepository.findById(classId)
                    .orElseThrow(() -> new RuntimeException("Ders/Sınıf bulunamadı: " + classId));

            // 3. EmbeddedId (GradeId) nesnesini oluştur ve set et
            GradeId gradeId = new GradeId(studentId, classId);
            grade.setId(gradeId);

            // 4. Veritabanından çekilen dolu nesneleri Grade'e bağla (@MapsId için şart)
            grade.setStudent(existingStudent);
            grade.setClasss(existingClass);

            // 5. Kaydet
            return gradeRepository.save(grade);
        }

    @Override
    public List<Grade> getAllGrade(Grade grade) {
        return gradeRepository.findAll();
    }

}
