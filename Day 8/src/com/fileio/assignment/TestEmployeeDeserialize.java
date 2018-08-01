package com.fileio.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployeeDeserialize {

	public static void main(String[] args) {
		Employee employee;
		
		try {
			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee = (Employee) ois.readObject();
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
