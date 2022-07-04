<%@page import="com.ty.student.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users list</title>
</head>
<body>
<%@ include file="Navbar.jsp" %>
<%Student student=(Student) request.getAttribute ("myStudent");  %>
<h1>Edit Item</h1>

<form action="edit" >

Id:<input type="text" name="id" value="<%=student.getId() %>"><br><br>
Name:<input type="text" name="userName" value="<%=student.getName() %>"><br><br>
	Email:<input type="text" name="userEmail" value="<%=student.getEmail() %>"><br><br>
	Gender:<input type="radio" id="Male" name="userGender" value="<%=student.getGender() %>" value="Male">
<label for="male">Male</label>
<input type="radio" id="Female" name="userGender" value="<%=student.getGender() %>"value="Female">
<label for="female">Female</label><br><br> 
   Phone:<input type="text" name="userPhone"  value="<%=student.getPhone() %>"><br><br>
	Age:<input type="number" name="userAge" value="<%=student.getAge() %>"><br><br>
	
	<input type="submit" value="submit">
	
</form>
</body>
</html>