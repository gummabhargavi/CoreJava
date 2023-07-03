package com.java.infinite;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
		
		while(true){
			
			System.out.println("Enter Regex pattern");
			String s=sc.nextLine();
			Pattern p=Pattern.compile(s);
			Matcher m=p.matcher("Welcome to infinite");
			boolean found=false;
			while(m.find()){
				System.out.println("Found the text "+m.group()+"\n"+"starting at index "+m.start()
				+"\n"+"and ending index "+m.end());
				found=true;
			}
			if(!found)
				System.out.println("Match not found");
		}
	}
	}

}
