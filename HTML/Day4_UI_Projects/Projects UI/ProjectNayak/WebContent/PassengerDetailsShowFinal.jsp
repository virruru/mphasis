<%@page import="com.cts.beans.Passenger"%>
<%@page import="com.cts.helper.PassengerDetailsBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
		String pnr=PassengerDetailsBo.getPnr();
	//	PassengerDetailsBo boPassenger=new PassengerDetailsBo(); 
		Passenger p=PassengerDetailsBo.searchPassenger(pnr);

		if(p!=null){
			String[] passengers=p.getPassengerName().split(",");
			String[] age=p.getAge().split(",");
			String[] gender=p.getGender().split(",");
			
			int c=0;
			for(int i=0;i<age.length;i++){
				c++;
				out.println("Passenger " +c+ " Passenger Name  " +passengers[i] + " Age  " +age[i] + "  Gender  " +gender[i] +"<br/><br/>");
			}
			/* out.println(p.getPassengerName());
			out.println(p.getAge());
			out.println(p.getGender()); */
		}
	%>
</body>
</html>