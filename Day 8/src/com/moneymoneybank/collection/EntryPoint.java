package com.moneymoneybank.collection;

import java.util.ArrayList;
import java.util.Scanner;

import com.moneymoneybank.casestudythree.MMNewSaveAccEntryConsole;
import com.moneymoneybank.casestudythree.MMSavingAccReport1;
import com.moneymoneybank.casestudythree.NewSavingPojo;

public class EntryPoint {

	public static void main(String[] args) {
		BankFactory mmBankFactory = new MMBankFactory();
		BankController mmBankController = new MMBankController(mmBankFactory);

		mmBankController.createNewCurrentAccount(101, "Nishad", 2000, 10000);
		mmBankController.createNewSavingAccount(101, "Nishad", 10000, true);

//		ArrayList arrl = BankCollection.listAll();
//		System.out.println(arrl);
//		
//		BankAcc str = mmBankController.presentAccountToView(201);
//		System.out.println(str);

		Scanner scanner = new Scanner(System.in);
		System.out.println("---------CONSOLE---------");
		System.out.println("Enter account number");
		int accNo = scanner.nextInt();
		MMNewSaveAccEntryConsole a = new MMNewSaveAccEntryConsole();
		NewSavingPojo newSavingPojo = a.readAccInfo(accNo);
		System.out.println(newSavingPojo);

		MMSavingAccReport1 m = new MMSavingAccReport1();
		m.printReport();

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
