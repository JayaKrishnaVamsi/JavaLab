<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int price; %>
<%
String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age"));
%>
<%="Welcome " %>
<%="name:"+name %>
<%="age: "+age %>
<%
if(age>62)
	price=50;
else if(age<10)
	price=30;
else
	price=80;
%>
<%="price: "+price %>
</body>
</html>