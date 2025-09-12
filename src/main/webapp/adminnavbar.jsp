<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%= request.getContextPath() %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Employee Demo project </title>
</head>
<body>

<a href="<%= request.getContextPath() %>/adminhome.jsp">  Home</a>&nbsp;&nbsp;
<a href="<%= request.getContextPath() %>/empreg.jsp">Add Employee</a>
<a href="<%= request.getContextPath() %>/viewallemployee.jsp">View Employees</a>&nbsp;&nbsp;
<a href="<%= request.getContextPath() %>/deleteemployee.jsp">Delete Employee</a>&nbsp;
<a href="<%= request.getContextPath() %>/adminlogin.jsp">Logout</a>
</body>
</html>