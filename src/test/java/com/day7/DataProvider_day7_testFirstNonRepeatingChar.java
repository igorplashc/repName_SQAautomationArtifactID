package com.day7;

import org.testng.annotations.DataProvider;

public class DataProvider_day7_testFirstNonRepeatingChar {
	
	@DataProvider(name = "DP_firstNRC")
	public static Object[][] dataProvider_frstNnRptngChr(){
		
		return new Object[][] {{"swiss", 'w'},{"igor", 'i'},{"aabbccd", 'd'},{"x", 'x'}};
	}

}
