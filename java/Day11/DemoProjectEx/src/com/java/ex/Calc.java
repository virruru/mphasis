package com.java.ex;

public class Calc {

	public void sum(int a,int b) throws NegativeException, NumberZeroException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Numbers Not Allowed...");
		} else if (a==0 || b==0) {
			throw new NumberZeroException("Zero is Invalid Value...");
		} else {
			int c=a+b;
			System.out.println("Sum is  " +c);
		}
	}
	public static void main(String[] args) {
		int a=8,b=6;
		Calc obj = new Calc();
		try {
			obj.sum(a, b);
		} catch (NegativeException | NumberZeroException e) {
			e.printStackTrace();
		}
	}
}
