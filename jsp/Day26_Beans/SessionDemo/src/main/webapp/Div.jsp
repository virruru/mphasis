<%@ page errorPage="errorPage.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Div.jsp">
	<center>
		First Number : 
		<input type="number" name="firstNo" /> <br/><br/>
		Second Number : 
		<input type="number" name="secondNo" /> <br/><br/> 
		<input type="submit" value="Calc" />
	</center>
</form>
<%
	if (request.getParameter("firstNo") !=null && request.getParameter("secondNo")!=null) {
		int fno = Integer.parseInt(request.getParameter("firstNo"));
		int sno = Integer.parseInt(request.getParameter("secondNo"));
		int res = fno/sno;
		out.println("Result is  " +res+ "<br/>");
	}
%>
</body>
</html>