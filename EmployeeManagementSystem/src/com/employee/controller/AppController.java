package com.employee.controller;

import java.util.Set;
import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.dao.DAO;
import com.employee.service.Service;

public class AppController implements EmployeeController{
	Service service;
	@Override
	public void addEmployee(Employee employee) {
		service.addEmployee(employee);
	}

	@Override
	public TreeSet<Employee> viewAllEmployee() {
		Set<Employee> employeeSet = service.viewAllEmployee();
		return (TreeSet<Employee>) employeeSet;
	}

	@Override
	public Employee getEmployeeByID(int employeeID) {
		Employee employee = service.getEmployeeByID(employeeID);
		return employee;
	}

	@Override
	public void deleteEmployeeByID(int employeeID) {
		service.deleteEmployeeByID(employeeID);
	}

	@Override
	public void setEmployeeService(Service service) {
		this.service = service;
	}	
}
