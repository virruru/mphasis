<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/AddFlight.js"></script>
<link type="text/css" rel="stylesheet" href="css/Admin.css" />
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(document).ready(function() {
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
<meta charset="ISO-8859-1">
<title>Add Flight</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body>
	<script>
		function goBack() {
			window.history.back()
		}
	</script>

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


				</div> <br> <br>
				<form method="post" action="NewFlightServlet" name="addFlight"
					onsubmit="return doValidate()">
					<div class="center">
						<table border='0' width='700px' style="padding-left: 60px;">

							<tr>
								<td colspan="2"><span id="result1"
									style="font-size: 20px; color: red; visibility: hidden; padding-left: 100px; padding-top: 30px;"><b>Your
											flight has been added sucessfully</b></span></td>
							</tr>
							<tr>
								<td colspan="2"><span id="result2"
									style="font-size: 20px; color: red; visibility: hidden; padding-left: 100px; padding-top: 30px;"><b>Flight
											Id already exsist</b></span></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><h1>Add a Flight</h1></td>
							</tr>



							<tr>
								<td align='center'>Flight Id:<font style="color: red;">*</font></td>
								<td align="right"><input type='text' name='id'
									required="required"></td>

							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'>Company Name:<font style="color: red;">*</font></td>
								<td><input type='text' name='name' required="required"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>


							<tr>
								<td align='center'>From:<font style="color: red;">*</font></td>
								<td><input type='text' name='from' required="required"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'>To:<font style="color: red;">*</font></td>
								<td><input type='text' name='to' required="required"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'>Departure Date :<font
									style="color: red;">*</font></td>
								<td><input type="text" class="datepicker" name="date"
									required="required"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>



							<tr>
								<td align='center'>Departure Time:<font style="color: red;">*</font></td>
								<td><input type="time" name="depart_time"
									required="required"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'>Arrival Time:<font style="color: red;">*</font></td>
								<td><input type="time" name="arrival_time"
									required="required"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'>Price<font style="color: red;">*</font></td>
								<td><input type="text" name="price" required="required"></td>
								<td><span id="errPrice" style="color: red;"></span></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'>Number of seats<font style="color: red;">*</font></td>
								<td><input type="text" name="seats" required="required"></td>
								<td><span id="errSeats" style="color: red;"></span></td>
							</tr>


							<tr>
								<td>&nbsp;</td>
							</tr>
							<table border='0' cellpadding='0' cellspacing='0' width='480px'
								style="padding-left: 100px;" align='center'>
								<tr>
									<td align='right'><button id="button" type="submit"
											style="font-weight: bold; font-size: 16px; background-color: #4CAF50; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width: 50%;">
											<b>Add</b>
										</button></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
							</table>
						</table>

					</div>

				</form></th>
		</tr>

	</table>

</body>
</html>