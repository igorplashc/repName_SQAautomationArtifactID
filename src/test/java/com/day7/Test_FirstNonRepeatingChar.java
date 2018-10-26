package com.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_FirstNonRepeatingChar {
	
	@Test(priority=3)
	public void test_frstNnRptngChr_LinkedHashMap() {
		char chr = 'w';
		String str = "swiss";
		
		Assert.assertEquals(FirstNRC_3solutions.getFirstNonRepeatedChar(str), chr);
	}

	@Test(priority=1)
	public void test_frstNnRptngChr_HashSet_ArrayList() {
		char chr = 'w';
		String str = "swiss";
		
		Assert.assertEquals(FirstNRC_3solutions.firstNonRepeatingChar(str), chr);
		
	}
	
	@Test(priority=1)
	public void test_frstNnRptngChr_HashMap() {
		char chr = 'w';
		String str = "swiss";
		
		Assert.assertEquals(FirstNRC_3solutions.firstNonRepeatingChar(str), chr);
		
	}
	/************************ tests using dataProvider *********************************/
	
	@Test(priority=4, dataProvider = "DP_firstNRC", dataProviderClass = DataProvider_day7_testFirstNonRepeatingChar.class)
	public void test_getFirstNonRepeatedChar_DP(String string, char chr) {
		
		char character = FirstNRC_3solutions.getFirstNonRepeatedChar(string);
		
		Assert.assertEquals(character, chr);
	}
	
	@Test(priority=5, dataProvider = "DP_firstNRC", dataProviderClass = DataProvider_day7_testFirstNonRepeatingChar.class)
	public void test_firstNonRepeatingChar_DP(String string, char chr) {
		
		char character = FirstNRC_3solutions.firstNonRepeatingChar(string);
		
		Assert.assertEquals(character, chr);
	}
	
	@Test(priority=6, dataProvider = "DP_firstNRC", dataProviderClass = DataProvider_day7_testFirstNonRepeatingChar.class)
	public void test_firstNonRepeatedCharacter_DP(String string, char chr) {
		
		char character = FirstNRC_3solutions.firstNonRepeatedCharacter(string);
		
		Assert.assertEquals(character, chr);
	}
}
