<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="loginvalidate" method="get" modelAttribute="register">
					<table BORDER="1" align="center" bgcolor="#E8FDFF" weight="50%"
						height="40%">
						<tr>
							<td>User ID</td>
							<td></td>
							<td><form:input path="userId" name="userId" /></td>
							
						</tr>
						<tr>
							<td>User Password</td>
							<td></td>
							<td><form:password path="user_password" name="user_password" /></td>
							
						
							
						</tr>
						<tr>
						<td><input type="submit" value="Submit"  class= "btn btn-primary">
						<input type="reset" class= "btn btn-secondary">
						</td>
						</tr>
						</table>
						</form:form>
</body>
</html>