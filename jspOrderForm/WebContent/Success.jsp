<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
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
	<header id="header">
		<h1>
			<a href="Index.jsp">The Best Coffee This World Has Ever Seen</a>
		</h1>
		<nav id="nav">
			<ul>
				<li><a href="Index.jsp">Order</a></li>
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
	<div class="wrapper style2 align-center">
	<%
		String c_name = request.getParameter("c_name");
		String c_size = request.getParameter("c_size");
		if(c_name==null || c_size==null){
			response.sendRedirect("Index.jsp");
		}
		out.print("<h2>Successful Order</h2>");
		out.print("<p>" + c_size + " " + c_name + "</p>");

		String options[] = request.getParameterValues("options");

		if (options != null) {
			out.print("<h4>Options</h4>");
			out.print("<ul class=\"alt\">");
			for (String option : options)
				out.print("<li>" + option + "</li>");
			out.print("</ul>");
		} else {
			out.print("<h4>No Options Selected</h4>");
		}
	%>
	<form method="get" action="Index.jsp">
		<ul class="actions">
			<li><button class="button fit" type="submit" id="submit">Return</button></li>
		</ul>
	</form>
	</div>
</body>
</html>