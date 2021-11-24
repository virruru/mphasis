package com.java.files;

public class EmployData {
	private int empno;
	private String name;
	private double basic;
	public EmployData() {
		// TODO Auto-generated constructor stub
	}
	public EmployData(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "EmployData [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	

}
