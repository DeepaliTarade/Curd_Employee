package com.example.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java.entity.Employee;
import com.example.java.repository.EmployeeRepostory;

//this class contains business logic  
@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepostory repository;

	public Employee saveEmployee(Employee Employee) 
	{
		return repository.save(Employee);
	} /* add single Employee */

	public List<Employee> saveEmployee(List<Employee> Employees)
	{
		return repository.saveAll(Employees);
	}/* add multiple Employee */

	public List<Employee> getEmployees() 
	{
		return repository.findAll();
	}

	public Employee getEmployeeById(int id)
	{
		return repository.findById(id).orElseGet(null);
	}

	public Employee getEmployeeByName(String name) 
	{
		return repository.findByName(name);
	}

	public String deleteEmployee(int id) 
	{
		repository.deleteById(id);
		return "Employee removed !!!!" + id;
	}

	public Employee updateEmployee(Employee Employee) 
	{
		Employee exsistingEmployee = repository.findById(Employee.getId()).orElse(null);
		exsistingEmployee.setName(Employee.getName());
		exsistingEmployee.setEmail(Employee.getEmail());
		exsistingEmployee.setPhone(Employee.getPhone());

		return repository.save(exsistingEmployee);
	}

	/*public Employee getEmployeeByName(String name) 
	{
		// TODO Auto-generated method stub
		return null;
	}*/

}
