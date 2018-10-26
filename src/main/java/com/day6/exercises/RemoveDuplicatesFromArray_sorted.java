package com.day6.exercises;

/************************  NEED COMPLETION ! ******************************************/

import java.util.Arrays;

public class RemoveDuplicatesFromArray_sorted {
	
	public static void main(String a[]){
        int[] input_arr = {9,2,5,7,9,14,14};
        System.out.println(Arrays.toString(input_arr));
        
        System.out.println(Arrays.toString(removeDuplicatesInArray(input_arr)));
    }
	 
    public static int[] removeDuplicatesInArray(int[] arr){
    	Arrays.sort(arr); 
        int index = arr.length;
        
        for(int i=0; i<arr.length-1; i++) {
        	if(arr[i] == arr[i+1]) {
        		index = index-1;        		
        	}       
        }
        System.out.println(index);
        
        int[] unique_arr = new int[index];
        int[] dupl_arr = new int[arr.length - index];
        unique_arr[0] = arr[0];
        
        int k = 0;
        
        for(int i=0; i<arr.length-1; i++) {
        	if(arr[i] == arr[i+1]) {
        		dupl_arr[k] = arr[i];
        		k++;
        	}
        }
        int b = 0;
        for(int i=1; i<arr.length; i++) {
        	if(arr[i-1] < arr[i]) {
        		unique_arr[b] = arr[i];
        		b++;
        	}
        }
         
        System.out.println(Arrays.toString(unique_arr));
        return dupl_arr;
    }
}
