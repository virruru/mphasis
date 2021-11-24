/**
 * 
 */

/* ***************************************** */

function doSignUpValidate() {
	
	var errFname="";
	var errLname="";
	var errPwd="";
	var errPwd2="";
	
	if(frmAirways.firstName.value==""){
		errFname="Please Enter valid FirstName";
		//alert(errFname);
		document.getElementById("errFirstname").innerHTML=errFname;
	}
	else {
		document.getElementById("errFirstname").innerHTML="";
	}
	
	if(frmAirways.lastName.value==""){

		errLname="Please Enter LastName";
		document.getElementById("errLastName").innerHTML=errLname;
		//alert(errLname);
	}
	else {
		document.getElementById("errLastName").innerHTML="";
	}
	
	var p1=frmAirways.password.value;
	var decimal=  /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	if(p1.match(decimal)) 
	{ 
	
	document.getElementById("errPasswordError").innerHTML="";
	
	}
	else
	{
		errPwd="Wrong Password...";
		document.getElementById("errPasswordError").innerHTML=errPwd;
	}
	
	 var dob=frmAirways.dateOfBirth.value;
		var dt=new Date(dob);
		var today=new Date();
		
		if(dt > today){
			errDob="Invalid Date...Pleas Enter Proper"
			document.getElementById("errDate").innerHTML=errDob;
		}
		else {
			document.getElementById("errDate").innerHTML="";
		}
		


	if(errFname.length!=0 || errLname.length!=0 || errPwd.length!=0 || errDob.length!=0 ){
		return false;
	}
}

/* *************************************************** */

function doValidate() {
	alert("Hello");
	var p1=frmAirways.password.value;
	var p2=frmAirways.retypePassword.value;
	/*alert(p1);
	alert(p2);
*/
	var errPwd="";
	var errFname="";
	var errLname="";
	var errEmail="";
	var errDob="";
	var errNum="";
	
	/*alert(p1);
	alert(p2);*/
	if(p1!=p2){

		errPwd="Password Mismatch";
	//	alert(errPwd);
	//	error+="Password Mismatch";
		document.getElementById("errPasswordError2").innerHTML=errPwd2;
		//return false;
	}
	else {
		document.getElementById("errPasswordError2").innerHTML="";
	}
	
	
	if(frmAirways.firstName.value==""){
		alert(frmAirways.firstName.value);

		errFname="Please Enter valid FirstName";
		//alert(errFname);
		document.getElementById("errFirstname").innerHTML=errFname;
	}
	else {
		document.getElementById("errFirstname").innerHTML="";
	}
	
	if(frmAirways.lastName.value==""){

		errLname="Please Enter LastName";
		document.getElementById("errLastName").innerHTML=errLname;
		//alert(errLname);
	}
	else {
		document.getElementById("errLastName").innerHTML="";
	}

	var email=frmAirways.email.value;
	 if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email))){
		  
		 errEmail="Enter Valid Email"
		 document.getElementById("errEmail").innerHTML=errEmail;
	}
	 else{
		 document.getElementById("errEmail").innerHTML="";
	 }
	 
	 var letters = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;  
		if(!(p1.match(letters)))
			{
				error+="Password too short\n";
				document.getElementById("errPassword").innerHTML="Password should contain atleast \n 1 special character,1 capital letter and 1 number";
				
			}
	 
	 var dob=frmAirways.dateOfBirth.value;
		var dt=new Date(dob);
		var today=new Date();
		
		if(dt > today){
			errDob="Invalid Date...Pleas Enter Proper"
			document.getElementById("errDate").innerHTML=errDob;
		}
		else {
			document.getElementById("errDate").innerHTML="";
		}
		
		
	 var contactNo=frmAirways.contactNo.value;
	// alert(contactNo);
	
		var patt1 =/^\d{10}$/;
		if(!contactNo.match(patt1)){
			error+="Enter Valid Contact Number\n";
			errNum="Enter 10 digit Contact Number";
			document.getElementById("errContactNo").innerHTML=errNum;
		}
		else {
			document.getElementById("errContactNo").innerHTML="";
		}
		
		
	 
	//alert(email);
	
	if(errPwd.length!=0 || errFname.length!=0 || errLname.length!=0 || errEmail.length!=0 || errDob.length!=0 || errNum.length!=0){
	//	alert("Hello final");
		return false;
	}
		
		

		
		
	}
	
