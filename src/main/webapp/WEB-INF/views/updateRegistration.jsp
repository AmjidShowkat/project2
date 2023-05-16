<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><i>Update Registration</i></h3>
<form action="updateReg" method="post">
Email<input type="text" name="email" value="<%=request.getAttribute("email") %>" >
Number <input type="text" name="number" value="<%=request.getAttribute("number") %>" >
<input type="submit" value="Update" >
</form>
</body>
</html>