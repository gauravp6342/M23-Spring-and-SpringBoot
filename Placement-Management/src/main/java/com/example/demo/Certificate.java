package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate 
{
	@Id
	private long cert_id;
	private Integer year;
	
	//Super class method
	public Certificate() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Certificate(long cert_id, Integer year)
	{
		super();
		this.cert_id = cert_id;
		this.year = year;
	}
	
	//Getters and Setters Method
	public long getCert_id()
	{
		return cert_id;
	}
	public void setCert_id(long cert_id) 
	{
		this.cert_id = cert_id;
	}
	public Integer getYear()
	{
		return year;
	}
	public void setYear(Integer year) 
	{
		this.year = year;
	}

	//to String Method
	@Override
	public String toString() 
	{
		return "Certificate [cert_id=" + cert_id + ", year=" + year + "]";
	}
}
