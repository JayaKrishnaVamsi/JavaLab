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
int mark=Integer.parseInt(request.getParameter("marks"));
if(mark>40)
{
	out.println("Eligible for SEE");
}
else{
	out.println("not eligible");
}
%>
<jsp:include page="b12-3.jsp"></jsp:include>
</body>
</html>