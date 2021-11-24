package com.java.cons;

public class Cricket {

	static int score;
	
	public void incr(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.incr(14);
		sb.incr(7);
		ext.incr(19);
		
		System.out.println(Cricket.score);
	}
}
