package com.java.thrs;

class Data {
	synchronized void showMsg(String name) {
		System.out.print("Hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are you...");
	}
}

class Pavithra extends Thread {
	Data d;
	Pavithra(Data d) {
		this.d=d;
	}
	public void run() {
		d.showMsg("Pavithra");
	}
}
class Abhinaya extends Thread {
	Data d;
	Abhinaya(Data d) {
		this.d=d;
	}
	public void run() {
		d.showMsg("Abhinaya");
	}
}

class Uday extends Thread {
	Data d;
	Uday(Data d) {
		this.d=d;
	}
	public void run() {
		d.showMsg("Uday");
	}
}
public class SyncDemo {
	public static void main(String[] args) {
		Data d = new Data();
		Thread t1 = new Thread(new Uday(d));
		Thread t2 = new Thread(new Pavithra(d));
		Thread t3 = new Thread(new Abhinaya(d));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
