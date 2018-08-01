package com.datetime.api;

import java.time.LocalDate;

public class DateAddDays {
	LocalDate date;

	public DateAddDays(int day, int month, int yyyy) {
		date = LocalDate.of(yyyy,month,day);
	}
	
	public LocalDate AddDays(int num) {
		LocalDate updated = date.plusDays(num);
		return updated;
		
	}
	
}
