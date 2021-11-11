<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobile Web</title>
</head>
<body>
	<h1>Welcome to Mobile Manager Program</h1>
	<a href="insert.jsp">Insert</a>
	<hr>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>Mobile Name</th>
			<th>Producer</th>
			<th>Price</th>
			<th>Description</th>
			

		</tr>
		<c:forEach items="${lst}" var="mobile">
			<tr>
				<td>${mobile.mobId}</td>
				<td>${mobile.mobName}</td>
				<td>${mobile.producer}</td>
				<td>${mobile.price}</td>
				<td>${mobile.description}</td>

			</tr>

		</c:forEach>
	</table>

</body>
</html>