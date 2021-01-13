<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js" integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo=" crossorigin="anonymous"></script>
</head>
<body>
<h1>Select Brand</h1>
	<hr>

	<div class="form" text-align="center">
		<form action="/brand" method="post" modelattribute="Brand">
		<div>
			<table>
				<tr>
					<th colspan="2">Add Category</th>
				</tr>
				<tr>

					<td>Enter brand details</td>
				<tr>
					<td><label for="brandName">brandName:</label></td>
					<td><input type="text" name="brandName"></td>
				</tr>
				
				
				<tr>
				<td>
				<label for="inputEmail4">Category Name</label> 
				<select class="form-control" id="categoryId" name="categoryId" >
					<option>select</option>
					<c:forEach items="${categories}" var="category">
						<option value="${category.categoryId}">${category.categoryName}</option>
					</c:forEach>
				</select>
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
<script type="text/javascript">

	$('form').validate({
		rules : {
			brandName : {
				required : true,
				lettersonly : true
			}	
		}
	});
</script>
</html>