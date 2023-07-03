package com.java.infinite;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateEx {
	public static void main(String[] args) {
		 
		LocalDate id=LocalDate.from(LocalDate.now());
		System.out.println(id);
		
		LocalDate id1=LocalDate.now();
		LocalDate id2=LocalDate.of(2023, Month.FEBRUARY, 21);
		System.out.println(id1.isAfter(id2));
		System.out.println(id2.isBefore(id1));
		
		System.out.println(id2.isAfter(id1));
		
		System.out.println(id1.getDayOfMonth());
		System.out.println(id1.getMonth());
		
		LocalDate id3=id1.plus(2, ChronoUnit.DAYS);
		System.out.println(id3);
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);
		
		LocalTime lt=LocalTime.now();
		int h=lt.getHour();
		System.out.println(h);

		


	}

}
