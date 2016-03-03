<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Index</title>
</head>
<body>
<h2><a href="welcome">Welcome Page</a></h2>
<h3><a href="welcome2?name=Phil">Welcome2 Page</a></h3>
<h3><a href="welcome3">Count Page</a></h3>
<h3><a href="welcome4">List my customers</a></h3>

<form method="post" action="verify">
<ul>
<li><label for="name">Name:</label><input type="text" id="name" name="name"></li>
<li><label for="Age">Age:</label><input type="number" id="Age" name="age"></li>
<li><label for="city">City:</label><input type="text" id="city" name="city"></li>
</ul>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
</body>
</html>