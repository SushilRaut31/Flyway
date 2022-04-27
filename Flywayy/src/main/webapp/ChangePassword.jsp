<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<h1>Hello <%out.print(session.getAttribute("name")); %></h1>
<h2 align="center">Welcome To  Change Password Page</h2>
<form action="ChangePasswordDB" method="post">
<table>
<tr><td>New Password:-</td><td><input type="text" name="t1">
<tr><td>Retype Password:-</td><td><input type="text" name="t2">
<br>
<tr><td><input type="text" name="t3" value="<%out.println(session.getAttribute("name"));%>" hidden="yes"></td><input type="submit" name="b1"></td></tr>
</table>

</form>
</body>
</html>