package com.moneymoneybank.collection;

public abstract class BankController {
	private BankCollection bc;
	private BankFactory bf;
	
	public BankController(BankFactory bf) {
		this.bf = bf;
	}
	abstract public void createNewCurrentAccount(int accNo, String accNm, int accBal, float creditLimit);
	abstract public void createNewSavingAccount(int  accNo, String accNm, int accBal, boolean isSalaried);
	abstract public String presentAccountToView(int accNo);
	
}
