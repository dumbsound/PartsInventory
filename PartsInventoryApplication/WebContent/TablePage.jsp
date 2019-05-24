<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.project.model.Parts" %>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of all parts</title>
</head>
<body>

	<h1>Parts List</h1>
	<%! List<Parts> partsList = new ArrayList<Parts>();%>
	
	<% partsList=(ArrayList<Parts>)request.getAttribute("partsList");%>
	<table>
		<tr>
			<td>Date Received</td>
			<td>Product Name</td>
			<td>SKU</td>
			<td>Serial Number</td>
		</tr>																						
		<% for(Parts parts:partsList){ %>
		<tr>
			<td><%= parts.getDateReceived()%></td>
			<td><%= parts.getProductName()%></td>
			<td><%= parts.getSku()%></td>
			<td><%= parts.getSerialNos()%></td>
			<td><a
				href="PartsServlet?editSku=<%=parts.getSku()%>">Edit</a></td>
			<td><a
				href="PartsServlet?partsSkuDelete=<%=parts.getSku()%>">Delete</a></td>
		</tr>
		<%} %>
	</table>
</body>

<footer>
	<div>
		<img src="images/apar-innosys.png">
	</div>
	<p>&copy; 2019 Apar Innosys<p>

</footer>
</html>
