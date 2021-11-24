package com.java.thrs;

class Second extends Thread {
	
	public void run() {
		for(int i=1;i<20;i+=2) {
			System.out.println("Odd  " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class First extends Thread {
	
	public void run() {
		for(int i=0;i<20;i+=2) {
			System.out.println("Even  " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Fact extends Thread {
	public void run() {
		int f=1;
		for(int i=1;i<=9;i++) {
			f=f*i;
			System.out.println("Factorial of "+i+ " is " +f);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThrDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new First());
		Thread t2 = new Thread(new Second());
		Thread t3 = new Thread(new Fact());
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}
}
