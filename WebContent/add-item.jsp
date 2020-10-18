<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>  
</head>
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <h2 class = "text-white">Add A Student!</h2>
    <form action="add-item" method="POST" class="needs-validation" novalidate>
      <div class="form-group">
        <label for="itemname" class="text-white">Student Name</label>
        <input type="text" class="form-control btn btn-dark" placeholder="Enter a Name" id="itemname" name="studentname" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>
      
      <div class="form-group">
        <label for="category" class="text-white">Student Email</label>
        <input type="email" class="form-control btn btn-dark" placeholder="Enter an Email" id="category" name="studentemail" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="quantity" class="text-white">Major?</label>
        <input type="text" placeholder="Enter your Major!" class="form-control btn btn-dark" id="major" name="major" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="price" class="text-white">Class Type</label>
        <input type="text" step="0.01" placeholder="Enter a class type? (Grad or Undergrad)" class="form-control btn btn-dark" id="classname" name="classname" required> 
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>
      
      <div class="form-group">
      			<label for="gender" class="text-white">Gender</label><br />
		        <input type="radio" id="male" name="genderm" value="male">
				<label for="male">Male</label><br>
				<input type="radio" id="female" name="genderf" value="female">
				<label for="female">Female</label><br>
				<input type="radio" id="other" name="gendero" value="other">
				<label for="other">Other</label>	      
      </div>

      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    <a href="./index.html">Return to the Main Page</a> 
</div>
</body>
</html>