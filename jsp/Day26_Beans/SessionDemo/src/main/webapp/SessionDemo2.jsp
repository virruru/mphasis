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
	String sname = (String)session.getAttribute("sname");
	out.println("Name from Second Page  " +sname+ "<br/>");
%>
</body>
</html>