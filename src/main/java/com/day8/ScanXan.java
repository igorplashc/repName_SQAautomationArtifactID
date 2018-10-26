package com.day8;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner scanner = null;
        //Scanner s1 = null;

        try {
        	scanner = new Scanner(new BufferedReader(new FileReader("src/main/resources/igor.txt")));
            //s1 = new Scanner(System.in);
        	scanner.useDelimiter(":");
            //Hello:World,How are you
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
                System.out.println(" After Delimiter");
            }
        } finally {
            if (scanner != null) {
            	scanner.close();
            }
        }
    }
}
