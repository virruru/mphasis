package com.java.abs;

abstract class Vehicle {
	abstract void name();
	abstract void model();
}

class Bike extends Vehicle {

	@Override
	void name() {
		System.out.println("Its Pulsor bike...");
	}

	@Override
	void model() {
		System.out.println("Its 2021 model 220CC Disc Break");
	}
}

class Car extends Vehicle {

	@Override
	void name() {
		System.out.println("Name is Baleno Car...");
	}

	@Override
	void model() {
		System.out.println("Its 2021 Model 1500CC");
	}
	
}
public class AbsNew {
	public static void main(String[] args) {
		
		Vehicle[] arr = new Vehicle[] {
			new Car(),new Bike()	
		};
		for (Vehicle vehicle : arr) {
			vehicle.name();
			vehicle.model();
		}
	}
}
