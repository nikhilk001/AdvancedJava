<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Form</h1>
<form action="checking" method="post">
<table>
<tr>
<td>Username</td>
<td><input type="text" name="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password"/></td>
</tr>
</table>
<input type="submit" value="submit" name="submit">
</form>
<%
String error=(String)request.getAttribute("msg");
if(error==null){
	error="";
}
%>
<h1><%=error %></h1>
</body>
</html>