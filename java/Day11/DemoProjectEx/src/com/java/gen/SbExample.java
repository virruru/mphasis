package com.java.gen;

public class SbExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to Java Programming...");
		System.out.println(sb);
		sb.insert(10, "Trainer Prasanna");
		System.out.println(sb);
		sb.delete(5, 10);
		System.out.println(sb);
		sb.append("\nI am Pavithra...");
		System.out.println(sb);
	}
}
