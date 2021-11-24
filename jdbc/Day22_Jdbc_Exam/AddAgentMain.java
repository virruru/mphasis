package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AddAgentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgentExam agent = new AgentExam();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		agent.setName(sc.next());
		System.out.println("enetr city");
		agent.setCity(sc.next());
		System.out.println("Enetr gender");
		agent.setGENDER(sc.next());
		System.out.println("enetr martialstatues");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("enetr primium");
		agent.setPremium(sc.nextDouble());
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.AddAgentExam(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
