package com.elifirem.controller.impl;

import com.elifirem.controller.IStudentController;
import com.elifirem.entity.Student;
import com.elifirem.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller olduğunu belirtmek için anotasyonu ekleriz. bu olmasa bean oluşmaz
@RestController
@RequestMapping("/rest/api/student")
//diğer metotları çağırmak için rest api metot adı yazarlar
//buraya ekleyince altta tanımladığın her metoda eklememiş olursun
public class RestStudentController implements IStudentController {

    //servis interface katmanının beanini enjekte ettik
    //bir sınıfın nesnesi türetildiğinde implement ettiği interfaceten enjekte edersin
    //class ile de yapabilirsin ama oop için doğrusu interfacei kullanmaktır
    @Autowired
    private IStudentService studentService;

    //normalde DTO kullanılır sonra yapıcaz, bu yanlış yöntem!!!!
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    //postmanden istek geldiğinde hangi metota gideceğini göstermek için anotasyon
    /*@GetMapping(path = "/student-list")
    public List<Student> getAllStudents() {
        return null;
    }*/
}
