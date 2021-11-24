package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class DeletAgentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter agent id");
		agentid = sc.nextInt();
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.DeleteAgent(agentid));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
