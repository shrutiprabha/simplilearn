<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List</h1>
<table class="data">
	<tr>
		<th>Id</th><th>Name</th><th>Price</th>
	</tr>
	<c:forEach var="product" items="${list}">
		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td>${product.price}</td>
		</tr>
	</c:forEach>
	
</table>
<br><a href="edit.jsp">Click here to edit values</a>
</body>
</html>