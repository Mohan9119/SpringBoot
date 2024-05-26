package com.example.app10;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.app9.Person;

@RestController
public class PersonController 
{
	@RequestMapping("upload")
	public String upload(@RequestParam MultipartFile file) throws Exception
	{
		byte[] fileContent = file.getBytes();
		String fileName = file.getOriginalFilename();
		String baseLocation = "src\\main\\resources\\static\\uploads";
		

		FileOutputStream fout = new FileOutputStream(baseLocation + "/" + fileName);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		bout.write(fileContent);
		bout.flush();
		bout.close();
		fout.close();
		
		
		List<Person> list = readExcelFile(baseLocation + "/" + fileName);
		for(Person person : list) 
		{
			System.out.println(person.getSno() + "\t");
			System.out.println(person.getName() + "\t");
			System.out.println(person.getAge() + "\t");
			System.out.println(person.getEducation());
		}
		
		
		
		return "sucess";
	}

	private List<Person> readExcelFile(String file) throws Exception
	{
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet workSheet = workBook.getSheetAt(0);
		List<Person> persons = new ArrayList<>();
		Person person;
		XSSFRow row;
		for(int i = 1; i < workSheet.getPhysicalNumberOfRows(); i++)
		{
			row = workSheet.getRow(i);
			person = new Person();
			person.setSno((int)row.getCell(0).getNumericCellValue());
			person.setName(row.getCell(1).getStringCellValue());
			person.setAge((int)row.getCell(2).getNumericCellValue());
			person.setEducation(row.getCell(3).getStringCellValue());
			persons.add(person);
		}
		return persons;	
	}
	@RequestMapping("test1")
	public String test1(@RequestParam Integer param)
	{
		System.out.println("DONE");
		int i = Integer.parseInt(param);
		return "done";
	}
	// http://localhost:1010/test1?param=abc
}
