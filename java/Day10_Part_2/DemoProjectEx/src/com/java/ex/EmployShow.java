package com.java.ex;

public class EmployShow {

	public static void main(String[] args) {
		Employ emp1 = new Employ(1, "Narendra", Gender.MALE, "Java", "Programmer", 88244);
		System.out.println(emp1);
		Employ emp2 = new Employ();
		emp2.setEmpno(3);
		emp2.setName("Gowree");
		emp2.setGender(Gender.MALE);
		emp2.setDept("Java");
		emp2.setDesig("Programmer");
		emp2.setBasic(88245);
	//	emp2.setGender("ABC");
		System.out.println(emp2);
	}
}
