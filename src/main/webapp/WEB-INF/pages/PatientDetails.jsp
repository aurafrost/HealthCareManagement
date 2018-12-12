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
<tr><td colspan=8><h3 align="center">Patient Details</h3></td></tr>
	<tr>
	<td>Patient Name</td>
	<td>Type</td>
	<td>Service Fee</td>
	<td>Bed Charge</td>
	<td>X-Ray Charge</td>
	<td>Scanning Charge</td>
	<td>Medicine Charge</td>
	<td>Days in Hospital</td>
	</tr>
<c:forEach var="p" items="${list}">
	<tr>
	<td>${p.patientName}</td>
	<c:set var = "type" scope = "session" value = "${p.type}"/>
	<td>${type}</td>
	<c:choose>
		<c:when test = "${type=='OutPatient'}">
			<td>${p.serviceFee}</td>
			<td>N/A</td>
			<td>N/A</td>
			<td>N/A</td>
			<td>N/A</td>
			<td>N/A</td>
		</c:when>
		<c:when test = "${type=='Student'}">
			<td>N/A</td>
			<td>${p.bedCharge}</td>
			<td>${p.xRayCharge}</td>
			<td>${p.scanningCharge}</td>
			<td>${p.medicineCharge}</td>
			<td>N/A</td>
		</c:when>
		<c:when test = "${type=='Employee'}">
			<td>N/A</td>
			<td>${p.bedCharge}</td>
			<td>${p.xRayCharge}</td>
			<td>${p.scanningCharge}</td>
			<td>${p.medicineCharge}</td>
			<td>${p.daysInHospital}</td>
		</c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
	</tr>
</c:forEach>
<tr><td colspan="8"><a href="home">Return</a></td></tr>
</table>

</body>
</html>