<%@page import="com.cts.helper.FlightDetailsHelper"%>
<%@page import="com.cts.beans.Flights"%>
<%@page import="com.cts.dao.FlightDetailsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function goBack() {
    window.history.back();
}
</script>
<link type="text/css" rel="stylesheet" href="css/dummy.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Review</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>





	<%
		String flightId = "";
		flightId = request.getParameter("flightid");
		if (flightId != null) {

			session.setAttribute("flightId", flightId);
		}

		//out.println("Flight id is  " +flightId);
	%>
	<script>
	localStorage.setItem("flightId","<%=flightId%>
		");
	</script>
	<table width="100%">
		<i class="fa fa-chevron-circle-left" type="button" value="Go back!"
			style="font-size: 26px" onclick="history.back()"></i>
		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<%
			int nop = 0;
			double total = 0;
			String tno = FlightDetailsHelper.getTicketNo();
			//	out.println("Ticket No is  " +tno);
			session.setAttribute("tid", tno);
		%>
		<tr id="img2">
			<th><div class="topnav">

					<a href="Search.jsp">Home</a><a href="Cancel.jsp">History</a><a
						href="Logout.jsp" style="float: right;">Logout</a> <br> <br>
					<br> <br>
				</div>
				<form action="PassengerDetails.jsp">
					<div
						style="background-color: white; margin-left: 200px; margin-right: 700px;">
						<div
							style="background-color: white; margin-left: 50px; margin-right: 50px;">
							<br>
							<h1 style="color: blue; font-style: italic; font-weight: bold;">Booking
								Details</h1>

							<%
								String user = (String) session.getAttribute("user");
								flightId = request.getParameter("flightid");
								if (flightId != null) {
									//out.println("Setted");
									session.setAttribute("flightid", flightId);
								}
								//	session.setAttribute("flightid", flightId);
								if (user == null) {

									//	out.println("Flight ID is  " +flightId);
									//out.println("user not there...");
							%>

							<jsp:forward page="Login.jsp" />
							<%
								} else {
									flightId = (String) session.getAttribute("flightid");

									//out.println(user);

									//out.println("Flight ID is <b> " +flightId + "</b>" ); 

									/* out.println(flightId); */
									out.print("<br/><br/>");

									//	FlightDetailsDao dao = new FlightDetailsDao();
									Flights f = FlightDetailsHelper.searchFlight(flightId);
									//Flights f = dao.searchFlight(flightId);

									if (f != null) {
							%>
							<table width="100%" height="100px;">

								<tr>
									<td align="left">Company Name</td>
									<td align="left">
										<%
											out.println(f.getCompanyName());
										%>
									</td>
								</tr>

								<tr>
									<td align="left">Destination</td>
									<td align="left">
										<%
											out.println(f.getDestination());
										%>
									</td>
								</tr>
								<tr>
									<td align="left">Departure Date</td>
									<td align="left">
										<%
											out.println(f.getDepartureDate());
										%>
									</td>
								</tr>
								<tr>
									<td align="left">Departure Date</td>
									<td align="left">
										<%
											out.println(f.getDepartureDate());
										%>
									</td>
								</tr>
								<tr>
									<td align="left">Departure Time</td>
									<td align="left">
										<%
											out.println(f.getDepartureTime());
										%>
									</td>
								</tr>
								<tr>
									<td align="left">Arrival Time</td>
									<td align="left">
										<%
											out.println(f.getArrivalTime());
										%>
									</td>

								</tr>

								<tr>
									<td align="left">Price</td>
									<td align="left">
										<%
											out.println(f.getPrice());
										%>
									</td>
								</tr>

								<tr>
									<td align="left">Seats Available</td>
									<td align="left">
										<%
											out.println(f.getSeats());
										%>
									</td>
								</tr>

								<%
									nop = (Integer) session.getAttribute("nop");
								%>


								<tr>
									<td align="left">Amount to be Paid</td>
									<td align="left">
										<%
											total = f.getPrice() * nop;
													out.println(total);
													session.setAttribute("flightid", flightId);
													session.setAttribute("total", total);
													session.setAttribute("nop", nop);
													session.setAttribute("departuredate", f.getDepartureDate());
													session.setAttribute("source", f.getSource());
													session.setAttribute("destination", f.getDestination());
													session.setAttribute("time", f.getDepartureTime());
													session.setAttribute("seats", f.getSeats());
													//	session.setAttribute(arg0, arg1)
										%>
									</td>

								</tr>

								<tr>
									<td align="left">Number of passengers</td>
									<td align="left">
										<%
											out.println(nop);
												}
											}
										%>
									</td>
								</tr>



								<tr>
									<td><br> <br></td>
								</tr>
								<tr>
									<td colspan="2"><button type="submit"
											style="font-weight: bold; font-size: 16px; background-color: #4CAF50; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width: 50%;">Continue</button></td>
								</tr>
								<tr>
									<td><br> <br></td>
								</tr>
							</table>
						</div>
					</div>
				</form> <br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br></th>
		</tr>

	</table>
	<%@ include file = "Footer.jsp" %>

</body>
</html>