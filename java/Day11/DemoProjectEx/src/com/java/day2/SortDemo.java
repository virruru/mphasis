package com.java.day2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Prakash");
		names.add("Namratha");
		names.add("Pavithra");
		names.add("Mohan");
		names.add("Gowree");
		names.add("Uday");
		names.add("Jyotsna");
		names.add("Pragathi");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
