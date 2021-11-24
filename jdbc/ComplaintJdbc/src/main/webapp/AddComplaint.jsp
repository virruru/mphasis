<%@page import="java.sql.PreparedStatement"%>
<%@page import="mphasis.ComplaintJdbc.ConnectionHelper"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Complaint</title>
</head>
<body>
<%
//Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(request.getParameter("cdate"));
//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//String date=sdf.format(date1);
//Date finaldate=(Date)sdf.parse(date);
//LocalDate cdat=finaldate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
Connection conn = ConnectionHelper.getConnection();
String cmd = "Insert into Complaint(ComplaintID,ComplaintType,CDescription,ComplaintDate,Severity) " +
		" values(?,?,?,?,?) ";
PreparedStatement pst = conn.prepareStatement(cmd);
pst.setString(1, request.getParameter("cid"));
pst.setString(2,request.getParameter("ctype"));
pst.setString(3,request.getParameter("cdes"));
pst.setDate(4, java.sql.Date.valueOf(request.getParameter("cdate")));
pst.setString(5,request.getParameter("cser"));
pst.executeUpdate();
%>
<jsp:forward page="home.jsp"/>
</body>
</html>