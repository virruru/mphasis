package com.java.ex;

import java.util.Scanner;

public class ScanEmploy {

	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name ");
		employ.setName(sc.next());
		System.out.println("Enter Gender ");
		String gen=sc.next();
		if (gen.equalsIgnoreCase("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.equalsIgnoreCase("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextInt());
		
		System.out.println(employ);
	}
}
