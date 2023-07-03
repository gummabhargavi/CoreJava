package com.java.infinite;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatEx {
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.of(2023, Month.FEBRUARY, 12,10,25);
		//System.out.println(ldt);
		
		String fd=ldt.format(DateTimeFormatter.ISO_DATE);
		System.out.println(fd);
		
		String fd1=ldt.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(fd1);
		
		String fd2=ldt.format(DateTimeFormatter.ISO_TIME);
		System.out.println(fd2);
		System.out.println(ldt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
	}

}
