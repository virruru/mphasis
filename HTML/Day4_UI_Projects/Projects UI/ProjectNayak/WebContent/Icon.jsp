<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/Footer.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.big-btn{
padding: 10px 0px 11px 0px;
width: 215px;
margin-top:5px;
}

.big-btn i{
font-size: 65px;
margin-right: 0px !important;
}
.big-btn strong{
font-size: 25px;
text-shadow: 1px 2px 0px #34659B;
color: #fff;
line-height: 24px;
}
.big-btn .btn-text{
margin-top:6px;
}

.big-btn small{font-size: 75%;}

.android-btn{

width: 240px;
padding: 13px 17px 13px 0px;
background-color: #000;
border-color: #000;

}
.android-btn:hover{
background-color: #272727;
}

.android-btn i{
font-size: 55px;
}

.android-btn .btn-text{
margin-top: 0px;
}

.android-btn strong{
font-size: 25px;
text-shadow: none;
color: #fff;
line-height: 24px;
}

.windows-btn{
background-color:#008A00;
width: 235px;
padding: 13px 5px 13px 10px;
border-color: #055805;
}

.windows-btn:hover{
background-color: #008A00;
}
.windows-btn .btn-text{
text-shadow: none;
font-size: 26px;
line-height: 25px;
}


</style>

<body>

<div class="container">
	<div class="row">
		<div class="col-md-6">
        <h2>Store Icons</h2>
        
       
        </div>
	</div>
    <div class="row">
        
        <div class="col-md-8">
           <!-- apple store button -->
                <a class="btn btn-lg btn-primary big-btn" href="#">
  				<i class="glyphicon glyphicon-phone pull-left"></i><div class="btn-text"><small>Available on the</small><br><strong>App Store</strong></div></a>
            <!-- android button -->
  				<a class="btn btn-lg btn-success big-btn android-btn" href="#">
  				<img width="80px" class="pull-left" src="http://www.userlogos.org/files/logos/jumpordie/google_play_04.png"><div class="btn-text"><small>Available on</small><br><strong>Google Play</strong></div></a>
            
            
        </div>
    </div>
</div>

</body>
</html>