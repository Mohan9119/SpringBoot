package com.example.app7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;

@RestController
public class MainController 
{
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping("mail")
	public String mail()
	{
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("mohankrishnasai63@gmail.com");
		msg.setSubject("Testing from Spring Boot");
		msg.setText("Hello World \n Spring Boot Email");
		javaMailSender.send(msg);
		return "success";
	}
	
	@RequestMapping("mail2")
	public String mail2() throws Exception
	{
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo("mohankrishnasai63@gmail.com");
		helper.setSubject("Testing from SpringBoot Mohan");
		helper.setText("<h1>Hellow \n Mohan Email <h1>", true);
		
		javaMailSender.send(message);
		return "sucess";
	}
}
