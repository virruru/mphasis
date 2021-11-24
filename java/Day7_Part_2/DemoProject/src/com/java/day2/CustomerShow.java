package com.java.day2;

public class CustomerShow {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.custId=1;
		c1.name="Jayasree";
		c1.city="Hyderabad";
		c1.billAmount = 88424;
		
		Customer c2 = new Customer();
		c2.custId=3;
		c2.name="Kajal";
		c2.city="Chennai";
		c2.billAmount=88224;
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
