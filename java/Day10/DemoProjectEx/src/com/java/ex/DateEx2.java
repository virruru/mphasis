package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public void convert(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date dt = sdf.parse(str);
		System.out.println(dt);
	}
	public static void main(String[] args) {
		String dt = "01-10-2021";
		DateEx2 obj = new DateEx2();
		try {
			obj.convert(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
