package com.example.app3;
// ? after this mark we are providing QueryString
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestC
public class IamtheController 
{
	@RequestMapping("r1")
	public String test1(@RequestParam String param)
	{
		System.out.println("from Test1");
		return "i am frm Test1 with: " + param;
	}
	// http://localhost:1010/r1?param=hello
	// http://localhost:1010/r1?param=20
	// http://localhost:1010/r1?param=3.6
	// http://localhost:1010/r1?param=true
	// http://localhost:1010/r1?param='&'

	
	@RequestMapping("r2")
	public String test2(@RequestParam String param1, @RequestParam String param2 )
	{
		System.out.println("from Test2");
		return "i am frm Test2 with: " + param1 + "and" + param2;
	}
	
		// http://localhost:1010/r2?param2=hello&param2=test 
		// http://localhost:1010/r2?param1=10&param2=2.3
		// http://localhost:1010/r2?param1=true&param2=false
		// http://localhost:1010/r2?param1='$'&param2="test"
	
	
	@RequestMapping("r3")
	public String test3(@RequestParam Integer age, @RequestParam String param2 )
	{
		System.out.println("from Test3");
		return "i am frm Test3 with: " + age + "and" + param2;
	}
	
	// http://localhost:1010/r3?age=40&param2=test 
	// http://localhost:1010/r3?age=40&param2='%'
	// http://localhost:1010/r3?age=40&param2=test 
	
	
	@RequestMapping("r4")
	public String test4(@RequestParam ("firstName") String s1)
	{
		System.out.println("from Test4");
		return "i am frm Test4 with: " + s1;
	}
	// http://localhost:1010/r4?firstName=Anunska
	// http://localhost:1010/r4?firstName=samantha
	
	
	@RequestMapping("r5")
	public String test5(@RequestParam (value = "firstName") String s1)
	{
		System.out.println("from Test5");
		return "i am frm Test5 with: " + s1;
	}
		// http://localhost:1010/r5?firstName=Anunska
		// http://localhost:1010/r5?firstName=sama
		
	
	@RequestMapping("r6")
	public String test6(@RequestParam (name = "firstName") String s1)
	{
		System.out.println("from Test6");
		return "i am frm Test6 with: " + s1;
	}
			// http://localhost:1010/r6?firstName=Anunska
			// http://localhost:1010/r6?firstName=samantha
	
	@RequestMapping("r7")
	public String test7(@RequestParam  String s1)
	{
		System.out.println("from Test7");
		return "i am frm Test7 with: " + s1;
	}
	// http://localhost:1010/r7
	
	
	@RequestMapping("r8")
	public String test8(@RequestParam(required = false)  String s1)
	{
		System.out.println("from Test8");
		return "i am frm Test7 with: " + s1;
	}
	// http://localhost:1010/r8
	// http://localhost:1010/r8?s1=hello
	
	
	@RequestMapping("r9")
	public String test9(@RequestParam(required = true)  String s1)
	{
		System.out.println("from Test9");
		return "i am frm Test9 with: " + s1;
	}
	// http://localhost:1010/r9
	// http://localhost:1010/r9?s1=hello
	
	@RequestMapping("r10")
	public String test10(@RequestParam(required = false) int s1)
	{
		System.out.println("from Test10");
		return "i am frm Test10 with: " + s1;
	}
	// http://localhost:1010/r10
	// http://localhost:1010/r10?s1=369
	//null cant be premitive
	
	
	@RequestMapping("r11")
	public String test11(@RequestParam(required = false) Integer s1)
	{
		System.out.println("from Test11");
		return "i am frm Test11 with: " + s1;
	}
	// http://localhost:1010/r11
	// http://localhost:1010/r11?s1=303
	
	
	@RequestMapping("r12")
	public String test12(@RequestParam(defaultValue = "123") Integer s1)
	{
		System.out.println("from Test12");
		return "i am frm Test12 with: " + s1;
	}
	// http://localhost:1010/r12
	// http://localhost:1010/r12?s1=456
	
	
	@RequestMapping("r13")
	public String test13(@RequestParam(defaultValue = "abc") String s1)
	{
		System.out.println("from Test13");
		return "i am frm Test13 with: " + s1;
	}
	// http://localhost:1010/r13
	// http://localhost:1010/r13?s1=Hamuman

	
	
	
}
