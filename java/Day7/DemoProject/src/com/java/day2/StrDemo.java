package com.java.day2;

public class StrDemo {

	public static void main(String[] args) {
		String str="Hello";
		str.concat(" World");
		System.out.println(str.concat(" World"));
		String s2 = str.concat(" World");
		System.out.println(s2);
		System.out.println(str);
	}
}
