<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%if(session.getAttribute("email")!=null)
	{
	response.sendRedirect("welcome.jsp");
	
	}
	%> 

<h1>Enter User Information</h1>
<hr>
<form method="post">
<table>
<tr><td>Email Id</td><td colspan="2"><input type="email" name="uemail" ></td></tr>
<tr><td>Password  </td><td colspan="2"><input type="password" name="upass" ></td></tr>
<tr><td></td><td><input type="submit" value="Log In" formaction="DoctorLogin">
</td><td><input type="submit" value="Sign Up" formaction="doctorSignup.jsp"></td></tr>




</table>
</form>
<% if(request.getAttribute("msg")!=null)
	{
%>
<h2> <%=request.getAttribute("msg") %></h2>
<% 	
	}%>


</body>
</html>