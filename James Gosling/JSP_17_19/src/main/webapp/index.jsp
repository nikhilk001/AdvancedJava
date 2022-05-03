<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EncodeUrl and sendRedirect</title>
</head>
<body>
<form action="page1.jsp" method="post">
<input type="text" name="uname"/>
<input type="password" name="pass"/>
<input type="submit" value="submit"/>
</form>
<%
String msg = request.getParameter("status");
if(msg==null)
{
msg=""	;
}

%>
<%= msg %>
</body>
</html>