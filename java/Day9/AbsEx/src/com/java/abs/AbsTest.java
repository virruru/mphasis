package com.java.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Abhinaya extends Training {

	@Override
	void name() {
		System.out.println("Name is Abhinaya...");
	}

	@Override
	void email() {
		System.out.println("Email is Abhinaya@gmail.com");
	}
	
}

class Uday extends Training {

	@Override
	void name() {
		System.out.println("Name is Uday...");
	}

	@Override
	void email() {
		System.out.println("Email is uday@gmail.com");
	}
	
	
}
class Haresh extends Training {

	@Override
	void name() {
		System.out.println("Name is Haresh Lad...");
	}

	@Override
	void email() {
		System.out.println("Email is haresh@gmail.com");
	}
	
}

class Gowri extends Training {

	@Override
	void name() {
		System.out.println("Name is Gowri..");
	}

	@Override
	void email() {
		System.out.println("Email is Gowri@gmail.com");
	}
	
}
public class AbsTest {

	public static void main(String[] args) {
//		Training obj1 = new Haresh();
//		Training obj2 = new Uday();
//		Training obj3 = new Abhinaya();
		
		Training[] arr = new Training[] {
			new Haresh(),
			new Uday(),
			new Abhinaya(),
			new Gowri()
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
