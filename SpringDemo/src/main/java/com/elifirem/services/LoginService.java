package com.elifirem.services;

import com.elifirem.config.AppConfig;
import org.apache.tomcat.util.descriptor.web.LoginConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {
    public void login() {}
    //user listesine ihtiyacım var
    //bean e erişiriz
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    UserService userService = context.getBean(UserService.class);
}
