<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='/stylesheets/style.css' />
    <link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	    <h4 align="center">Update student's email using student's ID</h4>
    <div  align="center">
        <form  action="update" method="POST">
        <label>Student ID</label>
        <input class="btn btn-dark" type="number" placeholder="Enter Student ID" name="studentid" required>
        <label>new Email</label>
        <input class="btn btn-dark" type="email" placeholder="Enter new Email" name="email" required>
        <button class="btn btn-primary" type="submit">Submit</button>
        </form>
        <a href="./index.html">Return to the Main Page</a> 
    </div> 

</body>
</html>