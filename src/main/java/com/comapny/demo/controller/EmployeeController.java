package com.comapny.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comapny.demo.model.EmployeeModel;
import com.comapny.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/create")
	public void createEmployee(EmployeeModel emp) {
		employeeService.createEmployee(emp);

	}

	@RequestMapping("/get")
	public List<EmployeeModel> getAllEmployees() {
		return employeeService.getAllEmployees();

	}

	@RequestMapping("/tax")
	public EmployeeModel taxCalculation(int id) {
		return employeeService.taxCalculation(id);

	}
}
