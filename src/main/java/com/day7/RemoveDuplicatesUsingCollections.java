package com.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		/*
		    Write a method called removeDuplicatesUsingCollections()
			That takes integer array as argument and returns 
			ArrayList with duplicate elements.
		 */
		Integer[] array = {4,1,1,3,1,2,2,4};
		removeDuplicatesUsingCollections(array);
		
	}
	public static ArrayList<Integer> removeDuplicatesUsingCollections(Integer[] inputArray){
		
		System.out.println("input Array with duplicates is - " + Arrays.toString(inputArray));
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		HashSet<Integer> hSet1 = new HashSet<Integer>();
			
		for(int e:inputArray) {
			if(!hSet1.add(e)) {
				arrList.add(e);
			}
		}		
		System.out.println("output ArrayList with only duplicates is - " + arrList);
		
		return arrList;
	}
}
