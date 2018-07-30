package com.moneymoneybank.collection;

import java.util.ArrayList;

public class EntryPoint {

	public static void main(String[] args) {
		BankFactory mmBankFactory = new MMBankFactory();
		BankController mmBankController = new MMBankController(mmBankFactory);
		
		mmBankController.createNewCurrentAccount(101, "Nishad", 2000, 10000);
		mmBankController.createNewSavingAccount(201, "Nishad", 2000, true);
		
		ArrayList arrl = BankCollection.listAll();
		System.out.println(arrl);
		
		String str = mmBankController.presentAccountToView(201);
		System.out.println(str);
//		mmBankFactory.withdraw(3000);
//		System.out.println(mmSavingAcc);
		
//		mmSavingAcc.withdraw(3000);
//		System.out.println(mmSavingAcc);
		
//		mmCurrentAcc.withdraw(8000);
//		System.out.println(mmCurrentAcc);
		
//		mmCurrentAcc.deposit(8000);
//		System.out.println(mmCurrentAcc);
		
//		mmCurrentAcc.withdraw(20000);
//		System.out.println(mmCurrentAcc);
		
//		SavingAcc mmSavingAcc2 = mmBankFactory.getNewSavingAcc(102, "Nishad", 5000, false);
//		mmSavingAcc2.withdraw(6000);

	}

}
