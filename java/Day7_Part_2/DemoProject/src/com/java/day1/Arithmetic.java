package com.java.day1;

public class Arithmetic {

	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int a,b;
		a=5;
		b=7;
		Arithmetic obj = new Arithmetic();
		int result = obj.sum(a, b);
		System.out.println("Sum is  " +result);
		result = obj.sub(a, b);
		System.out.println("Sub is  " +result);
		result = obj.mult(a, b);
		System.out.println("Multiplication is  " +result);
	}
}
