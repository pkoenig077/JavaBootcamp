<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>More JSP practice stuff</title>
</head>
<body>
<h1>
<%
if(request.getHeader("user-agent").contains("Chrome")){
out.print("Chrome browser");
}else if(request.getHeader("user-agent").contains("Mozilla")){
	out.print("Mozilla browser");
}else out.print("What are you even using?");
%>
</h1>
<p>${header["user-agent"]}</p>
</body>
</html>