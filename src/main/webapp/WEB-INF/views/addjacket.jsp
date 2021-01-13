<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>Jacket Data</h1>
	<hr>

	<div class="form" text-align="center">
		<form action="/jacket" method="post" modelattribute="Jacket">
			<table>
				<tr>
					<th colspan="2">Add Category</th>
				</tr>
				<tr>

					<td>Enter Jacket details</td>
				<tr>
					<td><label for="jacketColor">jacketColor:</label></td>
					<td><input type="text" name="jacketColor"></td>
				</tr>
				<tr>
					<td><label for="jacketDiscount">jacketDiscount:</label></td>
					<td><input type="text" name="jacketDiscount"></td>
				</tr>
				<tr>
					<td><label for="jacketPrice">jacketPrice:</label></td>
					<td><input type="text" name="jacketPrice"></td>
				</tr>

				<tr>
					<td>
						<div>
							<label for="inputEmail4">Brand Name</label> <select
								class="form-control" id="brandId" name="brandId">
								<option>select</option>
								<c:forEach items="${brands}" var="b">
									<option value="${b.brandId}">${b.brandName}</option>
								</c:forEach>
							</select>
						</div>
					</td>
				</tr>

				<tr>
					<td colspan="2"><input type="Submit" class="blue-button"
						value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>