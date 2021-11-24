package com.java.day2;

import java.util.Comparator;

public class CityComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getCity().compareTo(s2.getCity());
	}
	
}
