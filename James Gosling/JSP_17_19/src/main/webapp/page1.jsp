<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String user = request.getParameter("uname");
	String pass = request.getParameter("pass");
	
	if(user.equals("uddhav") && pass.equals("123")){
		session.setAttribute("username", user);
		session.setAttribute("password", pass);
		
		String encodeurl = response.encodeUrl("page2.jsp?sessionID="+session.getId()+"user="+user);
	%>
	<a href="<%= encodeurl %>">click here to page 2</a>
	<% 
	}
	else
	{
		response.sendRedirect("index.jsp?status=Invalid Credentials..");
	}
%>
</body>
</html>