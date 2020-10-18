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
<body>
	    <h1 align="center">Delete a Student</h1>
    <div class="text-center">
        <form action="delete" method="POST">
        <label>Student ID: </label>
        <input class="btn btn-dark" type="text" placeholder="Enter a student ID" name="studentid" required>
        <button class="btn btn-primary" type="submit">Submit</button>
        </form>
         <a href="./index.html">Return to the Main Page</a> 
    </div>

</body>
</html>