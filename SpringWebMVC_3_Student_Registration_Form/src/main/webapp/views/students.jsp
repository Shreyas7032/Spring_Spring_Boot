<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

 <a href="/" class="btn btn-info mt-3">Add Student</a>
	<h2 class="text-center">Student List</h2>

	<table class="table table-striped table-bordered table-hover">

<thead class="table-dark">
		<tr>

			<th>ID</th>
			<th>Name</th>
			<th>EMail</th>
			<th>Gender</th>
			<th>Course</th>
			<th>Timings</th>
			<th>Action</th>
		</tr>
</thead>
<tbody class="bg-secondary text-white">


<c:forEach var="student" items="${students}">
  <tr>
  
  <td>${student.id}</td>
  <td>${student.name}</td>
  <td>${student.email}</td>
  <td>${student.gender}</td>
  <td>${student.course}</td>
  <td>${student.timings}</td>
  
   <td> <a href="/delete" class="btn btn-info">Edit</a> 
   <a href="/delete" class="btn btn-danger">Delete</a> </td>
  
  </tr>

</c:forEach>


</tbody>

	</table>

</body>
</html>