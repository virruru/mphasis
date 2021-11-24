package com.java.thrs;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

class C3 implements Runnable {

	@Override
	public void run() {
		Vector<String> names = new Vector<String>();
		names.add("Uday");
		names.add("Sowmya");
		names.add("Bharath");
		names.add("Ashwin");
		names.add("Abhinaya");
		names.add("Prakash");
		names.add("Sakshi");
		names.add("Aseem");
		for (String v : names) {
			System.out.println("Vector  " +v);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class C2 implements Runnable {

	@Override
	public void run() {
		SortedSet<String> names = new TreeSet<String>();
		names.add("Uday");
		names.add("Sowmya");
		names.add("Bharath");
		names.add("Ashwin");
		names.add("Abhinaya");
		names.add("Prakash");
		names.add("Sakshi");
		names.add("Aseem");
		
		for (String s : names) {
			System.out.println("Treeset  " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class C1 implements Runnable {

	@Override
	public void run() {
		List<String> names = new ArrayList<String>();
		names.add("Uday");
		names.add("Sowmya");
		names.add("Prakash");
		names.add("Sakshi");
		names.add("Aseem");
		
		for (String s : names) {
			System.out.println("ArrayList " +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThrTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new C1());
		Thread t2 = new Thread(new C2());
		Thread t3 = new Thread(new C3());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
