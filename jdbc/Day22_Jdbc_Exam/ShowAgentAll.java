package com.java.agent;

import java.sql.SQLException;

public class ShowAgentAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgentDAO dao = new AgentDAO();
		AgentExam[] arrAgentExam;
		try 
		{
			arrAgentExam = dao.showAgent();
			for (AgentExam agentExam : arrAgentExam) 
			{
				System.out.println(agentExam);
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
