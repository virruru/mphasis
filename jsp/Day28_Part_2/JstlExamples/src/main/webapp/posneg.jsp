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
<form method="get" action="posneg.jsp">
	<center>
		Enter a Number : 
		<input type="number" name="no" /> <br/><br/>
		<input type="submit" value="Show" />
	</center>
</form>
<br/><br/> 
<c:if test="${param.no!=null}">
	<c:if test="${param.no >= 0}">
		<c:out value="Positive Number..."/>
	</c:if>
	<c:if test="${param.no < 0}">
		<c:out value="Negative Number..."/>
	</c:if>
</c:if>
</body>
</html>