package com.example.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//this (POJO)class used to map with DB 
@Entity
@Table(name = "Employee_Table")
public class Employee
{

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private double phone;

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public double getPhone() 
	{
		return phone;
	}

	public void setPhone(double phone) 
	{
		this.phone = phone;
	}

}
