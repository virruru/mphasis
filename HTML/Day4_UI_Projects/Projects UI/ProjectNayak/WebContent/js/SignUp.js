/**
 * 
 */

function doValidate() {
	
	var p1 = frmAirways.password.value;

	var p2 = frmAirways.retypePassword.value;
	var f1 = frmAirways.firstName.value;
	var l1 = frmAirways.lastName.value;
	
	/*
	 * alert(p1); alert(p2);
	 */
	var errPwd = "";
	var errFname = "";
	var errLname = "";
	var errEmail = "";
	var errDob = "";
	var errNum = "";

	var errPassPat = "";
	var errFirst = "";
	var errLast = "";
	var errPasslenth = "";
	
	/*
	 * alert(p1); alert(p2);
	 */
	if (p1 != p2) {
		
		errPwd = "Password Mismatch";
		alert(errPwd);
		// alert(errPwd);
		// error+="Password Mismatch";
		document.getElementById("errRePasswordError").innerHTML = errPwd;
		// return false;
	} else {
		document.getElementById("errRePasswordError").innerHTML = "";
		
	}

	
	/* ****************************** */
	if (frmAirways.firstName.value == "") {

		errFname = "Please Enter FirstName";

		document.getElementById("errFirstname").innerHTML = errFname;
	} else if (!f1.match(/^[A-Za-z]+$/)) {
		errFname = "Please enter alphabets only";

		document.getElementById("errFirstname").innerHTML = errFname;
	} else {

		document.getElementById("errFirstname").innerHTML = "";
	}
	

	
	/* ****************************** */
	/*if (frmAirways.lastName.value == "") {

		errLname = "Please Enter LastName";
		document.getElementById("errLastName").innerHTML = errLname;
		
	}else if (!l1.match(/^[A-Za-z]+$/)) {
		errLname = "Please enter alphabets only";

		document.getElementById("errLastname").innerHTML = errLname;
	} 
	else {
		document.getElementById("errLastName").innerHTML = "";
	}
	/* ****************************** */
	if (frmAirways.lastName.value == "") {

		errLname = "Please Enter FirstName";

		document.getElementById("errLastname").innerHTML = errLname;
	} else if (!l1.match(/^[A-Za-z]+$/)) {
		errLname = "Please enter alphabets only";

		document.getElementById("errLastname").innerHTML = errLname;
	} else {

		document.getElementById("errLastname").innerHTML = "";
	}
	
	
	
	/* ****************************** */
	var email = frmAirways.email.value;
	if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email))) {

		errEmail = "Enter Valid Email"
		document.getElementById("errEmail").innerHTML = errEmail;
	} else {
		document.getElementById("errEmail").innerHTML = "";
	}


	var dob = frmAirways.dateOfBirth.value;
	var dt = new Date(dob);
	var today = new Date();

	if (dt > today) {
		errDob = "Invalid Date...Please enter proper date";
		document.getElementById("errDate").innerHTML = errDob;
	} else if (dob == "") {
		errDob = "Please enter date of birth";
		document.getElementById("errDate").innerHTML = errDob;
	}

	else {
		document.getElementById("errDate").innerHTML = "";
	}

	
	var contactNo = frmAirways.contactNo.value;
	// alert(contactNo);

	var patt1 = /^\d{10}$/;
	if (!contactNo.match(patt1)) {
		error += "Enter Valid Contact Number\n";
		errNum = "Enter 10 digit Contact Number";
		document.getElementById("errContactNo").innerHTML = errNum;
	} else {
		document.getElementById("errContactNo").innerHTML = "";
	}
//	alert("Before PasspathHello");
	//alert("Before PassPath " +errPwd.length);
	
	var letters = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
	if (!(p1.match(letters)) || p1.length() < 9) {
		errPassPat = "Password too short\n";
		
		error += "Password should be of minimum 8 characters and should contain atleast \n 1 special character,1 capital letter and 1 number\n";
		document.getElementById("errPassword").innerHTML = "Password should be of minimum 8 characters and should contain atleast \n 1 special character,1 capital letter and 1 number";
		
	}
	else {
		document.getElementById("errPassword").innerHTML = "";
	}
	

	/*alert("After PasspathHello");
	alert("After PassPath " +errPwd.length);*/
	
	if (errPwd.length != 0 || errFname.length != 0 || errLname.length != 0
			|| errEmail.length != 0 || errDob.length != 0 || errNum.length != 0
			|| errPassPat.length != 0) {
		// alert("Hello final");
		return false;
	}
}
