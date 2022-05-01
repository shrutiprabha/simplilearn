<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="productdetail">Click here to view Product list and details</a>
	<form action="store" method="post">
		ProductName: <input type="text" name="pname"><br>
		<br> ProductPrice:<input type="text" name="price"><br>
		<br> <input type="submit" value="Save" />
</body>
</html>