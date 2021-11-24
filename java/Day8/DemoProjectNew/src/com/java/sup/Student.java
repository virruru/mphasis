package com.java.sup;

public class Student {

	private int sno;
	private String sname;
	private String city;
	private double cgp;
	
	
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCgp() {
		return cgp;
	}

	public void setCgp(double cgp) {
		this.cgp = cgp;
	}

	public Student() {

	}

	public Student(int sno, String sname, String city, double cgp) {
		this.sno = sno;
		this.sname = sname;
		this.city = city;
		this.cgp = cgp;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	
}
