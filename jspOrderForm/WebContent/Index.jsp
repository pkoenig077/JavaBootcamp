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

	<header id="header">
		<h1>
			<a href="Index.jsp">The Best Coffee This World Has Ever Seen</a>
		</h1>
		<nav id="nav">
			<ul>
				<li><a href="#Order">Order</a></li>
				<li><a href="#footer">About Us</a></li>
				<li>
					<%
						Date d = new Date();
						out.print(d.toLocaleString());
					%>
				</li>
			</ul>
		</nav>
	</header>
	<section id="banner">
		<h2>The Best Coffee You'll Ever Have:</h2>
		<p>Delivered By Carrier Pigeon</p>
		<ul class="actions">
			<li><a href="#footer" class="button big">Learn More</a></li>
		</ul>
	</section>
	<div class="wrapper style2 align-center">
		<form method="get" id="Order" action="Success.jsp">
			<h2 class="">
				<label for="name">Coffee:</label>
			</h2>

			<input type="text" id="name" name="c_name" value="Medium Roast"><br>
			<h3>
				<label for="size">Coffee Size:</label>
			</h3>
			<div class="">
				<ul id="size">
					<input type="radio" id="small" name="c_size" value="Small">
					<label for="small">Small</label>
					<input type="radio" id="medium" name="c_size" value="Medium"
						checked>
					<label for="medium">Medium</label>
					<input type="radio" id="large" name="c_size" value="Large">
					<label for="large">Large</label>
				</ul>
			</div>
			<h3>
				<label for="Extra Options">Options:</label>
			</h3>
			<div id="Extra Options">
				<ul class="alt">
					<li><input type="checkbox" id="decaf" name="options"
						value="Decaf"> <label for="decaf">Decaf</label></li>
					<li><input type="checkbox" id="cream" name="options"
						value="Cream"> <label for="cream">Cream</label></li>
					<li><input type="checkbox" id="sugar" name="options"
						value="Sugar"> <label for="sugar">Sugar</label></li>
				</ul>
			</div>
			<input type="submit"> <input type="reset">
		</form>
	</div>

	<footer id="footer">
		<div class="container">
			<div class="row">
				<section class="4u 6u(medium) 12u$(small)">
					<h3>About Us</h3>

					<ul class="alt">
						<li>This is some mad placeholder text</li>
						<li>Eventually this will have information</li>
						<li>About Carrier Pigeons</li>
					</ul>
				</section>
				<section class="4u 6u$(medium) 12u$(small)">
					<h3>Today's Luck Forecast</h3>

					<ul class="alt">
						<%
							Random r = new Random();
							int rInt = r.nextInt(10);
							if (rInt > 5) {
								out.print("<li><h3>Lucky</h3></li>");

								if (rInt == 9) {
									out.print("<li><h1>Bonus points!</h1></li>");
								}
							} else {
								out.print("<li><h2>Unlucky</h2></li>");
							}
						%>
					</ul>
				</section>
				<section class="4u$ 12u$(medium) 12u$(small)">
					<h3>Contact Us</h3>
					<ul class="icons">
						<li><a href="#" class="icon rounded fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon rounded fa-facebook"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon rounded fa-pinterest"><span
								class="label">Pinterest</span></a></li>
						<li><a href="#" class="icon rounded fa-google-plus"><span
								class="label">Google+</span></a></li>
						<li><a href="#" class="icon rounded fa-linkedin"><span
								class="label">LinkedIn</span></a></li>
					</ul>
					<ul class="tabular">

						<li>
							<h3>Mail</h3> <a href="#">pkoenig077@gmail.com</a>
						</li>
						<li>
							<h3>Phone</h3> (248) 882-3315
						</li>
					</ul>
				</section>
			</div>
			<ul class="copyright">
				<li>Design: <a href="http://templated.co">TEMPLATED</a></li>
				<li>Images: <a href="http://unsplash.com">Unsplash</a></li>
			</ul>
			<ul class="copyright">
				<li>
					<%
						out.print("<h1>" + d.toLocaleString() + "</h1>");
					%>
				</li>
				<li><a href="http://localhost:8080/jspOrderForm/page1.jsp">Browser
						Check</a></li>
			</ul>
		</div>
	</footer>
</body>
</html>