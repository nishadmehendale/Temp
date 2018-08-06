package com.employee.uiclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.bean.Employee;
import com.employee.controller.AppController;

public class UI {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	Scanner scanner = new Scanner(System.in);
	Map<String, Object> employeeDetails = new HashMap<>();
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	AppController appController = (AppController) context.getBean("controller");
	public void start() throws IOException{
		do {
			showMenu();
		}while (true);
	}
	private void showMenu() throws IOException {
		System.out.println("Make Choice : ");
		System.out.println("1.Accept Data");
		System.out.println("2.Search Employee using ID");
		System.out.println("3.Display All Data");
		
		acceptChoice();
	}
	private void acceptChoice() throws IOException {
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			acceptData();
			break;
		case 2:
			acceptEmployeeID();
			break;
		case 3:
			displayData();
		}
	}

	private void acceptEmployeeID() {
		System.out.println("Enter Employee ID: ");
		int empID = scanner.nextInt();
		Employee employee = appController.getEmployeeByID(empID);
		System.out.println(employee);
	}
	private void acceptData() throws IOException {
		System.out.println("Enter Employee name: ");
		String employeeName = bufferedReader.readLine();
		employeeDetails.put("employeeName",employeeName);
		System.out.println("Enter Employee salary: ");
		double employeeSalary = scanner.nextDouble(); 
		employeeDetails.put("employeeSalary",employeeSalary);
		System.out.println("Enter Employee designation: ");
		String employeeDesignation = bufferedReader.readLine();
		employeeDetails.put("employeeDesignation",employeeDesignation);
		appController.addEmployee(employeeDetails);
	}
	@SuppressWarnings("unchecked")
	private void displayData() {
		Set set = appController.viewAllEmployee();
		set.stream().forEach(System.out::println);
		
	}
	
}
