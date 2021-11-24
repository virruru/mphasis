package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	private int ven_id;
	private String ven_name;
	private String ven_phn_no;
	private String ven_username;
	private String ven_password;
	private String ven_email;
	
	@Id
	public int getVen_id() {
		return ven_id;
	}
	public void setVen_id(int ven_id) {
		this.ven_id = ven_id;
	}
	public String getVen_name() {
		return ven_name;
	}
	public void setVen_name(String ven_name) {
		this.ven_name = ven_name;
	}
	public String getVen_phn_no() {
		return ven_phn_no;
	}
	public void setVen_phn_no(String ven_phn_no) {
		this.ven_phn_no = ven_phn_no;
	}
	public String getVen_username() {
		return ven_username;
	}
	public void setVen_username(String ven_username) {
		this.ven_username = ven_username;
	}
	public String getVen_password() {
		return ven_password;
	}
	public void setVen_password(String ven_password) {
		this.ven_password = ven_password;
	}
	public String getVen_email() {
		return ven_email;
	}
	public void setVen_email(String ven_email) {
		this.ven_email = ven_email;
	}
	
	
}
