<%@page import="java.sql.ResultSet"%>
<%@page import="mphasis.Complaint_resolve.ConnectionHelper"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<th>Action</th>
	</tr>
	<%
	Connection conn = ConnectionHelper.getConnection();
	String cmd = "select * from Complaint where Status=?";
	PreparedStatement pst = conn.prepareStatement(cmd);
	pst.setString(1, "Pending");
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
		<th><%=rs.getString(6) %></th>
		<th><a href="resolve.jsp?cid=<%=rs.getString(1) %>&cdate=<%=rs.getString(4) %>">Resolve</a></th>
	</tr>
	<%} %>
</body>
</html>