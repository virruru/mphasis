package com.java.day1;

public class CaseDemo1 {

	public void show(int empno) {
		
		switch(empno) {
		case 1 : 
			System.out.println("Name is Sai Geetha...");
			break;
		case 2 : 
			System.out.println("Name is Varun Naik...");
			break;
		case 3 :
			System.out.println("Name is Mounika Vemula...");
			break;
		case 4 : 
			System.out.println("Name is Shanmugavel S...");
			break;
		case 5 : 
			System.out.println("Name is Keerthi Chalamalasetty...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int empno=1;
		CaseDemo1 obj = new CaseDemo1();
		obj.show(empno);
	}
}
