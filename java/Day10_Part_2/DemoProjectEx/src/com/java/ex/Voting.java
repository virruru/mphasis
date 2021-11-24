package com.java.ex;

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not elligile for voting...");
		} else {
			System.out.println("You are elligile for voting...");
		}
	}
	public static void main(String[] args) {
		int age=26;
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
