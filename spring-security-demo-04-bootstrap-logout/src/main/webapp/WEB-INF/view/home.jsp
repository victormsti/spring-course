<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>luv2code Company Home Page</title>
</head>
<body>
	<h2>luv2code Company Home Page - Test!!</h2>
	<hr>
	
	Welcome to the luv2code Company Home Page!
	
	<form:form
		action="${pageContext.request.contextPath}/logout"
		method="POST">
		
		<input type="submit" value="Logout">
		</form:form>
</body>
</html>