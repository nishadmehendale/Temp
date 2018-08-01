package com.datetime.api;

import java.time.LocalDate;

public class DisplayToday {
	public static void main(String args[]) {
		LocalDate date;
		date = LocalDate.now();
		System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
	}
}
