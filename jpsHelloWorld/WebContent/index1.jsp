<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML>
<!--
	Iridium by TEMPLATED
    templated.co @templatedco
    Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>JSP templating practice</title>
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
<body class="homepage">

	<!-- Header -->
	<div id="header">
		<div class="container">

			<!-- Logo -->
			<div id="logo">
			<table border =1> 
				<% String city[]={"Detroit","Chicago","DC","Troy"};%>
				<%
for(int i=0;i<city.length;i++){
out.print("<tr><td>"+city[i]+"</td></tr>");
}
%>
</table>
				<span>Design by TEMPLATED</span>
			</div>

			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li class="active"><a href="index1.jsp">Homepage</a></li>
					<li><a href="left-sidebar.html">Left Sidebar</a></li>
					<li><a href="right-sidebar.html">Right Sidebar</a></li>
					<li><a href="no-sidebar.html">No Sidebar</a></li>
				</ul>
			</nav>
		</div>
	</div>

	<!-- Main -->
	<div id="main">
		<div class="container">
			<div class="row">

				<!-- Content -->
				<div id="content" class="8u skel-cell-important">
					<section>
						<header>
							<h2>Welcome to Iridium!</h2>
							<span class="byline">Integer sit amet pede vel arcu
								aliquet pretium</span>
						</header>
						<a href="#" class="image full"><img src="images/pic07.jpg"
							alt="" /></a>
							
						<p>
							<%
if(request.getHeader("user-agent").contains("Chrome")){
out.print("Chrome browser");
}else if(request.getHeader("user-agent").contains("Mozilla")){
	out.print("Mozilla browser");
}else out.print("What are you even using?");
%>
						</p>
						<p>${header["user-agent"]}</p>
						
					</section>
				</div>

				<!-- Sidebar -->
				<div id="sidebar" class="4u">
					<section>
						<header>
							<h2>Pellentesque vulputate</h2>
						</header>
						<ul class="style">
							<li>
								<p class="posted">August 11, 2002 | (10 ) Comments</p> <img
								src="images/pic04.jpg" alt="" />
								<p class="text">Nullam non wisi a sem eleifend. Donec mattis
									libero eget urna. Pellentesque viverra enim.</p>
							</li>
							<li>
								<p class="posted">August 11, 2002 | (10 ) Comments</p> <img
								src="images/pic05.jpg" alt="" />
								<p class="text">Nullam non wisi a sem eleifend. Donec mattis
									libero eget urna. Pellentesque viverra enim.</p>
							</li>
							<li>
								<p class="posted">August 11, 2002 | (10 ) Comments</p> <img
								src="images/pic06.jpg" alt="" />
								<p class="text">Nullam non wisi a sem eleifend. Donec mattis
									libero eget urna. Pellentesque viverra enim.</p>
							</li>
						</ul>
					</section>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<div id="featured">
		<div class="container">
			<div class="row">
				<div class="4u">
					<h2>Aenean elementum facilisis</h2>
					<a href="#" class="image full"><img src="images/pic01.jpg"
						alt="" /></a>
					<p>Nullam non wisi a sem semper eleifend. Donec mattis libero
						eget urna. Donec leo, vivamus fermentum nibh in augue praesent a
						lacus at urna congue rutrum. Quisque dictum. Pellentesque viverra
						vulputate enim.</p>
					<p>
						<a href="#" class="button">More Details</a>
					</p>
				</div>
				<div class="4u">
					<h2>Fusce ultrices fringilla</h2>
					<a href="#" class="image full"><img src="images/pic02.jpg"
						alt="" /></a>
					<p>Nullam non wisi a sem semper eleifend. Donec mattis libero
						eget urna. Donec leo, vivamus fermentum nibh in augue praesent a
						lacus at urna congue rutrum. Quisque dictum. Pellentesque viverra
						vulputate enim.</p>
					<p>
						<a href="#" class="button">More Details</a>
					</p>
				</div>
				<div class="4u">
					<h2>Etiam rhoncus volutpat erat</h2>
					<a href="#" class="image full"><img src="images/pic03.jpg"
						alt="" /></a>
					<p>Nullam non wisi a sem semper eleifend. Donec mattis libero
						eget urna. Donec leo, vivamus fermentum nibh in augue praesent a
						lacus at urna congue rutrum. Quisque dictum. Pellentesque viverra
						vulputate enim.</p>
					<p>
						<a href="#" class="button">More Details</a>
					</p>
				</div>
			</div>
		</div>
	</div>


	<!-- Footer -->
	<div id="footer">
		<div class="container">
			<div class="row">
				<div class="4u">
					<section>
						<h2>Latest Posts</h2>
						<ul class="default">
							<li><a href="#">Pellentesque lectus gravida blandit</a></li>
							<li><a href="#">Lorem ipsum consectetuer adipiscing</a></li>
							<li><a href="#">Phasellus nibh pellentesque congue</a></li>
							<li><a href="#">Cras vitae metus aliquam pharetra</a></li>
							<li><a href="#">Maecenas vitae orci feugiat eleifend</a></li>
						</ul>
					</section>
				</div>
				<div class="4u">
					<section>
						<h2>Ultrices fringilla</h2>
						<ul class="default">
							<li><a href="#">Pellentesque lectus gravida blandit</a></li>
							<li><a href="#">Lorem ipsum consectetuer adipiscing</a></li>
							<li><a href="#">Phasellus nibh pellentesque congue</a></li>
							<li><a href="#">Cras vitae metus aliquam pharetra</a></li>
							<li><a href="#">Maecenas vitae orci feugiat eleifend</a></li>
						</ul>
					</section>
				</div>
				<div class="4u">
					<section>
						<h2>Aenean elementum</h2>
						<ul class="default">
							<li><a href="#">Pellentesque lectus gravida blandit</a></li>
							<li><a href="#">Lorem ipsum consectetuer adipiscing</a></li>
							<li><a href="#">Phasellus nibh pellentesque congue</a></li>
							<li><a href="#">Cras vitae metus aliquam pharetra</a></li>
							<li><a href="#">Maecenas vitae orci feugiat eleifend</a></li>
						</ul>
					</section>
				</div>
			</div>
		</div>
	</div>

	<!-- Copyright -->
	<div id="copyright">
		<div class="container">
			Design: <a href="http://templated.co">TEMPLATED</a> Images: <a
				href="http://unsplash.com">Unsplash</a> (<a
				href="http://unsplash.com/cc0">CC0</a>)
		</div>
	</div>

</body>
</html>