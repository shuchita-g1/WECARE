<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<%if(session.getAttribute("email")!=null)
	{
	response.sendRedirect("welcome.jsp");
	
	}
	%>
<h1>Enter your Details</h1>
<hr>

<form method="post">
<table>
<tr><td>Name</td><td colspan="2"><input type="text" name="uname" ></td></tr>
<tr><td>Email Id</td><td colspan="2"><input type="email" name="uemail" ></td></tr>
<tr><td>Password</td><td colspan="2"><input type="password" name="upass" ></td></tr>
<tr><td>Mobile No.</td><td colspan="2"><input type="text" name="umobile" ></td></tr>
<tr><td>Specialization</td><td colspan="2"><input type="text" name="uspecialization" ></td></tr>
<tr><td>Experience</td><td colspan="2"><input type="text" name="uexperience" ></td></tr>
<tr><td>Work Place</td><td colspan="2"><input type="text" name="uplace" ></td></tr>
<tr><td>Qualifications</td><td colspan="2"><input type="text" name="uqual" ></td></tr>
<tr><td>Description</td><td colspan="2"><input type="text" name="udesc" ></td></tr>


<tr><td></td><td><input type="submit" value="Submit" formaction="DoctorSignup"></td>
 <td><input type="submit" value="Cancel" formaction="doctorLogin.jsp"></td></tr>
</table>
</form>
</body>
</html>