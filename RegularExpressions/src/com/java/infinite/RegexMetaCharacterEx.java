package com.java.infinite;

import java.util.regex.Pattern;

public class RegexMetaCharacterEx {
	public static void main(String[] args) {
		System.out.println("Metacharacter \\d is....");
		System.out.println(Pattern.matches("\\d", "8"));  //true only one  numbers will be true
		
		System.out.println("Metacharacter \\D is...");
		System.out.println(Pattern.matches("\\D", "ab")); // only one character is true
	}

}
