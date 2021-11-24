package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {
	
	private int cus_id;
	private int wal_id;
	private double wal_amount;
	private String wal_source;
	
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	@Id
	public int getWal_id() {
		return wal_id;
	}
	public void setWal_id(int wal_id) {
		this.wal_id = wal_id;
	}
	public double getWal_amount() {
		return wal_amount;
	}
	public void setWal_amount(double wal_amount) {
		this.wal_amount = wal_amount;
	}
	public String getWal_source() {
		return wal_source;
	}
	public void setWal_source(String wal_source) {
		this.wal_source = wal_source;
	}
	
	
	

}
