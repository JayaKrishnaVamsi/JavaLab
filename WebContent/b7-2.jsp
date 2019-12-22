<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","");
PreparedStatement pst=con.prepareStatement("insert into book values( ?,?,?,?,?)");
int num,price;
Scanner sc=new Scanner(System.in);
String title,author,publication;
num=Integer.parseInt(request.getParameter("num"));
title=request.getParameter("title");
author=request.getParameter("auth");
publication=request.getParameter("pub");
price=Integer.parseInt(request.getParameter("price"));
pst.setInt(1,num);
pst.setString(2,title);
pst.setString(3,author);
pst.setString(4,publication);
pst.setInt(5,price);
pst.executeUpdate();
out.println("inserted");
%>
<jsp:include page="b7-3.jsp"></jsp:include>
<%
String q=request.getParameter("tit");
PreparedStatement ps=con.prepareStatement("select * from book where title=?");
ps.setString(1,q);
ResultSet rs=ps.executeQuery();
while(rs.next()){
	out.println("Book no:"+rs.getInt(1));
	out.println("Title:"+rs.getString(2));
	out.println("Author:"+rs.getString(3));
	out.println("Publication:"+rs.getString(4));
	out.println("Price:"+rs.getInt(5));
}
%>
</body>
</html>