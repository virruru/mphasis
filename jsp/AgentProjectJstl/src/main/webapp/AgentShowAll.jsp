<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn" 
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe"
	user="mbhargav"
	password="mbhargav"
	/>
	<sql:query var="agentQuery" dataSource="${conn}">
	    select * from Agent order by agentId
   </sql:query>
<table border="3">
	<tr>
		<th>Agent ID</th>
		<th>Name</th>
		<th>City</th>
		<th>Gender</th>
		<th>Marital Status</th>
		<th>Premium</th>
	</tr>
<c:forEach var="e" items="${agentQuery.rows}">
	<tr>
		<td><c:out value="${e.agentid}"/> </td>
		<td><c:out value="${e.name}"/> </td>
		<td><c:out value="${e.city}"/></td>
		<td><c:out value="${e.gender}"/> </td>
		<td><c:out value="${e.maritalstatus}"/> </td>
		<td><c:out value="${e.premium}"/> </td>
	</tr>
</c:forEach>
</table>
</body>
</html>