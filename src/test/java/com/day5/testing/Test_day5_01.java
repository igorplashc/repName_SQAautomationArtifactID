package com.day5.testing;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.day5.excercises.reverseWordsInSentence;

public class Test_day5_01 {

	@Test(groups = {"GoodTests"})
	public void test_reverseSentence() {
		
		String str = reverseWordsInSentence.reverseSentence("God save Queen");
		Assert.assertEquals(str, "Queen save God");
	}
	
	@Test(groups = {"NotGoodTests"})
	public void test_reverseSentence_2() {
		Assert.assertEquals(reverseWordsInSentence.reverseWords("Fall better Spring"), 
				"Spring better Fall");
	}
	
	@Test(groups = {"GoodTests"})
	public void test_reverseSentence_StringBuilder() {
		Assert.assertEquals(reverseWordsInSentence.reverseSentence_StringBuilder("1 2 3"), 
				"3 2 1");
	}
	
	@Parameters({"sentenceToBeReversed", "sentenceAfterReversing"})
	@Test
	public void testMethodWithParametrs(String actStr, String expStr) {
		Assert.assertEquals(reverseWordsInSentence.reverseSentence(actStr), expStr);
	}
	
}
