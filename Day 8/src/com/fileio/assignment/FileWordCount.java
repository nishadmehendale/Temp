package com.fileio.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCount {

	public static void main(String[] args) throws IOException {
		//Accepting file path
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the path of the file");
		String path = scanner.nextLine();
		
		//counting words
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int wordCount = 0;
		while((line = reader.readLine()) != null) {
			String[] wordList = line.split("\\s+");
			wordCount += wordList.length;
		}
		reader.close();

		//Displaying number of words
		System.out.println(wordCount + " number of words");
	}

}
