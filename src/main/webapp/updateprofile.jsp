<%@page import="com.example.Employeedemo.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<% 
Employee e =  (Employee)session.getAttribute("employee");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update profile</title>
</head>
<body>
<%@include file="employeenavbar.jsp"%>
<h2 align="center">Employee Update Profile Form</h2>
<form method="post" action="update">
<div class="container">
<label>Enter id</label>
<input type="number" class="form-control" name="eid" value="<%=e.getId() %>" readonly="required"><br><br>
<label >Enter name</label>
<input type="text" class="form-control" name="ename" value="<%=e.getName() %>" required="required"/><br><br>
<label>Enter Role</label>
<input type="text" class="form-control" name="erole" value="<%=e.getRole() %>" required="required"><br><br>
<label>Enter email</label>
<input type="email" class="form-control" name="eemail" value="<%=e.getEmail() %>" readonly="required"><br><br>
<label>Enter password</label>
<input type="password" class="form-control" name="epwd" value="<%=e.getPassword() %>" required="required"><br><br>
<label>Enter contactno</label>
<input type="number" class="form-control" name="econtact" value="<%=e.getContact() %>" required="required"><br>
<br>
<input type="submit" class="btn btn-success" value="Update">
<input type="reset" class="btn btn-success" value="clear">

</div>
</form>
</body>
</html>