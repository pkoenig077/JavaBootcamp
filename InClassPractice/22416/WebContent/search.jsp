<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Database interaction test</title>
</head>
<body>
	<sql:setDataSource var="mySrc" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/northwind" user="root" password="root" />
	<sql:query var="ListCustomers" dataSource="${mySrc}">select * from customers where city='<%=request.getParameter("city")%>'</sql:query>
	<form action="search.jsp" method="get">
	<input type="text" name="city">
	<input type="submit" id="city" value="Search by City">
	</form>
	<table border=1>
	<cr:forEach var="myVar" items="${ListCustomers.rows}">
		<tr>
		<td>${myVar.customerid}
		<td>${myVar.contactname}
		<td>${myVar.companyname}
		<td>${myVar.city}
		<td>${myVar.country}
	</cr:forEach>
	</table>
</body>
</html>