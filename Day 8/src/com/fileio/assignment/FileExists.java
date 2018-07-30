package com.fileio.assignment;

import java.io.File;
import java.util.Scanner;

public class FileExists {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path of the file");
		String path = scanner.nextLine();
		File tmpDir = new File(path);
		//boolean exists = tmpDir.exists();
		System.out.println(tmpDir.exists());
		if(tmpDir.exists()) {
			System.out.println("File exists in the given path and is a file");
		}
		else
			System.out.println("File does not exists");
		

	}

}
