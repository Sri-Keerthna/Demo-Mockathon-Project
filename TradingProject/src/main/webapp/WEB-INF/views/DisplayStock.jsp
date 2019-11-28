<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
		<h1>Stock List</h1>
		
		<table border="1">

			<th>Stock Id</th>
			<th>Stock Name</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Brokerage</th>
			<th>Buy</th>
	

			<c:forEach var="stock" items="${stockList}">
				<tr>
					
					<td>${stock.stockid}</td>
					<td>${stock.sname}</td>
					<td>${stock.qty}</td>
					<td>${stock.price}</td>
					<td>${stock.brokerage}</td>
					<td><a href="buyStock">Buy</a></td>
				</tr>
			</c:forEach>
</table>
</div>
</body>
</html>