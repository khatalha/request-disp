package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("email");
		String pwd = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd;
		if("talha@gmail.com".equals(name) && "demo".equals(pwd)) {
			rd= req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
			
		}
		else {
			
			out.print("<h1> Invalid User And Password");
			rd= req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	
	}
	
	
	

}
