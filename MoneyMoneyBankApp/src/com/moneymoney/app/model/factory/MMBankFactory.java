package com.moneymoney.app.model.factory;

import java.util.Map;
import java.util.Set;

import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.factory.BankFactory;

public class MMBankFactory extends BankFactory {

	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> arg0) {
		
	}
	
	public Set<BankAccount>  viewAllAccounts(){
		return null;
	}
}
