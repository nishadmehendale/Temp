package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.account.pojo.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount {

	public MMSavingsAccount(Customer accountHolder) {
		super(accountHolder);
	}

	public MMSavingsAccount(Customer accountHolder, double accountBalance) {
		super(accountHolder, accountBalance, false);
	}
	@Override
	public String withdraw(double amount) {
		String denominations;
		if(amount <= (this.getAccountBalance() - super.getMINIMUM_BALANCE())) {
			this.setAccountBalance(this.getAccountBalance() - amount);
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
			denominations = "Does not meet Minimum Balance Requirement";
		}
		return denominations;
	}
	public void deposit(double amount) {
		super.deposit(amount);
	}
}
