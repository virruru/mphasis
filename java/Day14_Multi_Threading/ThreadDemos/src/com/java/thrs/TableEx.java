package com.java.thrs;

class Mtable {
	
	synchronized void showTable(int x) {
		int p;
		for(int i=1;i<=10;i++) {
			p=x*i;
			System.out.println(x + " * " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Tab3 implements Runnable {
	Mtable m;
	Tab3(Mtable m) {
		this.m=m;
	}
	@Override
	public void run() {
		m.showTable(17);
	}

}
class Tab2 implements Runnable {

	Mtable m;
	Tab2(Mtable m) {
		this.m=m;
	}
	@Override
	public void run() {
		m.showTable(9);
	}
	
}
class Tab1 implements Runnable {
	
	Mtable m;
	Tab1(Mtable m) {
		this.m=m;
	}
	@Override
	public void run() {
		m.showTable(12);
	}
	
}
public class TableEx {
	public static void main(String[] args) {
		Mtable m = new Mtable();
		Thread t1 = new Thread(new Tab1(m));
		Thread t2 = new Thread(new Tab2(m));
		Thread t3 = new Thread(new Tab3(m));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
