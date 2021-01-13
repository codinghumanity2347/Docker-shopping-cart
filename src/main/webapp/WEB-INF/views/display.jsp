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
	<div class="form" text-align="center">
		<form action="/brandbycategoryid" method="get" modelattribute="Brands">
			<table>
				<tr>
					<td><label for="inputEmail4">select category</label> <select
						class="form-control" id="categoryId" name="categoryId">
							<option>select</option>
							<c:forEach items="${category}" var="category">
								<option value="${category.categoryId}">${category.categoryName}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="Submit" class="blue-button"
						value="show"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>