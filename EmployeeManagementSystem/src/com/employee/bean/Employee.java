package com.employee.bean;

public class Employee {
	private int empID;


	private String employeeName;
	private double salary;
	private String designation;
	

	public void setEmployeeDetails() {

	}
	public int getEmpID() {
		return empID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", employeeName=" + employeeName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	
}
