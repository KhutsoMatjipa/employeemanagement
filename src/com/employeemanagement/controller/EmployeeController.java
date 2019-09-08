package com.employeemanagement.controller;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;

import com.employeemanagement.entities.Employee;
import com.employeemanagement.service.EmployeeService;

@ManagedBean
public class EmployeeController {

	private Employee employee = new Employee();

	@EJB
	private EmployeeService service;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void saveEmployee(Employee emp) {
		service.addEmployee(emp);
	}

}
