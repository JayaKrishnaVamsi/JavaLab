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
if(mark>=90)
	{
	out.println("Grade A");
	}
else if(mark<90 && mark>=80)
	{
	out.println("Grade B");
	}
else if(mark<80 && mark>=70)
	{
	out.println("Grade C");
	}
else out.println("FAIL");

%>
</body>
</html>