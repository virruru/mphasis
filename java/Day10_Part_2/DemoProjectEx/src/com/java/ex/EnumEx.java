package com.java.ex;

enum WeekDays {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

public class EnumEx {

	public static void main(String[] args) {
		WeekDays wd = WeekDays.WEDNESDAY;
		System.out.println(wd);
		
		// HOw to convert String to enum 
		
		String str="FRIDAY";
		WeekDays wd1 = WeekDays.valueOf(str);
		System.out.println(wd1);
	}
}
