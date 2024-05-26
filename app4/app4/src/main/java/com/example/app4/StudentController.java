package com.example.app4;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@RequestMapping("Student")//http://localhost:9090/Student
	public String saveStudent(@RequestBody Student student)
	{
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getAge());
		System.out.println(student.getEmailAccounts());
		System.out.println(student.getMobileNumber());
		System.out.println(student.getAddress());
		System.out.println(student.getEducation());
		System.out.println(Arrays.toString(student.getProjects()));
		Address adress = student.getAddress();
		System.out.println(Adress.getHouseNo());
		System.out.println(Adress.getStreetName());
		return "sucess";
		
	}
	
}

/*
	{
		"FirstName": "Sai",
		"LastName": "Jai",
		"age": 32,
		"projects": ["e-commerce", "lms", "hospital management"],
		"emailAccount": ["ramu@gmail.com", "ramurao@gmail.com"],
		"MobileNumber": [9846516484, 8756165145],
		"Education": {	"degree": "BE",
						"post-degree": "ME"
						
			
					},
		"address":{
						"houseNo": "123/M",
						"streetName": "BTM",
						"city": "Bangalore"
						
					}
	}
*/