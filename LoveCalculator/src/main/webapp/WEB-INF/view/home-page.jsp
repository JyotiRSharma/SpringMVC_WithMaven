<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Welcome to Love Calculator</title>
</head>

<body>
	<h1 align="center">Love Calculator</h1>
	<hr>

	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your name:</label>
				<form:input id="yn" path="yourName" />
			</p>
			<p>
				<label for="cn">Crush name:</label>
				<form:input id="cn" path="crushName" />
			</p>

			<input type="submit" value="calculate">
			<input type="button" value="Register">
		</div>
	</form:form>
</body>

</html>