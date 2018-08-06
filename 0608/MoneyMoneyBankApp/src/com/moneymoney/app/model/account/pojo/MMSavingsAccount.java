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

	
}
