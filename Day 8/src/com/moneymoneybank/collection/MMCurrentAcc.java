package com.moneymoneybank.collection;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float amount) {
		if (((getAccBal() + getCreditLimit()) - amount) >= 0)
			setAccBal(getAccBal() - amount);
		else {
			System.out.println("Failed");
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAcc = " + super.toString() + ".";
	}

}
