package com.java.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntDemo {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(new Integer(12));
		numbers.add(new Integer(43));
		numbers.add(new Integer(82));
		numbers.add(new Integer(45));
		
		int sum=0;
		
		for (Object ob : numbers) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is  " +sum);
	}
}
