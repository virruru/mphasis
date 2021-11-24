<%@page import="java.text.SimpleDateFormat"%>
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
		String passF="";
		String ageF="";
		int no=Integer.parseInt(request.getParameter("nop"));
		String pass="passenger";
		String ag="age";
		String genF="";
		/* for(int i=1;i<no;i++){
			pass=pass+i;
			ag=ag+i;
			out.println(pass);
			out.println(request.getParameter(pass) + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			out.println("<br/><br/>");
			out.println(request.getParameter(ag));
		} */
		
		String flightid=(String)session.getAttribute("flightid");
		String doj=(String)session.getAttribute("doj");
		String tid=(String)	session.getAttribute("tid");
		out.println("Flight ID  " +flightid + "<br/><br/>");
		for(int i=1;i<=no;i++){
			String s1=request.getParameter("passenger" +i);
			String s2=request.getParameter("age" +i);
			String s3=request.getParameter("gender"+i);
		/* 	out.println(request.getParameter("passenger" +i));
			out.println(request.getParameter("age" +i));	
 */			passF+=s1+",";
			ageF+=s2+",";
			genF+=s3+",";
		}
		passF=passF.substring(0,passF.length()-1);
		ageF=ageF.substring(0,ageF.length()-1);
		genF=genF.substring(0,genF.length()-1);
		out.println(passF + "<br/>");
		out.println(ageF+ "<br/>");
		out.println(genF+ "<br/>");
		
		Passenger p=new Passenger();
		p.setPassengerName(passF);
		p.setGender(genF); 
		p.setAge(ageF); 
		
		   SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		    java.util.Date date = sdf.parse(doj);
		  //  out.println(date);
		    java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());  
		p.setJourneyDate(sqlStartDate);
		p.setFlightId(flightid);
	//	p.setTicketNo(tid);
		//PassengerDetailsBo boPassenger=new PassengerDetailsBo(); 
		out.println(PassengerDetailsBo.addPassenger(p));
		
		/* String s1=request.getParameter("passenger1");
		out.println(s1 + "<br/>");
		String s2=request.getParameter("passenger2");
		out.println(s2 + "<br/>");
		String age1=request.getParameter("age1");
		out.println(age1 + "<br/>");
		String age2=request.getParameter("age2");
		out.println(age2 + "<br/>"); */
	%>
	<jsp:forward page="Payment.jsp" />
</body>
</html>