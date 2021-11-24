/**
 * 
 */

function doValidate() {
	
	//var errPrice, errSeats;

	var errPrice = "";
	var errSeats = "";
	var error = "";

	var c1 = addFlight.price.value;
	var c2 = addFlight.seats.value;
	
	//var pat = /^\[0-9]{5}((.)[0-9]{0,2}))$/;
	var pat = /^\d{4}$/;
	if (c1 == "") {
		error = "Enter Number\n";

		errPrice = "Enter number only";
		document.getElementById("errPrice").innerHTML = error;
	} else if (!c1.match(pat)) {
		error = "Enter Number\n";

		errPrice = "Enter number only";
		document.getElementById("errPrice").innerHTML = error;

	} else {
		document.getElementById("errPrice").innerHTML = "";

	}

	var pat1 = /^\d{2}$/;
	if (c2 == "") {
		error = "Enter Number\n";

		errSeats = "Enter number only";
		document.getElementById("errSeats").innerHTML = error;
	} else if (!c2.match(pat1)) {
		error = "Enter Number\n";

		errSeats = "Enter number only";
		document.getElementById("errSeats").innerHTML = error;

	} else {
		document.getElementById("errSeats").innerHTML = "";

	}

	if (errPrice.length != 0 || errSeats.length != 0) {
		return false;
	}

}
