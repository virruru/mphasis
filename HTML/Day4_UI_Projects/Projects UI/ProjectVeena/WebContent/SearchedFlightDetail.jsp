<%@page import="com.cts.beans.Flights"%>
<%@page import="com.cts.dao.FlightDetailsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/Admin.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Search</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>
<form>
<script>
function goBack() {
    window.history.back()
}
</script>
</form>

	<table width="100%">
	<i class="fa fa-chevron-circle-left" type="button" value="Go back!" style="font-size:26px" onclick="history.back()" ></i>
	
		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th><div class="topnav">

					<a class="active" href="AdminHome.html">Admin Home Page</a> <a
						href="W1.html">Customer Home Page</a>


				</div> <br> <br> <br> <%
 	Flights flight = (Flights) request.getAttribute("SEARCHED FLIGHT");
 	String s = flight.getFlightId();
 %><br> <br> <br>
				<div
					style="background-color: white; margin-left: 300px; margin-right: 700px;">
					<table style="width: 100%; height: 100%;">
						<tr>
							<th align="center" colspan="2"><h2>
									Details of
									<%=flight.getFlightId()%></h2></th>

						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>

						<tr>
							<th>COMPANY NAME</th>
							<td><%=flight.getCompanyName()%></td>
						</tr><tr>
							<td><br></td>
						</tr>
						<tr>
							<th>SOURCE</th>
							<td><%=flight.getSource()%></td>
						</tr><tr>
							<td><br></td>
						</tr>
						<tr>
							<th>DESTINATION</th>
							<td><%=flight.getDestination()%></td>
						</tr><tr>
							<td><br></td>
						</tr>
						<tr>
							<th>DEPARTURE DATE</th>
							<td><%=flight.getDepartureDate()%></td>
						</tr><tr>
							<td><br></td>
						</tr>
						<tr>
							<th>ARRIVAL TIME</th>
							<td><%=flight.getArrivalTime()%></td>
						</tr><tr>
							<td><br></td>
						</tr>
						<tr>
							<th>DEPARTURE TIME</th>
							<td><%=flight.getDepartureTime()%></td>
						</tr><tr>
							<td><br></td>
						</tr>
						<tr>
							<th>PRICE</th>
							<td><%=flight.getPrice()%></td>
						</tr>
						<tr>
							<th>Total Seats</th>
							<td><%=flight.getSeats()%></td>
						</tr>
					</table>
					<br>
					<br>
					<br>
					<br>
				</div> <br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			
			<br></th>
		</tr>
	</table>
</body>
</html>