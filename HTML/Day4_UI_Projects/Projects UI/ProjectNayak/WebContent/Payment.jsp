<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/Payment.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HorizonAirways  Payment</title>
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
	<i class="fa fa-chevron-circle-left" type="button" value="Go back!" style="font-size:26px" onclick="history.back()" ></i>
	
		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th><div class="topnav">

					<a  href="Search.jsp">Home</a><a  href="Cancel.jsp">History</a>
					<a
						href="Logout.jsp" style="float: right;">Logout</a>
				</div> <br> 
			<br> <br>
			
			<div style=" "><br><br>
			<h1>Payment Mode</h1>
			
			<br>
			
			<a href="CreditCard.jsp">Credit Card</a><br><br>
			<a href="DebitCard.jsp">Debit Card</a><br><br>
			<a href="NetBanking.jsp">Net Banking</a>
			<br><br><br><br><br><br><br><br><br><br><br>
			</div>
			</th>
			</tr>
			</table>
		<%@ include file = "Footer.jsp" %>	
</body>
</html>