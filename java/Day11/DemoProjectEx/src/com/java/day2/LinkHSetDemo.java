package com.java.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHSetDemo {

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add("Sivani");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Sateesh");
		s.add("Sivani");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Sivani");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Sivani");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Sateesh");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Sateesh");
		s.add("Pavithra");
		s.add("Namratha");
		s.add("Rahul");
		s.add("Sateesh");
		for (Object object : s) {
			System.out.println(object);
		}

	}
}
