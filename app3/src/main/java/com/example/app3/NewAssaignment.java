package com.example.app3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class NewAssaignment 
{	
	@SpringBootApplication
	@RestController
	public class App2Application 
	{

		public static void main(String[] args) 
		{
			SpringApplication.run(App2Application.class, args);
		}
		@RequestMapping("z1") // http://localhost:1010/z1
		public int test1()
		{
			System.out.println("i am from Int");
			return 999;
		}
		@RequestMapping("z2") // http://localhost:1010/z2
		public String test2()
		{
			System.out.println("i am from String");
			return "I AM UNSTOPABLE";
		}
		@RequestMapping("z3") // http://localhost:1010/z3
		public Double test3()
		{
			System.out.println("Double");
			return 6.9;
		}
		@RequestMapping("z4") // http://localhost:1010/z4
		public Boolean test4()
		{
			System.out.println("i am from boolean");
			return true;
		}
		@RequestMapping("z5") // http://localhost:1010/z5
		public char test5()
		{
			System.out.println("char");
			return '$';
		}
		@RequestMapping("z6") // http://localhost:1010/z6
		public Integer test6()
		{
			System.out.println("Integer");
			return 06;
		}
		@RequestMapping("z7") // http://localhost:1010/z7
		public int [] test7()
		{
			System.out.println("int");
			int[] nums = {3, 6, 9};
			return nums;
		}
		@RequestMapping("z8") // http://localhost:1010/z8
		public String[] test8()
		{
			System.out.println("String");
			String[] names = {"hari", "giri", "ram"};
			return names;
		}
		@RequestMapping("z9") // http://localhost:1010/z9
		public List<Integer> test9()
		{
			System.out.println("LIST");
			List<Integer> list = new ArrayList();
			list.add(33);
			list.add(22);
			list.add(11);
			list.add(100);
			list.add(369);		
			return list;
		}

	@RequestMapping("z10") // http://localhost:1010/z10
	public Set<Integer> test10()
	{
		System.out.println("SET");
		Set<Integer> set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(10);		
		return set;
	}
		
		
		@RequestMapping("z11") // http://localhost:1010/z11
		public Map<String, Integer> test11()
		{
			System.out.println("MAP");
			Map<String, Integer> map = new HashMap();
			map.put("xyz", 90);
			map.put("lara", 60);
				
			return map;
		}
		@RequestMapping("z12") // http://localhost:1010/z12
		public List<Person> test12()
		{
			System.out.println("i am from z12 ListPerson");
			List<Person> list = new ArrayList();
			Person m1 = new Person();
			m1.setFirstName("VIRAT");
			m1.setLasttName("KOHLI");
			m1.setAge(33);
			
		
			Person m2 = new Person();
			m2.setFirstName("MS");
			m2.setLasttName("DHONI");
			m2.setAge(25);
			
			list.add(m1);
			list.add(m2);
			
			return list;
		}
		@RequestMapping("z13") // http://localhost:1010/z13
		public void test13()
		{
			System.out.println("404 = VOID");
		}
		

	}


}
