package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.account.pojo.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount {

	public MMSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);

	}

	public MMSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		{
			if (isSalary()) {
				if ((getAccountBalance() - amount) >= 0)
					setAccountBalance(getAccountBalance() - amount);
				else {
					System.out.println("Failed");
				}
			} else {
				if ((getAccountBalance() - amount) >= super.MINBAL)
					setAccountBalance(getAccountBalance() - amount);
				else {
					System.out.println("Failed");
				}
			}
		}
	}
	
}
