package com.java.cons;

public class ConTest {

	int a,b;
	
	public ConTest() {
		a=0;
		b=0;
	}
	
	public ConTest(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int sum() {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		ConTest obj1 = new ConTest(56, 42);
		System.out.println("Sum is  " +obj1.sum());
	} 
}
