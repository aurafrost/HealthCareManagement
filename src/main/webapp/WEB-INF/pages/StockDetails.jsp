<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock Details</title>
<style>
html{
	background-color:aqua;
	text-align: center;
}
table{
	background-color:orange;
}
</style>
</head>
<body>

<table align="center" border="1">
<tr><td colspan=3><h3 align="center">Stock Details</h3></td></tr>
	<tr>
	<td>Name</td>
	<td>In-Stock</td>
	<td>Expiry Date</td>
	</tr>
<c:forEach var="drug" items="${list}">
	<tr>
	<td>${drug.drugName}</td>
	<td>${drug.inStock}</td>
	<td>${drug.expiryDate}</td>
	</tr>
</c:forEach>
<tr><td colspan="3"><a href="home">Return</a></td></tr>
</table>

</body>
</html>