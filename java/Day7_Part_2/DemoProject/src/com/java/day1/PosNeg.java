package com.java.day1;

public class PosNeg {

	public void check(int n) {
		if (n < 0) {
			System.out.println("Negative Number...");
		} else {
			System.out.println("Positive Number...");
		}
	}
	
	public static void main(String[] args) {
		int n=-6;
		PosNeg obj = new PosNeg();
		obj.check(n);
	}
}
