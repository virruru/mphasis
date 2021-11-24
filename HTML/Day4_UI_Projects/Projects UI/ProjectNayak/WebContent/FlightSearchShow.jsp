<%@page import="java.util.List"%>
<%@page import="com.cts.helper.FlightDetailsHelper"%>
<%@page import="com.cts.dao.FlightDetailsDao"%>
<%@page import="com.cts.beans.Flights"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/Search.css" />
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
<table border="3">
<i class="fa fa-chevron-circle-left" type="button" value="Go back!" style="font-size:26px" onclick="history.back()" ></i>


	<tr>
		<th>Flight ID</th>
		<th>Company Name</th>
		<th>Source</th>
		<th>Destination</th> 
		<th>DepartureDate</th>
		<th>Departure Time</th>
		<th>Arrival Time</th>
	</tr>

	<%
		String source=request.getParameter("source");
	    String dest=request.getParameter("destination");
	    String doj=request.getParameter("dateofJourney");
	    out.println(doj);
	    
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	    java.util.Date date = sdf.parse(doj);
	    out.println(date);
	    java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());  
		out.println(source);
		out.println(dest);
		out.println(sqlStartDate);
		
		//FlightDetailsDao dao=new FlightDetailsDao();
		List<Flights> arrFlights=FlightDetailsHelper.searchFlights(sqlStartDate, source, dest);
	//	Flights[] arrFlights=dao.searchFlights(sqlStartDate, source, dest); 
		//out.println(arrFlights.length);
		for(Flights f : arrFlights){
			%>
			<tr>
				<td><%=f.getFlightId() %> </td>
				<td><%=f.getCompanyName() %> </td>
				<td><%=f.getSource() %> </td>
				<td><%=f.getDestination() %> </td>
				<td><%=f.getDepartureDate() %> </td>
				<td><%=f.getDepartureTime() %> </td>
				<td><%=f.getArrivalTime() %> </td>
			</tr>
			<%
			}
	%>
	</table>
	
</body>
</html>