package com.day6.exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day6_DataProvider {

	public static void main(String[] args) {
		/*
		 * {5, "five","two"},{6, "six","six1"},{7,"seven","seven1"}
		 * 
		 * create a DataProvider called getData with the above values. 
		 * And create a testMethod that will take the above data provider 
		 * and print the values
		 */

	}
	@DataProvider(name = "dataPrvdr")
	public Object[][] myData() {
	 return new Object[][] {
	   {5, "five", "two" },
	   {6, "six", "six1"},
	   {7, "seven", "seven1"}
	 };
	}
	 
	//This test method declares that its data should be supplied by the Data Provider
	//named "dataPrvdr"
	@Test(dataProvider = "dataPrvdr")
	public void verifyMyData(Integer n1, String n2, String n3) {
	 System.out.println(n1 + " " + n2 + " " + n3);
	}


}
