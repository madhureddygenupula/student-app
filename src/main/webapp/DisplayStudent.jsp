<%@page import="com.ty.student.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="display" method="post">

<%@ include file= "Navbar.jsp"%>
	<%
	List<Student> students=(List<Student>)request.getAttribute("myStudent");
%>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
	    <th>Email</th>
		<th>Phone</th>
		<th>Age</th>
		<th>Gender</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
<% 
	
	for(Student student : students) 
	{
			%>
			
			<tr>
				<td><%=student.getId() %></td>
				<td><%=student.getName() %></td>
				<td><%=student.getEmail() %></td>
				<td><%=student.getAge() %></td>
				<td><%=student.getPhone() %></td>
				<td><%=student.getGender() %></td>
				<td>
					<a href="delete?id=<%=student.getId() %>">Delete</a>
				</td>
				<td>
					<a href="get?id=<%=student.getId() %>">Edit</a>
				</td>
			</tr>
			
<%
		}
%>
	</form>
	
</table>
</body>
</html>