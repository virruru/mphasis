package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMapEx {

	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<Integer, String>();
		m.put(1, "Somendra");
		m.put(2, "Lalitha");
		m.put(3, "Sowmya");
		m.put(4, "Susmitha");
		m.put(5, "Prakash");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		int empno = sc.nextInt();
		String name = m.getOrDefault(empno, "Not Found");
		System.out.println("Name is  " +name);
	}
}
