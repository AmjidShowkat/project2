<%@page import="java.sql.ResultSet"%>
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
<h2><i>List Registrations</i></h2>
<table>
<tr>
<th>Name</th>
<th>City</th>
<th>Number</th>
<th>Email</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%
ResultSet result =(ResultSet)request.getAttribute("res");
while(result.next()){
%>	

<tr>	
	<td><%=result.getString(1) %></td>
<td><%=result.getString(2) %></td>
<td><%=result.getString(3) %></td>
<td><%=result.getString(4) %></td>
<td><a href="delReg?email=<%=result.getString(4) %>" >Delete</a></td>
<td><a href="updateReg?email=<%=result.getString(4) %>&mobile=<%=result.getString(3)%>">Update</a></td>
	</tr>
<% }%>
</table>
</body>
</html>