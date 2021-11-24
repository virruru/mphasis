<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link type="text/css" rel="stylesheet" href="css/login.css" />

<script>
	function generate() {
		var tot = parseInt(frmData.nop.value);
		var tbl = document.getElementById("sim");
		var res = "";
		for (var i = 1; i <= tot; i++) {
			res += 'Passenger '
					+ i
					+ '<font style="color: red; font-size: 23px;">*</font> &nbsp;&nbsp;<input type=text placeholder=" Full Name" required size=20 maxlength=20 name='+ 'passenger'+i+'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Age '
					
					+ '<font style="color: red; font-size: 23px;">*</font> &nbsp;&nbsp;<input type=text style="width: 80px;" required  size=20 maxlength=20 name='+ 'age'+i+'>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Gender '
					
					+ '<font style="color: red; font-size: 23px;">*</font>&nbsp;&nbsp;<select style="height: 35px"  required name='+'gender'+i+'>   <option  value="" disabled selected>Select </option><option value=male>Male</option><option value=female>Female</option><option value=others>Other</option></select> <br/><br/><br/> \n';
		}

		//document.getElementById('frmData').appendChild(res);
		//	document.write(res);
		
		tbl.innerHTML = res;
	}

	function show() {
		alert("Hi");
		var inputs = document.getElementsByTagName('input');
		var count = 0;
		for (var cpt = 0; cpt < inputs.length; cpt++) {
			if (inputs[cpt].type == 'text')
				count++;
			{
				alert(this.value);
			}
		}
		alert(count);
		var id = document.getElementById("pas1");
		alert(id);
		/* var id=document.getElementById("pas1").innerHTML;
		alert(id); */
		/* for(var i=1;i<=tot;i++){
			alert(frmData.passenger+i.value);	
		} */

	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flights Traveller</title>
<link rel="SHORTCUT ICON" href="images/top.png" />
</head>
<body onload="generate()">

	<table width="100%">
		<i class="fa fa-chevron-circle-left" type="button" value="Go back!"
			style="font-size: 26px" onclick="history.back()"></i>

		<tr height="40px" id="img1">
			<th><center>
					<img src="images/logo_	new.PNG" height="122" width="642">
				</center></th>
		</tr>
		<tr id="img2">
			<th><div class="topnav">

					<a  href="Search.jsp">Home</a><a  href="Cancel.jsp">History</a><a
						href="Logout.jsp" style="float: right;">Logout</a>

				</div> <%
 	int nop = 0;
 	nop = (Integer) (session.getAttribute("nop"));
 	int seats=(Integer)	session.getAttribute("seats");
 	//out.println("No.of Seats available  " +seats);
 	//out.println("No.of Passengers  " + nop);
 %> <br />
			<br />
				<form id="frmData" name="frmData" action="dummyshow.jsp"> 
				
					 No.of Passengers : <input type="text" style="width: 60px;" name="nop" value="<%= nop %>"
						readonly="readonly" />  <br />
					<br />
					<div id="sim"></div>
					<!-- <input type="button" value="Show" onclick="show()" /> -->
					<input type="submit"
										style="font-weight: bold; font-size: 16px; background-color: #4CAF50; color: white; padding: 10px 10px; margin: 4px 0; border: none; cursor: pointer; width: 20%;" value="Proceed to Payment"/>

				</form> <br><br><br><br><br><br><br><br><br><br><br><br><br><br></th>
		</tr>
	</table>
<%@ include file = "Footer.jsp" %>
</body>
</html>