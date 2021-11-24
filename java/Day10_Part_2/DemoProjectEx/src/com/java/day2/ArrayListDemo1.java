package com.java.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		
		names.add("Ashwin");
		names.add("Uday");
		names.add("Gowree");
		names.add("Divyanshu");
		
		System.out.println("ArrayList values are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		
		names.add(2, "Bhanu");
		System.out.println("List after adding new Value");
		for (Object object : names) {
			System.out.println(object);
		}
		names.set(2, "Praveen");
		System.out.println("List after Updating Value  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Gowree");
		System.out.println("List after Removing by Object  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
