package com.java.day2;

public class StrArray {

	public void show() {
		String[] names = new String[] {
				"Abhinaya",
				"Pragathi",
				"Kajal",
				"Jeevana",
				"Manoj",
				"Namratha"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StrArray obj = new StrArray();
		obj.show();
	}
}
