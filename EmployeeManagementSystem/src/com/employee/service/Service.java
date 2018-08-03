package com.employee.service;

import java.util.Set;
import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.dao.DAO;

public class Service implements EmployeeService{
	DAO dao;
	
	@Override
	public void addEmployee(Employee employee) {
		dao.addEmployee(employee);
	}
	@Override
	public TreeSet<Employee> viewAllEmployee() {
		Set<Employee> employeeSet = dao.viewAllEmployee();
		return (TreeSet<Employee>) employeeSet;
	}
	@Override
	public Employee getEmployeeByID(int employeeID) {
		Employee employee = dao.getEmployeeByID(employeeID);
		return employee;
	}
	@Override
	public void deleteEmployeeByID(int employeeID) {
		dao.deleteEmployeeByID(employeeID);
	}
	@Override
	public void setDAO(DAO dao) {
		this.dao = dao;
	}
	
}
