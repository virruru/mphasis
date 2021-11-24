package com.java.day1;

public class Calculation {

	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum is  " +c);
	}
	public static void main(String[] args) {
		int a,b;
		a=5;
		b=8;
		Calculation obj = new Calculation();
		obj.sum(a, b);
	}
}
