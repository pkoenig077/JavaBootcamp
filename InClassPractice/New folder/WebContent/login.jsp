<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="j_security_check" method="post">
		<label for="user">Username: </label> 
		<input type="text" id="user" name="j_username"><br>
		<label for="pass">Password: </label>
		<input type="password" id="pass" name="j_password"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>