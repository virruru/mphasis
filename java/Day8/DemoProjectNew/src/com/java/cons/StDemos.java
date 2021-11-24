package com.java.cons;

public class StDemos {

	public void show() {
		System.out.println("From Show Method...");
	}
	
	public static void display() {
		System.out.println("From Display Method...");
	}
	
	public static void main(String[] args) {
		StDemos obj = new StDemos();
		obj.show();
		StDemos.display();
	}
}
