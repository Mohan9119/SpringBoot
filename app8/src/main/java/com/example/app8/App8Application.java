package com.example.app8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App8Application implements CommandLineRunner
{

	public static void main(String[] args) 
	{
//		for(String s1 : args)
//		{
//			System.out.println(s1);
//		}
		SpringApplication.run(App8Application.class, args);
	}
	//http://localhost:1010/mail

	@Override
	public void run(String... args) throws Exception 
	{
		for(String s1 : args)
			{
				System.out.println(s1);
			}
		
		
	}
}
/*
 InOrder to run Command Line Aur uin the no Static context we will use ComandLIneAur
 
 
 
 
 */
