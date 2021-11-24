<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="SessionDemo.jsp">
	Name : 
	<input type="text" name="sname" /> <br/><br/> 
	<input type="submit" value="Show" /> <br/><br/>
</form>
<%
	if (request.getParameter("sname") != null) {
		String sname = request.getParameter("sname");
		session.setAttribute("sname", sname);
		out.println("<a href=SessionDemo2.jsp>Session Demo2</a>");
	}
%>
</body>
</html>