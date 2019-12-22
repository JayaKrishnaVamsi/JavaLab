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
if(session.isNew())
{
	out.println("0");
	session.setAttribute("count",0);
}
int count=(int)session.getAttribute("count");
count+=1;
out.println(count);
session.setAttribute("count",count);

%>

</body>
</html>