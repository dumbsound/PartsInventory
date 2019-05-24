<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<div>
		<img src="images/logo.png">
	</div>
	<h2>Parts Inventory Application</h2>
	<h3>Make a selection</h3>

	<div>

		<form action="AddNew.jsp">
			<input type="submit" value="Add" />
		</form>

		<form action="TablePage.jsp">
			<input type="submit" value="View Database" />
		</form>

		<form action="http://google.com">
			<input type="submit" value="testbutton" />
		</form>

	</div>

</body>

<footer>
	<div>
		<img src="images/apar-innosys.png">
	</div>
	<p>&copy; 2019 Apar Innosys<p>

</footer>
</html>