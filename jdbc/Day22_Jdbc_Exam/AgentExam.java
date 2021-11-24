package com.java.agent;

public class AgentExam {
	private int AgentID;
	private String Name;
	private String City;
	private String GENDER;
	private int MaritalStatus;
	private double Premium;
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	@Override
	public String toString() {
		return "AgentExam [AgentID=" + AgentID + ", Name=" + Name + ", City=" + City + ", GENDER=" + GENDER
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	

}
