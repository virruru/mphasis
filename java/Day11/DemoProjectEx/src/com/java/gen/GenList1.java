package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Keerthi");
		names.add("Namratha");
		names.add("Kajal");
		names.add("Pragathi");
		names.add("Gowree");
		//names.add(1);
		
		for (String s : names) {
			System.out.println(s);
		}
	}
}
