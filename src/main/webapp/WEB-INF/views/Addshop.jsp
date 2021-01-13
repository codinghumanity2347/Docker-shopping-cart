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

</head>
<body>

	<center>
		<h1>Add Shop Form</h1>
	</center>

	<br>
	<br>
	<form action=submitShops>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Shop Name</label> <input type="text"
					class="form-control" id="shopName" name="shopName"
					placeholder="shop Name">
			</div>
			<div class="form-group col-md-6">
				<label for="inputEmail4">Dishe Type</label> <select
					class="form-control" id="disheType" name="disheType">
					<option value="south">south</option>
					<option value="north">north</option>
					<option value="Chinese">Chinese</option>
				</select>

			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Rating</label> <input type="number" step="any"
					class="form-control" id="rating" name="rating" placeholder="rating">
			</div>
			<div class="form-group col-md-6">
				<label for="inputEmail4">Block Name</label> 
				<select class="form-control" id="blockId" name="blockId" >
					<option>select</option>
					<c:forEach items="${block}" var="block">
						<option value="${block.blockId}">${block.blockName}</option>
					</c:forEach>
				</select>
			</div>

		</div>

		<div align="center">
			<button type="submit" class="btn btn-primary"
				onclick="alert('confirm before submit'); validate();">Submit</button>
		</div>
	</form>
</body>
<script type="text/javascript">
$('#firstName').keypress(function (e) {
    var regex = new RegExp("^[a-zA-Z]+$");
    var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
    if (regex.test(str)) {
        return true;
    }
    else
    {
    e.preventDefault();
    alert('Please Enter Alphabate');
    return false;
    } 
});
$('#lastName').keypress(function (e) {
    var regex = new RegExp("^[a-zA-Z]+$");
    var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
    if (regex.test(str)) {
        return true;
    }
    else
    {
    e.preventDefault();
    alert('Please Enter Alphabate');
    return false;
    } 
});


$(document).ready(function () {
	  //called when key is pressed in textbox
	  $("#mobileNumber").keypress(function (e) {
	     //if the letter is not digit then display error and don't type anything
	     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
	        //display error message
	        $("#errmsg").html("Digits Only").show().fadeOut("slow");
	               return false;
	    }
	   });
	});
</script>
</html>