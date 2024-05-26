package com.example.app5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController 
{
	@RequestMapping("upload1")//http://localhost:9090/upload1
	public String upload1(@RequestParam MultipartFile file1) throws Exception
	{
		byte[] fileContent = file1.getBytes();
		String fileName = file1.getOriginalFilename();
		
		FileOutputStream fout = new FileOutputStream(fileName);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(fileContent);
		bout.flush();
		bout.close();
		fout.close();
		return "Sucess";
	}

}
