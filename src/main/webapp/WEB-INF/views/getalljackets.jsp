<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Selected Brand Name</title>
</head>
<body>
	<h3>jackets</h3>
	<c:if test="${!empty listofjackets}">
		<table class="tg">
			<tr>
				<th width="80">jacketId</th>
				<th width="120">jacketColor</th>
				<th width="120">jacketDiscount</th>
				<th width="120">jacketPrice</th>



			</tr>
			<c:forEach items="${listofjackets}" var="Jacket">
				<tr>
					<td>${Jacket.jacketId}</td>
					<td>${Jacket.jacketColor}</td>
					<td>${Jacket.jacketDiscount}</td>
					<td>${Jacket.jacketPrice}</td>

				</tr>
			</c:forEach>
		</table>
	</c:if>
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