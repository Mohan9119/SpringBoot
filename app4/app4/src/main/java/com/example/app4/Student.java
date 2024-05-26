package com.example.app4;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

public class Student 
{
	private String FirstName;
	private String LastName;
	private Integer Age;
	private String [] Projects;
	private List<String> emailAccounts;
	private Set<Long> MobileNumber;
	private Map<String, String> Education;
	private Address address;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String[] getProjects() {
		return Projects;
	}
	public void setProjects(String[] projects) {
		Projects = projects;
	}
	public List<String> getEmailAccounts() {
		return emailAccounts;
	}
	public void setEmailAccounts(List<String> emailAccounts) {
		this.emailAccounts = emailAccounts;
	}
	public Set<Long> getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Set<Long> mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public Map<String, String> getEducation() {
		return Education;
	}
	public void setEducation(Map<String, String> education) {
		Education = education;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
