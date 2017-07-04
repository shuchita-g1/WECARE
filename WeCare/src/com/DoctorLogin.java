package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.DAO;

/**
 * Servlet implementation class DoctorLogin
 */
@WebServlet("/DoctorLogin")
public class DoctorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLogin() {
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
		
		String email=request.getParameter("uemail");
		String password=request.getParameter("upass");
		
		try{
			Connection con=DAO.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select * from DoctorRequest where email=? and password=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				
				 HttpSession s = request.getSession(true);
				s.setAttribute("email", email);
				response.sendRedirect("welcome.jsp");
				
				}
			else
			{
				
				 RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
				request.setAttribute("msg", "Enter correct ID or password");
				rd.forward(request, response);
				
			}
			
			
		
		}
	
		catch (Exception e) {
			// TODO: handle exception
			out.println(e);
		}
	}

	
	

}
