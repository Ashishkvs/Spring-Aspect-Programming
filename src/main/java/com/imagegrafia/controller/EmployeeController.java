package com.imagegrafia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.model.Employee;
import com.imagegrafia.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeService;
	
	@GetMapping(value = "emp")
	public List<Employee> getEmployees() {
		return employeService.getEmployees();
	}


}
