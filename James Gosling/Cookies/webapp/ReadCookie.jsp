<!DOCTYPE html>
<html>
<head>
<title>
Read Cookie</title>
</head>
<body>
<h1>Cookies Found</h1>
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
			out.println("key:"+ ck.getName()+ "  ,  ");
			out.println("value:"+ ck.getValue()+"\n");
		}
	}
	else
	{
		out.println("Cookies are not Available.");
	}
%>

<form action="DeleteCookie.jsp" method="get">
<input type="submit" value="Click here to delete Cookies"/>
</form>
</body>

</html>