<%@page import="java.sql.PreparedStatement"%>
<%@page import="mphasis.JspDemos.ConnectionHelper"%>
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
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String dept = request.getParameter("dept");
	String desig = request.getParameter("desig");
	int basic = Integer.parseInt(request.getParameter("basic"));
	Connection conn = ConnectionHelper.getConnection();
	String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) " +
			" values(?,?,?,?,?,?) ";
	PreparedStatement pst = conn.prepareStatement(cmd);
	pst.setInt(1, empno);
	pst.setString(2,name);
	pst.setString(3,gender);
	pst.setString(4,dept);
	pst.setString(5,desig);
	pst.setInt(6,basic);
	pst.executeUpdate();
	out.println("*** Record Inserted ***");
%>
</body>
</html>