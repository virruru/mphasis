package com.java.abs;

abstract class Animal {
	abstract void name();
	abstract void type();
}

class Crocodile extends Animal {

	@Override
	void name() {
		System.out.println("Name is Crocodile...");
	}

	@Override
	void type() {
		System.out.println("Its Water Animal...");
	}
	
}
class Lion extends Animal {

	@Override
	void name() {
		System.out.println("Name is Lion...");
	}

	@Override
	void type() {
		System.out.println("Its Wild Animal...");
	}
	
}
public class AbsEx {
	public static void main(String[] args) {
		Animal[] arr = new Animal[] {
			new Lion(),
			new Crocodile()
		};
		for (Animal animal : arr) {
			animal.name();
			animal.type();
		}
	}
}
