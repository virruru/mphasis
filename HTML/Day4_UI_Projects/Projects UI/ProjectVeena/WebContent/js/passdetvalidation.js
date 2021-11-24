/**
 * 
 */

function doValidate(){
	
	var errName,errAge;
	
	errName="";
	errAge="";
	
	var c1=frmDetails.passenger1.value;
	var c2=frmDetails.age1.value;
	
	var pat1 = "^[a-z A-Z]+$";
	if(c1 == ""){
		error = "Enter Name\n";

		errName = "Enter Alphabets only ";
		document.getElementById("errName").innerHTML = error;
	}
	else if (!c1.match(pat1)) {
		error = "Enter the name \n";

		errName = "Enter Alphabets only ";
		document.getElementById("errName").innerHTML = error;

	} else {
		document.getElementById("errName").innerHTML = "";
		
	}
	
	var pat2 = "/^\d{2}+$/";
	if(c2 == ""){
		error = "Enter Number\n";

		errAge = "Enter Numbers only ";
		document.getElementById("errAge").innerHTML = error;
	}
	else if (!c2.match(pat2)) {
		error = "Enter  Number\n";

		errAge = "Enter Numbers only ";
		document.getElementById("errAge").innerHTML = error;

	} else {
		document.getElementById("errAge").innerHTML = "";
		
	}
	
	if(errName.length!=0 || errAge.length!=0){
		return false;
	}
}