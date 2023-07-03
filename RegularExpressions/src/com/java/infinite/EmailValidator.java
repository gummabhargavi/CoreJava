package com.java.infinite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
		
		private Pattern p;
		private Matcher m;
		
		private static final String EMAIL_PATTER = 
				"^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"	
				+"[_A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
		
		public EmailValidator(){
			p=Pattern.compile(EMAIL_PATTER);
			
		}
		
	public boolean validate(final String hex){
		m=p.matcher(hex);
		return m.matches();
		
	}

}
