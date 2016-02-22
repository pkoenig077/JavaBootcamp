<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test JSP stuff</title>
</head>
<body>
<h1><a href ="http://localhost:8080/jpsHelloWorld/page1.jsp">Goodbye World</a></h1>

<%
Date d = new Date();
out.print("<h1>"+d.toLocaleString()+"</h1>");
%>
<%
Random r = new Random();
int rInt = r.nextInt(10);
if(rInt<5){
	out.print("<h2>Unlucky</h2>");
}else{
	out.print("<h2>Lucky</h2>");
}
%>

</body>
</html>