package com.java.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Narendra implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is narendra@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Narendra...");
	}
	
}

public class MultiInh {
	public static void main(String[] args) {
		Narendra obj = new Narendra();
		obj.name();
		obj.email();
	}
}
