<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
</head>
<body>
<%@include file="adminnavbar.jsp"%><br/><br/>

<h2 align="center">View all employee</h2><br/>
Total Employee:<c:out value="${count}"></c:out>
<table align="center" border=2 class="table table-striped">
<tr>
<th>ID</th>
<th>Name</th>
<th>Role</th>
<th>Email</th>
<th>Contact</th>
</tr>
<c:forEach items="${employeelist}" var="employee">
<tr>
<td><c:out value="${employee.id}"></c:out></td>

<td><c:out value="${employee.name}"></c:out></td>

<td><c:out value="${employee.role}"></c:out></td>

<td><c:out value="${employee.email}"></c:out></td>

<td><c:out value="${employee.contact}"></c:out></td>
</c:forEach>

</tr>

</table>
</body>
</html>