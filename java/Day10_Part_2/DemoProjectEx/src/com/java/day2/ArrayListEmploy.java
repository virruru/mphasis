package com.java.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Aseem", 99244));
		employList.add(new Employ(2, "Uday Prakash", 99244));
		employList.add(new Employ(3, "Bhanu Praveen", 90555));
		employList.add(new Employ(4, "Ashwin Kumar", 88944));
		employList.add(new Employ(5, "Avula Jayashree", 90844));
		
		for (Object ob : employList) {
			Employ e = (Employ)ob;
			System.out.println(e);
		}
	}
}
