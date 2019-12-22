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
String user=request.getParameter("username");
String pass=request.getParameter("password");
session.setAttribute("user", user);
session.setAttribute("pass", pass);
if(user.equals("vamsi") && pass.equals("vamsi4"))
{%>
<jsp:forward page="b44.jsp"></jsp:forward>

<%}
else{
	response.sendRedirect("b4.html");
}
	%>


%>
</body>
</html>