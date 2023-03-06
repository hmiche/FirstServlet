<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello To Login Page</title>

</head>
<body>
<h1> Hello Veuillez identifie</h1>
<form method="post" action="Login") >

	<label for="txtLogin">LogIn :</label>
	<input id="txtlogin" name="txtlogin" type="text" value=<%= session.getAttribute("Login")%> autofocus /> <br>
	<label for="txtLogin">Password :</label>
	<input id="textPassword" name="textPassword"  type="password"  value=<%= session.getAttribute("password")%> autofocus /> <br>
	<input name="btnConnect" type="submit" />

</form>
</body>
</html>