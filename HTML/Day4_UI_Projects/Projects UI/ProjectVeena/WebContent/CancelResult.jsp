<%@page import="com.cts.dao.FlightDetailsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/login.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<script>
			function goBack() {
				window.history.back()
			}
		</script>
	</form>
	<form name="frmAirways">

		<table width="100%">
			<i class="fa fa-chevron-circle-left" type="button" value="Go back!"
				style="font-size: 26px" onclick="history.back()"></i>

			<tr height="40px" id="img1">
				<th><center>
						<img src="images/logo_new.PNG" height="92" width="642">
					</center></th>
			</tr>
			<tr id="img2">
				<th><div class="topnav">

						<a href="Search.jsp">Home</a> <a href="SignNew.jsp">Register</a> <a
							href="Login.html">Login</a> <a href="CancelNew.html">Cancel</a>
					</div> <br>
				<br>
				<br>

					<div style="background-color: white;">

						<br>
						<br>
						<br>
						<h3>Your ticket has been cancelled sucessfully</h3>
						<br>
						<br>
						<br>
					</div>
</body>
</html>