<%@page import="com.FIR.Beans.User"%>
<%@page import="java.util.List"%>
<%@page import="com.FIR.DAO.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 List<User> users = new UserDao().getAllUser();

%>
<% for(User u: users){ %>
<h1> <%=u.getEmail() %></h1>
<%} %>
</body>
</html>