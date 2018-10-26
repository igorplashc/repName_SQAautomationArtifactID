package com.day7;

import java.util.HashSet;

public class HashSetExamples {
	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      
	      System.out.println(hset.contains("Mango"));
	      
	      System.out.println(hset);
	      System.out.println(hset.remove("Fig"));
	      System.out.println(hset);
	      
	      System.out.println(hset.size());
	    } 	
}
	
	
	