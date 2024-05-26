package com.example.app3;
// output to get through ARC
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MohanJavaController 
{
	@RequestMapping("s1")
	public String savel(@RequestBody Person person)
	{
		System.out.println(person.getFirstName());
		System.out.println(person.getLasttName());
		System.out.println(person.getAge());
		return "sucess from savel";
		//  http://localhost:1010/s1
	}
	/*
	 {
		 "firstName": "Ramu",
		 "lasttName": "Roa",
		 "age": 22
	 } 
	 */
	
	@RequestMapping("s3")
	public String save3(@RequestBody Person person)
	{
		System.out.println(person.getFirstName());
		System.out.println(person.getLasttName());
		System.out.println(person.getAge());
		return "sucess from save3";
		//  http://localhost:1010/s3
	}
	
	/*
	 {
	 1
		 "firstName": "Ramu",
		 "lasttName": "Roa",
		 "age": 22
		} 
		 
	 2	 
	 {
		 "address": "btm"
	 } 
	 */

	
// Json (Java Script Object Notation)	
// POSTMAN
// ARC (AdvancedRstClient)
// browser plugins
}

