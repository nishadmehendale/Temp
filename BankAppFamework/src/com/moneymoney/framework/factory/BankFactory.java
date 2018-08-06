package com.moneymoney.framework.factory;

import java.util.Map;

/**
 * 
 * @author Nishad Mehendale
 * 
 * For creating the account objects
 *
 */
public abstract class BankFactory {
	
	public abstract void createNewSavingsAccount(Map<String, Object> account);
	
	public abstract void createNewCurrentAccount(Map<String, Object> account);
	
	
}
