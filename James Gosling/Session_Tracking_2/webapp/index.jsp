<%@ page import="java.util.*" %>
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
	Date CreateTime = new Date(session.getCreationTime());

	Date LastAccessTime = new Date(session.getLastAccessedTime());
	
	String title = "Welcome MITAOE Student ";
	
	//we need to create attribute as well as values for attributes
	String VisitAttribute = new String ("VisitCount");
	Integer Vscount = new Integer(0);
			
	String UserAttribute = new String("UserId");
	String UID = new String("uddhav");
	
	if(session.isNew())
	{
		title = "welcome to MITAOE";
		session.setAttribute(VisitAttribute, Vscount );
		session.setAttribute(UserAttribute, UID);
	}
	else
	{
		Vscount = (Integer) session.getAttribute(VisitAttribute);
		Vscount = Vscount + 1;
		session.setAttribute(VisitAttribute, Vscount );
		session.setAttribute(UserAttribute, UID);
	}
%>
<table>
	<tr>
		<td> SessionID </td>	
		<td> <%= session.getId() %> </td>
	</tr>
	<tr>
		<td> SessionCreateTime </td>	
		<td> <%= CreateTime %> </td>
	</tr>
	<tr>
		<td> LastAccessTime </td>	
		<td> <%= LastAccessTime %> </td>
	</tr>
	
	<tr>
		<td>UserId</td>
		<td><%= UID %></td>
	</tr>
	
	<tr>
		<td>VisitCount</td>
		<td><%= Vscount %></td>
	</tr>
</table>
</body>
</html>