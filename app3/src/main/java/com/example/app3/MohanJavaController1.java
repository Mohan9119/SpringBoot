package com.example.app3;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class MohanJavaController1
	{
		@RequestMapping("s2")
		public String savel2(@RequestBody Employee employee)
		{
		
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println(employee.getWeigth());
			return "sucess from save2";
			//  http://localhost:1010/s2
		}
		/*
		 {
			 "Name": "chiru",
			 Salary: 59900,
			 Weigth: 78
		 } 
		 */
	}

