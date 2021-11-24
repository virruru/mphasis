package com.java.day2;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Anshul");
		names.add("Bhanu");
		names.add("Uday");
		names.add("Srija");
		names.add("Jyotsna");
		
		System.out.println("Linked List Elements are");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.addFirst("Keerthi");
		names.addLast("Prakash");
		System.out.println("Linked List new Elements");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
