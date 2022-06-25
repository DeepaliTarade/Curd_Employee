package com.example.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.entity.Employee;
import com.example.java.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{

	@Autowired
	private EmployeeService service;

	//inserting one employee details
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee Employee)
	{
		return service.saveEmployee(Employee);
	}

	@PostMapping("/addAllEmployee")
	public List<Employee> addEmployee(@RequestBody List<Employee> Employees) {
		return service.saveEmployee(Employees);
	}

	@GetMapping("/getEmployee")
	public List<Employee> findAllEmployee() {
		return service.getEmployees();
	}

	@GetMapping("/getidEmp/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@GetMapping("/getNameEmp/{name}")
	public Employee findByName(@PathVariable String name) {
		return service.getEmployeeByName(name);
	}

	@PutMapping("/UpdateEmployee")
	public Employee updateEmployee(@RequestBody Employee Employee) {
		return service.updateEmployee(Employee);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}
