package com.day7;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListExercise {

	public static void main(String[] args) {
	/*  Write a Method called addElements() that takes in input as a String Array 
		and adds the elements to arrayList of Strings 
		and returns the ArrayList<String> as output. */
		String[] strArray = {"apple","boy","cat","dog"};
		addElements(strArray);		
	}
	
	public static ArrayList<String> addElements(String[] str_array) {
		System.out.println("input Array is - " + Arrays.toString(str_array));
		ArrayList<String> arrList = new ArrayList<String>();
		
		for(int i=0; i<str_array.length; i++) {
			arrList.add(str_array[i]);
		}
		System.out.println("output ArrayList is -" + arrList);
		return arrList;
	}
	
	
}
