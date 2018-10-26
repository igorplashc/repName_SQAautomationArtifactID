package com.day6;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.day6.exercises.RemoveDuplicatesInArray;

public class TestRemoveDuplicateInArray {
	
	@Test
	public void test_removeDuplicatesInArray() {
		
		int[] arrayWithDuplicates = {1,1,2,1,3};
		int[] ArrayWithoutDuplicates = RemoveDuplicatesInArray.removeDuplicates(arrayWithDuplicates);
		Arrays.sort(ArrayWithoutDuplicates);
				
		Assert.assertEquals(ArrayWithoutDuplicates[2], 3);
	}

}
