<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><i>New Registration</i></h3>
<form action="saveReg" method="post">
<i>Name</i><input type="text" name="name"/>
<i>City</i><input type="text" name="city"/>
<i>Number</i><input type="text" name="number"/>
<i>Email</i><input type="text" name="email"/>

<input type="submit" value="Save"/>

</form>


<%
if(request.getAttribute("md")!=null){
out.println(request.getAttribute("md"));
}
%>



</body>
</html>