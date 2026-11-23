package com.elifirem.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//springbootapplication dosyam controller entity ve repo dosyalarıyla aynı pakette olmadığı
// için onların ayriyeten taranmasını sağlayan anotasyonlar ekleriz. ya da paketi taşırsın falan ama onu boşver
@ComponentScan(basePackages = {"com.elifirem"})
@EntityScan(basePackages = {"com.elifirem"})
@EnableJpaRepositories(basePackages = {"com.elifirem"})
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
}
