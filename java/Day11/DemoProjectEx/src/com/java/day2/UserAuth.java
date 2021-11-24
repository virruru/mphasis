package com.java.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("Chaitanya", "Kumar");
		m.put("Srija", "Karaumuri");
		m.put("Keerthi", "Chalamalasetty");
		m.put("Narendra", "Kumar");
		m.put("Susmitha", "Pasumarthi");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userName and Password");
		String user = sc.next();
		String pwd = sc.next();
		
		String res = (String) m.getOrDefault(user, "Not Found");
		
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
