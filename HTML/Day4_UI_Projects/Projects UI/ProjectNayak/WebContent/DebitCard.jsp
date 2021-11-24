<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="js/debitcard.js"></script>
<link type="text/css" rel="stylesheet" href="css/Payment.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HorizonAirways Payment</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>


	<table width="100%">

		<tr>
			<td>
				<%--  <%=session.getAttribute("seats") %>  --%>
			</td>
		</tr>
		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_new.PNG" height="92" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th><div class="topnav">

					<a href="Search.jsp">Home</a><a href="Cancel.jsp">History</a> <a
						href="Logout.jsp" style="float: right;">Logout</a>
				</div>
				<div class="abc" style="margin-left: 100px; margin-right: 650px;">
					<form action="Ticket.jsp" name="frmPayment"
						onsubmit="return doValidate()">
						<center>
							<table>
								<div>
									<tr align="center">
										<%-- Total Amount Paid : 
											<h5>
											</h5> --%>
										<h1>
											<font size="5px"> Payment </font>
										</h1>
									</tr>
									<tr>
										<font color="black" size="5px">Accepted Cards: </font>
									</tr>
									<div class="icon-container">
										<i class="fa fa-cc-visa" style="color: navy; font-size: 30px"></i>
										<i class="fa fa-cc-amex" style="color: blue; font-size: 30px"></i>
										<i class="fa fa-cc-mastercard"
											style="color: red; font-size: 30px"></i> <i
											class="fa fa-cc-discover"
											style="color: orange; font-size: 30px"></i>
									</div>
									<tr>
										<td><font color="black" size="4px"> Total Amount
												to be Paid :</font></td>
										<td><font color="black" size="5px">&nbsp;&nbsp;&nbsp;&nbsp;Rs.
</font></td>
									</tr>

									<tr>
										<td><font color="black" size="4px">Card Holder
												Name: </font></td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
											name="Name" placeholder=" Enter name on the card"
											style="height: 5px; width: 200px; padding: 12px 20px; margin-bottom: 10px; margin-top: 15px;" /><br>
											<br>
										<td><span id="errHolderName" style="color: red;"></span>
										</td> &nbsp;&nbsp;
									<tr>
										<td><font color="black" size="4px">Debit Card
												Number: </font></td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
											name="credit"
											placeholder="Enter 16 digits debit card number"
											style="height: 5px; width: 200px; padding: 12px 20px; margin-bottom: 10px; margin-top: 15px;" /><br>
											<br>
										<td><span id="errCardNor" style="color: red;"></span></td>
									</tr>
									<tr>
										<td><font color="black" size="4px">Expiry Month: </font></td>
										<td>&nbsp;&nbsp;&nbsp; <select name="month"
											style="height: 35px; width: 245px; margin-bottom: 10px; margin-top: 15px;">

												<option value="" disabled selected>Select Month</option>
												<option>January</option>
												<option>February</option>
												<option>March</option>
												<option>April</option>
												<option>May</option>
												<option>June</option>
												<option>July</option>
												<option>August</option>
												<option>September</option>
												<option>October</option>
												<option>November</option>
												<option>December</option>
										</select> <br /> <br /></td>
										<br>
										<td><span id="errMonth" style="color: red;"></span>
									</tr>
									<tr>
										<td><font color="black" size="4px">Expiry Year: </font></td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;<select name="year"
											style="height: 35px; width: 245px; margin-bottom: 10px; margin-top: 15px;">

												<option value="" disabled selected>Select Year</option>
												<option>2018</option>
												<option>2019</option>
												<option>2020</option>
												<option>2021</option>
												<option>2022</option>
												<option>2023</option>
												<option>2024</option>
												<option>2025</option>
												<option>2026</option>
												<option>2027</option>
												<option>2028</option>
												<option>2029</option>
												<option>2030</option>
												<option>2031</option>
												<option>2032</option>
												<option>2033</option>
												<option>2034</option>
												<option>2035</option>
												<option>2036</option>
												<option>2037</option>
												<option>2038</option>
												<option>2039</option>
												<option>2040</option>
										</select> <br> <br></td>
										<td><span id="errYear" style="color: red;"></span>
									</tr>
									<tr>
										<td><font color="black" size="4px"> CVV: </font></td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="password"
											name="cvv" placeholder=" Enter CVV number"
											style="height: 5px; width: 200px; padding: 12px 20px; margin-bottom: 10px; margin-top: 15px;" />
											<br> <br>
										<br>
										<td><span id="errCVVNor" style="color: red;"></span></td>
									</tr>
									<tr align="center">
										<th style="text-align: right;"><input type="submit"
											value="Pay"
											style="background-color: #4CAF50;font-weight:bold; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width:40%;" />
										</th></form>
										<form action="CancelAction.jsp">
										 <th style="text-align: left;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Cancel"
											style="background-color: red;font-weight:bold; ;color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width: 30%;" /></th> </tr>
								
								</form>
								<tr><td>&nbsp;</td></tr>
								</div>
								<br>
							</table>

						</center>
					
				</div>
				</th>
				</tr>
				</table>
</body>
</html>