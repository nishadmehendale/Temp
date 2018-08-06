package com.moneymoney.framework.account.pojo;

/**
 * @author Satyen Singh
 * @author Nishad Mehendale
 *
 *This is an address class to maintain the address of the customer.
 */
public abstract class Address {
	
	private String houseNo;
	private String street;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private int pinCode;
	
	/**
	 * 
	 * @param houseNo
	 * @param street
	 * @param city
	 * @param state
	 * @param pinCode
	 * 
	 * This is a Ctor...
	 */
	public Address(String houseNo, String street, String city, String state, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", line1=" + line1 + ", line2=" + line2
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
}
