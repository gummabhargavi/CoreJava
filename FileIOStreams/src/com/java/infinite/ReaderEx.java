package com.java.infinite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class ReaderEx {
     public static void main(String[] args) {
		
    	 Reader r;
		try {
			r = new FileReader("d:\\File\\writer.txt");
			Scanner sc=new Scanner(r);
	    	 while(sc.hasNextLine()){
	    		 String s=sc.nextLine();
	    		 System.out.println(s);
	    	 }
	    	 sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
	}
}
