<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drug Entry</title>
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
	<tr>
	<td colspan=2><h2>Drug Entry</h2></td>
	</tr>
	<f:form action="entry" method="post">
		<tr>
			<td>Name: </td><td><f:input path="drugName"/></td>
		</tr>
		<tr>
			<td>In-Stock: </td><td><f:input path="inStock"/></td>
		</tr>
		<tr>
			<td>Expiry Date: </td><td><f:input path="expiryDate"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add Drug"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</f:form>
<tr>
<td colspan=2><a href="home">Return</a></td>
</tr>
</table>
</body>
</html>