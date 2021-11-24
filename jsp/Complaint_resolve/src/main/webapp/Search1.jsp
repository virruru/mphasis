<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
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
<table border=3>
	<tr>
		<th>Id</th>
		<th>Type</th>
		<th>description</th>
		<th>Complaint date</th>
		<th>severity</th>
		<th>status</th>
	</tr>
	<%
	Connection conn = ConnectionHelper.getConnection();
	String cmd = "select * from Complaint where complaintId=?";
	PreparedStatement pst = conn.prepareStatement(cmd);
	pst.setInt(1, Integer.parseInt(request.getParameter("id")));
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
	%>
	<tr>
		<th><%=rs.getString(1) %></th>
		<th><%=rs.getString(2) %></th>
		<th><%=rs.getString(3) %></th>
		<th><%=rs.getString(4) %></th>
		<th><%=rs.getString(5) %></th>
		<%String status=rs.getString(6);
			if(status.equals("Pending"))
			{%>
				<th style="color:red">Pending</th>
			<% } 
			else{%>
			<th style="color:Green">Resolved</th>
			<%} %>
	</tr>
	<%} %>
</body>
</html>