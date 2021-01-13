<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shirts</title>
</head>
<body>
	<h3>Shirts</h3>
	<c:if test="${!empty listofshirts}">
		<table class="tg">
			<tr>
				<th width="80">shirtId</th>
				<th width="120">shirtName</th>
				<th width="120">shirtDiscount</th>
				<th width="120">shirtPrice</th>



			</tr>
			<c:forEach items="${listofshirts}" var="shirt">
				<tr>
					<td>${Shirt.shirtId}</td>
					<td>${shirt.shirtName}</td>
					<td>${shirt.shirtDiscount}</td>
					<td>${shirt.shirtPrice}</td>

				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>