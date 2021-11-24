/**
 * 
 */

function doValidate() {
	var errEmail="";
	var errPassword="";
	
	if(frmLogin.email.value == ""){
		errEmail="Please Enter Email";
	}
	else {
		errEmail="";
	}
	document.getElementById("errEmail").innerHTML=errEmail;

	
	if(frmLogin.password.value==""){
		errPassword="Please Enter Password";
	}
	else {
		errPassword="";
	}
	document.getElementById("errPassword").innerHTML=errPassword;
	
	/*alert(errEmail.length);
	alert(errPassword.length);*/
	if(errEmail.length >= 1 || errPassword.length > 1){
		return false;
	}
}