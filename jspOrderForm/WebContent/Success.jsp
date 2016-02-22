<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Coffee Order Complete</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link href='http://fonts.googleapis.com/css?family=Arimo:400,700'
	rel='stylesheet' type='text/css'>
<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/skel.min.js"></script>
<script src="js/skel-panels.min.js"></script>
<script src="js/init.js"></script>
<noscript>
	<link rel="stylesheet" href="css/skel-noscript.css" />
	<link rel="stylesheet" href="css/style.css" />
	<link rel="stylesheet" href="css/style-desktop.css" />
</noscript>
<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
<!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
</head>
<body>
	<%
		String c_name = request.getParameter("c_name");
		String c_size = request.getParameter("c_size");
		out.print("<h1>Successful Order</h1>");
		out.print("<p>" + c_size + " " + c_name + "</p>");

		String options[] = request.getParameterValues("options");

		if (options != null) {
			out.print("<p>Options: <br><ul>");
			for (String option : options)
				out.print("<li>" + option + "</li>");
			out.print("</ul></p>");
		} else {
			out.print("<p>No Options Selected</p>");
		}
	%>
	<form method="get" action="Index.jsp">
		<button type="submit">Return to Order</button>
	</form>
</body>
</html>