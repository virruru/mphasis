<%@page import="com.cts.helper.FlightDetailsHelper"%>
<%@page import="com.cts.beans.Flights"%>
<%@page import="com.cts.dao.FlightDetailsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/dummy.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

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
<script>
	alert("Hello");
</script>
	<table width="100%">
	<i class="fa fa-chevron-circle-left" type="button" value="Go back!" 
					style="font-size:26px" onclick="history.back()" ></i>
		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<form action="Payment.html"  >
		<tr id="img2">
			<th><div class="topnav">

					<a class="active" href="Search.jsp">Home</a> <a href="SignNew.jsp">Register</a>
					<a href="Login.html">Login</a> <a href="AboutUs.html">About Us</a>
					<br> <br> <br> <br></div>
					<div
						style="background-color: white; margin-left: 400px; margin-right: 400px;">
						<br>
						<h2>Flight Details</h2>
						<%
						String user=(String)session.getAttribute("user");
						if(user==null){
													 
							
						%>
						<jsp:forward page="Login.html" />
							<%-- <jsp:forward page="Login.html" /> --%>
						<%								
							}
							else {
								out.println(user);
							String flightId = request.getParameter("flightid");
							out.println(flightId);
							out.print("<br/><br/>");
							//FlightDetailsDao dao = new FlightDetailsDao();
							Flights f=FlightDetailsHelper.searchFlight(flightId);
						//	Flights f = dao.searchFlight(flightId);

							if (f != null) {
								out.println("Company Name - " + f.getCompanyName()
										+ "<br/><br/>");
								out.println("Source - " + f.getSource() + "<br/><br/>");
								out.println("Destination - " + f.getDestination()
										+ "<br/><br/>");
								out.println("Departure Date - " + f.getDepartureDate()
										+ "<br/><br/>");
								out.println("Departure Time - " + f.getDepartureTime()
										+ "<br/><br/>");
								out.println("Arrival Time - " + f.getArrivalTime()
										+ "<br/><br/>");
								out.println("Price - " + f.getPrice());
								int nop = (Integer) session.getAttribute("nop");
								out.println("No.of Passengers - " + nop + "<br/>");
							} else {
								out.println("Flight ID Not Found...");
							}
							}
						%>
						<br> <br> <input type="submit" value="Proceed to Payment"
							style="font-weight:bold;font-size:16px; background-color: #4CAF50; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width: 30%;"/>
						 <br><br>
					</div>
					</form>
					<br> <br> <br>
				</div> <br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br>
</body>
</html>