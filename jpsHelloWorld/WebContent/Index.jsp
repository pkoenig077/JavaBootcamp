<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test JSP stuff</title>
</head>
<body>
	<h1>
		<a href="http://localhost:8080/jpsHelloWorld/page1.jsp">Goodbye
			World</a>
	</h1>

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

	<table border=1>
		<%
			String city[] = null;
			request.setAttribute("city", city);
		%>
		<%
			try {
				for (int i = 0; i < city.length; i++) {
					out.print("<tr><td>" + city[i] + "</td></tr>");

				}
			} catch (NullPointerException e) {
				//log error
				out.print("<h1>Shit broke!</h1>");
			}
		%>
	</table>
	<table>
		<cr:forEach var="v" items="${city}">
			<cr:out value="${v}"></cr:out>
		</cr:forEach>
	</table>

</body>
</html>