<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Health Care Management</title>
<style>
html{
	background-color:red;
	text-align: center;
}
table{
	background-color:darkred;
	border-style: solid;
	border-color: black;
	border-collapse: collapse;
}
th, td{
	padding: 1px 2px 1px 2px;
	border: 1px 1px 1px 1px;
	border-style: solid;
	border-color: black;
	font-weight: bold;
	font-size: 120%;
}
a{
	color: white;
	text-decoration: none;
}
</style>
</head>
<body>
<table align="center" border="1">
<tr>
	<th colspan=2>Health Care Management</th>
</tr>
<tr>
	<th><h3>Drug Store</h3></th>
	<th><h3>Case Records</h3></th>
</tr>
<tr>
	<td><a href="showentry">Drug Entry</a></td>
	<td><a href="showInPatientStudent">In-Patient (Student)</a></td>
</tr>
<tr>
	<td><a href="showupdate">Update Drug Entry</a></td>
	<td><a href="showInPatientEB">In-Patient (Employee/Beneficiary)</a></td>
</tr>
<tr>
	<td><a href="stock">Stock Details</a></td>
	<td><a href="showOutPatient">Out-Patient Record</a></td>
</tr>
<tr>
	<td></td>
	<td><a href="patientRecords">Patient Records</a></td>
</tr>
</table>
</body>
</html>