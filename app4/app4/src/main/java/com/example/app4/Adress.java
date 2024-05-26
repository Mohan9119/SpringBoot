package com.example.app4;

public class Adress 
{
	private static String HouseNo;
	private static  String StreetName;
	private String City;
	public static String getHouseNo() 
	{
		return HouseNo;
	}
	public void setHouseNo(String houseNo) 
	{
		HouseNo = houseNo;
	}
	public static String getStreetName()
	{
		return StreetName;
	}
	public void setStreetName(String streetName) 
	{
		StreetName = streetName;
	}
	public String getCity() 
	{
		return City;
	}
	public void setCity(String city) 
	{
		City = city;
	}

}
