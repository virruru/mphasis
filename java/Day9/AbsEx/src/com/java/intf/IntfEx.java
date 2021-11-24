package com.java.intf;

interface ITraining {
	void name();
	void email();
}

class Pavithra implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Pavithra...");
	}

	@Override
	public void email() {
		System.out.println("Email is pavithra@gmail.com");
	}
	
}
class Gauree implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Gauree...");
	}

	@Override
	public void email() {
		System.out.println("Email is gauree@gmail.com");
	}
	
}

class Hardik implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Hardik...");
	}

	@Override
	public void email() {
		System.out.println("Email is hardik@gmail.com");
	}
	
}

public class IntfEx {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Hardik(),
			new Pavithra(),
			new Gauree()
		};
		for (ITraining t : arr) {
			t.name();
			t.email();
		}
	}
}
