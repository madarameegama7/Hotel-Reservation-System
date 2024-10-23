<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<h1>This is register page</h1>
<div style="margin:30px;">
<form action="registerServlet" method="post">
	
	Enter Full Name: <input type="text" name="name"><br><br>
	Enter Email: <input type="email" name="email"><br><br>
	Enter Username: <input type="text" name="username"><br><br>
	Enter Password: <input type="password" name="password"><br><br>
	Enter Contact Number: <input type="number" name="contactnumber"><br><br>
	Enter Address: <input type="text" name="address"><br><br>
	
	<input type="submit" value="register">
	
</form>
</div>
<a href="Main.jsp"><button type="button" class="btn btn-primary">Return home</button></a>
</body>
</html>