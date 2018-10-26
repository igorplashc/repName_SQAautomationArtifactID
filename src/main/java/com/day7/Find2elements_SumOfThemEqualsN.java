package com.day7;

import java.util.Arrays;
import java.util.HashSet;

public class Find2elements_SumOfThemEqualsN {

	public static void main(String[] args) {
		/*
		 * Given an array of integers finds two elements in the array 
		 * whose sum is equal to n. 
		 * 
		 * Use Collections -> HashSet !
		   n-i=e
		   int[] input={2,6,3,9,11}
		 */
		int[] array = {2,6,3,9,11,7};
		Integer[] array2 = {2,6,3,9,11,7};
		find2elementsSumOfThemEqualsN(array,  9);
		find2elements_SumOfThemEqualsToN_usingHashSet(array2,  9);
	}
	public static void find2elementsSumOfThemEqualsN(int[] input, int sum) {
			//using nested loop
		
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++)
				if(sum - input[i] == input[j]) {
					System.out.println(input[i] +" and "+ input[j]);
			}
		}
	}
	public static void find2elements_SumOfThemEqualsToN_usingHashSet(Integer[] input, int sum) {
		
		HashSet<Integer> hS = new HashSet<Integer>();
		
		for(int i=0; i<input.length; i++) {
			if(hS.contains(sum - input[i])) {
				System.out.println("found them - " + input[i] + " and " + (sum-input[i]));
			}else {
				hS.add(input[i]);
			}
		}	
	}
	public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }        
        HashSet<Integer> set = new HashSet<Integer>(numbers.length);
        
      //{2, 6, 5,7, 9, 11}
        //n=9
        //iteration1
        //value:2
        //target=9-2=7
        //set=2
        //iteration2
        //n=9
        //vaue:6
        //target=3
        //set=6
        //iteration3
        //n=9
        //value:5
        //target=4
        //set=5
        //n=9
        //value=7
        //target=2
        //
        
        for(int value : numbers){
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

}
