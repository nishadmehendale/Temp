package com.calculator.test;
import org.junit.Assert;
import org.junit.Test;


import com.calculator.application.Calculator;

public class division {
	
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		Calculator calculator = new Calculator();
		@SuppressWarnings("unused")
		float div = calculator.divide(2,0);
	}
	@Test
	public void testDivideZero() {
		Calculator calculator = new Calculator();
		float div = calculator.divide(0,-2);
		Assert.assertEquals(0, div,0);
	}
	@Test
	public void testTwoPositive() {
		Calculator calculator = new Calculator();
		float div = calculator.divide(8,2);
		Assert.assertEquals(4, div,0);
	}
	@Test
	public void testTwoNegative() {
		Calculator calculator = new Calculator();
		float div = calculator.divide(-8,-2);
		Assert.assertEquals(4, div,0);
	}
	@Test
	public void testPositiveNegative() {
		Calculator calculator = new Calculator();
		float div = calculator.divide(-8,2);
		Assert.assertEquals(-4,div,0);
	}
}
