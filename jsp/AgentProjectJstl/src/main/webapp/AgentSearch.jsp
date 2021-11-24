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
<form method="get" action="AgentSearch.jsp">
		<center>
			Agent ID : 
			<input type="number" name="agentid" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.agentid !=null}">
			<sql:setDataSource var="conn" 
				driver="oracle.jdbc.driver.OracleDriver"
				url="jdbc:oracle:thin:@localhost:1521:xe"
				user="mbhargav"
				password="mbhargav"
			/>
			
			<sql:query var="agentQuery" dataSource="${conn}">
	    		select * from Agent where agentid=?
	    		<sql:param value="${param.agentid}"/>
   			</sql:query>	
   			<c:set var="flag" value="0" />
<c:forEach var="e" items="${agentQuery.rows}">
	Agent ID : 
	<c:out value="${e.agentid}"/> <br/>
	Name : 
	<c:out value="${e.name}"/> <br/>
	City : 
	<c:out value="${e.city}"/> <br/>
	Gender : 
	<c:out value="${e.gender}"/> <br/>
	Marital Status : 
	<c:out value="${e.maritalstatus}"/> <br/>
	Premium :
	<c:out value="${e.premium}"/> <br/> <hr/>
	<c:set var="flag" value="1" />
</c:forEach>
<c:if test="${flag==0}">
	<c:out value="Record Not Found..."/>
</c:if>
   			
	</c:if>
</body>
</html>