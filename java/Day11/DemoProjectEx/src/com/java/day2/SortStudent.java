package com.java.day2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		// Comparator c = new CityComparator();
		Comparator c = new CgpComparator();
		SortedSet students = new TreeSet(c);
		students.add(new Student(1, "Mohan", "Hyderabad", 9.4));
		students.add(new Student(2, "Keerthi", "Chennai", 8.9));
		students.add(new Student(3, "Chaitanya", "Delhi", 8.6));
		students.add(new Student(4, "Haresh", "Bangalore", 9.0));
		students.add(new Student(5, "Gauree", "Pune", 8.8));
		students.add(new Student(6, "HariPriya", "Erode", 9.1));
		
		System.out.println("Student Details are ");
		for (Object object : students) {
			System.out.println(object);
		}
	}
}
