<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/Admin.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta charset="ISO-8859-1">
<title>Flight Delete</title>
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
		<i class="fa fa-chevron-circle-left" type="button" value="Go back!"
			style="font-size: 26px" onclick="history.back()"></i>
		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th><div class="topnav">

					<a href="Search.jsp">Customer Home Page</a>


				</div> <br> <br> <br> <br>

				<div
					style="background-color: white; margin-left: 300px; margin-right: 600px;">
					<table style="padding-left: 40px;" border='0' width='480px'
						cellpadding='0' cellspacing='0' align='center'>
						<tr>
							<td><br></td>
						</tr>
						<%
							String flightid = request.getParameter("flightid");
						%>
						<tr>
							<td colspan="2"><h3>Are you sure you want to delete
									this flight?</h3></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>




						<tr>
							<td><a style="color: red;"
								href="FlightDeletionServlet?flightid=<%=flightid%>">Delete</a></td>
							<!-- <td colspan="2" align='center'><button id="button"
										type="submit"
										style="background-color: #8d94e9; width: 200px; height: 30px">
										<b>Delete </b>
									</button></td> -->
						</tr>

						<form action="DeleteFlight.jsp">
						<tr>
							<td><a style="color: red;" href="DeleteFlight.jsp">Cancel</a></td>
						</tr>
						</form>
						<tr>
							<td><br></td>
						</tr>
					</table>





				</div> <br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br></th>
		</tr>
	</table>
</body>
</html>