package com.java.infinite;

import java.util.regex.Pattern;

public class RegularExQuantifiers {
	public static void main(String[] args) {
		System.out.println("? quantifier ....");  //occurs only onces
		System.out.println(Pattern.matches("[amn]?", "a")); //true (a or m or n comes one time) 
		
		System.out.println("+ quantifier ...."); //occurs once or more time
		System.out.println(Pattern.matches("[anm]+", "nnmm"));
		
		System.out.println("* quantifier ...."); //occurs zero or more times
		System.out.println(Pattern.matches("[xyz]*","z"));
	}

}
