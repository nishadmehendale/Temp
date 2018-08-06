package com.employee.mainclass;

import java.io.IOException;

import com.employee.uiclass.UI;

public class MainClass {

	public static void main(String[] args) throws IOException {
		try {
			new UI().start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
