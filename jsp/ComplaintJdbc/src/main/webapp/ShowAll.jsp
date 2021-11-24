<%@page import="java.sql.PreparedStatement"%>
<%@page import="mphasis.ComplaintJdbc.ConnectionHelper"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All</title>
</head>
<body>
<jsp:include page="home.jsp"/>
<table border=3>
	<tr>
		<th>Id</th>
		<th>Type</th>
		<th>description</th>
		<th>Complaint date</th>
		<th>servity</th>
		<th>status</th>
	</tr>
	<%
	Connection conn = ConnectionHelper.getConnection();
	String cmd = "select * from Complaint";
	PreparedStatement pst = conn.prepareStatement(cmd);
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		Date cdate= rs.getDate("COMPLAINTDATE");
		long diff= today.getTime()-cdate.getTime();
		int days=(int) diff/(1000*60*60*24);
		days++;
		if(days>=7){
	%>
	<tr style="color:Red">
		<th><%=rs.getString(1) %></th>
		<th><%=rs.getString(2) %></th>
		<th><%=rs.getString(3) %></th>
		<th><%=rs.getString(4) %></th>
		<th><%=rs.getString(5) %></th>
		<%String status=rs.getString(6)%></th>
                 </tr>
			<% } 
			else  if( days>1){%>
			<tr style="color:Green">
		<th><%=rs.getString(1) %></th>
		
		<th><%=rs.getString(2) %></th>
		<th><%=rs.getString(3) %></th>
		<th><%=rs.getString(4) %></th>
		<th><%=rs.getString(5) %></th>
		<th><%=days %></th>
		<th><%=rs.getString(6) %></th>
	</tr>
	<%} %>
</body>
</html>