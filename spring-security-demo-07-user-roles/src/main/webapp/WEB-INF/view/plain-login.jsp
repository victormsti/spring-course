<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<style>
	.failed {
		color: red;
	}
</style>

<title>Custom Login Page</title>
</head>

<body>
	<h3>My Custom Login Page</h3>

	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">

		<c:if test="${param.error != null }">
			<i class="failed">Sorry! You entered invalid username/password.</i>
		</c:if>

		<p>
			User name: <input type="text" name="username" />
		</p>

		<p>
			password: <input type="password" name="password" />
		</p>

		<input type="submit" value="login" />

	</form:form>
</body>
</html>