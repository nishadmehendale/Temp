package com.taxcalculator;

public class TaxCalculator {
	private String empName;
	private double empSal;
	private boolean isIndian;

	public TaxCalculator(String empName, double empSal, boolean isIndian) {

		this.empName = empName;
		this.empSal = empSal;
		this.isIndian = isIndian;
	}

	public double getTaxAmount()
			throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		double taxAmount = 0;
		if (isIndian == true) {
			if (empName.isEmpty()) {
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			} else {
				if (empSal >= 100000) {
					taxAmount = empSal * 0.08;
				} else if (empSal >= 50000) {
					taxAmount = empSal * 0.06;
				} else if (empSal >= 30000) {
					taxAmount = empSal * 0.05;
				} else if (empSal >= 10000) {
					taxAmount = empSal * 0.04;
				} else {
					throw new TaxNotEligibleException("The employee does not need to pay tax");
				}
			}
		} else {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		return taxAmount;
	}

}
