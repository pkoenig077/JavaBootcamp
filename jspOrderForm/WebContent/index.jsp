<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Coffee Delivery</title>
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
		<form method="get" id="Order" action="cart.jsp">
			<header class="major">
				<h2>Coffee by Pigeon</h2>
			</header>
			<div class="container 50%">
			
				<div class="12u$(xsmall) align-center select-wrapper">
					
					<select id="name" name="c_name">
						<option value="Light Roast" selected>Light Roast</option>
						<option value="Dark Roast">Dark Roast</option>
						<option value="Cappuccino">Cappuccino</option>
						<option value="Latte">Latte</option>
						<option value="Espresso">Espresso</option>
						<option value="Macchiato">Macchiato</option>
					</select>

				</div>
			
			</div>
			<h3>
				<label for="size">Size:</label>
			</h3>
			<ul id="size">
				<input type="radio" id="small" name="c_size" value="Small">
				<label for="small">Small</label>
				<input type="radio" id="medium" name="c_size" value="Medium" checked>
				<label for="medium">Medium</label>
				<input type="radio" id="large" name="c_size" value="Large">
				<label for="large">Large</label>
			</ul>
			<h3>
				<label for="options">Options:</label>
			</h3>
			<ul>
				<input type="checkbox" id="decaf" name="options" value="Decaf">
				<label for="decaf">Decaf</label>
				<input type="checkbox" id="cream" name="options" value="Cream">
				<label for="cream">Cream</label>
				<input type="checkbox" id="sugar" name="options" value="Sugar">
				<label for="sugar">Sugar</label>

				<input type="checkbox" id="espresso" name="options"
					value="Shot of Espresso">
				<label for="espresso">Shot of Espresso</label>

				<input type="checkbox" id="milk" name="options" value="Milk">
				<label for="milk">Milk</label>
				<input type="checkbox" id="almond" name="options"
					value="Almond Milk">
				<label for="almond">Almond Milk</label>
				<input type="checkbox" id="chocolate" name="options"
					value="Chocolate">
				<label for="chocolate">Chocolate</label>
				<input type="checkbox" id="vanilla" name="options" value="Vanilla">
				<label for="vanilla">Vanilla</label>
				<input type="checkbox" id="caramel" name="options" value="Caramel">
				<label for="caramel">Caramel</label>
			</ul>
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
						out.print(d.toLocaleString() + " (GMT-5)");
					%>
				</li>
				<li><a href="http://localhost:8080/jspOrderForm/page1.jsp">Browser
						Check</a></li>
				<li>
					<%
						if (application.getAttribute("gcounter") == null)//initalize counter on first visit
							application.setAttribute("gcounter", 0);
						Integer gcounter = (Integer) application.getAttribute("gcounter");
						gcounter++;
						application.setAttribute("gcounter", gcounter);
						out.print(gcounter + " Views");
					%>
				</li>
			</ul>
		</div>
	</footer>
</body>
</html>