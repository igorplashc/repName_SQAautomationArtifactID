package com.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class FirstNotRepeatedChar {
	
	//  Not Correct methods !!! Use FirstNRC_3solutions.java
	
	public static void main(String[] args) {
		/*
		 Write a method called firstNonRepeatingChar() that takes a String as parameter 
		 and returns the first Non repeated char.
		 If the String is “swiss”. It should return w.
		 
		 Use 1) HashSet, 2) hashMap
		 */

		String string = "igor";
		System.out.println(firstNonRepeatingChar_HashSet(string));
		System.out.println(firstNonRepeatingChar_HashMap(string));
		
	}

	public static char firstNonRepeatingChar_HashSet(String str) {
		// using HashSet
		HashSet<Character> hSet = new HashSet<Character>();
		ArrayList<Character> arrLst = new ArrayList<Character>();
		char[] arr = str.toCharArray();
		char frstNnRptChr = ' ';
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i] == arr[i-1]) {
				hSet.add(arr[i]);
			}else {
				arrLst.add(arr[i]);
			}
		}	
		System.out.println(hSet.toString());
		System.out.println(arrLst.toString());
		
		if (arrLst != null && !arrLst.isEmpty()) {
			frstNnRptChr = arrLst.get(arrLst.size()-1);
			}
			
		return frstNnRptChr;
	
	}
	
// “swiss
	public static char firstNonRepeatingChar_HashMap(String str) {
		// using HashMap and ArrayList
		HashMap<Character, Integer> HM_IC = new HashMap<Character, Integer>();
		
		for(char e:str.toCharArray()) {
			if(!HM_IC.containsKey(e)) {
				HM_IC.put(e, 1);
			}else {
				HM_IC.put(e, HM_IC.get(e)+1);
			}
		}
		System.out.println(HM_IC.toString());
		
		//Iterator<Character> char_iterator = HM_IC.keySet().iterator();
		
		for(char e2:HM_IC.keySet()) {
			if(HM_IC.get(e2) == 1) {
				return e2;
			}
			
		}
		return 'n';
	}
	
}
