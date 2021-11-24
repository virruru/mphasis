<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="mphasis.JspDemos.ConnectionHelper"%>
<%@page import="oracle.ucp.ConnectionHarvestingCallback"%>
<%@page import="java.sql.Connection"%>
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
	int empno = Integer.parseInt(request.getParameter("empno"));
	Connection con = ConnectionHelper.getConnection();
	String cmd="select * from Employ where empno=?";
	PreparedStatement pst = con.prepareStatement(cmd);
	pst.setInt(1, empno);
	ResultSet rs = pst.executeQuery();
	if (rs.next()) {
		out.println("Name  " +rs.getString("name") + "<br/>");
		out.println("Department  " +rs.getString("dept") + "<br/>");
		out.println("Gender  " +rs.getString("gender") + "<br/>");
		out.println("Designation  " +rs.getString("desig") + "<br/>");
		out.println("Basic  " +rs.getString("basic") + "<br/>");
	} else {
		out.println("*** Record Not Found ***");
	}
%>
</body>
</html>