<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>User Form</h2>

	<form action="submit" method="post" modelAttribute="user">
		Enter Name: <input type="text" name="name" required /> <br><br> 
		Enter Department: <input type="text" name="department" required /> <br><br> 
		<input type="submit" value="Submit" />
	</form>

</body>
</html>