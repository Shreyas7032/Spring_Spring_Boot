package com.aadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApp1Application.class, args);
	}
	
	public String home()
	{
		return "<center><h1>This is my First Spring Boot App</h1></center>";
	}
}
