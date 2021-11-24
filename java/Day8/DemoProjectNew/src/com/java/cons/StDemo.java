package com.java.cons;

public class StDemo {

	static int score;
	
	public void incr() {
		score++;
	}
	
	public void show() {
		System.out.println("Score is  " +score);
	}
	public static void main(String[] args) {
		StDemo obj1 = new StDemo();
		StDemo obj2 = new StDemo();
		StDemo obj3 = new StDemo();
		
		obj1.incr();
		obj2.incr();
		obj3.incr();
		
		obj1.show();
	}
}
