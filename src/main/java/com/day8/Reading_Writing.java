package com.day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Reading_Writing {

	public static void main(String[] args) throws IOException {
		/*
		 * Read a File called test.txt that has the following content
		 *  7,7,7,7,7
			2,2,2,2,2
			1,1,1,1,1
			4,4,4,4,4
			Write a method called parseCSVData that takes inputstream as argument 
			and returns the 2diamention array of double values.
			The values should be copied to 2-diamention array
			
		 */
		String file = "src/main/resources/text.txt";
		BufferedReader inpStr = new BufferedReader(new FileReader(file));
		double[][] dblArr = parseCSVData(inpStr);
		
		for(int i=0; i<dblArr.length; i++) {
			for(int j=0; j<dblArr[i].length; j++) {
				System.out.print(dblArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static double[][] parseCSVData(BufferedReader inputStream) throws IOException {
		
        double[][] Array2dmntDouble = new double[4][5];
		String str;
        int rowNumber = 0;
                
        while ((str = inputStream.readLine()) != null) {
            String[] Array1dmntString = str.split(",");
        	for (int i=0; i<Array1dmntString.length; i++) {
            	Array2dmntDouble[rowNumber][i] = Double.parseDouble(Array1dmntString[i]);
            }
            rowNumber++;	      
        }
        inputStream.close();
		return Array2dmntDouble;
	}
}
