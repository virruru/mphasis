/**
 * 
 */
function doValidate() {
	var errCVVNor,errMonth,errCardNor,errHolderName,errYear;
	errCVVNor="";
	errMonth="";
	errCardNor="";
	errHolderName="";
	errYear="";
	
	/*alert("Hiii");*/
	var c1 = frmPayment.credit.value;
	var c2 = frmPayment.cvv.value;
	var c3 = frmPayment.Name.value;
	var c4 = frmPayment.month.value;
	var c5 = frmPayment.year.value;

	if (c4 == "") {

		error = "Select Month\n";
		errMonth = "Select Month";
		document.getElementById("errMonth").innerHTML = error;
	} else {
		document.getElementById("errMonth").innerHTML = "";
		
	}

	

	if (c5 == "") {

		error = "Select Year\n";
		errYear = "Select Year";
		document.getElementById("errYear").innerHTML = error;
	} else {
		document.getElementById("errYear").innerHTML = "";
		
	}

	
	
	var pat = /^\d{16}$/;
	if(c1 == ""){
		error = "Enter Card Number\n";

		errCardNor = "Enter 16 digit Card Number";
		document.getElementById("errCardNor").innerHTML = error;
	}
	else if (!c1.match(pat)) {
		error = "Enter Valid Card Number\n";

		errCardNor = "Enter 16 digit Card Number";
		document.getElementById("errCardNor").innerHTML = error;

	} else {
		document.getElementById("errCardNor").innerHTML = "";
		
	}
	
	var pat1 = /^\d{3}$/;
	if(c2 == ""){
		error = "Enter CVV Number\n";
		errCVVNor = "Enter 3 digit CVV Number";
		document.getElementById("errCVVNor").innerHTML = error;
	}
	else if (!c2.match(pat1)) {

		error = "Enter Valid CVV Number\n";
		errCVVNor = "Enter 3 digit CVV Number";
		document.getElementById("errCVVNor").innerHTML = error;

	} else {
		document.getElementById("errCVVNor").innerHTML = "";
		
	}

	
	
	var pat2 = "^[a-z A-Z]+$";
	if (c3 == "") {
		error = "Enter name\n";

		errHolderName = "Enter name";
		document.getElementById("errHolderName").innerHTML = error;
	} else if (!c3.match(pat2)) {
		error = "Enter Valid name\n";

		errHolderName = "Enter proper name";
		document.getElementById("errHolderName").innerHTML = error;
	} else {
		document.getElementById("errHolderName").innerHTML = "";
		
	}

	
	
/*	alert("cvv " +errCVVNor.length);
	alert("card no " +errCardNor.length);
	alert("Holder " +errHolderName.length); 
	alert("Month  "+errMonth.length);
	alert("Year " +errYear.length);*/
	if (errCVVNor.length != 0 
		|| errCardNor.length != 0
			|| errHolderName.length != 0 || errMonth.length != 0
			|| errYear.length != 0) {
		/*alert("Error Hi");*/
		return false;
	}
}

