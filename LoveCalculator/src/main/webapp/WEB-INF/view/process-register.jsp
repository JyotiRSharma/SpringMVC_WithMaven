<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Processed</title>
</head>
<body>
<h1>Your registration was successful</h1>
<h2>The details entered by you are:</h2>
Name: ${showRegisteredUser.user }
<br>
User Name: ${showRegisteredUser.userName }
<br>
Password: ${showRegisteredUser.password }
<br>
Country: ${showRegisteredUser.country }
<br>
Hobbies: ${showRegisteredUser.hobby }
<br>
Gender: ${showRegisteredUser.gender}
</body>
</html>