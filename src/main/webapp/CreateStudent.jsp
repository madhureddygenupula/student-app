<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create user</title>
</head>
<body>
<%@ include file="Navbar.jsp" %>
<form action="create" method="post">
	
	Name:<input type="text" name="userName"><br><br>
	Email:<input type="text" name="userEmail"><br><br>
	Gender:<input type="radio" id="Male" name="userGender" value="Male">
<label for="male">Male</label>
<input type="radio" id="Female" name="userGender" value="Female">
<label for="female">Female</label><br><br> 
   Phone:<input type="text" name="userPhone"><br><br>
	Age:<input type="number" name="userAge"><br><br>
	
	<input type="submit" value="submit">
	
	</form>

</body>
</html>