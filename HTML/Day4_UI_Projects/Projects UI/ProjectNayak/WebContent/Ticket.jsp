<%@page import="com.cts.beans.Ticket"%>
<%@page import="com.cts.helper.FlightDetailsHelper"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="com.cts.dao.FlightDetailsDao"%>
<%@page import="com.cts.beans.Passenger"%>
<%@page import="com.cts.helper.PassengerDetailsBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="css/login.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Ticket</title>
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

						<a href="Search.jsp">Home</a><a href="Cancel.jsp">History</a> <a
							href="Logout.jsp" style="float: right;">Logout</a>
					</div> <br> <br> <br>

					<div style="background-color: white;">

						<br> <br> <br>
						<%
							//FlightDetailsDao obj=new FlightDetailsDao();
							String fid = (String) session.getAttribute("flightid");
							String custName = (String) session.getAttribute("user");
							int nop = (Integer) session.getAttribute("nop");
							double billAmount = (Double) session.getAttribute("total");
							//	String departureDate1=(String)session.getAttribute("departuredate");
							String source = (String) session.getAttribute("source");
							String destination = (String) session.getAttribute("destination");
							Date date = (Date) session.getAttribute("departuredate");
							String time = (String) session.getAttribute("time");

							Ticket objTicket = new Ticket();
							objTicket.setFlightId(fid);
							objTicket.setCustomerName(custName);
							objTicket.setNoOfPassengers(nop);
							objTicket.setBillAmount(billAmount);
							objTicket.setSource(source);
							objTicket.setDestination(destination);
							objTicket.setDateOfJourney(date);
							String res = FlightDetailsHelper.bookFlight(objTicket);
							if (res.equalsIgnoreCase("No Booking Allowed...No Seats")) {
								out.println(res);
							} else {
								out.println(res);
								//	out.print(FlightDetailsHelper.booKflight(fid, custName, nop, billAmount));
								out.println("Booking Details :-" + "<br/>");
								out.println("Flight Id:" + fid + "<br/>");
								out.println(date + "<br/>");

								out.println(source + " to " + destination + "<br/>");
								out.println(time + "<br/>");
								out.println("Number of passengers :" + nop + "<br/>");

								String tno = FlightDetailsHelper.getTicketNo();
								out.println(tno);

								//String ticketid=fid.substring(0,1)+custName.substring(0,2)+nop+fid.substring(fid.length()-1,fid.length());
								//out.println(ticketid+"<br/>");
								/* out.println(fid+"<br/>");
								
								out.println(custName+"<br/>");
								out.println(nop+"<br/>");
								out.println(billAmount+"<br/>"); */
						%>
						<br> <br>
						<table align="center" width="25%">
							<tr>
								<th>Name</th>
								<th>Age</th>
								<th>Gender</th>
							</tr>

							<%
								String pnr = PassengerDetailsBo.getPnr();
									//	PassengerDetailsBo boPassenger=new PassengerDetailsBo(); 
									Passenger p = PassengerDetailsBo.searchPassenger(pnr);

									if (p != null) {
										String[] passengers = p.getPassengerName().split(",");
										String[] age = p.getAge().split(",");
										String[] gender = p.getGender().split(",");

										int c = 0;
										for (int i = 0; i < age.length; i++) {
											c++;
											//out.println("Passenger " +c+ "- Name  " +passengers[i] + " Age  " +age[i] + "  Gender  " +gender[i] +"<br/><br/>");
											// out.println("Passenger " +c+"<br/>");
											//out.println("Name - " +passengers[i] + ". Age - " +age[i] + ".  Gender - " +gender[i] +"<br/><br/>");
							%>
							<tr>
								<th>
									<%
										out.println(passengers[i]);
									%>
								</th>
								<th>
									<%
										out.println(age[i]);
									%>
								</th>
								<th>
									<%
										out.println(gender[i]);
									%>
								</th>
							</tr>
							<%
								}
							%>
						</table>

						<%
							/* out.println(p.getPassengerName());
													out.println(p.getAge());
													out.println(p.getGender()); */
								}
							}
						%>
						<br> <br> <a href="#" class="btn btn-info btn-lg"> <span style="background-color: #4CAF50"
							class="glyphicon glyphicon-print"></span> Print
						</a><br><br><br>
					</div> <br> <br> <br> <br> <br> <br> <br>
					<br> <br> <br> <br> <br> <br> <br>
					<br> <br> <br> <br> <br> <br></th>
			</tr>
		</table>
		<%@ include file="Footer.jsp"%>
</body>
</html>