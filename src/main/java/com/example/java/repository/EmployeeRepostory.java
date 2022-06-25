package com.example.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.entity.Employee;

public interface EmployeeRepostory extends JpaRepository<Employee,Integer>
{

	Employee findByName(String name);

}
