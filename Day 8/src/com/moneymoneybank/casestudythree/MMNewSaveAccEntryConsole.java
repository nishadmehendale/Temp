package com.moneymoneybank.casestudythree;

import java.util.Scanner;

import com.moneymoneybank.collection.*;

public class MMNewSaveAccEntryConsole implements NewAccEntry{
	
	@Override
	public NewSavingPojo readAccInfo(int accNm) {
		MMBankController mmBankController = new MMBankController(null); 
		String str = "com.moneymoneybank.collection.MMSavingAcc";
		BankAcc ba = mmBankController.presentAccountToView(accNm, str);
		NewSavingPojo newSavingPojo = new NewSavingPojo(ba.getAccNm(),ba.getAccNo(),ba.getAccBal());
		return newSavingPojo;
	}
	
}
