package com.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDetails {

	public static void main(String args[]) {

	      /******* This is how to declare HashMap *****************/
	      HashMap<Integer, String> hashMap_IntStr = new HashMap<Integer, String>();
	      HashMap<Character, Character> hashMap_CharChar = new HashMap<Character, Character>();
	      
	      /*Adding elements to HashMap*/
	      hashMap_IntStr.put(12, "Chaitanya");
	      hashMap_IntStr.put(2, "Rahul");
	      hashMap_IntStr.put(7, "Singh");
	      hashMap_IntStr.put(49, "Smith");
	      hashMap_IntStr.put(51, "Smith");
	      hashMap_IntStr.put(3, "Anuj");
	      hashMap_IntStr.put(6, "Anuj");
	      
	      hashMap_CharChar.put('a', 'b');
	      hashMap_CharChar.put('c', 'd');
	      hashMap_CharChar.put('e', 'f');
	      
	 /***************** Iterator created based on HashMap with KEY ***********************/
	 
	      /************************ HashMapObject.keySet().iterator() ********************/      
	      
	      Iterator<Integer> HashMapKeyIterator_int = hashMap_IntStr.keySet().iterator();
	      Iterator<Character> HashMapKeyIterator_char = hashMap_CharChar.keySet().iterator();
	  
	  /***************************** HashMap.hasNext() ********************************/  
	   /***************************** HashMap.next() ********************************/
	      
	      /***************************** HashMap.get(KEY) ********************************/  
	  
	      while (HashMapKeyIterator_int.hasNext()) {
	          Integer key_int = HashMapKeyIterator_int.next();
	          System.out.println(key_int + ": " + hashMap_IntStr.get(key_int)); 
	      }
	      
	      while(HashMapKeyIterator_char.hasNext()) {
	    	  Character key_char = HashMapKeyIterator_char.next();
	    	  System.out.println(key_char + ": " + hashMap_CharChar.get(key_char)); 
	      }
	      
	      /* Get values based on key*/
	      String var= hashMap_IntStr.get(49);
	     
	     // hmap.put(49, "smith2");
	      System.out.println("Value at index 49 is: " + var);

	      /* Remove values based on key*/
	      hashMap_IntStr.remove(3);
	      System.out.println("Map key and values after removal of item (Anuj )with key=3:");
	      
	 /************************* Iterator created based on HashMap with ENTRY(set) ***********************/ 
	 
	      /***************************** HashMapObject.entrySet().iterator() *************************************/     
	      
	      Iterator<Map.Entry<Integer, String>> hashMapSetIterator_IntStr = hashMap_IntStr.entrySet().iterator();
	      Iterator<Map.Entry<Character, Character>> hashMapSetIterator_CharChar = hashMap_CharChar.entrySet().iterator();
	      
	      /***************************** HashMap.hasNext() ********************************/  
		   /***************************** HashMap.next() ********************************/
	      
	       /******************************** // ENTRY.getKey()  &   ENTRY.getValue() ************************************/ 
	      
	      while (hashMapSetIterator_IntStr.hasNext()) {
	          Map.Entry<Integer, String> entry = hashMapSetIterator_IntStr.next();
	          System.out.println(entry.getKey() + ": " + entry.getValue());	
	      } 
	     while(hashMapSetIterator_CharChar.hasNext()) {
	    	 Map.Entry<Character, Character> entry2 = hashMapSetIterator_CharChar.next();
	    	 System.out.println(entry2.getKey() + ": " + entry2.getValue()); 
	     }
	     

	   }

}
