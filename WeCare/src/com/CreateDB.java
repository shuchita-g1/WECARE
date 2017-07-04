package com;

import java.sql.*;

class CreateDB
{

	public static void main(String args[])throws Exception
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","SHUCHITA","gupta8868");
		Statement st=con.createStatement();
		st.executeQuery("create TABLE DoctorRequest (name varchar2(50),email varchar2(50),password varchar2(10))");
		con.close();
		
		
		
		
		
		
		
	}
		catch (Exception e) {
			// TODO: handle exception
			//out.println("An error occurred");
			e.printStackTrace();
		}
		
	}
}