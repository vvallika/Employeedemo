<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample project</title>
</head>
<body>
<%@include file="navbar.jsp"%>
<h2 align="center">Employee Registration</h2>
<form method="post" action="insertemployee">
<div class="container">
<label>Enter id</label>
<input type="number" class="form-control" name="eid" required="required"><br><br>
<label >Enter name</label>
<input type="text" class="form-control" name="ename" required="required"/><br><br>
<label>Enter Role</label>
<input type="text" class="form-control" name="erole" required="required"><br><br>
<label>Enter email</label>
<input type="email" class="form-control" name="eemail" required="required"><br><br>
<label>Enter password</label>
<input type="password" class="form-control" name="epwd" required="required"><br><br>
<label>Enter contactno</label>
<input type="number" class="form-control" name="econtact" required="required"><br>
<br>
<input type="submit" class="btn btn-success" value="register">
<input type="reset" class="btn btn-success" value="clear">

</div>
</form>
</body>
</html>