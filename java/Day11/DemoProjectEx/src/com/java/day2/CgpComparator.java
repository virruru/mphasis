package com.java.day2;

import java.util.Comparator;

public class CgpComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if (s1.getCgp() >= s2.getCgp()) {
			return -1;
		} else {
			return 1;
		}
	}

	
}
