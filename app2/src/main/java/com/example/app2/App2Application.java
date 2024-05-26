package com.example.app2;

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

@SpringBootApplication
@RestController
public class App2Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(App2Application.class, args);
	}
	@RequestMapping("t1") // http://localhost:7070/t1
	public int test1()
	{
		System.out.println("i am from Int");
		return 999;
	}
	@RequestMapping("t2") // http://localhost:7070/t2
	public String test2()
	{
		System.out.println("i am from String");
		return "SAI IAS";
	}
	@RequestMapping("t3") // http://localhost:7070/t3
	public Double test3()
	{
		System.out.println("Double");
		return 3.4;
	}
	@RequestMapping("t4") // http://localhost:7070/t4
	public Boolean test4()
	{
		System.out.println("i am from boolean");
		return true;
	}
	@RequestMapping("t5") // http://localhost:7070/t5
	public char test5()
	{
		System.out.println("char");
		return 't';
	}
	@RequestMapping("t6") // http://localhost:7070/t6
	public Integer test6()
	{
		System.out.println("Integer");
		return 40;
	}
	@RequestMapping("t7") // http://localhost:7070/t7
	public int [] test7()
	{
		System.out.println("int");
		int[] nums = {1, 6, 9, 0};
		return nums;
	}
	@RequestMapping("t8") // http://localhost:7070/t8
	public String[] test8()
	{
		System.out.println("String");
		String[] names = {"ramu", "sai", "hai"};
		return names;
	}
	@RequestMapping("t9") // http://localhost:7070/t9
	public List<Integer> test9()
	{
		System.out.println("LIST");
		List<Integer> list = new ArrayList();
		list.add(90);
		list.add(60);
		list.add(30);
		list.add(100);
		list.add(10);		
		return list;
	}

@RequestMapping("t10") // http://localhost:7070/t10
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
	
	
	@RequestMapping("t11") // http://localhost:7070/t11
	public Map<String, Integer> test11()
	{
		System.out.println("MAP");
		Map<String, Integer> map = new HashMap();
		map.put("abc", 90);
		map.put("asd", 60);
		map.put("iusbdc", 90);
		map.put("askdhcb", 10);
		map.put("asdaad", 10);		
		return map;
	}
	@RequestMapping("t12") // http://localhost:7070/t12
	public List<Person> test12()
	{
		System.out.println("i am from t12 ListPerson");
		List<Person> list = new ArrayList();
		Person p1 = new Person();
		p1.setFirstName("mohan");
		p1.setLastName("sai");
		p1.setAge(23);
		
	
		Person p2 = new Person();
		p2.setFirstName("krishna");
		p2.setLastName("mano");
		p2.setAge(25);
		
		list.add(p1);
		list.add(p2);
		
		return list;
	}
	@RequestMapping("t13") // http://localhost:7070/t13
	public void test13()
	{
		System.out.println("15 = VOID");
	}
	

}
