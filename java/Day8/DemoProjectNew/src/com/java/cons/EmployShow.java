package com.java.cons;

public class EmployShow {

	public static void main(String[] args) {
		
//		Employ e1 = new Employ();
//		e1.empno=1;
//		e1.name="Pragathi";
//		e1.basic=88234;
		Employ emp1 = new Employ(1, "Rahul", 88234);
		System.out.println(emp1);
		
		Employ emp2 = new Employ(3, "Snigdha", 99422);
		System.out.println(emp2);
	}
}
