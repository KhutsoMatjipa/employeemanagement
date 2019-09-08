package com.employeemanagement.service.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.employeemanagement.entities.Employee;
import com.employeemanagement.service.EmployeeService;


@Stateless
public class EmployeeServiceImpl implements EmployeeService {

	@PersistenceContext(name = "employeemanagement")
	private EntityManager em;

	@Override
	public void addEmployee(Employee emp) {

		em.persist(emp);

	}

}
