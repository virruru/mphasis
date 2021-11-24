package com.java.gen;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value " +a+ " B value " +b);
	}
}
public class SwapDemo {

	public static void main(String[] args) {
		int a=12, b=13;
		Data obj = new Data();
		obj.swap(a, b);
		String s1="Uday", s2="Prakash";
		obj.swap(s1, s2);
		boolean b1=true,b2=false;
		obj.swap(b1, b2);
	}
}
 