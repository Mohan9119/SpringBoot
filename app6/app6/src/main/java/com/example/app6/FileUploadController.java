package com.example.app6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
public class FileUploadController 
{
	@RequestMapping("upload")//http://localhost:4040/upload
	public String upload(@RequestParam MultipartFile file1,  @RequestParam MultipartFile resume, @RequestParam MultipartFile profilepic, @RequestParam String firstName, @RequestParam Integer age ) throws Exception
	{
		String baseLocation = "src\\main\\resources\\static\\uploads";
		
		
		//process file1
		byte[] file1Content = file1.getBytes();
		String file1Name = file1.getOriginalFilename();
		FileOutputStream fout1 = new FileOutputStream(baseLocation + "\\" + file1Name);
		BufferedOutputStream bout1 =  new BufferedOutputStream(fout1);
		bout1.write(file1Content);
		bout1.flush();
		bout1.close();
		bout1.close();
		
		
		
		
		//process resume
		byte[] resumeContent = resume.getBytes();
		String resumeName = resume.getOriginalFilename();
		FileOutputStream fout2 = new FileOutputStream(baseLocation + "\\" + resumeName);
		BufferedOutputStream bout2 =  new BufferedOutputStream(fout2);
		bout2.write(resumeContent);
		bout2.flush();
		bout2.close();
		bout2.close();
		
		
		
		//process profilepic
		byte[] profilepicContent = profilepic.getBytes();
		String profilepicName = profilepic.getOriginalFilename();
		FileOutputStream fout3 = new FileOutputStream(baseLocation + "\\" + profilepicName);
		BufferedOutputStream bout3 =  new BufferedOutputStream(fout3);
		bout3.write(profilepicContent);
		bout3.flush();
		bout3.close();
		bout3.close();
		
		System.out.println(firstName);
		System.out.println(age);
		
		return "Sucess";
	}

}
