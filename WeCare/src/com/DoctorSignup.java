package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DAO;

/**
 * Servlet implementation class DoctorSignup
 */
@WebServlet("/DoctorSignup")
public class DoctorSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorSignup() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");

		String password =request.getParameter("upass");
		String mobile = request.getParameter("umobile");
		String specialization = request.getParameter("uspecialization");
		String experience = request.getParameter("uexperience");
		String place = request.getParameter("uplace");
		String qualification = request.getParameter("uqual");
		String description = request.getParameter("udesc");


		try{
			Connection con=DAO.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into DoctorRequest"
					+ "(name,email,password,mobile,specialization,experience,workplace,qualifications,description)values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1,name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, mobile);
			ps.setString(5, specialization);
			ps.setString(6, experience);
			ps.setString(7, place);
			ps.setString(8, qualification);
			ps.setString(9, description);
			
			int i=ps.executeUpdate();
			
			
			if(i>0)
			{
				out.println("You have registered successfully");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			out.print(e);
		}
	}

}
