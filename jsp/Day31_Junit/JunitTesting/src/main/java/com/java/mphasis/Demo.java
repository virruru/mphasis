package com.java.mphasis;

public class Demo {

	public boolean check(int n) {
		if (n >=0) {
			return true;
		} else {
			return false;
		}
	}
	public int minArray(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if (min > a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public int max3(int a,int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m=c;
		}
		return m;
	}
	public int sum(int a,int b) {
		return a+b;
	}
	
	public String sayHello() {
		return "Welcome to Junit...";
	}
}
