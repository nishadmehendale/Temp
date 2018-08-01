package com.datetime.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestAssignment {

	public static void main(String[] args) {
		ArrayList<Assignment> arrayList = new ArrayList<>();
		Assignment[] assignment = new Assignment[5];
		LocalDate date;
		date= LocalDate.of(2018, 8, 20);
		assignment[0] = new Assignment("AI",date);
		
		date= LocalDate.of(2018, 8, 25);
		assignment[1] = new Assignment("DSP",date);
		
		date= LocalDate.of(2018, 8, 31);
		assignment[2] = new Assignment("PDS",date);
		
		date= LocalDate.of(2018, 9, 30);
		assignment[3] = new Assignment("ML",date);
		
		date= LocalDate.of(2018, 9, 15);
		assignment[4] = new Assignment("DWM",date);
		
		for(int i =0; i< 5; i++)
			arrayList.add(assignment[i]);
		
		arrayList.stream().forEach(System.out::println);
		
		arrayList.remove(assignment[2]);
		System.out.println("----------------------------");
		arrayList.stream().forEach(System.out::println);
	
		System.out.println("----------------------------");
		
		Comparator<Assignment> comparator = (arg0, arg1) -> arg0.getDueDate().compareTo(arg1.getDueDate());
		Collections.sort(arrayList, comparator);
		System.out.println(arrayList.get(0));
	}

}
