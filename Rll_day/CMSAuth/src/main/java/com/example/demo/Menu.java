package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	private int men_id;
	private String men_item;
	private double men_price;
	private double men_calories;
	private String men_speciality;
	@Id
	public int getMen_id() {
		return men_id;
	}
	public void setMen_id(int men_id) {
		this.men_id = men_id;
	}
	public String getMen_item() {
		return men_item;
	}
	public void setMen_item(String men_item) {
		this.men_item = men_item;
	}
	public double getMen_price() {
		return men_price;
	}
	public void setMen_price(double men_price) {
		this.men_price = men_price;
	}
	public double getMen_calories() {
		return men_calories;
	}
	public void setMen_calories(double men_calories) {
		this.men_calories = men_calories;
	}
	public String getMen_speciality() {
		return men_speciality;
	}
	public void setMen_speciality(String men_speciality) {
		this.men_speciality = men_speciality;
	}



}
