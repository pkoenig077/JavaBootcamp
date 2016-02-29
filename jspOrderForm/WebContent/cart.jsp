<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Shopping Cart</title>
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
	<header id="header">
		<h1>
			<a href="index.jsp">Coffee Delivery by Carrier Pigeon</a>
		</h1>
		<nav id="nav">
			<ul>
				<li><a href="index.jsp">Order</a></li>
				<li><a href="page1.jsp">Browser Check</a></li>
				<li>
					<%
						Date d = new Date();
						out.print(d.toLocaleString());
					%>
				</li>
			</ul>
		</nav>
	</header>
	<div id="banner" class="align-center">
	<%
		String c_name = request.getParameter("c_name");
		String c_size = request.getParameter("c_size");
		if(c_name==null || c_size==null){
			response.sendRedirect("index.jsp");
		}
		out.print("<h2>Order: </h2>");
		out.print("<p>" + c_size + " " + c_name + "</p>");

		String options[] = request.getParameterValues("options");

		if (options != null) {
			out.print("<h2>With</h2>");
			out.print("<ul class=\"alt\">");
			for (String option : options)
				out.print("<li>" + option + "</li>");
			out.print("</ul>");
		} else {
			out.print("<h4>No Options Selected</h4>");
		}
	%>
	<form method="get" action="index.jsp">
		<ul class="actions">
			<li><button class="button fit" type="button" id="return">Return to Order Form</button></li>
			<li><button class="button fit" type="button" id="checkout">Check Out</button></li>
		</ul>
	</form>
	</div>
</body>
</html>