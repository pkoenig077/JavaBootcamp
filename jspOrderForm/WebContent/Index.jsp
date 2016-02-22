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

	<%
		Date d = new Date();
		out.print("<h1>" + d.toLocaleString() + "</h1>");
	%>
	<%
		Random r = new Random();
		int rInt = r.nextInt(10);
		if (rInt > 5) {
			out.print("<h2>Lucky</h2>");

			if (rInt == 9) {
				out.print("<h1>Bonus points!</h1>");
			}
		} else {
			out.print("<h2>Unlucky</h2>");
		}
	%>
	<div class="container">
		<form method="get" action="Success.jsp">
			<h3>Coffee name:</h3>
			<input type="text" name="c_name" value="Medium Roast">
			<h3>Coffee Size:</h3>
			<div class="4u 12u$(small)">
				<input type="radio" id="small" name="c_size" value="Small">
				<label for="small">Small</label>
			</div>
			<div class="4u 12u$(small)">
				<input type="radio" id="medium" name="c_size" value="Medium" checked>
				<label for="medium">Medium</label>
			</div>
			<div class="4u$ 12u$(small)">
				<input type="radio" id="large" name="c_size" value="Large">
				<label for="large">Large</label>
			</div>
			<h3>Options:</h3>
			<div class="6u 12u$(small)">
				<input type="checkbox" id="decaf" name="options" value="Decaf"> <label
					for="decaf">Decaf</label>
			</div>
			<div class="6u 12u$(small)">
				<input type="checkbox" id="cream" name="options" value="Cream"> <label
					for="cream">Cream</label>
			</div>
			<div class="6u 12u$(small)">
				<input type="checkbox" id="sugar" name="options" value="Sugar"> <label
					for="sugar">Sugar</label>
			</div>
			<input type="submit"> <input type="reset">
		</form>
	</div>

	<p>
		<a href="http://localhost:8080/jspHelloWorld/page1.jsp">Browser
			Check</a>
	</p>
</body>
</html>