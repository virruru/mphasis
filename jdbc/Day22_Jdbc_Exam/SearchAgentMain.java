package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAgentMain {

	public static void main(String[] args) {
		int agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a agent id");
		agentid = sc.nextInt();
		AgentDAO dao = new AgentDAO();
		try {
			AgentExam agents = dao.searchAgent(agentid);
			if(agents!=null)
			{
				System.out.println(agents);
			}
			else
			{
				System.out.println("Record not found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
