package com.comapny.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.comapny.demo.dao.EmployeeDao;
import com.comapny.demo.model.EmployeeModel;

public class serviceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public void createEmployee(EmployeeModel emp) {
		empDao.save(emp);

	}

	@Override
	public List<EmployeeModel> getAllEmployees() {
		return empDao.findAll();

	}

	@Override
	public EmployeeModel taxCalculation(int id) {
		EmployeeModel emp = empDao.findById(id).get();
		if (empDao.findById(id).isPresent()) {
			double tax = calculateTax(emp);
			emp.setTax(tax);
			empDao.save(emp);
		}
		return emp;
	}

	private double calculateTax(EmployeeModel emp) {
		double salary = emp.getSalary();
		double tax = 0;
		if (salary <= 250000) {

			tax += 0;
		} else if (salary > 250000 && salary <= 500000) {
			tax += .05 * salary;
		} else if (salary > 500000 && salary <= 1000000) {
			tax += .1 * salary;
		} else {
			tax += 0.2 * salary;
		}
		return tax;

	}

}
