<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function chkLog() {
		var res=confirm("Are you Sure to logout?");
		if (res == true) {
			/* localStorage.clear();
			alert(localStorage.getItem("source")); */
			<% session.invalidate(); %>
			window.location="Login.jsp";
		}
		else{
			window.location="Search.jsp";
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="chkLog()">

	<%--  <%
		session.invalidate();
	%>
	
	<jsp:forward page="Login.html" />  --%>
</body>
</html>