package com.calculator.test;

import org.junit.Assert;
import org.junit.Test;

import com.calculator.application.Calculator;

public class addition {

	@Test
	public void testAddTwoPositive() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(100,20);
		Assert.assertEquals(120,sum);
	}
	
	@Test
	public void testAddTwoNegative() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(-100,-20);
		Assert.assertEquals(-120,sum);
	}
	@Test
	public void testAddGreaterPositiveAndNegative() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(100,-20);
		Assert.assertEquals(80,sum);
	}
	@Test
	public void testAddPositiveAndGreaterNegative() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(-100,20);
		Assert.assertEquals(-80,sum);
	}
	@Test
	public void testAddTwoZeros() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(0,0);
		Assert.assertEquals(0,sum);
	}
	@Test
	public void testAddOneZeroAndOnePositive() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(0,20);
		Assert.assertEquals(20,sum);
	}
	@Test
	public void testAddOneZeroAndOneNegative() {
		Calculator calculator = new Calculator();
		int sum = calculator.add(0,-20);
		Assert.assertEquals(-20,sum);
	}
}
