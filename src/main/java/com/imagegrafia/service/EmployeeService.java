package com.imagegrafia.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imagegrafia.model.Employee;

@Service
public class EmployeeService {
	static		List<Employee> list=Arrays.asList(new Employee(1,"Ashish"),new Employee(2,"Surila"));
	
	public List<Employee> getEmployees(){
		System.out.println("inside service");
		return EmployeeService.list;
	}
}
