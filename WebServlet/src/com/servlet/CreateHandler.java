package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;

public class CreateHandler extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1612670215725837381L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("student_name");
		String desc = request.getParameter("student_desc");
		String level = request.getParameter("student_level");
		
		Student stu = new Student();
		stu.setName(name);
		stu.setDesc(desc);
		stu.setLevel(level);
		response.sendRedirect(request.getContextPath()+"/index.jsp");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
