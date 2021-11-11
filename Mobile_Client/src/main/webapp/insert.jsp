<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Mobile</title>
</head>
<body>
	<h2>Insert Mobile</h2>

	<form action="Insert" method="post">
		<table border=1>
			<tr>
				<th>Mobile Name</th>
				<td><input type="text" name="mobName"/></td>
			</tr>
			<tr>
				<th>Producer</th>
				<td><input type="text" name="producer"/></td>
			</tr>
			<tr>
				<th>Price</th>
				<td><input type="number" name="price" /></td>
			</tr>
			<tr>
				<th>Description</th>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Add Mobile" /></td>
			</tr>
		</table>
	</form>
	<a href="Home">Back</a>

</body>
</html>