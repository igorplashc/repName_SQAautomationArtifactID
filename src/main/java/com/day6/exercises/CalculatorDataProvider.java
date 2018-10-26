package com.day6.exercises;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {
	  @DataProvider(name = "addMethodDataProvider")
	   public static Object[][] addMethodDataProvider() {
	       return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
	    }
	  @DataProvider(name="substrMethodDataProvider")
	  public static Object[][] substrMethodDataProvider(){
		  return new Object[][] {{12,3,9},{9,3,6},{100,5,95}};
	  }
	  @DataProvider(name="multiplMethodDataProvider")
	  public static Object[][] multiplMethodDataProvider(){
		  return new Object[][] {{12,3,36},{9,3,27},{100,5,500}};
	  }
}