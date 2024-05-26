package com.example.app5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student 
{
	private String firstName;
	private String lasttName;
	private String age;
	private String[] projects;
	private List<Long> mobileNumber;
	private Set<String> emailAccounts;
	private Map<String, String> education;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String[] getProjects() {
		return projects;
	}
	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	public List<Long> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<Long> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Set<String> getEmailAccounts() {
		return emailAccounts;
	}
	public void setEmailAccounts(Set<String> emailAccounts) {
		this.emailAccounts = emailAccounts;
	}
	public Map<String, String> getEducation() {
		return education;
	}
	public void setEducation(Map<String, String> education) {
		this.education = education;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Address address;
	public char[] getHouseNo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
