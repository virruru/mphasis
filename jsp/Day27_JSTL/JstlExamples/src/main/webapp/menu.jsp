<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="menu.jsp">
		<center>
			Enter a Number : 
			<input type="number" name="sno" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<c:if test="${param.sno !=null}">
		<c:set var="no" value="${param.sno}"/>
		<c:choose>
		<c:when test="${no==1}">
			<c:out value="Sakshi Jathar"/>		
		</c:when>
		<c:when test="${no==2}">
			<c:out value="Kritik"/>		
		</c:when>
		<c:when test="${no==3}">
			<c:out value="Sai Bhavani"/>		
		</c:when>
		<c:when test="${no==4}">
			<c:out value="Sowmya T"/>		
		</c:when>
		<c:otherwise>
			<c:out value="Invalid Number...."/>
		</c:otherwise>
		
	</c:choose>
	</c:if>
	
</body>
</html>