<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<a href="<%= request.getContextPath() %>/emphome.jsp"> Home</a>&nbsp;&nbsp;
<a href="<%= request.getContextPath() %>/empprofile.jsp">Profile</a>&nbsp;&nbsp;
<a href="<%= request.getContextPath() %>/updateprofile.jsp">Update Profile</a>&nbsp;&nbsp;
<a href="<%= request.getContextPath() %>/emplogin.jsp">Logout</a>
</body>
</html>