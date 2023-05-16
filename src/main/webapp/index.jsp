<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><i>Login Here...</i></h3>
<form action="verifyLogin" method="post">
<i>Email</i><input type="text" name="email" />
<i>Password</i><input type="text" name="password" />
<input type="submit" value="Login" />
</form>
<%
if(request.getAttribute("error")!=null){
out.println(request.getAttribute("error"));
}
%>
<%
if(request.getAttribute("ml")!=null){
out.println(request.getAttribute("ml"));
}
%>
</body>
</html>