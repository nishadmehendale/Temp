package com.employee.service;

import java.util.Map;
import java.util.TreeSet;

import com.employee.bean.Employee;
import com.employee.dao.DAO;

public interface EmployeeService {

	public TreeSet<Employee> viewAllEmployee();
	public Employee getEmployeeByID(int employeeID);
	public void deleteEmployeeByID(int employeeID);
	public void setDAO(DAO dao);
	void addEmployee(Employee employee);
	

}
