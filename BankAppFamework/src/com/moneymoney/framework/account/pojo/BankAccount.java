package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Satyen Singh
 * @author Nishad Mehendale
 *
 */
public abstract class BankAccount {
	private final int accountNumber;
	private Customer accountHolder;
	private double accountBalance;
	
	//maintains the next accountNumber
	private static int accountId;
	
	//gets invoked whenever a class is loaded
	static {
		accountId = 100;
	}

	//gets invoked whenever a new object is created
	{
		this.accountNumber = ++accountId;
	}
	
	public BankAccount(Customer accountHolder, double accountBalance) {
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	//For Zero Balance account holders
	public BankAccount(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	//getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}
	public Customer getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	//It will give the next account number that will assigned to next account object
	public static int getNextAccountNumber() {
		return accountId+1;
	}
	
	//Deposit method 
	public void deposit(double amount) {
		if(amount > 0)
			this.accountBalance += amount;
	}
	public String FundTransfer(BankAccount account,double amount) {
		String result;
		if(PaymentGateway.transfer(this, account, amount))
			result = "Transaction Successful";
		else
			result = "Transaction Failed";
		return result;
	}
	public abstract String withdraw(double amount);
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
}