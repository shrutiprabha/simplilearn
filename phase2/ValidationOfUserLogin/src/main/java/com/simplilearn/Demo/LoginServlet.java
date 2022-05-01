package com.simplilearn.Demo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name= request.getParameter("userid");
		String password= request.getParameter("password");
		PrintWriter out=response.getWriter();
		if(password.equals("admin123") && name.equals("admin"))
		{
//			out.print("<form action='dashboard'>");
//			out.print("<input name='user' value='"+name+"'>");
//			out.print("<input name='password' value='"+password+"'>");
//			out.print("<input type='submit' value='login'>");
//			out.print("<input type='submit' value='logout'>");
//			
//			out.print("</form>");
			
			out.print("Welcome, "+name);
			HttpSession session=request.getSession(false);
			session.setAttribute("user", name);

		}
		else
		{
			out.print("Incorrect user or password ");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


