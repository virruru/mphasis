package com.java.agent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	Connection connection;
	PreparedStatement pst;
	public String AddAgentExam(AgentExam agent) throws ClassNotFoundException, SQLException
	{
		connection = ConnectionHelper.getConnection();
		int agentid = generateAgentId();
		agent.setAgentID(agentid);
		String cmd = "Insert into AgentExam(AgentId,Name,City,Gender,MaritalStatus,Premium)" + "values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentid);
		pst.setString(2,agent.getName());
		pst.setString(3,agent.getCity());
		pst.setString(4, agent.getGENDER());
		pst.setInt(5,agent.getMaritalStatus());
		pst.setDouble(6,agent.getPremium());
		pst.executeUpdate();
		return "Add agent successfullycompleted...";
		
	}
	public int generateAgentId() throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd = " select case when max(AgentId) is NULL"
				+ " then 1 else max(AgentId)+1 end agentid from AgentExam ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int AgentId= rs.getInt("agentid");
		return AgentId;
	}
	public AgentExam searchAgent(int agentid) throws ClassNotFoundException, SQLException
	{
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from AgentExam where AgentID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentid);
		ResultSet rs = pst.executeQuery();
		AgentExam agent = null;
		if (rs.next()) {
			agent = new AgentExam();
			agent.setAgentID(rs.getInt("agentid"));
			agent.setName(rs.getString("Name"));
			agent.setCity(rs.getString("city"));
			agent.setGENDER(rs.getString("GENDER"));
			agent.setMaritalStatus(rs.getInt("MaritalStatus"));
			agent.setPremium(rs.getDouble("Premium"));
		}
		return agent;
	}
	public String DeleteAgent(int Agentid) throws ClassNotFoundException, SQLException
	{
	AgentExam agent = searchAgent(Agentid);	
	if(agent!=null)
	{
		String cmd = "delete from AgentExam where AgentID=?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, Agentid);
		pst.executeUpdate();
	}
	return "Agent Closed...";
	}
	public String updateAgent(AgentExam agentexam) throws ClassNotFoundException, SQLException {
		AgentExam agentexamFound = searchAgent(agentexam.getAgentID());
		if (agentexamFound != null) {
			String cmd = "Update AgentExam set Name=?, Gender=?, City=?, MaritalStatus=?, Premium=? "
					+ " Where AgentID=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, agentexam.getName());
			pst.setString(2, agentexam.getGENDER());
			pst.setString(3, agentexam.getCity());
			pst.setInt(4, agentexam.getMaritalStatus()); 
			pst.setDouble(5, agentexam.getPremium());
			pst.setInt(6, agentexam.getAgentID());
			pst.executeUpdate();
			return "Record Updated...";
		}
		return "Record Not Found...";
	}
	public AgentExam[] showAgent() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from AgentExam";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<AgentExam> agentexamList = new ArrayList<AgentExam>();
		AgentExam agentexam = null;
		while(rs.next()) {
			agentexam = new AgentExam();
			agentexam.setAgentID(rs.getInt("agentid"));
			agentexam.setName(rs.getString("name"));
			agentexam.setGENDER(rs.getString("gender"));
			agentexam.setCity(rs.getString("city"));
            agentexam.setMaritalStatus(rs.getInt("maritalstatus"));
			agentexam.setPremium(rs.getDouble("premium"));
			agentexamList.add(agentexam);
		}
	    return agentexamList.toArray(new AgentExam[agentexamList.size()]);
	}
}
