package com.java.cons;

public class EmployArray {

	public static void main(String[] args) {
		Employ[] arrEmploy = new Employ[] {
			new Employ(1, "Mounika", 88234),
			new Employ(3, "Rahul", 99234),
			new Employ(4, "Sai Geetha", 90442)
		};
		
		System.out.println("Employ Array  ");
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
