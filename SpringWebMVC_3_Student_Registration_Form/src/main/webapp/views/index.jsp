<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">

   <a href="/allstudents" class="btn btn-primary">AllStudents</a>
    <h2 class="text-center mb-4">Student Registration Form</h2>
     
       <h3 style='color:green;font-size:40px:font-weight:800;text-align: center;'>${msg}</h3>

    <form:form action="save" modelAttribute="student" method="post" class="card p-4">
        <div class="form-group">
            <label for="name">Name:</label>
            <form:input path="name" class="form-control" id="name" placeholder="Enter your name"/>
        </div>
        
        <div class="form-group">
            <label for="email">Email:</label>
            <form:input path="email" class="form-control" id="email" placeholder="Enter your email"/>
        </div>
        
        <div class="form-group">
            <label>Gender:</label>
            <div>
                <form:radiobutton path="gender" value="Male" class="form-check-input" id="male"/>
                <label class="form-check-label" for="male">Male</label>
            </div>
            <div>
                <form:radiobutton path="gender" value="Female" class="form-check-input" id="female"/>
                <label class="form-check-label" for="female">Female</label>
            </div>
        </div>
        
        <div class="form-group">
            <label for="course">Course:</label>
            <form:select path="course" class="form-control" id="course">
                <form:option value="JAVA">JAVA</form:option>
                <form:option value="Spring Boot">Spring Boot</form:option>
                <form:option value="React">React</form:option>
                <form:option value="Angular 18">Angular 18</form:option>
            </form:select>
        </div>
        
        <div class="form-group">
            <label>Timings:</label>
            <div class="form-check">
                <form:checkbox path="timings" value="Morning" class="form-check-input" id="morning"/>
                <label class="form-check-label" for="morning">Morning</label>
            </div>
            <div class="form-check">
                <form:checkbox path="timings" value="Afternoon" class="form-check-input" id="afternoon"/>
                <label class="form-check-label" for="afternoon">Afternoon</label>
            </div>
            <div class="form-check">
                <form:checkbox path="timings" value="Evening" class="form-check-input" id="evening"/>
                <label class="form-check-label" for="evening">Evening</label>
            </div>
        </div>
        
        <button type="submit" class="btn btn-primary">Register</button>
    </form:form>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>