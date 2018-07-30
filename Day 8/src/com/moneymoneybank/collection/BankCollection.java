package com.moneymoneybank.collection;

import java.util.ArrayList;

public class BankCollection {
	public static ArrayList<BankAcc> al=new ArrayList<>();
	
	public void addNewAccount(BankAcc ba) {
		al.add(ba);
//		System.out.println(al);
	}
	
	public static ArrayList listAll() {
		return al;
//		System.out.println(al.toString());
//		al.stream().forEach((account) -> System.out.println(account));
	}
}
