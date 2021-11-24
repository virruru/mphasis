package com.java.day1;

class Data {
	
	public void geetha() {
		System.out.println("Hi I am Geetha...");
	}
	
	private void suresh() {
		System.out.println("Hi I am Sumanthran...");
	}
	
	void sowmya() {
		// suresh();
		System.out.println("Hi I am Sowmya...");
	}
}

public class Demo {
	public static void main(String[] args) {
		Data obj = new Data();
		obj.geetha();
		obj.sowmya();
	}
}
