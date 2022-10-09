package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College
{
	@Id
	private Integer collegeid;
	private String collegename;
	private String location;
	
	//Super class method
	public College() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public College(Integer collegeid, String collegename, String location) 
	{
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
		this.location = location;
	}

	//Getters and Setters Method
	public Integer getCollegeid() 
	{
		return collegeid;
	}
	public void setCollegeid(Integer collegeid) 
	{
		this.collegeid = collegeid;
	}
	public String getCollegename()
	{
		return collegename;
	}
	public void setCollegename(String collegename) 
	{
		this.collegename = collegename;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}

	//to String Method
	@Override
	public String toString() {
		return "College [collegeid=" + collegeid + ", collegename=" + collegename + ", location=" 
				+ location + "]";
	}
}
	
	
	

	
	
	

