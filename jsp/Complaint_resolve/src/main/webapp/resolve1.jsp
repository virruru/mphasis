<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="mphasis.Complaint_resolve.ConnectionHelper"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Connection conn = ConnectionHelper.getConnection();
		String cmd = "Insert into Resolve" +
				" values(?,?,?,?,?) ";
		PreparedStatement pst = conn.prepareStatement(cmd);
		pst.setString(1, request.getParameter("cid"));
		pst.setDate(2,java.sql.Date.valueOf(request.getParameter("cdate")));
		pst.setDate(3,java.sql.Date.valueOf(request.getParameter("crdate")));
		pst.setString(4,request.getParameter("rby"));
		pst.setString(5,request.getParameter("comment"));
		pst.executeUpdate();
		
		cmd="update Complaint set Status=? where ComplaintID=?";
		pst = conn.prepareStatement(cmd);
		pst.setString(1, "Resolved");
		pst.setString(2, request.getParameter("cid"));
		pst.executeUpdate();
%>
<jsp:forward page="home.jsp"/>
</body>
</html>