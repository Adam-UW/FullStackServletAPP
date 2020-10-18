<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 	<meta name="viewport" content="width=device-width, initial-scale=1.0">
   	<link rel='stylesheet' href='/stylesheets/style.css' />
    <link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body class="bg-dark">
    <div class="container">
<h2 class = "text-white">Items Available in the Students Database</h2>
   <table border="1" class = "table table-dark table-striped">
		   <%
		   		session.removeAttribute("student");
		   
		   		session.getAttribute("student");
		   %>
        <tr>
            <th>S.No</th>
            <th>S Name</th>
            <th>Gender</th>
            <th>Email</th>
            <th>Class Type</th>   
            <th>Major</th>                         
        </tr>
				  <tr>
				    <td>${student.student_id}</td>
				    <td>${student.student_name}</td>
				    <td>${student.gender}</td>
				    <td>${student.email}</td>
				    <td>${student.class_type}</td>
				    <td>${student.major}</td>
				  </tr>
    </table>
    <a href="index.html">Return to the Main Page</a>    
    </div>
</body>
</html>