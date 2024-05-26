package com.example.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
	
	@RequestMapping("h1") // http://localhost:6060/h1
	public String hello()
	{
		System.out.println("Hello mohan");
		return "Hello from rest webservices ";
	}
}
