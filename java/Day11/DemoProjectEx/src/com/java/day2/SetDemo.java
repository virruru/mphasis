package com.java.day2;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
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
