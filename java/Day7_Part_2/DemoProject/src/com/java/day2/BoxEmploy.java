package com.java.day2;

public class BoxEmploy {

	public void show(Object ob) {
		System.out.println(ob.getClass().getSimpleName());
	//	int x = (Integer)ob;
		String type = ob.getClass().getSimpleName();
		if (type.equals("Employ")) {
			Employ x = (Employ)ob;
			System.out.println("Employ No  " +x.empno);
			System.out.println("Employ Name " +x.name);
			System.out.println("Basic  " +x.basic);	
		}
		if (type.equals("Student")) {
			Student x = (Student)ob;
			System.out.println("Student Id  " +x.sno);
			System.out.println("Student Name  " +x.sname);
			System.out.println("CGP  " +x.cgp);
		}
	}
	
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno=1;
		employ.name="Shanmugavel";
		employ.basic=88422;
		
		Student student = new Student();
		student.sno=1;
		student.sname="Somendra";
		student.cgp=9.6;
		
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
		obj.show(student);
	}
}
