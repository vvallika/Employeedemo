<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE httml>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<%@include file="navbar.jsp"%>
<h2 align="center">Admin Login Form</h2>
<form method="post" action ="checkadminlogin">
<label>Enter username</label>
<input type="text" class="form-control" name="auname"required="required"><br/>
<label>Enter password</label>
<input type="password" class="form-control" name="apwd" required="required"><br/>
<input type="submit" class="btn btn-success" value="login">
<input type="reset" class="btn btn-success" value="clear">
</form>
</body>
</html>