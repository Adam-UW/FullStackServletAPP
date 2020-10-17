<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>
<meta charset="ISO-8859-1">
<link rel='stylesheet' href='/stylesheets/style.css' />
 <link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body class="bg-dark">
    <div class="container">
<h2 class = "text-white">Items Available in the Students Database</h2>
   <table border="1" class = "table table-dark table-striped">
        <tr>
            <th>S.No</th>
            <th>S Name</th>
            <th>Gender</th>
            <th>Email</th>
            <th>Class Type</th>   
            <th>Major</th>                         
        </tr>
        
        <c:forEach items="${list}" var="student">
				  <tr>
				    <td>${student.student_id}</td>
				    <td>${student.student_name}</td>
				    <td>${student.gender}</td>
				    <td>${student.email}</td>
				    <td>${student.class_type}</td>
				    <td>${student.major}</td>
				  </tr>
		</c:forEach>
    </table>
    <a href="index.html">Return to the Main Page</a>    
    </div>
</body>
</html>