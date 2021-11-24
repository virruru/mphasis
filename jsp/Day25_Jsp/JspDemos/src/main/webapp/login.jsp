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
	String user,pwd;
	user = request.getParameter("userName");
	pwd = request.getParameter("passWord");
	if (user.equals("Mohan") && pwd.equals("Aditya")) {
	%>
	  <jsp:forward page="menu.jsp"/>
	<%
	} else {
	%>
		<jsp:include page="login.html"/>
	<%
	out.println("Invalid Credentials...");
	}
%>

</body>
</html>