<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="num1" value="${param.id1}"></c:set>
<c:set var="num2" value="${param.id2}"></c:set>
<c:set var="num3" value="${param.id3}"></c:set>
<c:set var="num4" value="${param.id4}"></c:set>
<c:set var="num5" value="${param.id5}"></c:set>
<c:set var="ans" value="${(num1+num2+num3+num4+num5)/5}"></c:set>
<c:out value="${ans}"></c:out>
<c:if test="${ans>=75}">
<h1>A Grade</h1>
</c:if>
<c:if test="${ans<75 && ans>=60}">
<h1>B Grade</h1>
</c:if>
<c:if test="${ans<60 && ans>=50}">
<h1>C Grade</h1>
</c:if>
</body>
</html>