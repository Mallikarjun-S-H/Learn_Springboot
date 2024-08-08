<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<%
	String name = (String)request.getAttribute("name");
 %>

<h2>Name:<%=name %> </h2>
<a href="login">Login</a>
</body>
</html>