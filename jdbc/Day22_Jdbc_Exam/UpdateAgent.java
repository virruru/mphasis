package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	AgentExam agent = new AgentExam();
	System.out.println("Enter agent id");
	agent.setAgentID(sc.nextInt());
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
			System.out.println(dao.updateAgent(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
