<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/Payment.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HorizonAirways  Payment</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>
	

		<table width="100%">
			<tr height="40px" id="img1">
				<th><center>
						<img src="images/logo_new.PNG" height="92" width="642">
					</center></th>
			</tr>
			<tr id="img2">
				<th><div class="topnav">
					<a  href="Search.jsp">Home</a><a  href="Cancel.jsp">History</a>
					<a
						href="Logout.jsp" style="float: right;">Logout</a>
					</div> 
					<div class="abc" style="margin-left: 200px; margin-right: 600px;">
						<center><br><br><br><br>
						<form action="Ticket.jsp" >
							<table>
								<div >
								<tr align="center">
									<h1><font size="6px">Complete Your Payment </font><br><br></h1>
								</tr>
								</div>
					            <div >
					            <tr align="center">
						            <tr>
						            	<td><font color="black" size="5px">Total amount to be paid: Rs. <%=session.getAttribute("total") %></font><br><br><br></td>
						            </tr>
									<tr>
										<td><font color="black" size="5px">Select your bank: </font><br><br></td>
									</tr>
									<tr>
										<td> 
												<input name="bank" type="radio" value="sbi" required >State Bank of India<br><br><br>
												<input name="bank" type="radio" value="hdfc" required>HDFC Bank<br><br><br>
												<input name="bank" type="radio" value="icici" required>ICICI Bank<br><br><br>
												<input name="bank" type="radio" value="axis" required>Axis Bank<br><br><br>
												<input name="bank" type="radio" value="pnb" required>Punjab National Bank<br><br><br> 
										</td>
									</tr>
									
									
									<tr align="center">
										<th colspan="2" style="text-align: center"><br><br><br><input type="submit"
											value="Pay"
											style="background-color: #4CAF50;font-weight:bold; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width:40%;" />
										</th>
									</tr>
									<tr>
										<td><br><br><br><font color="black" size="4px">Other payment mode: </font><br><br></td>
									</tr>
									<tr>
										<td> 
												<a href="Creditcard.html"><font size="4px">Credit Card</font></a><br><br><br>
												<a href="Debitcard.html"><font size="4px">Debit Card</font></a><br><br><br>
										</td>
									</tr>
									</tr>
								</div>
							</div>
							</table></form>
						</center>
						<br><br><br><br><br><br><br><br><br><br>
								<br><br><br><br><br><br><br></div></th>
					</tr>

					
					<%@ include file = "Footer.jsp" %>
</body>
</html>
