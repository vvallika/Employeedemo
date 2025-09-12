<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE httml>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<%@include file="navbar.jsp"%>

<h4 align="center" style="color:red">
<c:out value="${message}"></c:out><br/></h4>

<h2 align="center">Employee Login Form</h2>
<form method="post" action ="checkemployeelogin">
<label>Enter email</label>
<input type="text" class="form-control" name="ename"required="required"><br/>
<label>Enter password</label>
<input type="password" class="form-control" name="epwd" required="required"><br/>
<input type="submit" class="btn btn-success" value="login">
<input type="reset" class="btn btn-success" value="clear">
</form>
</body>
</html>