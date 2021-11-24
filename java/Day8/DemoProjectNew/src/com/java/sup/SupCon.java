package com.java.sup;

class Employ {
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

class Sowmya extends Employ {

	public Sowmya(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}


class Sakshi extends Employ {

	public Sakshi(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class SupCon {
	public static void main(String[] args) {
		Sowmya obj1 = new Sowmya(1, "Sowmya", 99234);
		System.out.println(obj1);
		
		Sakshi obj2 = new Sakshi(3, "Sakshi", 99322);
		System.out.println(obj2);
	}
}
