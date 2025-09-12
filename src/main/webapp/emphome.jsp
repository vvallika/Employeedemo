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
<title>emp home</title>
</head>
<body>
<%@include file="employeenavbar.jsp"%><br/>
<h4>Welocome <%= e.getName() %></h4>
</body>
</html>