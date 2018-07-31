package com.moneymoneybank.casestudythree;

import java.util.ArrayList;

import com.moneymoneybank.collection.BankCollection;

public class MMSavingAccReport1 implements AccReport {
	public void printReport() {
		System.out.println("IN REPORT 1");
		ArrayList al = BankCollection.listAll();
		al.stream().forEach(System.out::println);
	}
}
