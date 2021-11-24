<%@page import="java.util.List"%>
<%@page import="javafx.scene.control.Alert"%>
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



<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link type="text/css" rel="stylesheet" href="css/dummy.css" />
<!-- <link type="text/css" rel="stylesheet" href="css/Footer.css" /> -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>



<script>

	function loadDef() {
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
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>



	<table width="100%">

		<tr height="40px" id="img1">
			<th colspan="2" align="top"><center>
					<img src="images/h.png" height="100" width="200";"> <img
						src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th colspan="2"><div class="topnav">

					<a class="active" href="Search.jsp">Home</a>

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
					%><a href="Cancel.jsp">History</a>
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
				<form action="Search.jsp" id="frmSearch" name="frmSearch"
					method="get">
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
					<br> <br>

					<div class="con">
						<input type="hidden" id="hidval" name="hidval" value="<%=userN%>" />
						<div class="center_div">


							<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;From:
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

							&nbsp;&nbsp;&nbsp;&nbsp; <font style="font-size: 25px;">&#8646;</font>

							&nbsp;&nbsp;&nbsp; To:&nbsp;&nbsp; <input type="text" id="dest"
								list="names" style="height: 20px;" name="destination"
								placeholder="Where to?" required />
							<datalist id="names">
							<option label="Kolkata" value="Kolkata" />
							<option label="Delhi" value="Delhi" />
							<option label="Mumbai" value="Mumbai" />
							<option label="Panaji" value="Panaji" />
							<option label="Chennai" value="Chennai" />
							<option label="Hyderabad" value="Hyderabad" />
							<option label="Bangalore" value="Bangalore" />
							<option label="Bhubaneswar" value="Bhubaneswar" />
							<option label="Bengaluru" value="Bengaluru" />
							<option label="Kochi" value="Kochi" />
							<option label="Bhopal" value="Bhopal" />
							<option label="Pune" value="Pune" />

							</datalist>
							&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							Departure:&nbsp;&nbsp;&nbsp; <input id="depdate" type="text"
								class="datepicker" name="dateofJourney" style="height: 20px"
								required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;Passengers: &nbsp;&nbsp;&nbsp;
							<!-- <input id="nop"
								type="number" min="1" max="10" style="height: 20px;"
								name="passengers" placeholder="" required /> -->
							<select name="passengers" id="nop" style="height: 25px" required>

								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>


							</select>


							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

							<button id="button" type="submit"
								style="font-weight: bolder;border-radius: 4px; font-size: 15px; letter-spacing: 1px; background-color: #4CAF50; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width: 15%;">
								<b>Search Flight </b>
							</button>

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
	<!-- <br>
	<br>
	<br> -->
	<%
		String source ="";
			String dest="";
			String doj="";
		/* 	String passengers=""; */
			int nop=0;
			if(request.getParameter("source")!=null && request.getParameter("destination") != null && request.getParameter("dateofJourney") !=null)
			{
		source=request.getParameter("source");
			    dest=request.getParameter("destination");
			    doj=request.getParameter("dateofJourney");
			    nop=Integer.parseInt(request.getParameter("passengers"));
			    
			    session.setAttribute("source", source);
			    session.setAttribute("dest",dest);
			    session.setAttribute("doj",doj);
			    session.setAttribute("nop","nop");
	%>

	<script>
	//	alert(frmSearch.source.value);
	//	alert("<%=source%>");
		//alert(res);
		
	<%-- 	localStorage.setItem("source","<%=source%>");
		localStorage.setItem("dest","<%=dest%>"); 
		localStorage.setItem("doj","<%=doj%>"); 
		localStorage.setItem("nop","<%=nop%>");  --%>
		//alert(localStorage.getItem("nop"));
		//alert(localStorage.getItem("source"));
		//alert(localStorage.getItem("dest"));
	//	alert(localStorage.getItem("doj"));
		frmSearch.source.value="<%=source%>";
		/* alert(frmSearch.source.value); */
		frmSearch.dest.value="<%=dest%>"
		/* alert(frmSearch.dest.value); */
		frmSearch.depdate.value="<%=doj%>";
		/* alert(frmSearch.depdate.value) */
		frmSearch.nop.value="<%=nop%>";
		document.getElementById("source").disabled = true
		document.getElementById("dest").disabled = true
		document.getElementById("depdate").disabled = true
		document.getElementById("nop").disabled = true
		
	//	alert("Updated " +frmSearch.source.value);
	</script>

	<div id="main">


		<%
			session.setAttribute("nop",nop);
														    
														    SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
														    java.util.Date date = sdf.parse(doj);
														  
														    java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		%>



		<%
			//FlightDetailsDao dao=new FlightDetailsDao();
																//List<Flights> arrFlights=FlightDetailsHelper.searchFlights(sqlStartDate, source, dest); 
																List<Flights> arrFlights=FlightDetailsHelper.searchFlights(sqlStartDate, source, dest);
																if(source.equalsIgnoreCase(dest)){
		%>
		<h2 style="color: red;">ERROR : Source and Destination cannot be
			same</h2>
		<%
			/* out.println(" <h2><b>ERROR : Source and Destination cannot be same</b></h2>" ); */
														 	}
															else if(arrFlights==null){
																out.println("<h1><b>Sorry, There were no flights found for this route and date combination.<br>We suggest you to modify your search and try again.</b></h1>");
															}
															
															else {
		%>
		<table class="result"
			style="background-color: white; width: 100%; height: 200px;">

			<tr
				style="text-decoration: underline; background-color: #ABE4F7; font-size: 20px;">
				<th>Flight ID</th>
				<th>Company Name</th>
				<th>Source</th>
				<th>Destination</th>
				<th>Departure Date</th>
				<th>Departure Time</th>
				<th>Arrival Time</th>
				<th>Price</th>
				<th>No of Seats<br> Available
				</th>
				<th></th>
			</tr>

			<br>
			<font style="font-size: x-large;"> <%
 	out.println(arrFlights.size() +"  Flights found");
  															 for(Flights f : arrFlights){
 %></font>
			<br>
			<tr>
				<td><%=f.getFlightId()%></td>
				<td><%=f.getCompanyName()%></td>
				<td><%=f.getSource()%></td>
				<td><%=f.getDestination()%></td>
				<td><%=f.getDepartureDate()%></td>
				<td><%=f.getDepartureTime()%></td>
				<td><%=f.getArrivalTime()%></td>
				<td>Rs. <%=f.getPrice()%>0
				</td>
				<td><%=f.getSeats()%></td>
				<td>
					<%-- <a href="BookFlight.jsp?flightid=<%=f.getFlightId()%>">Book Now</a> --%>
					<a href="BookFlightDup.jsp?flightid=<%=f.getFlightId()%>">Book
						Now</a>
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
		//	alert("<%=source%>");
		//	alert("Form value  " +frmSearch.source.value);
			
			/* alert("Hello");
			document.getElementById("source").innerHTML="Kolkata"; */
		</script>
		<%
			}
		%>
	</div>
<%@ include file = "Footer.jsp" %>
</body>
</html>