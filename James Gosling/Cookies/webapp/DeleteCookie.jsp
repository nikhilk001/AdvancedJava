<!DOCTYPE html>
<html>
<head>
<title>
Delete Cookie</title>
</head>
<body>
<h1>Cookies Deleted</h1>
<%
	//java code
	Cookie ck = null; //1. create cookies object
	Cookie [] cookie = null; //2. create an array of object
	
	//3. get cookies by using getCookies()
	cookie = request.getCookies();
	
	//4. Logic to print cookies
	if(cookie!=null)
	{
		for(int i=0;i<cookie.length;i++)
		{
			ck = cookie[i];
			//to extract key-getName()
			//to extract value-getValue()
			if(ck.getName().compareTo("username")==0)
			{
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
			
			if(ck.getName().compareTo("password")==0)
			{
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
		}
	}
	else
	{
		out.println("Cookies are not Available.");
	}
%>
<form action="ReadCookie.jsp" method="get">
<input type="submit" value="Check Cookies"/>
</form>
</body>

</html>