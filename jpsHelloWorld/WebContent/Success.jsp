<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful Order</title>
</head>
<body>
	<%
		String c_name = request.getParameter("c_name");
		String c_type = request.getParameter("c_type");
		out.print("<h1>Successful Order</h1>");
		out.print("<p>" +c_type +" "+ c_name + "</p>");

		String options[] = request.getParameterValues("options");
		
		if(options!=null){
		out.print("<p>Options: <br><ul>");
		for(String option: options)
			out.print("<li>"+option+"</li>");
		out.print("</ul></p>");
		} else{
			out.print("<p>No Options Selected</p>");
		}
		
	
	%>

</body>
</html>