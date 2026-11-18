package com.elifirem.config;

import com.elifirem.model.User;
import com.elifirem.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//bunun bir configurasyon sınıfı olduğunu ekleriz
@Configuration
public class AppConfig {
    //stereotype anatasyonlar:
    //RestController, Repository, Service..
    //ama bugün bean yöntemiyle containera ekleme yapıcaz
    //spring containerda buna bean oluşturucaz
    @Bean
    public UserService userService(){
        //void değil userservice döndürüyoruz
        UserService userService1 = new UserService();

        List<User> userList =  new ArrayList<>();
        userList.add(new User("Elif", "İrem"));
        userList.add(new User("kou", "zen"));

        userService1.setUserList(userList);

        return userService1;
    }
}
