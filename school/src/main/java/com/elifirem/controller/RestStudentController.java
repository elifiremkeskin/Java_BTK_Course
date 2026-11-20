package com.elifirem.controller;

import com.elifirem.entity.Student;
import com.elifirem.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//controller olduğunu belirtmek için anotasyonu ekleriz. bu olmasa bean oluşmaz
@RestController
@RequestMapping("/rest/api") //diğer metotları çağırmak için rest api metot adı yazarlar
//buraya ekleyince altta tanımladığın her metoda eklememiş olursun
public class RestStudentController {

    //servis katmanının beanini enjekte ettik
    @Autowired
    private StudentService studentService;

    //postmanden istek geldiğinde hangi metota gideceğini göstermek için anotasyon
    @GetMapping(path = "/student-list")
    public List<Student> getAllStudents() {
        return null;
    }
}
