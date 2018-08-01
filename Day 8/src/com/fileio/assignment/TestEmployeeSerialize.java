package com.fileio.assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployeeSerialize{

	public static void main(String[] args){
		Employee employee = new Employee("Nishad",1001);
		
		try {
			FileOutputStream fos = new FileOutputStream("emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
