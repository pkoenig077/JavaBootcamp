<%@page import="org.apache.catalina.SessionIdGenerator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
synchronized(session){
if(session.getAttribute("counter")==null)//initalize counter on first visit
session.setAttribute("counter", 0);
Integer counter = (Integer)session.getAttribute("counter");
counter++;
session.setAttribute("counter", counter);
out.print("<h1>"+counter+"</h1>");
out.print(session.getId()+"<br>");
out.print(session.isNew());

%>
<%
if(application.getAttribute("gcounter")==null)//initalize counter on first visit
application.setAttribute("gcounter", 0);
Integer gcounter = (Integer)application.getAttribute("gcounter");
gcounter++;
application.setAttribute("gcounter", gcounter);
out.print("<h1>"+gcounter+"</h1>");
}
%>
</body>
</html>