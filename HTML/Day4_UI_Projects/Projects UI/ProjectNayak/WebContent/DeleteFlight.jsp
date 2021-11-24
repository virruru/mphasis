<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/Admin.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
					<form action="DeleteConfirmation.jsp">
				</div> <br> <br> <br> <br>
				<div
					style="background-color: white; margin-left: 300px; margin-right: 600px;">
					<table border='0' width='480px' cellpadding='0' cellspacing='0'
						align='center'>
						<tr>
							<td colspan="2"><h1>Delete a flight</h1></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><span id="result1"
								style="font-size: 20px; color: red; visibility: hidden; padding-left: 100px; padding-top: 30px;"><b>Flight
										deleted sucessfully</b></span></td>
						</tr>
						<tr>
							<td><span id="result2"
								style="font-size: 20px; color: red; visibility: hidden; padding-left: 100px; padding-top: 30px;"><b>
										No such flight exsist</b></span></td>
						</tr>
						<br>
						<tr>
							<td align="right">Flight Id</td>
							<td><input type="text" name="flightid" required="required">
						</tr>

						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td colspan="2" align='center'><button id="button"
									type="submit"
									style="background-color: #8d94e9; width: 200px; height: 30px">
									<b>Delete </b>
								</button></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
					</table>





				</div>
				</form> <br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br></th>
		</tr>
	</table>
</body>
</html>