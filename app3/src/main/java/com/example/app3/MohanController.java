package com.example.app3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class MohanController 
{
	@RequestMapping("h1")		// http://localhost:1010/h1
	public String hello1()
	{
	System.out.println("from hello1");
	return "i am from hello1";
	}
	
		@RequestMapping("h2/{arg1}")  // http://localhost:1010/h2/sai
		public String hello2(@PathVariable String arg1)
		{
			System.out.println("from hello2:" + arg1);
			return "i am from hello2:" + arg1;
		}
		
		
		@RequestMapping("h3/{arg1}")  // http://localhost:1010/h3/123
		public String hello3(@PathVariable int arg1)
		{
			System.out.println("from hello3:" + arg1);
			return "i am from hello3:" + arg1;
		}       
		
		
		@RequestMapping("h4/{mohan}/{krishna}")  // http://localhost:1010/h4/10/xyz
		public String hello4(@PathVariable int mohan, @PathVariable String krishna)
		{
			System.out.println("from hello4:" + mohan + "," + krishna);
			return "i am from hello4:" + mohan + "," + krishna ;
		}
		
		
		@RequestMapping("h5/firstName/{mohan}/lastName/{krishna}")  // http://localhost:1010/h5/firstName/lara/lastName/btm
		public String hello5(@PathVariable String mohan, @PathVariable String krishna)
		{
			System.out.println("from hello5:" + mohan + "," + krishna);
			return "i am from hello5:" + mohan + "," + krishna ;
		}
		
		
		@RequestMapping("h6/firstName/{firstName}/lastName/{lastName}/age/{age}")  // http://localhost:1010/h6/firstName/chotabhim/lastName/hero/age/123
		public String hello6(@PathVariable String FirstName, @PathVariable String LastName, @PathVariable Integer age)
		{
			System.out.println("from hello6:" + FirstName + "," + LastName + "," + age);
			return "i am from hello6:" + FirstName + "," + LastName + "," + age ;
		}
		
		
		@RequestMapping("h7/firstName/{arg1}/lastName/{arg2}/age/{arg3}")  // http://localhost:1010/h7/FirstName/heman/LastName/mahesh/age/123
		public String hello7(@PathVariable ("arg1") String FirstName, @PathVariable("arg2") String LastName, @PathVariable("arg3") Integer age)
		{
			System.out.println("from hello7:" + FirstName + "," + LastName + "," + age);
			return "i am from hello7:" + FirstName + "," + LastName + "," + age ;
		}
		
		
		@RequestMapping("h8/{test}")
		public String hello8(@PathVariable("test") String firstName)
		{
			System.out.println(firstName);
			return "your first Name =" + firstName;
		}
		
		@RequestMapping("h9/{test}")
		public String hello9(@PathVariable(name = "test") String firstName)
		{
			System.out.println(firstName);
			return "your first Name :" + firstName;
		}
		
		@RequestMapping("h10/{test}")
		public String hello10(@PathVariable(value = "test") String firstName)
		{
			System.out.println(firstName);
			return "your first Name :" + firstName;
		}
		
		@RequestMapping("h12")
		public String hello12(@PathVariable(required = false) String firstName)
		{
			System.out.println(firstName);
			return "your first Name :" + firstName;
		}
	//	http://localhost:1010/h12
		
		@RequestMapping("h13")
		public String hello13(@PathVariable(required = false) int age)
		{
			System.out.println(age);
			return "your first Name :" + age;
		}
		
		//http://localhost:1010/h13
		@RequestMapping("h14")
		public String hello14(@PathVariable(required = false) Integer age)
		{
			System.out.println(age);
			return "your first Name :" + age;
		}
		//http://localhost:1010/h14
}
/* aur can be anything*/