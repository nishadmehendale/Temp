package com.fileio.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileLineCount {
	public static void main(String args[]) throws IOException {
		
		//Entering the file path
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path of the file");
		String path = scanner.nextLine();
		
		//Counting lines
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int lineCount = 0;
		while(reader.readLine() != null) {
			lineCount++;
		}
		reader.close();
		
		//Displaying number of lines
		System.out.println(lineCount + " number of lines");
	}
	
}
