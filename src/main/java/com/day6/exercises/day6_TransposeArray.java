package com.day6.exercises;

import java.util.Arrays;

public class day6_TransposeArray {

	public static void main(String[] args) {
		
		/*
		Write a method called TransPoseMatrix() that takes 2 dimension Array as input and returns  a transposed array.
		Example  :
		Original Array
		1	2	3	
		4	5	6	
		7	8	9	
		 The Transpose Matrix 
		1	4	7	
		2	5	8	
		3	6	9
		 */
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		TransPoseMatrix(array);
		
		//printGrid();
	}
	
	public static void TransPoseMatrix(int[][] inputArray){
		
		System.out.println(Arrays.deepToString(inputArray));
		
		for(int i = 0; i < inputArray.length; i++) {
		    for(int j = 0; j < inputArray.length; j++) {
		        System.out.print(inputArray[i][j]);
		        if(j < inputArray[i].length - 1) System.out.print(" ");
		    }
		    System.out.println();
		}   
		/*********************************************/
		    
		int[][] transPoseArray = new int[inputArray.length][inputArray.length];
		
		for(int x=0; x<inputArray.length; x++) {
			for(int y=0; y<inputArray.length; y++) {
				transPoseArray[x][y] = inputArray[y][x];
			}
		}
		/*************************************************/
		
		for(int k = 0; k < transPoseArray.length; k++) {
		    for(int l = 0; l < transPoseArray.length; l++) {
		        System.out.print(transPoseArray[k][l]);
		        if(l < transPoseArray[k].length - 1) {
		        	System.out.print(" ");
		        }
		    }
		    System.out.println();		     
		}
 
		
	}
	
	public static void printGrid() {
		String [][] plants = new String[2][2];
	    plants[0][0] = "Rose";
	    plants[0][1] = "Red";
	    plants[1][0] = "Snowdrop";
	    plants[1][1] = "White";
	    
		for(int i = 0; i < plants.length; i++) {
		    for(int j = 0; j < plants[i].length; j++) {
		        System.out.print(plants[i][j]);
		        if(j < plants[i].length - 1) System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
