package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Nishad Mehendale
 * 
 * Payment Gateway for Account to Account transfer
 *
 */
public class PaymentGateway {
	// method to transfer the given amount from the sender to target account.
	public static boolean transfer(BankAccount sender, BankAccount reciever, double amount) {
		// If the sender account balance = the given amount then the amount is
		// transferred from the sender to the target account and true is returned
		// otherwise false is returned.
		boolean status;
		if (sender.getAccountBalance() >= amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			status = true;
		} else {
			status = false;
		}
		return status;
	}
}