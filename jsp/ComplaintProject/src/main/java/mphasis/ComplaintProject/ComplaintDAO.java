package mphasis.ComplaintProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ComplaintDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String generateId() throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = " select case when max(complaintId) is NULL"
				+ " then 1 else max(complaintId)+1 end ID from complaint ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		String id=rs.getString("ID");
		return id;
	}
	
	public String addComplaint(Complaint complaint) throws ClassNotFoundException, SQLException {
		String id = generateId();
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Books(id,name,author,edition,dept,totalBooks) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, "complaintId");
		pst.setString(2, complaint.getComplaintType());
		pst.setString(3, complaint.getcDescription());
		pst.setDate(4, complaint.getComplaintDate());
		pst.setString(5, complaint.getSeverity()); 
		pst.setString(6, complaint.getStatus());
		pst.executeUpdate();
		return "Complaint Registered...";
	}
	
	public Complaint searchComplaint(String id) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from complaint where complaintid=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, "complaintId");
		ResultSet rs = pst.executeQuery();
		Complaint complaint = null;
		if (rs.next()) {
			complaint = new Complaint();
			complaint.setComplaintId(rs.getString("complaintId"));
			complaint.setComplaintType(rs.getString("complaintType"));
			complaint.setcDescription(rs.getString("cDescription"));
			complaint.setComplaintDate(rs.getDate("complaintDate"));
			complaint.setSeverity(rs.getString("severity"));
			complaint.setStatus(rs.getString("status"));
		}
		return complaint;
	}
	
	public Complaint[] showComplaint() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Complaint> complaintList = new ArrayList<Complaint>();
		Complaint complaint = null;
		while(rs.next()) {
			complaint = new Complaint();
			complaint.setComplaintId(rs.getString("complaintId"));
			complaint.setComplaintType(rs.getString("complaintType"));
			complaint.setcDescription(rs.getString("cDescription"));
			complaint.setComplaintDate(rs.getDate("complaintDate"));
			complaint.setSeverity(rs.getString("severity"));
			complaint.setStatus(rs.getString("status"));
			complaintList.add(complaint);
		}
	    return complaintList.toArray(new Complaint[complaintList.size()]);
	}
}
