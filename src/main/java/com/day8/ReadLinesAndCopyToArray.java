package com.day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.sql.*;

public class ReadLinesAndCopyToArray {
	public static void main(String[] args) {
		BufferedReader inputStream = null;
			//PrintWriter outputStream = null;		//why do we need this ?
		double[][] myArray = parseCsvData(inputStream);
		
		for (int i = 0; i < myArray.length; i++) {
			for (int y = 0; y < myArray[i].length; y++) {
				// System.out.println(" The Output Array");
				// System.out.println(" The y value " +y);
				System.out.print(myArray[i][y] + "\t");
			}
			System.out.println();
		}
	}

	public static double[][] parseCsvData(BufferedReader inpStream) {
		double[][] dblArray = new double[4][5];
		int Rowc = 0;
		try {
			String inputFile = "C:\\Users\\Igor\\eclipse-workspace-3\\SQA_automation_ArtifactID\\src\\main\\resources\\text.txt";
			inpStream = new BufferedReader(new FileReader(inputFile));
			String l;
			
			while ((l = inpStream.readLine()) != null) {
				System.out.println(" The input line " + l);
				
				String[] inputArray = l.split(",");
				
				System.out.println("array representing single line - "+Arrays.toString(inputArray));
				
				for (int x = 0; x < inputArray.length; x++) {
					//System.out.println(" The input " + inputArray[x]);
					dblArray[Rowc][x] = Double.parseDouble(inputArray[x]);
				}
				Rowc++;
			}
			System.out.println(" The Output Array length - " + Rowc);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found" + e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(" Number Format Exception for File Double" + e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException reading from File" + e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException Reading past array" + e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dblArray;
	}
}
