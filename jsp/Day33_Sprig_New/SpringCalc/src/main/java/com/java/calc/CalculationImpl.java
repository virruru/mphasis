package com.java.calc;

public class CalculationImpl implements Calculation {

	private int firstNo;
	private int secondNo;
	
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	
	@Override
	public int sum() {
		return firstNo + secondNo;
	}

	@Override
	public int sub() {
		return firstNo - secondNo;
	}
	
	@Override
	public int mult() {
		return firstNo * secondNo;
	}
}
