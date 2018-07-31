package com.fileio.assignment;

import java.io.File;
import java.util.Scanner;

public class FileExists {

	public static void main(String[] args) {
		//Taking the file path
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path of the file");
		String path = scanner.nextLine();
		
		//Checking if a file exists
		File tmpDir = new File(path);
		if(tmpDir.exists()) {
			System.out.println("File exists in the given path and is a file");
		}
		else
		{
			System.out.println("File does not exists");
		}

	}

}
