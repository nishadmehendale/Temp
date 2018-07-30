package com.moneymoneybank.collection;

public abstract class BankFactory { 
	 public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried); 
	 public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit); 
	 } 