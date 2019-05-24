<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style> 
input[type=submit]{
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=reset]{
  background-color: #f44336;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div>
		<img src="images/logo.png" alt=""/>
	</div>
	<h2>Parts Inventory Application</h2>

	<h4>Please Login</h4>



	<form action="LoginPage" method="post">
		User name:<br> <input type="text" name="username"> <br>
		Password:<br> <input type="password" name="userpass"><br>
		<input type="submit" value="Submit"> <input type="reset" value="Reset">
	</form>


</body>

<footer>
	<div>
		<img src="images/apar-innosys.png">
	</div>
	<p>&copy; 2019 Apar Innosys<p>

</footer>
</html>