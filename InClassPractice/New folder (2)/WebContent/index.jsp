<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.apache.http.*"%>
<%@ page import="org.apache.http.client.methods.HttpGet"%>
<%@ page import="org.apache.http.impl.client.DefaultHttpClient"%>
<%@ page import="org.apache.http.util.EntityUtils"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>testYahooWeather Thing</title>
</head>
<body>
<%
DefaultHttpClient httpclient = new DefaultHttpClient();
HttpHost p = new HttpHost("weather.yahooapis.com",80,"http");
HttpGet getWeather = new HttpGet("/forecastrss?p=48462&u=f");
HttpResponse resp = httpclient.execute(p, getWeather);
out.print(EntityUtils.toString(resp.getEntity()));
 %>
</body>
</html>