package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {

	public static void main(String[] args) {
		Accounts accounts  = new Accounts();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FirstName  ");
		accounts.setFirstName(sc.next());
		System.out.println("Enter LastName   ");
		accounts.setLastName(sc.next());
		System.out.println("Enter City  ");
		accounts.setCity(sc.next());
		System.out.println("Enter State   ");
		accounts.setState(sc.next());
		System.out.println("Enter Amount   ");
		accounts.setAmount(sc.nextDouble());
		System.out.println("Enter CheqFacility  ");
		accounts.setCheqFacil(sc.next());
		System.out.println("Enter AccountType   ");
		accounts.setAccountType(sc.next());
		
		AccountsDAO dao = new AccountsDAO();
		try {
			System.out.println(dao.createAccount(accounts));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
