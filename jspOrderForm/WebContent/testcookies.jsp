<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="testcookies.jsp?temp=C">C</a>
	<a href="testcookies.jsp?temp=F">F</a>

	<%
		Cookie[] clientCookies = request.getCookies();
		String temp = request.getParameter("temp");
		if (clientCookies != null) {
			temp = clientCookies[0].getValue();
		}
		if (temp != null) {
			if (temp.equals("C")) {
				out.print("<h1>Temp: 0 C</h1>");
			} else
				out.print("<h1>Temp: 30 F</h1>");
			if (clientCookies != null) {
				clientCookies[0].setValue(temp);
				response.addCookie(clientCookies[0]);
			} else {
				Cookie tc = new Cookie("tempCookie", temp);
				tc.setMaxAge(60 * 60 * 24 * 30);
				response.addCookie(tc);
			}
		} else {
			out.print("<h1>Temp: 30 F</h1>");
		}
	%>

</body>
</html>