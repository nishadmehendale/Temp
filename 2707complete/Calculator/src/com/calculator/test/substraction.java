package com.calculator.test;

import org.junit.Assert;
import org.junit.Test;

import com.calculator.application.Calculator;

public class substraction {

	@Test
	public void testTwoPositiveFirstGreater() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(100,20);
		Assert.assertEquals(80, sub);
	}
	@Test
	public void testTwoPositiveSecondGreater() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(20,100);
		Assert.assertEquals(-80, sub);
	}
	@Test
	public void testTwoNegativeFirstGreater() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(-20,-100);
		Assert.assertEquals(80, sub);
	}
	@Test
	public void testTwoNegativSecondGreater() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(-100,-20);
		Assert.assertEquals(-80, sub);
	}
	@Test
	public void testOneFirstGreaterPositiveOneNegative() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(100,-20);
		Assert.assertEquals(120, sub);
	}
	@Test
	public void testOneFirstNegativeThenPositiveGreater() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(-100,20);
		Assert.assertEquals(-120, sub);
	}
	@Test
	public void testOneFirstPositiveThenNegative() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(20,-100);
		Assert.assertEquals(120, sub);
	}
	@Test
	public void testOneFirstNegativeThenPositive() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(-20,100);
		Assert.assertEquals(-120, sub);
	}
	@Test
	public void testPositiveZero() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(20,0);
		Assert.assertEquals(20, sub);
	}
	@Test
	public void testNegativeZero() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(-20,0);
		Assert.assertEquals(-20, sub);
	}
	@Test
	public void testZeroPositive() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(0,100);
		Assert.assertEquals(-100, sub);
	}
	@Test
	public void testZeroNegative() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(0,-100);
		Assert.assertEquals(100, sub);
	}
	public void testEquals() {
		Calculator calculator = new Calculator();
		int sub = calculator.subtract(0,0);
		Assert.assertEquals(0, sub);
	
	}
}
