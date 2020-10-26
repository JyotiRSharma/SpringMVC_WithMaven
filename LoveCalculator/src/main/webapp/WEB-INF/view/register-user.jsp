<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<div align="center">
	<h1>Please Register here</h1>

	<form:form action="process-register" method="get"
		modelAttribute="registerUser">

		<p>
			<label for="user">User:</label>
			<form:input id="user" path="user" />
		</p>

		<p>
			<label for="userName">User Name:</label>
			<form:input id="userName" path="userName" />
		</p>

		<p>
			<label for="password">Password:</label>
			<form:password id="password" path="password" />
		</p>

		<label for="country">Country:</label>
		<form:select id="country" path="country">
			<form:option value="India" />
			<form:option value="USA" />
			<form:option value="Srilanka" />
		</form:select>

		<p>
			<label>Hobbies:</label> <label for="circket">Cricket:</label>
			<form:checkbox id="circket" path="hobby" value="Cricket" />
			<label for="programming">Programming:</label>
			<form:checkbox id="programming" path="hobby" value="Programming" />

			<label for="reading">Reading:</label>
			<form:checkbox id="reading" path="hobby" value="Reading" />

			<label for="Travel">Travel:</label>
			<form:checkbox id="Travel" path="hobby" value="Travel" />
		</p>

		<p>
			<label for="gender">Gender:</label>
			<label for="Male">Male</label>
			<form:radiobutton id="Male" path="gender" value="Male" />
			<label for="Female">Female</label>
			<form:radiobutton id="Female" path="gender" value="Female" />
		</p>
		
		<input type="submit" value="register" />
	</form:form>
</div>
</body>
</html>