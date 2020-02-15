<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <script>


 function valid(){
	 if (document.getElementById("first_name").value==""){  
	      document.getElementById("error1").innerHTML="<center>Username required</center>";  
	      return false;  
	    } 
	     else if(document.getElementById("last_name").value==""){
	    	document.getElementById("error2").innerHTML="<center>Last name required</center>";
	    	return false;
	     }
	     else if(document.getElementById("age").value==0){
	    	 document.getElementById("error3").innerHTML="<center>enter age above 18</center>";
	    	 return false;
	     }
	     else if(document.getElementById("gender").value=="--Select--"/* !=document.getElementById("conf_password").value */){
	    	 document.getElementById("error4").innerHTML="<center>Gender required</center>";
	    	 return false;
	     }
	     else if(document.getElementById("userId").value==""){
		    	document.getElementById("error5").innerHTML="<center>USerID required</center>";
		    	return false;
		     }
		     else if(document.getElementById("user_password").value==""){
		    	 document.getElementById("error6").innerHTML="<center> password required</center>";
		    	 return false;
		     }
		     else if(document.getElementById("email").value==""/* !=document.getElementById("conf_password").value */){
		    	 document.getElementById("error7").innerHTML="<center>Email is required</center>";
		    	 return false;
		     }else if(document.getElementById("addres").value==""/* !=document.getElementById("conf_password").value */){
		    	 document.getElementById("error8").innerHTML="<center>Address is required</center>";
		    	 return false;
		     }else  {
	    	 return true;
	     } 
	
}  
</script> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<div align="center">
		<div class="container">
			<ul class="nav nav-tabs">
				<a class="navbar-brand">OlX </a>
				<li class="active"><a href="#"> Home</a></li>
				<li><a href="pets"> My Cart</a></li>
				<li><a href="/add"> LOGIN</a></li>
				<li><input type="button" class="btn btn-secondary" value="Sell">
				</li>
				<p id="error4"></p>
				<center><h3 color: blue>User Registration Page</h5></center>
				
				
				<form:form action="add" method="get" modelAttribute="register">
					<table  class=" table table-striped table-dark">
						<tr>
							<td>First Name:</td>
							<td>
							<td><form:input path="first_name" name="first_name" /></td>
							<td><p id="error1"></p></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td>
							<td><form:input path="last_name" name="last_name" /></td>
							<td><p id="error2"></p></td>
						</tr>
						<tr>
							<td>Age :</td>
							<td>
							<td><form:input path="age" name="age" /></td>
							<td><p id="error3"></p></td>
						</tr>
						<tr>
							<td>Gender:</td>
							<td>
							<td><select name="gender">
									<option value="none">--Select--</option>
									<option value="Male">Male</option>
									<option value="Female">Female</option>
							</select></td>
							<!-- <td><input type="radio" name="gender" value="MAle">
					Male</td>
				<td><input type="radio" name="gender" value="Female">
					Female</td>
				<p id="error4"></p> -->

						</tr>
						<tr>
							<td>UserId:</td>
							<td>
							<td><form:input path="userId" name="userId" /></td>
							<td><p id="error5"></p></td>
						</tr>
						<tr>
							<td>User_Password:</td>
							<td>
							<td><form:password path="user_password" name="user_password" /></td>
							<td>
								<p id="error6"></p>
							</td>
						</tr>
						<tr>
							<td>Email:</td>
							<td>
							<td><form:input path="email" name="email" /></td>
							<td>
								<p id="error7"></p>
							</td>
						</tr>
						<tr>
							<td>Address:</td>
							<td>
							<td><form:input path="addres" name="addres" /></td>
							<td>
								<p id="error8"></p>
							</td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" class="btn btn-primary"
								value="Submit" onclick="return valid()" /></td>
							<td colspan="2"><input type="reset" class="btn btn-primary"
								value="Reset" /></td>
						</tr>
					</table>
				</form:form>
</body>
</html>
