<%@page import="com.example.Employeedemo.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
Employee e =  (Employee)session.getAttribute("employee");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>
</head>
<body>
<%@include file="employeenavbar.jsp"%><br/>
<h3 align="center">My Profile</h3>
<br/>
ID:<%=e.getId() %><br/>
NAME:<%=e.getName() %><br/>
ROLE:<%=e.getRole() %><br/>
EMAIL:<%=e.getEmail() %><br/>
CONTACT: <%=e.getContact()%><br>
</body>
</html>