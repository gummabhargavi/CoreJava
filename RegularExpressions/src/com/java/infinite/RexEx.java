package com.java.infinite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexEx {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("axx.");
		Matcher m=p.matcher("axx7");
		
		Pattern p1=Pattern.compile("[A-Za-z0-9]+");
		Matcher m1=p1.matcher("AVBc80@");
		System.out.println("Charcater with capital? "+m1.matches());

//		System.out.println("String matches the given Regex: "+m.matches());
//		System.out.println("Matched sequence is: "+m.group());
//		System.out.println("Ending index of the matched pattern is: "+m.end());
//
//		System.out.println(Pattern.matches("..gh.", "^3gh9"));
	}

}
