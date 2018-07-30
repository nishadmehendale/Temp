package com.moneymoneybank.collection;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		SavingAcc savingAcc = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentAcc;
	}

}
