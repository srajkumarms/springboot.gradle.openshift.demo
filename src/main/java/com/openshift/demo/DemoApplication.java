package com.openshift.demo;

import com.openshift.demo.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("srajkumarms");
		System.out.println("Starting Spring Boot Application");
		SpringApplication.run(DemoApplication.class, args);
	}
}
