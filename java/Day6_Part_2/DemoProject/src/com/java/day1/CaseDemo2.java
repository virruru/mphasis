package com.java.day1;

public class CaseDemo2 {
	
	public void show(String dayName) {
		
		switch(dayName) {
			case "Monday" :
				System.out.println("Its Monday...");
				break;
			case "Tuesday" :
				System.out.println("Its Tuesday...");
				break;
			case "Wednesday" : 
				System.out.println("Its Wednesday...");
				break;
			case "Thursday" :
				System.out.println("Its Thursday...");
				break;
			case "Friday" :
				System.out.println("Its Friday...");
				break;
			case "Saturday" : 
				System.out.println("Its Saturday...");
				break;
			case "Sunday" : 
				System.out.println("Its Sunday...");
		}
	}
	public static void main(String[] args) {
		String dayName="Wednesday";
		CaseDemo2 obj = new CaseDemo2();
		obj.show(dayName);
	}
}
