package com.fileio.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileGREP {

	public static void main(String[] args) throws IOException {
		String line;
		Pattern pattern = Pattern.compile(args[1]);
		Matcher matcher = pattern.matcher("");
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		int lineCount = 0,flag = 0;
		while ((line = reader.readLine()) != null) {
			matcher.reset(line);
			lineCount++;
			if (matcher.find()) {
				flag = 1;
				System.out.println(lineCount + ": " + line);
			}
			
		}
		if(flag == 0) {
			System.out.println("String not found");
		}
		reader.close();
	}

}
