function doValidate() {
	alert("Hello");
	var p1 = frmAirways.password.value;
	var p2 = frmAirways.retypePassword.value;
	/*
	 * alert(p1); alert(p2);
	 */
	var errPwd = "";
	var errFname = "";
	var errLname = "";
	var errEmail = "";
	var errDob = "";
	var errNum = "";

	/*
	 * alert(p1); alert(p2);
	 */
	if (p1 != p2) {

		errPwd = "Password Mismatch";
		// alert(errPwd);
		// error+="Password Mismatch";
		document.getElementById("errPasswordError2").innerHTML = errPwd2;
		// return false;
	} else {
		document.getElementById("errPasswordError2").innerHTML = "";
	}

	if (frmAirways.firstName.value == "") {
		alert(frmAirways.firstName.value);

		errFname = "Please Enter valid FirstName";
		// alert(errFname);
		document.getElementById("errFirstname").innerHTML = errFname;
	} else {
		document.getElementById("errFirstname").innerHTML = "";
	}

	if (frmAirways.lastName.value == "") {

		errLname = "Please Enter LastName";
		document.getElementById("errLastName").innerHTML = errLname;
		// alert(errLname);
	} else {
		document.getElementById("errLastName").innerHTML = "";
	}

	if (errPwd.length != 0 || errFname.length != 0 || errLname.length != 0
			|| errEmail.length != 0 || errDob.length != 0 || errNum.length != 0) {
		// alert("Hello final");
		return false;
	}
}