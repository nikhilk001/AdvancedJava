<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is my first mvc program</h1>
<%
String uname=(String)request.getAttribute("username");
%>
<h1>your username is <%= uname %></h1>
</body>
</html>