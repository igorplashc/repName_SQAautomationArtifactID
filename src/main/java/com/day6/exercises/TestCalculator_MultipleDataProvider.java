package com.day6.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCalculator_MultipleDataProvider {
	
	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void testAddMethod(int a, int b, int expectedResult) {
		int result=Calculator.add(a, b);
        Assert.assertEquals(result, expectedResult);
    }
	@Test(dataProvider="substrMethodDataProvider", dataProviderClass=CalculatorDataProvider.class)
	public void testSubstrMethod(int a, int b, int expectedResult) {
		int result = Calculator.substr(a, b);
		Assert.assertEquals(result, expectedResult);
	}
	@Test(dataProvider="multiplMethodDataProvider", dataProviderClass=CalculatorDataProvider.class)
	public void testMultiplMethod(int a, int b, int expectedResult) {
		int result = Calculator.multipl(a, b);
		Assert.assertEquals(result, expectedResult);
	}
	
}