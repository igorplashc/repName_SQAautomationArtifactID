package com.day6.exercises;

public class day6class {

	public static void main(String[] args) {
		
		String[] name = {"Mr ","Smith"};
		String[][] names  = {
				//1st row
			 	{"Mr","Mrs","Ms"},
			 	//2nd row
				{"Smith","Jones"}
				
		      };
		
		int[][] origArray={
				{1,2,4  },
				{2,3,4  },
				{5,4,6 }
				
		};
		//This will output Mr.Smith..
		System.out.println(names[0][0]+names[1][0]);
		//This will output ?
		System.out.println(names[0][2]+names[1][1]);
		System.out.println(origArray[0][0]+origArray[1][2]+origArray[2][2]);
		
	}
}
