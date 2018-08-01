package com.datetime.api;

import java.time.LocalDate;
import java.util.Scanner;

public class TestDateAddDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date as DD/MM/YYYY");
		String str = sc.nextLine();
		String[] date = str.split("/");
		DateAddDays day = new DateAddDays(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
		System.out.println("Number of Days to be added");
		int num = sc.nextInt();
		LocalDate newDate = day.AddDays(num);
		System.out.println(newDate.getDayOfMonth()+"/"+newDate.getMonthValue()+"/"+newDate.getYear());
	}

}
