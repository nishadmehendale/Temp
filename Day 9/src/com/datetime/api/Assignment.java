package com.datetime.api;

import java.time.LocalDate;

public class Assignment {
	private String subject;
	private LocalDate dueDate;
	 
	
	public Assignment(String subject, LocalDate dueDate) {
		this.subject = subject;
		this.dueDate = dueDate;
	}
	public String getSubject() {
		return subject;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	@Override
	public String toString() {
		return "Assignment [subject=" + subject + ", dueDate=" + dueDate + "]";
	}
	
	
}
