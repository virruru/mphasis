package com.java.day2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
	//	Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Anshual", 99322));
		// employs.add(1);
		employs.add(new Employ(3,"Poortna",99211));
		employs.add(new Employ(4, "Darshan", 99255));
		employs.add(new Employ(5, "Bharath", 95663));
		employs.add(new Employ(6, "Uday", 99421));
		employs.add(new Employ(7, "Narendra", 99225));
		System.out.println("Employ List  ");
		for (Object ob : employs) {
			System.out.println(ob);
		}
	}
}
