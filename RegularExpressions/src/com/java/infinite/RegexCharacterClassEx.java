package com.java.infinite;

import java.util.regex.Pattern;

public class RegexCharacterClassEx {
	public static void main(String[] args) {
		System.out.println("pattern 1: "+Pattern.matches("[abc]", "a")); //true must be one character is need 
		System.out.println("pattern 2: "+Pattern.matches("[mno]", "mno")); //false (among m or n or o are true)
		System.out.println("pattern 3: "+Pattern.matches("[abcd]", "aabcdd")); //false
		
		System.out.println("pattern 4: "+Pattern.matches("[^ab]","c")); //true  
		
		System.out.println("pattern 5: "+Pattern.matches("[a-z&&[m-p]]","o"));  //intersected characters are true
	}

}
