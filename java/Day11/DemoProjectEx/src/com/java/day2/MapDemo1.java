package com.java.day2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {

	public static void main(String[] args) {
		Map data = new Hashtable();
		data.put(1, "Jeevana");
		data.put(2, "Jyotsna");
		data.put(3, "Kajal");
		data.put(4, "Srija");
		data.put(5, "Snigdha");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No");
		int empno = sc.nextInt();
		String name = (String)data.getOrDefault(empno, "Not Found");
		System.out.println(name);
	}
}
