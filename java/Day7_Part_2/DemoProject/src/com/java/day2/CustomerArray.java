package com.java.day2;

public class CustomerArray {

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
		
		Customer c3 = new Customer();
		c3.custId=4;
		c3.name="Srija";
		c3.city="Bangalore";
		c3.billAmount=90445;
		
		Customer[] arr = new Customer[] {c1, c2, c3};
		
		for (Customer customer : arr) {
			System.out.println(customer);
		}
	}
}
