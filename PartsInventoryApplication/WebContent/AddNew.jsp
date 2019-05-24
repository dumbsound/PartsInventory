<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.project.model.Parts"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Parts</title>
</head>
<body>
	<div>
		<img src="images/logo.png">
	</div>
	<h2>Parts Inventory Application</h2>

	<%  
 		Parts parts = (Parts)request.getAttribute("parts");  
 		if(parts==null){  
		parts=new Parts();
	 	parts.setDateReceived("");
		parts.setProductName("");
	 	parts.setSerialNos("");
		parts.setSku("");
 }  
 %>
	<h1>Parts Form</h1>
	<form action="PartsServlet" method="post">
	
		Date Received <input type="text" value="<%=parts.getDateReceived() %>"
		name="dateReceived"> 
			
		Product Name <input type="text" value="<%=parts.getProductName() %>" 
		name="studentName">  
		
		Serial Nos. <input type="text" value="<%=parts.getSerialNos() %>" 
		name="studentAddress"> 
		
		SKU <input type="text" value="<%=parts.getSku() %>" 
		name="sku"> 
		
		<input type="submit"value="<%=parts.getSku()==null?"Add":"Update" %>"
			name="<%=parts.getSku()==null?"add":"update" %>"> 
		
	</form>

</body>
<footer>
	<div>
		<img src="images/apar-innosys.png">
	</div>
	<p>&copy; 2019 Apar Innosys
	<p>
</footer>
</html>