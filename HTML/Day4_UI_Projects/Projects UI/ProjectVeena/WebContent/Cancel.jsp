<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.cts.helper.TicketDetailsHelper"%>
<%@page import="com.cts.beans.Ticket"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/dummy.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bookings</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>


	<table width="100%">

		<tr height="40px" id="img1">
			<th colspan="2"><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th colspan="2"><div class="topnav">

					<a href="Search.jsp">Home</a>

					<%
						if(session.getAttribute("user") == null){
					%>
					<a href="SignNew.jsp">Register</a>
					<%
						}
					%>
					<%
						if(session.getAttribute("user") == null){
					%>
					<a href="Login.jsp">Login</a>
					<%
						}
					%>
					<%
						if(session.getAttribute("user") != null){
					%><a class="active" href="Cancel.jsp">History</a>
					<%
						}
					%>
					<%
						if(session.getAttribute("user") != null){
					%>
					<a href="Logout.jsp" style="float: right;">Logout</a>
					<%
						}
					%>


				</div> <br> <br> <br> <span id="result2"
				style="font-size: 20px; color: blue; visibility: hidden; padding-left: 100px; padding-top: 30px;"><b>Your
						ticket has been cancelled sucessfully</b></span> <br> <br> <%
 	String user=(String) session.getAttribute("user");
  			 		List<Ticket> arrTicket=TicketDetailsHelper.showTickets(user); 
  			 												
  			 												if(arrTicket==null){
  			 													out.println("<h1><b>No Booking</b></h1>");
 %><br> <br> <br> <br> <br> <br> <br>
				<%
					}
				 			 												else {
				%>
				<table class="result"
					style="background-color: white; width: 100%; height: 200px;">
					<tr
						style="text-decoration: underline; background-color: #ABE4F7; font-size: 20px;">
						<td>Flight ID</td>
						<td>Source</td>
						<td>Destination</td>
						<td>No Of Passengers</td>
						<td>Journey Date</td>
						<td>BillAmount</td>
						<td>Ticket No</td> 
						<td>Status</td>
						<td></td>
					</tr>
					<%
					Date now = new Date();
  			 	  	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
  			 	  	String st=sdf.format(now);
  			 	  	Date ss=sdf.parse(st);
					java.sql.Date sqlDt=new java.sql.Date(ss.getTime());
					//out.println(sqlDt);
					long dif=0;
					Date temp;
						for(Ticket t : arrTicket){
					%>

					<tr>
						<td><%=t.getFlightId()%></td>
						<td><%=t.getSource()%></td>
						<td><%=t.getDestination()%></td>
						<td><%=t.getNoOfPassengers()%></td>
						<td><%=t.getDateOfJourney() %> </td>
						<td><%=t.getBillAmount()%></td>
						<td><%=t.getTicketNo()%></td>
						<td><%=t.getBookStatus()%></td>
						<%
						temp=(java.util.Date)t.getDateOfJourney();
						dif=temp.getTime()-ss.getTime();
							if(t.getBookStatus().equals("Booked") && dif >= 0) {
						%>
						<td><a style="color: red;"
							href="TicketCancellation?ticketNo=<%=t.getTicketNo()%>">Cancel</a>
							<%-- <a href="TicketCancel.jsp?ticketNo=<%=t.getTicketNo()%>">Cancel</a> --%>
						</td>
						<%
								}
							else{
							%>
							<td><a style="color: grey;">Cancel</a>
							<%-- <a href="TicketCancel.jsp?ticketNo=<%=t.getTicketNo()%>">Cancel</a> --%>
						</td>
							
							<%} %>
					</tr>
					<%
						}
																										}
					%>
				</table> <br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br></th>
		</tr>
	</table>

</body>
</html>