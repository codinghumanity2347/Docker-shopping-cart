<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style>
.main-div {
	background-color: #92a8d1;
	list-style-type: none;
	text-align: center;
	margin: 0;
	padding: 20px;
}

.main-div li {
	display: inline-block, flex;
	font-size: 20px;
	padding: 20px;
}
</style>
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
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="main-div" text-align="center">
		<form action="/category" method="post" modelattribute="Category">
			<table class="table table-bordered">
				<tr>
					<td colspan="2">Enter Category details</td>
				<tr>
					<td><label for="categoryName">categoryName:</label></td>
					<td><input type="text" name="categoryName"></td>
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
			categoryName : {
				required : true,
				lettersonly : true
			}	
		}
	});
</script>
</html>
