<!DOCTYPE html>

<%
	//create cookies
	Cookie user = new Cookie("username",request.getParameter("user"));
	Cookie password = new Cookie("password",request.getParameter("pass"));

	//set age
	user.setMaxAge(60*60*24); //for 24 hour
	password.setMaxAge(60*60*24);
			
	//add cookies in response
	response.addCookie(user);
	response.addCookie(password);
	
	
%>

<html>
<head>
<title>
JSP</title>
</head>
<body>

<h1>Cookies Added Successfully with response</h1>
<form action="ReadCookie.jsp" method="post">
<input type="submit" value="Click here to read cookie" />
</form>
</body>

</html>