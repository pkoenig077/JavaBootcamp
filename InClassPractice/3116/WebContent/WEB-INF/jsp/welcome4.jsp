<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CustomerID list page</title>
</head>
<body>
<table border=1>
	<cr:forEach var="myVar" items="${clist}">
		<tr>
		<td>${myVar}</td>
	</cr:forEach>
	</table>
</body>
</html>