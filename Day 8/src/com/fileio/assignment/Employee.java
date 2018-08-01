package com.fileio.assignment;

import java.io.Serializable;

public class Employee  implements Serializable{
	private String name;
	private int empId;
	public Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
}
