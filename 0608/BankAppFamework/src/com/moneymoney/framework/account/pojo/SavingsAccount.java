package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Satyen Singh
 * @author Nishad Mehendale
 *
 *Maintaining savings account details of money money bank
 */
public abstract class SavingsAccount extends BankAccount {
	private boolean salary;
	private double MINIMUM_BALANCE;

	public SavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance);
		this.salary = salary;
		this.MINIMUM_BALANCE = 10000;
	}
	public SavingsAccount(Customer accountHolder) {
		super(accountHolder);
		this.salary = true;
		this.MINIMUM_BALANCE = 0;
	}

	public boolean isSalary() {
		return salary;
	}
	public void setSalary(boolean salary) {
		this.salary = salary;
		if(salary)
			this.MINIMUM_BALANCE =0;
		else
			this.MINIMUM_BALANCE = 10000;
	}
	public String withdraw(double amount) {
		String denominations;
		if(amount <= (this.getAccountBalance() - MINIMUM_BALANCE)) {
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
	@Override
	public String toString() {
		return "SavingsAccount [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
}
