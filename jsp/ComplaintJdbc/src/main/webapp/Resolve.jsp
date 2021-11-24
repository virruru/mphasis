<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	String cid=request.getParameter("cid");
	String cdate=request.getParameter("cdate");
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date d=sdf.parse(cdate);
%>
<form method="get" action="Resolving.jsp">
	<center>
		Complaint ID : 
		<input type="text" name="cid" value=<%=cid %> /> <br/><br/>
		Complaint Date : 
		<input type="date" name="cdate" value=<%=cdate %> /> <br/><br/>
		Resolve Date : 
		<input type="date" name="crdate" /> <br/><br/>
		Resolved By : 
		<input type="text" name="rby" /> <br/><br/>
		Comments : 
		<input type="text" name="comment" /> <br/><br/>
		<input type="submit" value="Resolve" />
	</center>
</form>



</body>
</html>