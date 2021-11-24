package com.java.ex;

public class DivEx {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division  " +c);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero impossible...");
		}
		catch (NumberFormatException e) {
			System.out.println("String cannot be converted as Integer...");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from Mphasis Batch...");
		}
	}
}
