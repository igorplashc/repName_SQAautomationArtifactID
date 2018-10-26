package com.day7;

import java.util.ArrayList;

public class ArrayListExample {
	   public static void main(String args[]) {
	      /*Creation of ArrayList: I'm going to add String
	       elements so I made it of string type */
		  ArrayList<String> obj = new ArrayList<String>();
		  ArrayList<Integer> obj1 = new ArrayList<Integer>();
		  //double -> Double
		  //int->Integer
		  //String - String
		  int a='S';
		  //System.out.println(" The value " +a);
		  
		  
	  
		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  obj.add("Ajeet");

		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");

		  System.out.println("now array list is:"+ obj);

		  /*Remove element from the given index*/
		  obj.remove(1);
		  
		  System.out.println("and now array list is:"+obj);
		  
		  System.out.println(obj.size());
		  
		  System.out.println(obj.get(0));
		  
	   }
	}
