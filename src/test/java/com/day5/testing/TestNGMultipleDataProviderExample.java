package com.day5.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.day6.exercises.Calculator;
import com.day6.exercises.CalculatorDataProvider;

public class TestNGMultipleDataProviderExample {
	
	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void testAddMethod(int a, int b, int expectedResult) {
		int sum=Calculator.add(a, b);
 
        Assert.assertEquals(sum, expectedResult);
    }
}	
		  