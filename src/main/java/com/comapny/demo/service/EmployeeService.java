package com.comapny.demo.service;

import java.util.List;

import com.comapny.demo.model.EmployeeModel;

public interface EmployeeService {

	public void createEmployee(EmployeeModel emp);

	public List<EmployeeModel> getAllEmployees();

	public EmployeeModel taxCalculation(int id);

}
