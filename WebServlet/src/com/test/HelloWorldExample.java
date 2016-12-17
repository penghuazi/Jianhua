package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldExample extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 511671521229418151L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		StringBuffer sb = new StringBuffer(); 
		sb.append("Hello World!");
		out.println(sb.toString());
		out.flush();
		out.close();
	}
	
	

}
