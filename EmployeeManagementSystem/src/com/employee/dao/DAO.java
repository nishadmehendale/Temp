package com.employee.dao;

import java.util.Set;
import java.util.TreeSet;

import com.employee.bean.Employee;

public class DAO {
	Set<Employee> employeeSet = new TreeSet<>();

	public void addEmployee(Employee employee) {
		employeeSet.add(employee);
	}

	public TreeSet<Employee> viewAllEmployee() {
		return (TreeSet<Employee>) employeeSet;
	}

	public Employee getEmployeeByID(int employeeID) {
		Employee emp = null;
		for (Employee employee : employeeSet) {
			if (employee.getEmpID() == employeeID) {
				emp = employee;
			}
		}
		return emp;
	}

	public void deleteEmployeeByID(int employeeID) {
		for (Employee employee : employeeSet) {
			if (employee.getEmpID() == employeeID) {
				employeeSet.remove(employee);
			}
		}
	}

}
