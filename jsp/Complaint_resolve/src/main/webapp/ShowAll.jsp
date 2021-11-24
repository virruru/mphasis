<%@page import="java.util.Date"%>
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
<jsp:include page="home.jsp"/>
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
	String cmd = "select * from Complaint";
	PreparedStatement pst = conn.prepareStatement(cmd);
	ResultSet rs=pst.executeQuery();
	Date today= new Date();
	while(rs.next())
	{
		Date cdate= rs.getDate("COMPLAINTDATE");
		long diff= today.getTime()-cdate.getTime();
		int days=(int) diff/(1000*60*60*24);
		days++;
		if(days>=7){
		
	%>
	<tr style="color:red">
		<th><%=rs.getString(1) %></th>
		<th><%=rs.getString(2) %></th>
		<th><%=rs.getString(3) %></th>
		<th><%=rs.getString(4) %></th>
		<th><%=rs.getString(5) %></th>
		<th><%=days %></th>
		<th><%=rs.getString(6)%></th>
		</tr>
			<%} 
		else if( days>1){
			%>
			<tr style="color:Green">
		<th><%=rs.getString(1) %></th>
		
		<th><%=rs.getString(2) %></th>
		<th><%=rs.getString(3) %></th>
		<th><%=rs.getString(4) %></th>
		<th><%=rs.getString(5) %></th>
		<th><%=days %></th>
		<th><%=rs.getString(6) %></th>
		</tr>
			<% 
		}else{
			%>
			<tr style="color:pink">
			<th><%=rs.getString(1) %></th>
			
			<th><%=rs.getString(2) %></th>
			<th><%=rs.getString(3) %></th>
			<th><%=rs.getString(4) %></th>
			<th><%=rs.getString(5) %></th>
			<th><%=days %></th>
			<th><%=rs.getString(6) %></th>
				
			</tr>
	
	
	<%}
	}%>
</body>
</html>