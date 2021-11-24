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
<form method="get" action="AgentAdd.jsp">
		<center>
			Agent ID : 
			<input type="number" name="agentid"> <br/><br/>
			Name : 
			<input type="text" name="name" /> <br/><br/> 
			City : 
			<input type="text" name="city" /> <br/><br/>
			Gender :
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/><br/> 
			Marital Status : 
			<input type="text" name="maritalstatus" /> <br/><br/> 
			Premium : 
			<input type="number" name="premium" /> <br/><br/> 
			<input type="submit" value="Add Agent" />
		</center>
	</form>
<c:if test="${param.agentid!=null && param.premium!=null}">
			<sql:setDataSource var="conn" 
				driver="oracle.jdbc.driver.OracleDriver"
				url="jdbc:oracle:thin:@localhost:1521:xe"
				user="mbhargav"
				password="mbhargav"
			/>
	<sql:update var="agentUpdate" dataSource="${conn}">
		Insert into Agent(agentid,name,city,gender,maritalstatus,premium) values(?,?,?,?,?,?)
		<sql:param value="${param.agentid}" />
		<sql:param value="${param.name}" />
		<sql:param value="${param.city}"/>
		<sql:param value="${param.gender}" />
		<sql:param value="${param.maritalstatus}" />
		<sql:param value="${param.premium}" />
	</sql:update>
	<c:out value="Record Inserted..." />
</c:if>
</body>
</html>