package com.elifirem.main;

import com.elifirem.config.AppConfig;
import com.elifirem.model.User;
import com.elifirem.services.LoginService;
import com.elifirem.services.UserService;
import org.springframework.context.ApplicationContext;
//bu zaten application contexti extend ediyo o yüzden oop açısından üsttekini kullanabilirsin
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        //configurasyona erişmek için bu fonksiyonun içine erişmek istediğin configürasyonun sınıfını yazıyosun
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        for (User user : userService.getUserList()){
            //java classını olduğı gibi yazdırırsak adresi gelir
            //yazı gelmesi için classa gidip tostring eklenir
            System.out.println(user);
        }

        LoginService loginService = new LoginService();
        loginService.login();
        //bean kullandığımız için new demeyiz ve aynı listeye erişiriz
    }
}
