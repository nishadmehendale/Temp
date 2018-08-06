package com.employee.controller;

import java.util.Map;
import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.service.Service;

public interface EmployeeController {
	public TreeSet<Employee> viewAllEmployee();
	public Employee getEmployeeByID(int employeeID);
	public void deleteEmployeeByID(int employeeID);
	public void setEmployeeService(Service service);
	void addEmployee(Map map);
}
