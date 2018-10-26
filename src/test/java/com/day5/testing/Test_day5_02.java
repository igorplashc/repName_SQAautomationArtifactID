package com.day5.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.day5.excercises.reverseWordsInSentence;

public class Test_day5_02 {

	@Test(groups = {"GoodTests"})
	public void test_reverseSentence() {
		
		String str = reverseWordsInSentence.reverseSentence("Lord save King");
		Assert.assertEquals(str, "King save Lord");
	}
	
	@Test(groups = {"NotGoodTests"})
	public void test_reverseSentence_2() {
		Assert.assertEquals(reverseWordsInSentence.reverseWords("Summer better Winter"), 
				"Winter better Summer");
	}
	
	@Test(groups = {"GoodTests"})
	public void test_reverseSentence_StringBuilder() {
		Assert.assertEquals(reverseWordsInSentence.reverseSentence_StringBuilder("9 99 999"), 
				"999 99 9");
	}
	
}

