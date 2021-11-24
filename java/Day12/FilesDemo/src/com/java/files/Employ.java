package com.java.files;

import java.io.Serializable;

public class Employ implements Serializable {

	private int empno;
	private String name;
	private double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	public Employ() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}
