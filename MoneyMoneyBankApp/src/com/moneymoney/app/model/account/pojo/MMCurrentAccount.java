package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.CurrentAccount;
import com.moneymoney.framework.account.pojo.Customer;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance, odLimit);
	}
	@Override
	public String withdraw(double amount){
		String denominations;
		if(amount <= (this.getAccountBalance() + getOdLimit())) {
			this.setAccountBalance((this.getAccountBalance() + getOdLimit()) - amount);
				int thousand = (int)amount/1000;
				amount = amount%1000;
				int fiveHundred = (int)amount/500;
				amount = amount%500;
				int hundred = (int)amount/100;
				amount = amount%100;
				int fifty = (int)amount/50;
				amount = amount%50;
				denominations = "No of thousand notes "+ thousand +"\nNo of five hundred notes "+fiveHundred+"\nNo of Hundred notes"+ hundred +
						"\n No of fifty notes "+ fifty + ".";
		}
		else
		{
			denominations = "Exceeds OD Limit";
		}
		return denominations;
	}
	public void deposit(double amount) {
		super.deposit(amount);
	}
	
	
}
