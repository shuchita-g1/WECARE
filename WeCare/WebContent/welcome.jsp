<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(session.getAttribute("email")==null)
	{
	response.sendRedirect("login.jsp");
	
	}
	%>
<h1>Welcome : <%= session.getAttribute("email") %></h1>

<h2><a href="Retrieve"> Check all users</a></h2>
<h2 align="right"><a href="DoctorLogout"> LogOut </a></h2>


<hr>
	</body>
</html>