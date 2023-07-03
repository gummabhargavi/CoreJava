package com.java.infinite;

import java.io.DataInputStream;
import java.io.IOException;

public class IntrestCalculator {
	public static void main(String[] args) throws IOException {
		Float pa=new Float(0);
		Float ri=new Float(0);
		int numberOfYears=0;
		
		DataInputStream in =new DataInputStream(System.in);
		String tempString;
		System.out.println("Enter PrincipalAmount: ");
		System.out.flush();
		tempString=in.readLine();  //to read the string or numbers together.
		pa=Float.valueOf(tempString);
		System.out.println("rate of interest is: ");
		System.out.flush();
		tempString=in.readLine();
		ri=Float.valueOf(tempString);
		System.out.println("Enter Number of Years: ");
		System.out.flush();
		tempString=in.readLine();
		numberOfYears=Integer.parseInt(tempString);
		
		//input is over : calculate the interest
		int interestTotal=(int) (pa*ri*numberOfYears);
		System.out.println("Total Interest is: "+interestTotal);
		
		
	}

}
