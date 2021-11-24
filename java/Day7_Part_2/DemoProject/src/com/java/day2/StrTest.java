package com.java.day2;

public class StrTest {

	public static void main(String[] args) {
		String str="Welcome to Java Programming...Prasanna";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Occurrence of char 'a' is  " +str.indexOf("a"));
		System.out.println("Char at 5th position " +str.charAt(5));
		System.out.println("Lower Case String " +str.toLowerCase());
		System.out.println("Upper Case String  " +str.toUpperCase());
		System.out.println("Part of the String  " +str.substring(1, 15));
		String s1="Vallabh", s2="Abhinaya", s3="Vallabh";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}
