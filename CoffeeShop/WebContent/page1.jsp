<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>useragent display</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
<script src="js/jquery.min.js"></script>
<script src="js/skel.min.js"></script>
<script src="js/skel-layers.min.js"></script>
<script src="js/init.js"></script>
<noscript>
	<link rel="stylesheet" href="css/skel.css" />
	<link rel="stylesheet" href="css/style.css" />
	<link rel="stylesheet" href="css/style-xlarge.css" />
</noscript>
<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
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
	<div>
		<h1>
			<%
				if (request.getHeader("user-agent").contains("Chrome")) {
					out.print("Chrome browser");
				} else if (request.getHeader("user-agent").contains("Mozilla")) {
					out.print("Mozilla browser");
				} else
					out.print("What are you even using?");
			%>
		</h1>
	</div>
	<div>
		<p>${header["user-agent"]}</p>
	</div>
</body>
</html>