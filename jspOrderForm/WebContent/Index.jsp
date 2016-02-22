<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Coffee Order Form</title>
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
		Date d = new Date();
		out.print("<h1>" + d.toLocaleString() + "</h1>");
	%>
	<%
		Random r = new Random();
		int rInt = r.nextInt(10);
		if (rInt < 5) {
			out.print("<h2>Unlucky</h2>");
		} 
		if (rInt>5) {
			out.print("<h2>Lucky</h2>");
		}
		if (rInt ==9){
			out.print("<h1>Bonus points!</h1>");
		}
		
	%>
	
	<form method="get" action="Success.jsp">
	<h3>Coffee name: </h3><input type="text" name="c_name" value="Medium Roast">
	<h3>Coffee Size: </h3>
	<input type="radio" name="c_size" value="Small"> Small<br>
	<input type="radio" name="c_size" value="Medium" checked="checked"> Medium<br>
	<input type="radio" name="c_size" value="Large"> Large<br>
	<h3>Options:</h3>
	<input type="checkbox" name="options" value="decaf"> Decaf<br>
	<input type="checkbox" name="options" value="cream"> Cream<br>
	<input type="checkbox" name="options" value="sugar"> Sugar<br>
	<input type="submit">
	<input type="reset">
	</form>

	<p><a href="http://localhost:8080/jpsHelloWorld/page1.jsp">Browser Check</a></p>
</body>
</html>