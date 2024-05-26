package com.example.app11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.File;
import java.io.FileInputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app1.Person;

@RestController
public class ResponeseEntityController 
{
	@RequestMapping("t1")// http://localhost:9090/t1  
	public ResponseEntity<String> test1()
	{
		System.out.println("test1");
		return new ResponseEntity("Sucess from Test1", HttpStatus.OK);
		
	}
	
		@RequestMapping("t2")// http://localhost:9090/t2
		public ResponseEntity<Integer> test2()
		{
			System.out.println("test2");
			return new ResponseEntity(2000, HttpStatus.OK);
			
		}
		
		@RequestMapping("t3")// http://localhost:9090/t3
		public ResponseEntity<List<String>> test3()
		{
			System.out.println("test3");
			List<String> list = new ArrayList();
			list.add("avg");
			list.add("bcg");
			list.add("xby");
			return new ResponseEntity(list, HttpStatus.OK);
			
		}
		
		
		@RequestMapping("t4")// http://localhost:9090/t4
		public ResponseEntity<Map<String, Integer>> test4()
		{
			System.out.println("test4");
			Map<String, Integer> map = new HashMap();
			map.put("asdf", 100);
			map.put("jkl", 101);
			map.put("yui", 123);
			map.put("mjk", 45);
			map.put("wer", 1);
			return new ResponseEntity(map, HttpStatus.OK);
		}
			@RequestMapping("t5")// http://localhost:9090/t5
			public ResponseEntity<Person> test5()
			{
				System.out.println("test5");
				Person p1 = new Person();
				p1.setFirstName("akjsd");
				p1.setAge(22);
				p1.setLastName("sai");
				return new ResponseEntity(p1, HttpStatus.OK);
				
		}
			
			@RequestMapping("t6")// http://localhost:9090/t6
			public ResponseEntity<List<Person>> test6()
			{
				System.out.println("test6");
				List<Person> persons = new ArrayList();
				Person p1 = new Person();
				p1.setFirstName("asdf");
				p1.setAge(23);
				p1.setLastName("jkl");
				persons.add(p1);
				
				Person p2 = new Person();
				p2.setFirstName("mohan");
				p2.setAge(25);
				p2.setLastName("krishna");
				persons.add(p2);
				ResponseEntity<List<Person>> responseEntity = new ResponseEntity(p1, HttpStatus.OK);
				return  responseEntity;
				
			}
			
			@RequestMapping("t7")// http://localhost:9090/t7
			public ResponseEntity<Double> test7()
			{
				ResponseEntity<Double> re =new ResponseEntity(1.5, HttpStatus.OK);
				return re;
			}
			
			@RequestMapping("t8")// http://localhost:9090/t8
			public ResponseEntity<Double> test8()
			{
				ResponseEntity<Double> re = new ResponseEntity (1.5, HttpStatus.OK);
				return re;
			}
			
			
			
			
			@RequestMapping("t9")// http://localhost:9090/t19
			public ResponseEntity<String> test9()
			{
				return  ResponseEntity.ok("HELLO MOHAN");
				
			}
			
			@RequestMapping("t10")// http://localhost:9090/t10
			public ResponseEntity<String> test10()
			{
				return  ResponseEntity.ok("HELLO MOHAN");
				
			}
			
			@RequestMapping("t11")// http://localhost:9090/t11
			public ResponseEntity<List<String>> test11()
			{
				List<String> list = new ArrayList();
				list.add("rama");
				list.add("sita");
				return  ResponseEntity.ok(list);
				
			}
			
			@RequestMapping("t12/{age}")// http://localhost:9090/t12/0
			public ResponseEntity<String> test12(@PathVariable Integer age)
			{
				ResponseEntity re = ResponseEntity.ok("valid age" + age);
				if(age <= 0)
				{
					re = ResponseEntity.badRequest().body("Invalid age" + age);
				}
			
				return  re;
				
			}
			
			@RequestMapping("t13/{YOB}")// http://localhost:9090/t13/2000  & http://localhost:9090/t13/2025
			public ResponseEntity<String> test13(@PathVariable Integer YOB)
			{
				ResponseEntity re = ResponseEntity.ok("valid YOB" + YOB);
				if(YOB > 2024)
				{
					re = ResponseEntity.badRequest().body("Invalid age" + YOB);
				}
				
				return  re;
				
			}
			
			@RequestMapping("t14")// http://localhost:9090/t14
			public ResponseEntity<String> test14()
			{
				return  ResponseEntity.ok("<h1>HELLO MOHAN<h1>");
				
			}
			
			@RequestMapping("t15")// http://localhost:9090/t15
			public ResponseEntity<String> test15()
			{
				return  ResponseEntity.ok().header("content-type", "text/plain").body("<h1>Heman To Batman</h1>");
				
			}
			
			int count = 0;
			@RequestMapping("t16")// http://localhost:9090/t16
			public ResponseEntity<String> test16()
			{
				count++;
				return  ResponseEntity.ok().header("refresh", "2").body("<h1>Heman To Batman:" + count + "</h1>");
				
			}
			
			
			@RequestMapping("t17")// http://localhost:9090/t17
			public ResponseEntity<String> test17()
			{
				HttpHeaders headers = new HttpHeaders();
				headers.add("content-type", "tex/plain");
				headers.add("refresh", "5");
				count++;
				return  ResponseEntity.ok().headers(headers).body("<h1>Hello Man:" + count + "</h1>");
				
			}
			
		
			@RequestMapping("t18")// http://localhost:9090/t18
			public ResponseEntity<Object> test18() throws Exception
			{
				HttpHeaders headers = new HttpHeaders();
				headers.add("content-disposition", "attachment;filename=test.txt");
				File f1 = new File("src\\main\\resources\\application.properties");
				FileInputStream fin = new FileInputStream(f1);
				InputStreamResource resource = new InputStreamResource(fin);
				return ResponseEntity.ok().headers(headers).body(resource);
			}

}
// respone , ststus , headers
