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
<link type="text/css" rel="stylesheet" href="css/dummy.css" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>

	function loadDef() {
		  /*  session.setAttribute("source", source);
		    session.setAttribute("dest",dest);
		    session.setAttribute("doj",doj);
		    session.setAttribute("nop","nop"); */
		var source="<%=session.getAttribute("source")%>";
		var dest="<%=session.getAttribute("dest")%>";
		var doj="<%=session.getAttribute("doj")%>";
		var nop="<%=session.getAttribute("nop")%>";
		alert(nop);
		frmSearch.source.value=source;
		frmSearch.dest.value=dest;
		frmSearch.depdate.value=doj; 
		frmSearch.nop.value=nop;
	<%-- 	var c=0;
		c="<%=session.getAttribute("count")%>"; 
		alert(c); --%>
	/* 	var source=localStorage.getItem("source");
		var dest=localStorage.getItem("dest");
		var doj=localStorage.getItem("doj"); 
		var nop=localStorage.getItem("nop"); */
	/* 	if(source!=null && dest!=null && doj != null && nop!=null){
			frmSearch.source.value=source;
			frmSearch.dest.value=dest;
			frmSearch.depdate.value=doj; 
			frmSearch.nop.value=nop;
		} */
	
	
	}
	$(document).ready(function() {
		//document.getElementById("frmSearch").submit();
		var today = new Date();
		$('.datepicker').datepicker({
			format : 'mm-dd-yyyy',
			autoclose : true,
			startDate : "today",
			minDate : today
		}).on('changeDate', function(ev) {
			$(this).datepicker('hide');
		});

		$('.datepicker').keyup(function() {
			if (this.value.match(/[^0-9]/g)) {
				this.value = this.value.replace(/[^0-9^-]/g, '');
			}
		});
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Horizon Airways</title>
</head>
<body onload="loadDef()">



	<table width="100%">

		<tr height="40px" id="img1">
			<th colspan="2"><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th colspan="2"><div class="topnav">

					<a class="active" href="Search.jsp">Home</a> <a href="SignNew.jsp">Register</a>
					<a href="Login.jsp">Login</a>
					<%
						if(session.getAttribute("user") != null){
					%><a href="Cancel.jsp">Cancel</a>
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


				</div>
				<form action="SearchPrint.jsp" id="frmSearch" name="frmSearch" method="get"> 
					<br> <span id="firstName"></span>
					<marquee>
						<font color="firebrick" style="font-face: 'italic';"><h1>
								Welcome to Horizon Airways...
								<%
								String userN="";
							if(session.getAttribute("user") != null){
								 userN=(String)session.getAttribute("user");
																		out.println(session.getAttribute("user"));
																																	}
						%>
							</h1></font>

					</marquee>
					<br>
					<%-- User Name is : <b>
					<%=session.getAttribute("user") %>
					</b> --%>
					<br>
						
					<div class="container">
						<input type="hidden" id="hidval" name="hidval" value="<%=userN%>" />
						<div class="center_div">

		
							<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;From:
							&nbsp;&nbsp;&nbsp;<input type="text" list="names" id="source"
								style="height: 20px;" name="source" placeholder="Where from?"
								required />
							<datalist id="names">
							<option label="Kolkata" value="Kolkata" />
							<option label="Delhi" value="Delhi" />
							<option label="Mumbai" value="Mumbai" />
							<option label="Panaji" value="Panaji" />
							<option label="Chennai" value="Chennai" />
							<option label="Hyderabad" value="Hyderabad" />
							<option label="Bangalore" value="Bangalore" />
							<option label="Bhubaneswar" value="Bhubaneswar" />
							</datalist>

							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To:&nbsp;&nbsp; <input type="text" id="dest"
								list="names" style="height: 20px;" name="destination"
								placeholder="Where to?" required />
							<datalist id="names">
							<option label="Kolkata" value="Kolkata" />
							<option label="Delhi" value="Delhi" />
							<option label="Mumbai" value="Mumbai" />
							<option label="Panaji" value="Panaji" />
							<option label="Panaji" value="Panaji" />
							<option label="Chennai" value="Chennai" />
							<option label="Hyderabad" value="Hyderabad" />
							<option label="Bangalore" value="Bangalore" />
							<option label="Bhubaneswar" value="Bhubaneswar" />
							</datalist>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Departure:&nbsp;&nbsp;&nbsp; <input id="depdate"
								type="text" class="datepicker" name="dateofJourney" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;Passengers: &nbsp;&nbsp;&nbsp;<input id="nop"
								type="number" min="1" max="4" style="height: 20px;"
								name="passengers" placeholder="" required />





							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

						<!-- 	<button id="button" type="submit"
								style="color: white; background-color: firebrick; width: 150px; height: 30px">
								<b>Search </b>
							</button> -->

							<br> <br>
						</div>
					</div>
					<br> <br>
					<div id="dummy"></div>
					<br> <br> <br> <br> <br> <br> <br>
					<br> <br> <br> <br> <br> <br> <br>
					<br> <br> <br> <br> <br> <br> <br>
					<br> <br> <br></th>
		</tr>

 <!-- <tr>
			<td><img alt="" src="images/air4.jpg" height="350px;" width="500px;" style="padding-left: 100px; border-radius: 50%;"></td>
		<td>	<img alt="" src="images/com13.jpg" height="350px;" width="500px;" style=" border-radius: 50%;"  ></td>
		</tr>  -->

	</table>
	 </form> 
	<br>
	<br>
	<br>

	
	<div id="main">
		<table class="result"
			style="background-color: white; width: 100%; height: 200px;">

			<tr>
				<th>Flight ID</th>
				<th>Company Name</th>
				<th>Source</th>
				<th>Destination</th>
				<th>DepartureDate</th>
				<th>Departure Time</th>
				<th>Arrival Time</th>
				<th>Price</th>
				<th>Book</th>
				<th>No.ofSeats</th>
			</tr>

			



			<%
				//FlightDetailsDao dao=new FlightDetailsDao();
			String dt=(String)session.getAttribute("doj");
			 SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
			    java.util.Date date = sdf.parse(dt);
			  
			    java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
			String source=(String)session.getAttribute("source"); 
			String dest=(String)session.getAttribute("dest");
			List<Flights> arrFlights=FlightDetailsHelper.searchFlights(sqlStartDate, source, dest); 
													
													if(arrFlights==null){
														out.println("<h1><b>There are no flights avaialble on that day</b></h1>");
													}
													else {
												 out.println("Search Results");
												 for(Flights f : arrFlights){
			%>
			<tr>
				<td><%=f.getFlightId()%></td>
				<td><%=f.getCompanyName()%></td>
				<td><%=f.getSource()%></td>
				<td><%=f.getDestination()%></td>
				<td><%=f.getDepartureDate()%></td>
				<td><%=f.getDepartureTime()%></td>
				<td><%=f.getArrivalTime()%></td>
				<td><%=f.getPrice()%></td>
				<td><%=f.getSeats()%></td>
				<td>
					<%-- <a href="BookFlight.jsp?flightid=<%=f.getFlightId()%>">Book Flight</a> --%>
					<a href="BookFlightDup.jsp?flightid=<%=f.getFlightId()%>">Book
						Flight</a>
				</td>
			</tr>
			<%
				}
													}
			%>
		</table>
		<script>
		//	alert(document.getElementById("source").innerHTML);
		
			document.getElementById("dummy").innerHTML = document
					.getElementById("main").innerHTML;
			document.getElementById("main").style.display = "none";
	
		//	alert("Form value  " +frmSearch.source.value);
			
			/* alert("Hello");
			document.getElementById("source").innerHTML="Kolkata"; */
		</script>
		
	</div>
</body>
</html>