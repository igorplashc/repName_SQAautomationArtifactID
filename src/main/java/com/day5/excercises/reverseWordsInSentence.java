package com.day5.excercises;

import java.util.Arrays;

public class reverseWordsInSentence {

	/*
	Write a program to reverse words in sentence. 
	If the Sentence is "Hello World". It should be "World Hello"
	and write a test case for it
	
	!!!! Use just 1 for loop !!!!!!!!!!!!!!!
	!!!! Do the same above exercise using StringBuilder instead of Strings !!!!
	
	*/
	public static void main(String[] args) {
		//reverseWords("igor drive car");
		
		System.out.println("");
		
		reverseSentence("elina writes letter");
		reverseWords("igor rides bike");
		reverseSentence_StringBuilder("1 2 3");
	}
	
	public static String reverseWords(String originalString) {
		String reversedString = "";
		String[] originalStringArray = originalString.split(" ");
		//System.out.println("original string array - " + Arrays.toString(originalStringArray));
		String[] reversedStringArray = new String[originalStringArray.length];
		
		for(int i=0; i < originalStringArray.length; i++)
		{
			reversedStringArray[i] = originalStringArray[originalStringArray.length-i-1];
			
		}
		//System.out.println("reversed string array - " + Arrays.toString(reversedStringArray));
				
		for(String e:reversedStringArray) {
			reversedString += e + " ";
		}
		//System.out.print("reversed string - " + reversedString);
		return reversedString.trim();
	}
	
	public static String reverseSentence(String sentence) {
	
		String[] words= sentence.split("\\s+");
		//System.out.println("the string lenth is " +words.length);
		String s = "";
		for(int i=0; i<words.length; i++){
			s=s+words[words.length-1-i]+" ";
    	}
		//System.out.println(s);
		//String trimmed_s = s.trim();
		return s.trim();
     }
	
	public static String reverseSentence_StringBuilder(String origStr) {
		
		String[] sentence_members = origStr.split("\\s+");
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0; i<sentence_members.length; i++) {
			sb.append(sentence_members[sentence_members.length-1-i] + " ");
		}
		//System.out.println(sb.toString());
		return sb.toString().trim();
	}
}
