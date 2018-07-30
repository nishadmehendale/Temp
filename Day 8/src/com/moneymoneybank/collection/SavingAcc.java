package com.moneymoneybank.collection;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL = 10000;

	public SavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.setSalaried(isSalaried);
	}

	public abstract void withdraw(float amount);

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried() + ", toString()=" + super.toString() + "]";
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}

}
