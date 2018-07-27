package com.calculator.test;

import org.junit.Assert;
import org.junit.Test;

import com.calculator.application.Calculator;

public class multiply {

	@Test
	public void testTwoPositive() {
		Calculator calculator = new Calculator();
		int mul = calculator.multiply(2,3);
		Assert.assertEquals(6, mul);
	}
	@Test
	public void testTwoNegative() {
		Calculator calculator = new Calculator();
		int mul = calculator.multiply(-2,-3);
		Assert.assertEquals(6, mul);
	}
	@Test
	public void testPositiveAndNegative() {
		Calculator calculator = new Calculator();
		int mul = calculator.multiply(-2,3);
		Assert.assertEquals(-6, mul);
	}
	@Test
	public void testTwoZero() {
		Calculator calculator = new Calculator();
		int mul = calculator.multiply(0,0);
		Assert.assertEquals(0, mul);
	}
	@Test
	public void testZero() {
		Calculator calculator = new Calculator();
		int mul = calculator.multiply(2,0);
		Assert.assertEquals(0, mul);
	}

}
