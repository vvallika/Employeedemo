<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="jakarta.tags.core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Fail</title>
</head>
<body>
<c:out value="${message}"></c:out><br/>
<a href="<%= request.getContextPath() %>/adminlogin.jsp">Try Again</a>
</body>
</html>