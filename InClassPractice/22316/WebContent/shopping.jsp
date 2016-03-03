<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.gc.shop.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>Thing</td>
			<td>$9999</td>
			<td><a href="shopping.jsp?item=Thing&price=9999">Add to Cart</a></td>
		</tr>
		<tr>
			<td>Thing2</td>
			<td>$1234</td>
			<td><a href="shopping.jsp?item=Thing2&price=1234">Add to
					Cart</a></td>
		</tr>
	</table>
	<br>
	<h1>Shopping Cart</h1>
	<%
		HashMap<String, ShoppingItem> cart = new HashMap<>();
		if (session.getAttribute("cart") == null) {
			session.setAttribute("cart", cart);
		} else {
			cart = (HashMap<String, ShoppingItem>) session.getAttribute("cart");
		}
		if (request.getParameter("item") != null) {
			if (cart.containsKey(request.getAttribute("item"))) {
				ShoppingItem temp = cart.get(request.getAttribute("item"));
				temp.setpQuant(temp.getpQuant() + 1);
			} else {
				String itemName = request.getParameter("item");
				float itemPrice = Float.parseFloat(request.getParameter("price"));
				ShoppingItem temp = new ShoppingItem(itemName, itemPrice, 1);
				cart.put(itemName, temp);
			}
			session.setAttribute("cart", cart);
		}
	%>

</body>
</html>