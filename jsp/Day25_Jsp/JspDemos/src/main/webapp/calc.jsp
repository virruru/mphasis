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
	int a,b,c;
	a=Integer.parseInt(request.getParameter("firstNo"));
	b=Integer.parseInt(request.getParameter("secondNo"));
	c=a+b;
	out.println("Sum is  " +c + "<br/><br/>");
	c=a-b;
	out.println("Sub is   "+c+ "<br/><br/>");
	c=a*b;
	out.println("Mult is   " +c+ "<br/><br/>");
%>
</body>
</html>