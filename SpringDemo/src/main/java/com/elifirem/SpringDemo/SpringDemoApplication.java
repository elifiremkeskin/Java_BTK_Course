package com.elifirem.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {
//bu classı runlayınca uygulama çalışır. containerdaki nesnelerin oluşur
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
