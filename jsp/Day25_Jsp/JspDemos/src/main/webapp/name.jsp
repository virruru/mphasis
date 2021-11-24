<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String firstName,lastName,fullName;
	firstName=request.getParameter("firstName");
	lastName=request.getParameter("lastName");
	fullName=firstName + "  " +lastName;
	out.println("Full Name   " +fullName);
%>
</body>
</html>