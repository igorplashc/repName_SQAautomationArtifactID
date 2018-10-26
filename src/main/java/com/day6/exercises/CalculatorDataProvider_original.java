package com.day6.exercises;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider_original {
	
	@DataProvider(name = "addMethodDataProvider")
	public static Object[][] addMethodDataProvider() {
		        
		return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
	}
}	
