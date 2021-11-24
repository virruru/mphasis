package com.java.sup;

public class StudentInfo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setSno(1);
		student.setSname("Uday");
		student.setCity("Hyderabad");
		student.setCgp(9.2);
		System.out.println(student);
		
		System.out.println("Student No  " +student.getSno());
		System.out.println("Student Name  " +student.getSname());
		System.out.println("City  " +student.getCity());
		System.out.println("Cgp  " +student.getCgp());
	}
}
