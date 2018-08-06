package com.employee.bean;

public class Employee implements Comparable<Employee>{
	private final int empID;
	private String employeeName;
	private double salary;
	private String designation;
	private static int empIDNO = 0;

	public Employee(String employeeName, double salary, String designation) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.designation = designation;
		this.empID = empIDNO;
		++empIDNO;
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
	@Override
	public int compareTo(Employee arg0) {
		
		return this.empID - arg0.empID;
	}
	
	
}
