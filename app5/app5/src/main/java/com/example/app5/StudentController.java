package com.example.app5;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@RequestMapping("Student")
	public String save(@RequestBody Student student)
	{
		System.out.println(student.getFirstName());
		System.out.println(student.getLasttName());
		System.out.println(student.getAge());
		System.out.println(student.getEmailAccounts());
		System.out.println(student.getMobileNumber());
		System.out.println(student.getEducation());
		System.out.println(Arrays.toString(student.getProjects()));
		Address address = student.getAddress();
		System.out.println(address.getHouseNo());
		System.out.println(address.getStreetName());
		System.out.println(address.getCity());

		
		return "Sucess";
	}

}
/*
 
 	{
	 	"firstName": "Ram",
	 	"lastName": "Reddy",
	 	"age": 27,
	 	"projects": ["e-comerce", "lms", "product management"],
	 	"mobileNumbers": [9845098450, 8596585965],
	 	"emailAccounts": ["ram@gmail.com","ramds@gmail.com"],
	 	"educations": {"ug": "BE", "pg": "ME"},
	 	"address":{
	 		"houseNo": "123/N",
	 		"streetName": "BTM",
	 		"city": "Bangalore"
	 	}
	 	}

*/